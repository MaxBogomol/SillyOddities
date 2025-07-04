package mod.maxbogomol.silly_oddities.common.block.plant;

import mod.maxbogomol.silly_oddities.registry.common.block.SillyOdditiesBlockTags;
import mod.maxbogomol.silly_oddities.registry.common.block.SillyOdditiesBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class TallDryGrassBlock extends GrassBushBlock {

    public TallDryGrassBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(SillyOdditiesBlockTags.DRY_VEGETATION_MAY_PLACE_ON);
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        popResource(level, pos, new ItemStack(SillyOdditiesBlocks.SHORT_DRY_GRASS.get()));
    }
}
