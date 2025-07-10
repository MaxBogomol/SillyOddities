package mod.maxbogomol.silly_oddities;

import mod.maxbogomol.fluffy_fur.FluffyFurClient;
import mod.maxbogomol.fluffy_fur.client.gui.screen.FluffyFurMod;
import mod.maxbogomol.silly_oddities.client.event.SillyOdditiesClientEvents;
import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesCreativeTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.awt.*;
import java.util.Random;

public class SillyOdditiesClient {
    public static Random random = new Random();

    public static class ClientOnly {
        public static void clientInit() {
            IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
            IEventBus forgeBus = MinecraftForge.EVENT_BUS;
            forgeBus.register(new SillyOdditiesClientEvents());

            eventBus.addListener(SillyOdditiesCreativeTabs::addCreativeTabContent);
        }
    }

    public static void clientSetup(final FMLClientSetupEvent event) {
        setupMenu();
        setupSplashes();
    }

    public static FluffyFurMod MOD_INSTANCE;

    public static void setupMenu() {
        MOD_INSTANCE = new FluffyFurMod(SillyOddities.MOD_ID, SillyOddities.NAME, SillyOddities.VERSION).setDev("MaxBogomol").setItem(new ItemStack(Items.BUNDLE))
                .setEdition(SillyOddities.VERSION_NUMBER).setNameColor(new Color(246, 160, 211)).setVersionColor(new Color(222, 126, 105))
                .setDescription(Component.translatable("mod_description.silly_oddities"))
                .addGithubLink("https://github.com/MaxBogomol/SillyOddities")
                .addCurseForgeLink("https://www.curseforge.com/minecraft/mc-mods/silly-oddities")
                .addModrinthLink("https://modrinth.com/mod/very-silly-oddities")
                .addDiscordLink("https://discord.gg/cKf55qNugw");

        FluffyFurClient.registerMod(MOD_INSTANCE);
    }

    public static void setupSplashes() {

    }
}
