package mod.maxbogomol.silly_oddities.registry.common;

import mod.maxbogomol.fluffy_fur.common.pack.PackHandler;
import mod.maxbogomol.silly_oddities.SillyOddities;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class SillyOdditiesDataPacks {

    @Mod.EventBusSubscriber(modid = SillyOddities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void addPackFinders(AddPackFindersEvent event) {
            if (event.getPackType() == PackType.SERVER_DATA) {
                addPack(event, "tuff");
                addPack(event, "copper");
                addPack(event, "plants");
                addPack(event, "bundles");
                addPack(event, "paintings");
                addPack(event, "lodestone");
                addPack(event, "integration/wizards_reborn");
            }
        }
    }

    public static void addPack(AddPackFindersEvent event, String name) {
        String id = SillyOddities.MOD_ID + ":" + name;
        PackHandler.addPack(event, SillyOddities.MOD_ID, id, Component.literal(id), "datapacks/" + name, PackType.SERVER_DATA, Pack.Position.BOTTOM, PackSource.BUILT_IN);
    }
}
