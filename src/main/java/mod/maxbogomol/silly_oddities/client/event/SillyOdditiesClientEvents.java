package mod.maxbogomol.silly_oddities.client.event;

import com.mojang.blaze3d.systems.RenderSystem;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.client.effect.SillyOdditiesEffects;
import mod.maxbogomol.silly_oddities.common.item.NothingItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class SillyOdditiesClientEvents {

    public static final ResourceLocation AIR_EMPTY_LOCATION = new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/hud/air_empty.png");

    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event) {
        if (event.player.level().isClientSide()) {
            SillyOdditiesEffects.firefliesAmbientEffect(event.player);
        }
    }

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        NothingItem.clientTick(event);
    }

    @SubscribeEvent
    public void onRenderGuiOverlayEvent(RenderGuiOverlayEvent.Pre event) {
        if (SillyOddities.proxy.getPlayer().isAlive()) {
            if (event.getOverlay().id() == VanillaGuiOverlay.AIR_LEVEL.id()) {
                drawAirGui(event.getGuiGraphics());
            }
        }
    }

    public static void drawAirGui(GuiGraphics gui) {
        Minecraft minecraft = Minecraft.getInstance();
        Player player = SillyOddities.proxy.getPlayer();

        if (minecraft.gui instanceof ForgeGui forgeGui) {
            int left = gui.guiWidth() / 2 + 91;
            int top = gui.guiHeight() - forgeGui.rightHeight;

            RenderSystem.enableBlend();
            int air = player.getAirSupply();
            if (player.isEyeInFluidType(ForgeMod.WATER_TYPE.get()) || air < 300) {
                int full = Mth.ceil((double) (air - 2) * 10.0D / 300.0D);

                for (int i = 10; i > full; --i) {
                    gui.blit(AIR_EMPTY_LOCATION, left - i * 8 - 1, top, 0, 0, 9, 9, 9, 9);
                }
            }
            RenderSystem.disableBlend();
        }
    }
}
