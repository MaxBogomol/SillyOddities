package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.torch;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.salt.torch.SaltWallTorchBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesSaltWallTorchBlock extends SaltWallTorchBlock {

    public SillyOdditiesSaltWallTorchBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.SALT_TORCH.get().create(pos, state);
    }
}
