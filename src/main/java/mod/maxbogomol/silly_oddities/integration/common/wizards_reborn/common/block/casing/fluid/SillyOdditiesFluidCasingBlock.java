package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.fluid;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.casing.fluid.FluidCasingBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesFluidCasingBlock extends FluidCasingBlock {

    public SillyOdditiesFluidCasingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.FLUID_CASING.get().create(pos, state);
    }
}
