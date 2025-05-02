package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.arcane_pedestal;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.arcane_pedestal.ArcanePedestalBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesArcanePedestalBlockEntity extends ArcanePedestalBlockEntity {

    public SillyOdditiesArcanePedestalBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public SillyOdditiesArcanePedestalBlockEntity(BlockPos pos, BlockState state) {
        this(SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.ARCANE_PEDESTAL.get(), pos, state);
    }
}
