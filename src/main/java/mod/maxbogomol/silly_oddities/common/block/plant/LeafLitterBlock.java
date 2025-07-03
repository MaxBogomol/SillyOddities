package mod.maxbogomol.silly_oddities.common.block.plant;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PinkPetalsBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nonnull;

public class LeafLitterBlock extends PinkPetalsBlock {

    public static VoxelShape SHAPE = Block.box(0,0,0,16,1,16);

    public LeafLitterBlock(Properties properties) {
        super(properties);
    }

    @Nonnull
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}
