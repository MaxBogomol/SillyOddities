package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.wissen;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.casing.wissen.WissenCasingBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesWissenCasingBlock extends WissenCasingBlock {

    public SillyOdditiesWissenCasingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.WISSEN_CASING.get().create(pos, state);
    }
}
