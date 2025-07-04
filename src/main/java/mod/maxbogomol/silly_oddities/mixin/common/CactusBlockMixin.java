package mod.maxbogomol.silly_oddities.mixin.common;

import mod.maxbogomol.silly_oddities.common.block.plant.CactusFlowerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CactusBlock.class)
public abstract class CactusBlockMixin {

    @Inject(at = @At("HEAD"), method = "randomTick")
    private void silly_oddities$randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random, CallbackInfo ci) {
        CactusBlock self = (CactusBlock) ((Object) this);
        CactusFlowerBlock.growRandomTick(self, state, level, pos, random);
    }
}
