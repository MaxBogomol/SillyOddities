package mod.maxbogomol.silly_oddities.client.model.item;

import mod.maxbogomol.fluffy_fur.client.model.item.CustomItemOverrides;
import mod.maxbogomol.fluffy_fur.client.model.item.CustomModel;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.SillyOdditiesClient;
import mod.maxbogomol.silly_oddities.common.item.NothingItem;
import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.List;

public class NothingItemModel extends CustomModel {

    public NothingItemModel(BakedModel baseModel, CustomItemOverrides itemOverrides) {
        super(baseModel, itemOverrides);
    }

    @Override
    public List<BakedQuad> getQuads(BlockState state, Direction direction, RandomSource random) {
        return getNothingModel().getQuads(state, direction, random);
    }

    @Override
    public boolean useAmbientOcclusion() {
        return getNothingModel().useAmbientOcclusion();
    }

    @Override
    public boolean isGui3d() {
        return getNothingModel().isGui3d();
    }

    @Override
    public boolean usesBlockLight() {
        return getNothingModel().usesBlockLight();
    }

    @Override
    public boolean isCustomRenderer() {
        return true;
    }

    @Override
    public TextureAtlasSprite getParticleIcon() {
        return getNothingModel().getParticleIcon();
    }

    public static ItemStack getNothingItem() {
        if (NothingItem.items.isEmpty()) {
            IForgeRegistry<Item> items = ForgeRegistries.ITEMS;
            for (Item item : items) {
                String string = item.getDescriptionId();
                if (!string.isEmpty()) {
                    if (!string.contains(".")) break;
                    int i = string.indexOf(".");
                    string = string.substring(i + 1);
                    if (!string.contains(".")) break;
                    i = string.indexOf(".");
                    String modId = string.substring(0, i);
                    if (modId.equals(SillyOddities.MOD_ID) && item != SillyOdditiesItems.NOTHING.get()) {
                        NothingItem.items.add(new ItemStack(item));
                    }
                }
            }
            NothingItem.itemNumber = SillyOdditiesClient.random.nextInt(0, NothingItem.items.size());
        }

        return NothingItem.items.get(NothingItem.itemNumber);
    }

    public static BakedModel getNothingModel() {
        return Minecraft.getInstance().getItemRenderer().getModel(getNothingItem(), null, null, 0);
    }
}
