package mod.maxbogomol.silly_oddities.registry.client;

import mod.maxbogomol.fluffy_fur.common.pack.PackHandler;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

public class SillyOdditiesResourcePacks {

    public static List<Item> eggItems = new ArrayList<>();

    @Mod.EventBusSubscriber(modid = SillyOddities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientRegistryEvents {

        @SubscribeEvent
        public static void addPackFinders(AddPackFindersEvent event) {
            if (event.getPackType() == PackType.CLIENT_RESOURCES) {
                addPack(event, "redstone");
                addPack(event, "spawn_eggs");
                addPack(event, "dyes");
                addPack(event, "clouds");
                addPack(event, "shadow");
                addPack(event, "ghast");
                addPack(event, "bat");
                addPack(event, "zombie_horse");
                addPack(event, "zombie_horse_spawn_egg");
                addPack(event, "horse_leather_armor_classic");
                addPack(event, "horse_leather_armor");
            }
        }
    }

    public static void addPack(AddPackFindersEvent event, String name) {
        String id = SillyOddities.MOD_ID + ":" + name;
        PackHandler.addPack(event, SillyOddities.MOD_ID, id, Component.literal(id), "resourcepacks/" + name, PackType.CLIENT_RESOURCES, Pack.Position.TOP, PackSource.DEFAULT);
    }

    public static void addEggItems() {
        if (eggItems.isEmpty()) {
            IForgeRegistry<Item> items = ForgeRegistries.ITEMS;
            for (Item item : items) {
                String string = item.getDescriptionId();
                if (!string.isEmpty()) {
                    if (!string.contains(".")) break;
                    int i = string.indexOf(".");
                    string = string.substring(i + 1);
                    if (!string.contains(".")) break;
                    i = string.indexOf(".");
                    String modId = string.substring(0, i);
                    if (modId.equals("minecraft")) {
                        eggItems.add(item);
                    }
                }
            }
            if (SillyOdditiesWizardsReborn.isLoaded()) SillyOdditiesWizardsReborn.ClientLoadedOnly.addResourcePackEggItems();
        }
    }
}
