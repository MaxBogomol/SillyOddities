package mod.maxbogomol.silly_oddities.common.block.copper;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CopperGrateBlock extends GlassBlock {

    public CopperGrateBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.getBlock() instanceof WeatheringCopperGrateBlock || adjacentBlockState.getBlock() instanceof CopperGrateBlock || super.skipRendering(state, adjacentBlockState, side);
    }
}
