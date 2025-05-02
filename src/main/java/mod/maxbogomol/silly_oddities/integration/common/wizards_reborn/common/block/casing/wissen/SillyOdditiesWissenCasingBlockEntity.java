package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.wissen;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.casing.wissen.WissenCasingBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesWissenCasingBlockEntity extends WissenCasingBlockEntity {

    public SillyOdditiesWissenCasingBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public SillyOdditiesWissenCasingBlockEntity(BlockPos pos, BlockState state) {
        this(SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.WISSEN_CASING.get(), pos, state);
    }
}
