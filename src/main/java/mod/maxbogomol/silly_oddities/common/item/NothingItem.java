package mod.maxbogomol.silly_oddities.common.item;

import mod.maxbogomol.fluffy_fur.client.event.ClientTickHandler;
import mod.maxbogomol.silly_oddities.SillyOdditiesClient;
import mod.maxbogomol.silly_oddities.config.SillyOdditiesConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.TickEvent;

import java.util.ArrayList;
import java.util.List;

public class NothingItem extends SillyOdditiesRenderItem {

    public static List<ItemStack> items = new ArrayList<>();
    public static int itemNumber = 0;

    public NothingItem(Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    public static void clientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            if (!Minecraft.getInstance().isPaused()) {
                if (!items.isEmpty()) {
                    if (ClientTickHandler.ticksInGame % 20 == 0) {
                        itemNumber = SillyOdditiesClient.random.nextInt(0, items.size());
                    }
                }
            }
        }
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, Level level, List<Component> list, TooltipFlag flags) {
        int enabled = 0;
        if (SillyOdditiesConfig.TUFF_DATAPACK.get()) enabled++;
        if (SillyOdditiesConfig.COPPER_DATAPACK.get()) enabled++;
        if (SillyOdditiesConfig.PLANTS_DATAPACK.get()) enabled++;
        if (SillyOdditiesConfig.BUNDLES_DATAPACK.get()) enabled++;
        if (SillyOdditiesConfig.HORSE_ARMOR_DATAPACK.get()) enabled++;
        if (SillyOdditiesConfig.PAINTINGS_DATAPACK.get()) enabled++;

        if (SillyOdditiesConfig.WIZRDS_REBORN_INTEGRATION_DATAPACK.get()) enabled++;

        if (enabled > 0) {
            list.add(getDataPacksComponent(enabled));
        } else {
            list.add(Component.translatable("lore.silly_oddities.nothing").withStyle(ChatFormatting.DARK_GRAY));
        }
    }

    public int getDataPacks() {
        return 7;
    }

    public Component getDataPacksComponent(int enabled) {
        return Component.literal(enabled + "/" + getDataPacks());
    }
}
