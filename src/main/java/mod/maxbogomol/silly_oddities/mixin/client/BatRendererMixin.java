package mod.maxbogomol.silly_oddities.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import mod.maxbogomol.silly_oddities.client.model.entity.SillyBatModel;
import mod.maxbogomol.silly_oddities.config.SillyOdditiesClientConfig;
import mod.maxbogomol.silly_oddities.registry.client.SillyOdditiesModels;
import net.minecraft.client.model.BatModel;
import net.minecraft.client.renderer.entity.BatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.world.entity.ambient.Bat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BatRenderer.class)
public abstract class BatRendererMixin extends MobRenderer<Bat, BatModel> {

    public BatRendererMixin(EntityRendererProvider.Context context, BatModel model, float shadowRadius) {
        super(context, model, shadowRadius);
    }

    @Inject(at = @At("RETURN"), method = "<init>")
    private void silly_oddities$BatRenderer(EntityRendererProvider.Context context, CallbackInfo ci) {
        if (SillyOdditiesClientConfig.BAT_RESOURCEPACK.get()) {
            BatRenderer self = (BatRenderer) ((Object) this);
            self.model = new SillyBatModel(context.bakeLayer(SillyOdditiesModels.SILLY_BAT_LAYER));
        }
    }

    @Inject(at = @At("HEAD"), method = "scale*", cancellable = true)
    public void silly_oddities$scale(Bat livingEntity, PoseStack poseStack, float partialTickTime, CallbackInfo ci) {
        if (SillyOdditiesClientConfig.BAT_RESOURCEPACK.get()) {
            ci.cancel();
        }
    }

    @Inject(at = @At("HEAD"), method = "setupRotations*", cancellable = true)
    public void silly_oddities$setupRotations(Bat livingEntity, PoseStack poseStack, float ageInTicks, float rotationYaw, float partialTicks, CallbackInfo ci) {
        if (SillyOdditiesClientConfig.BAT_RESOURCEPACK.get()) {
            ci.cancel();
            super.setupRotations(livingEntity, poseStack, ageInTicks, rotationYaw, partialTicks);
        }
    }
}