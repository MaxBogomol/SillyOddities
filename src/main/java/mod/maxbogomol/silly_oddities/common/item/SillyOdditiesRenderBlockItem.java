package mod.maxbogomol.silly_oddities.common.item;

import mod.maxbogomol.silly_oddities.registry.client.SillyOdditiesModels;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.function.Consumer;

public class SillyOdditiesRenderBlockItem extends BlockItem {

    public SillyOdditiesRenderBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return SillyOdditiesModels.itemRenderer;
            }
        });
    }
}