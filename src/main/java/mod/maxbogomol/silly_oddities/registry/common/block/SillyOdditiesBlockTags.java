package mod.maxbogomol.silly_oddities.registry.common.block;

import mod.maxbogomol.silly_oddities.SillyOddities;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class SillyOdditiesBlockTags {
    public static final TagKey<Block> DRY_VEGETATION_MAY_PLACE_ON = TagKey.create(Registries.BLOCK, new ResourceLocation(SillyOddities.MOD_ID, "dry_vegetation_may_place_on"));
    public static final TagKey<Block> VEGETATION_MAY_PLACE_ON = TagKey.create(Registries.BLOCK, new ResourceLocation(SillyOddities.MOD_ID, "vegetation_may_place_on"));
    public static final TagKey<Block> CACTUS_FLOWER_MAY_PLACE_ON = TagKey.create(Registries.BLOCK, new ResourceLocation(SillyOddities.MOD_ID, "cactus_flower_may_place_on"));
}
