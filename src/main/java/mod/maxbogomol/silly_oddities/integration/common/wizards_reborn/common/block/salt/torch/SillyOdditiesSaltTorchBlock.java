package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.torch;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.salt.torch.SaltTorchBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesSaltTorchBlock extends SaltTorchBlock {

    public SillyOdditiesSaltTorchBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.SALT_TORCH.get().create(pos, state);
    }
}
