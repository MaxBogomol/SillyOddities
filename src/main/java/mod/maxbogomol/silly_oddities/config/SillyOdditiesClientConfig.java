package mod.maxbogomol.silly_oddities.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class SillyOdditiesClientConfig {
    public static ForgeConfigSpec.ConfigValue<Boolean>
            FIREFLY_BUSH_EFFECT, FIREFLIES_AMBIENT_EFFECT;

    public SillyOdditiesClientConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("Graphics").push("graphics");

        builder.comment("Particles").push("particles");
        FIREFLY_BUSH_EFFECT = builder.comment("Enable firefly bush effect.").define("fireflyBushEffect", true);
        FIREFLIES_AMBIENT_EFFECT = builder.comment("Enable ambient fireflies effect in swamp biomes.").define("firefliesAmbientEffect", true);
        builder.pop();
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
