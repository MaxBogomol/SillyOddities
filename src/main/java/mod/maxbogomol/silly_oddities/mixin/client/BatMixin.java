package mod.maxbogomol.silly_oddities.mixin.client;

import mod.maxbogomol.silly_oddities.common.entity.ISillyBat;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.ambient.Bat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Bat.class)
public abstract class BatMixin implements ISillyBat {
    @Unique
    public final AnimationState silly_oddities$flyAnimationState = new AnimationState();
    @Unique
    public final AnimationState silly_oddities$restAnimationState = new AnimationState();

    @Override
    public AnimationState silly_oddities$getFlyAnimationState() {
        return silly_oddities$flyAnimationState;
    }

    @Override
    public AnimationState silly_oddities$getRestAnimationState() {
        return silly_oddities$restAnimationState;
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void silly_oddities$tick(CallbackInfo ci) {
        Bat self = (Bat) ((Object) this);
        if (self instanceof ISillyBat sillyBat) {
            if (self.isResting()) {
                sillyBat.silly_oddities$getFlyAnimationState().stop();
                sillyBat.silly_oddities$getRestAnimationState().startIfStopped(self.tickCount);
            } else {
                sillyBat.silly_oddities$getRestAnimationState().stop();
                sillyBat.silly_oddities$getFlyAnimationState().startIfStopped(self.tickCount);
            }
        }
    }
}
