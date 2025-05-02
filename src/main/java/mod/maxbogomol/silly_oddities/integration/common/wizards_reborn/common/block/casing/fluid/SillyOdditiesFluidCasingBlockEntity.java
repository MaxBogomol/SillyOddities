package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.fluid;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.casing.fluid.FluidCasingBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesFluidCasingBlockEntity extends FluidCasingBlockEntity {

    public SillyOdditiesFluidCasingBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public SillyOdditiesFluidCasingBlockEntity(BlockPos pos, BlockState state) {
        this(SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.FLUID_CASING.get(), pos, state);
    }
}
