package mod.maxbogomol.silly_oddities.common.block.copper;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

public class CopperDoorBlock extends DoorBlock {

    public CopperDoorBlock(Properties properties, BlockSetType type) {
        super(properties, type);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        super.neighborChanged(state, level, pos, block, fromPos, isMoving);
        Direction direction = state.getValue(HALF) == DoubleBlockHalf.LOWER ? Direction.UP : Direction.DOWN;
        if (fromPos.equals(pos.relative(direction))) {
            BlockState fromState = level.getBlockState(fromPos);
            BlockState newState = level.getBlockState(pos);
            if (!fromState.getBlock().equals(newState.getBlock())) {
                if (fromState.getBlock() instanceof WeatheringCopperDoorBlock doorBlock) {
                    level.setBlock(pos, doorBlock.defaultBlockState().setValue(POWERED, newState.getValue(POWERED)).setValue(OPEN, newState.getValue(OPEN)).setValue(HALF, newState.getValue(HALF)).setValue(FACING, newState.getValue(FACING)).setValue(HINGE, newState.getValue(HINGE)), 2);
                }
                if (fromState.getBlock() instanceof CopperDoorBlock doorBlock) {
                    level.setBlock(pos, doorBlock.defaultBlockState().setValue(POWERED, newState.getValue(POWERED)).setValue(OPEN, newState.getValue(OPEN)).setValue(HALF, newState.getValue(HALF)).setValue(FACING, newState.getValue(FACING)).setValue(HINGE, newState.getValue(HINGE)), 2);
                }
            }
        }
    }
}
