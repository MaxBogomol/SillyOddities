package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.lantern;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.baulk.CrossBaulkBlock;
import mod.maxbogomol.wizards_reborn.common.block.salt.lantern.SaltLanternBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesSaltLanternBlock extends SaltLanternBlock {

    public SillyOdditiesSaltLanternBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.SALT_LANTERN.get().create(pos, state);
    }
}
