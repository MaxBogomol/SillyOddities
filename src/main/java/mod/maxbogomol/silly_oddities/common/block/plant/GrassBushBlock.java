package mod.maxbogomol.silly_oddities.common.block.plant;

import mod.maxbogomol.silly_oddities.registry.common.block.SillyOdditiesBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.DeadBushBlock;
import net.minecraft.world.level.block.state.BlockState;

public class GrassBushBlock extends DeadBushBlock implements BonemealableBlock {

    public GrassBushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(SillyOdditiesBlockTags.VEGETATION_MAY_PLACE_ON);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState blockState, boolean isClient) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        popResource(level, pos, new ItemStack(this));
    }
}
