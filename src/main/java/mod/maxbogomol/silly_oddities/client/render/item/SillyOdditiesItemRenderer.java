package mod.maxbogomol.silly_oddities.client.render.item;

import com.mojang.blaze3d.vertex.PoseStack;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.client.render.item.WizardsRebornItemRenderer;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class SillyOdditiesItemRenderer extends BlockEntityWithoutLevelRenderer {

    public SillyOdditiesItemRenderer(BlockEntityRenderDispatcher blockEntityRenderDispatcher, EntityModelSet entityModelSet) {
        super(blockEntityRenderDispatcher, entityModelSet);
    }

    @Override
    public void renderByItem(ItemStack stack, ItemDisplayContext displayContext, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        if (SillyOdditiesWizardsReborn.isLoaded()) {
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.OAK_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.SPRUCE_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.BIRCH_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.JUNGLE_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.ACACIA_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.DARK_OAK_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.MANGROVE_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.CHERRY_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.BAMBOO_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.CRIMSON_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.WARPED_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
            if (SillyOdditiesWizardsReborn.MalumLoadedOnly.isLoaded()) {
                WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.RUNEWOOD_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);
                WizardsRebornItemRenderer.renderLightCasing(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_LIGHT_CASING.get(), SillyOdditiesWizardsReborn.ModelsLoadedOnly.SOULWOOD_LIGHT_CASING_PIECE, stack, displayContext, poseStack, buffer, packedLight, packedOverlay);

            }
        }
    }
}
