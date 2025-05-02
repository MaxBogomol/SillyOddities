package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.baulk;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.baulk.CrossBaulkBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesCrossBaulkBlockEntity extends CrossBaulkBlockEntity {

    public SillyOdditiesCrossBaulkBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public SillyOdditiesCrossBaulkBlockEntity(BlockPos pos, BlockState state) {
        this(SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.CROSS_BAULK.get(), pos, state);
    }
}
