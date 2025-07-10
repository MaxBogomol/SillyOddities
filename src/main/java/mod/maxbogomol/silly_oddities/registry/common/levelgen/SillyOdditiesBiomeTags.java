package mod.maxbogomol.silly_oddities.registry.common.levelgen;

import mod.maxbogomol.silly_oddities.SillyOddities;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class SillyOdditiesBiomeTags {
    public static final TagKey<Biome> FIREFLIES_AMBIENT = TagKey.create(Registries.BIOME, new ResourceLocation(SillyOddities.MOD_ID, "fireflies_ambient"));
}
