package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.campfire;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.arcane_pedestal.ArcanePedestalBlockEntity;
import mod.maxbogomol.wizards_reborn.common.block.salt.campfire.SaltCampfireBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesSaltCampfireBlockEntity extends SaltCampfireBlockEntity {

    public SillyOdditiesSaltCampfireBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public SillyOdditiesSaltCampfireBlockEntity(BlockPos pos, BlockState state) {
        this(SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.SALT_CAMPFIRE.get(), pos, state);
    }
}
