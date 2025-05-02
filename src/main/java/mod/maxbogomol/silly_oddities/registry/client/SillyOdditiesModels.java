package mod.maxbogomol.silly_oddities.registry.client;

import mod.maxbogomol.fluffy_fur.registry.client.FluffyFurModels;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.client.render.item.SillyOdditiesItemRenderer;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class SillyOdditiesModels {

    public static SillyOdditiesItemRenderer itemRenderer;

    @Mod.EventBusSubscriber(modid = SillyOddities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientRegistryEvents {
        @SubscribeEvent
        public static void registerModels(FMLClientSetupEvent event) {
            Minecraft minecraft = Minecraft.getInstance();
            itemRenderer = new SillyOdditiesItemRenderer(minecraft.getBlockEntityRenderDispatcher(), minecraft.getEntityModels());
        }

        @SubscribeEvent
        public static void modelRegistry(ModelEvent.RegisterAdditional event) {
            if (SillyOdditiesWizardsReborn.isLoaded()) {
                SillyOdditiesWizardsReborn.ClientLoadedOnly.modelRegistry(event);
            }
        }

        @SubscribeEvent
        public static void modelBake(ModelEvent.ModifyBakingResult event) {
            if (SillyOdditiesWizardsReborn.isLoaded()) {
                SillyOdditiesWizardsReborn.ClientLoadedOnly.modelBake(event);
            }
        }

        @SubscribeEvent
        public static void completeModelBake(ModelEvent.BakingCompleted event) {
            if (SillyOdditiesWizardsReborn.isLoaded()) {
                SillyOdditiesWizardsReborn.ClientLoadedOnly.completeModelBake(event);
            }
        }
    }

    public static ModelLayerLocation addLayer(String layer) {
        return FluffyFurModels.addLayer(SillyOddities.MOD_ID, layer);
    }

    public static ModelResourceLocation addCustomModel(String model) {
        return FluffyFurModels.addCustomModel(SillyOddities.MOD_ID, model);
    }
}
