package mod.maxbogomol.silly_oddities.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mod.maxbogomol.silly_oddities.config.SillyOdditiesClientConfig;
import net.minecraft.client.model.HorseModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.HorseArmorLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HorseArmorLayer.class)
public abstract class HorseArmorLayerMixin {

    @Unique
    private static final ResourceLocation LEATHER_HORSE_ARMOR_OVERLAY_LOCATION = new ResourceLocation("textures/entity/horse/armor/horse_armor_leather_overlay.png");

    @Shadow @Final private HorseModel<Horse> model;

    @Inject(at = @At("TAIL"), method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/entity/animal/horse/Horse;FFFFFF)V")
    private void silly_oddities$render(PoseStack poseStack, MultiBufferSource buffer, int packedLight, Horse livingEntity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, CallbackInfo ci) {
        if (SillyOdditiesClientConfig.HORSE_LEATHER_ARMOR_RESOURCEPACK.get()) {
            ItemStack itemstack = livingEntity.getArmor();
            if (itemstack.getItem().equals(Items.LEATHER_HORSE_ARMOR)) {
                VertexConsumer vertexconsumer = buffer.getBuffer(RenderType.entityCutoutNoCull(LEATHER_HORSE_ARMOR_OVERLAY_LOCATION));
                this.model.renderToBuffer(poseStack, vertexconsumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
            }
        }
    }
}
