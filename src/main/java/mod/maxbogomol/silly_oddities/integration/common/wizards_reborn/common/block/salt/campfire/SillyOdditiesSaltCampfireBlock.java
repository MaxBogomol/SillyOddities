package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.campfire;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.salt.campfire.SaltCampfireBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesSaltCampfireBlock extends SaltCampfireBlock {

    public SillyOdditiesSaltCampfireBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.SALT_CAMPFIRE.get().create(pos, state);
    }
}
