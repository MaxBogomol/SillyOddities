package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.steam;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.arcane_pedestal.ArcanePedestalBlockEntity;
import mod.maxbogomol.wizards_reborn.common.block.casing.steam.SteamCasingBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesSteamCasingBlockEntity extends SteamCasingBlockEntity {

    public SillyOdditiesSteamCasingBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public SillyOdditiesSteamCasingBlockEntity(BlockPos pos, BlockState state) {
        this(SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.STEAM_CASING.get(), pos, state);
    }
}
