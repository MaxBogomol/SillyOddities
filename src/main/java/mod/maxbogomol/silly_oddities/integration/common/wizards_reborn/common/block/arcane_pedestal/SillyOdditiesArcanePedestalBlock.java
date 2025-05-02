package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.arcane_pedestal;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.arcane_pedestal.ArcanePedestalBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesArcanePedestalBlock extends ArcanePedestalBlock {

    public SillyOdditiesArcanePedestalBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.ARCANE_PEDESTAL.get().create(pos, state);
    }
}
