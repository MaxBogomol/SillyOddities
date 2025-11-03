package mod.maxbogomol.silly_oddities.common.entity;

import net.minecraft.world.entity.AnimationState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public interface ISillyBat {
    @OnlyIn(Dist.CLIENT)
    AnimationState silly_oddities$getFlyAnimationState();
    @OnlyIn(Dist.CLIENT)
    AnimationState silly_oddities$getRestAnimationState();
}
