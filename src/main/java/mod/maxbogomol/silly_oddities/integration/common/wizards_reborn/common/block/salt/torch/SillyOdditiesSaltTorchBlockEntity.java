package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.torch;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.salt.torch.SaltTorchBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesSaltTorchBlockEntity extends SaltTorchBlockEntity {

    public SillyOdditiesSaltTorchBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public SillyOdditiesSaltTorchBlockEntity(BlockPos pos, BlockState state) {
        this(SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.SALT_TORCH.get(), pos, state);
    }
}
