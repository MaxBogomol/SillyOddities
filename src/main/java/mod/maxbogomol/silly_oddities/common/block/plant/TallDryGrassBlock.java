package mod.maxbogomol.silly_oddities.common.block.plant;

import mod.maxbogomol.silly_oddities.registry.common.block.SillyOdditiesBlockTags;
import net.minecraft.core.BlockPos;
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
}
