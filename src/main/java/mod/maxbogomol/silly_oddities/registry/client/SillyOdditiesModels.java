package mod.maxbogomol.silly_oddities.registry.client;

import mod.maxbogomol.fluffy_fur.client.model.item.CustomItemOverrides;
import mod.maxbogomol.fluffy_fur.client.model.item.CustomModel;
import mod.maxbogomol.fluffy_fur.registry.client.FluffyFurModels;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.client.model.item.NothingItemModel;
import mod.maxbogomol.silly_oddities.client.model.item.entity.SillyBatModel;
import mod.maxbogomol.silly_oddities.client.render.item.SillyOdditiesItemRenderer;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.Map;

public class SillyOdditiesModels {

    public static ModelLayerLocation SILLY_BAT_LAYER = addLayer("silly");

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
            Map<ResourceLocation, BakedModel> map = event.getModels();

            addNothingItemModel(map, SillyOdditiesItems.NOTHING.getId());

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

        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(SILLY_BAT_LAYER, SillyBatModel::createBodyLayer);
        }
    }

    public static void addNothingItemModel(Map<ResourceLocation, BakedModel> map, ResourceLocation item) {
        BakedModel model = map.get(new ModelResourceLocation(item, "inventory"));
        CustomModel customModel = new NothingItemModel(model, new CustomItemOverrides());
        map.replace(new ModelResourceLocation(item, "inventory"), customModel);
    }

    public static ModelLayerLocation addLayer(String layer) {
        return FluffyFurModels.addLayer(SillyOddities.MOD_ID, layer);
    }

    public static ModelResourceLocation addCustomModel(String model) {
        return FluffyFurModels.addCustomModel(SillyOddities.MOD_ID, model);
    }
}
