package mod.maxbogomol.silly_oddities.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class SillyOdditiesClientConfig {
    public static ForgeConfigSpec.ConfigValue<Boolean>
            FIREFLY_BUSH_EFFECT, FIREFLIES_AMBIENT_EFFECT,
            SPAWN_EGGS_RESOURCEPACK, BAT_RESOURCEPACK;

    public SillyOdditiesClientConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("Graphics").push("graphics");

        builder.comment("Particles").push("particles");
        FIREFLY_BUSH_EFFECT = builder.comment("Enable firefly bush effect.").define("fireflyBushEffect", true);
        FIREFLIES_AMBIENT_EFFECT = builder.comment("Enable ambient fireflies effect in swamp biomes.").define("firefliesAmbientEffect", true);
        builder.pop();
        builder.pop();

        builder.comment("Resource Packs").push("resourcepacks");
        SPAWN_EGGS_RESOURCEPACK = builder.comment("Enables fixing egg colors for Spawn Eggs Resource Pack").define("spawnEggsResourcepack", false);
        BAT_RESOURCEPACK = builder.comment("Enables bat model and animations for Bat Resource Pack").comment("Requires a resource packs reload").define("batResourcepack", false);
        builder.pop();
    }

    public static final SillyOdditiesClientConfig INSTANCE;
    public static final ForgeConfigSpec SPEC;

    static {
        final Pair<SillyOdditiesClientConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(SillyOdditiesClientConfig::new);
        SPEC = specPair.getRight();
        INSTANCE = specPair.getLeft();
    }
}
