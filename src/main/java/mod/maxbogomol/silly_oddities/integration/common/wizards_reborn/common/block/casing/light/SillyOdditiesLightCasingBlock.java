package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.light;

import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.common.block.casing.light.LightCasingBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SillyOdditiesLightCasingBlock extends LightCasingBlock {

    public SillyOdditiesLightCasingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return SillyOdditiesWizardsReborn.BlockEntitiesLoadedOnly.LIGHT_CASING.get().create(pos, state);
    }
}
