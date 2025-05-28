package mod.maxbogomol.silly_oddities.common.block.copper;

import mod.maxbogomol.silly_oddities.registry.common.SillyOdditiesSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

import javax.annotation.Nullable;

public class CopperBulbBlock extends RedstoneLampBlock {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public CopperBulbBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState().setValue(LIT, false).setValue(POWERED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT).add(POWERED);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean signal = context.getLevel().hasNeighborSignal(context.getClickedPos());
        return this.defaultBlockState().setValue(LIT, signal).setValue(POWERED, signal);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide()) {
            boolean flag = state.getValue(POWERED);
            if (flag != level.hasNeighborSignal(pos)) {
                state = state.cycle(POWERED);
                if (!flag) {
                    state = state.cycle(LIT);
                    level.playSound(null, pos, state.getValue(LIT) ? SillyOdditiesSounds.COPPER_BULB_TURN_ON.get() : SillyOdditiesSounds.COPPER_BULB_TURN_OFF.get(), SoundSource.BLOCKS, 1.0f, 1.0f);
                }
                level.setBlock(pos, state, 2);
            }
        }
    }
}