package mod.maxbogomol.silly_oddities.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class SillyOdditiesConfig {
    public static ForgeConfigSpec.ConfigValue<Boolean>
            TUFF_DATAPACK, COPPER_DATAPACK, PLANTS_DATAPACK, BUNDLES_DATAPACK, PAINTINGS_DATAPACK, LODESTONE_DATAPACK,
            WIZRDS_REBORN_INTEGRATION_DATAPACK;

    public SillyOdditiesConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("Data Packs").push("datapacks");
        TUFF_DATAPACK = builder.comment("Enables tuff Data Pack").comment("Requires a world reload").define("tuffDatapack", true);
        COPPER_DATAPACK = builder.comment("Enables copper Data Pack").comment("Requires a world reload").define("copperDatapack", true);
        PLANTS_DATAPACK = builder.comment("Enables plants Data Pack").comment("Requires a world reload").define("plantsDatapack", true);
        BUNDLES_DATAPACK = builder.comment("Enables bundles Data Pack").comment("Requires a world reload").define("bundlesDatapack", true);
        PAINTINGS_DATAPACK = builder.comment("Enables paintings Data Pack").comment("Requires a world reload").define("paintingsDatapack", true);
        LODESTONE_DATAPACK = builder.comment("Enables lodestone Data Pack").comment("Requires a world reload").define("lodestoneDatapack", true);

        builder.comment("Integrations").push("integrations");
        WIZRDS_REBORN_INTEGRATION_DATAPACK = builder.comment("Enables Wizard's Reborn integration Data Pack").comment("Requires a world reload").define("wizardsRebornIntegrationDatapack", true);
        builder.pop();
        builder.pop();
    }

    public static final SillyOdditiesConfig INSTANCE;
    public static final ForgeConfigSpec SPEC;

    static {
        final Pair<SillyOdditiesConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(SillyOdditiesConfig::new);
        SPEC = specPair.getRight();
        INSTANCE = specPair.getLeft();
    }
}
