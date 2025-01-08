package mod.maxbogomol.silly_oddities.registry.common.item;

import mod.maxbogomol.silly_oddities.SillyOddities;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class SillyOdditiesItemTags {
    public static final TagKey<Item> BUNDLES = TagKey.create(Registries.ITEM, new ResourceLocation(SillyOddities.MOD_ID, "bundles"));
}
