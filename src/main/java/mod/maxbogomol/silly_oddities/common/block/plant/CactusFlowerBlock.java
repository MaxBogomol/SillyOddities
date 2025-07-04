package mod.maxbogomol.silly_oddities.common.block.plant;

import mod.maxbogomol.silly_oddities.registry.common.block.SillyOdditiesBlockTags;
import mod.maxbogomol.silly_oddities.registry.common.block.SillyOdditiesBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;

public class CactusFlowerBlock extends GrassBushBlock {

    public CactusFlowerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(SillyOdditiesBlockTags.CACTUS_FLOWER_MAY_PLACE_ON);
    }

    public static void growRandomTick(CactusBlock self, BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        BlockPos blockPos = pos.above();
        if (level.isEmptyBlock(blockPos)) {
            int i;
            for (i = 1; level.getBlockState(pos.below(i)).is(self); ++i) {
            }

            int j = state.getValue(CactusBlock.AGE);
            boolean growFlower = false;

            if (j == 15) {
                if (i < 3 && random.nextFloat() < 0.1f) growFlower = true;
                if (i >= 3 && random.nextFloat() < 0.25f) growFlower = true;
            }

            if (growFlower) {
                if (ForgeHooks.onCropsGrowPre(level, blockPos, state, true)) {
                    level.setBlockAndUpdate(blockPos, SillyOdditiesBlocks.CACTUS_FLOWER.get().defaultBlockState());
                    BlockState blockState = state.setValue(CactusBlock.AGE, 0);
                    level.setBlock(pos, blockState, 4);
                    level.neighborChanged(blockState, blockPos, self, pos, false);
                }
                ForgeHooks.onCropsGrowPost(level, pos, state);
            }

            if (i >= 3 && j < 15) {
                level.setBlock(pos, state.setValue(CactusBlock.AGE, j + 1), 4);
            }
        }
    }
}
