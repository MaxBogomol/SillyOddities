package mod.maxbogomol.silly_oddities.registry.common.block;

import mod.maxbogomol.fluffy_fur.registry.common.block.FluffyFurBlocks;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.common.block.copper.*;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.silly_oddities.registry.common.SillyOdditiesSounds;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SillyOdditiesBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SillyOddities.MOD_ID);

    public static final RegistryObject<Block> TUFF_STAIRS = BLOCKS.register("tuff_stairs", () -> new StairBlock(Blocks.TUFF::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> TUFF_SLAB = BLOCKS.register("tuff_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> TUFF_WALL = BLOCKS.register("tuff_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> CHISELED_TUFF = BLOCKS.register("chiseled_tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> POLISHED_TUFF = BLOCKS.register("polished_tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SillyOdditiesSounds.POLISHED_TUFF)));
    public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = BLOCKS.register("polished_tuff_stairs", () -> new StairBlock(POLISHED_TUFF.get()::defaultBlockState, BlockBehaviour.Properties.copy(POLISHED_TUFF.get())));
    public static final RegistryObject<Block> POLISHED_TUFF_SLAB = BLOCKS.register("polished_tuff_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_TUFF.get())));
    public static final RegistryObject<Block> POLISHED_TUFF_WALL = BLOCKS.register("polished_tuff_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(POLISHED_TUFF.get())));
    public static final RegistryObject<Block> TUFF_BRICKS = BLOCKS.register("tuff_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SillyOdditiesSounds.TUFF_BRICKS)));
    public static final RegistryObject<Block> TUFF_BRICKS_STAIRS = BLOCKS.register("tuff_bricks_stairs", () -> new StairBlock(TUFF_BRICKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(TUFF_BRICKS.get())));
    public static final RegistryObject<Block> TUFF_BRICKS_SLAB = BLOCKS.register("tuff_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(TUFF_BRICKS.get())));
    public static final RegistryObject<Block> TUFF_BRICKS_WALL = BLOCKS.register("tuff_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(TUFF_BRICKS.get())));
    public static final RegistryObject<Block> CHISELED_TUFF_BRICKS = BLOCKS.register("chiseled_tuff_bricks", () -> new Block(BlockBehaviour.Properties.copy(TUFF_BRICKS.get())));

    public static final RegistryObject<Block> CHISELED_COPPER = BLOCKS.register("chiseled_copper", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> EXPOSED_CHISELED_COPPER = BLOCKS.register("exposed_chiseled_copper", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));
    public static final RegistryObject<Block> WEATHERED_CHISELED_COPPER = BLOCKS.register("weathered_chiseled_copper", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));
    public static final RegistryObject<Block> OXIDIZED_CHISELED_COPPER = BLOCKS.register("oxidized_chiseled_copper", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));
    public static final RegistryObject<Block> WAXED_CHISELED_COPPER = BLOCKS.register("waxed_chiseled_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_EXPOSED_CHISELED_COPPER = BLOCKS.register("waxed_exposed_chiseled_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));
    public static final RegistryObject<Block> WAXED_WEATHERED_CHISELED_COPPER = BLOCKS.register("waxed_weathered_chiseled_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_CHISELED_COPPER = BLOCKS.register("waxed_oxidized_chiseled_copper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));

    public static final RegistryObject<Block> COPPER_GRATE = BLOCKS.register("copper_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).sound(SillyOdditiesSounds.COPPER_GRATE).noOcclusion()));
    public static final RegistryObject<Block> EXPOSED_COPPER_GRATE = BLOCKS.register("exposed_copper_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).sound(SillyOdditiesSounds.COPPER_GRATE).noOcclusion()));
    public static final RegistryObject<Block> WEATHERED_COPPER_GRATE = BLOCKS.register("weathered_copper_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).sound(SillyOdditiesSounds.COPPER_GRATE).noOcclusion()));
    public static final RegistryObject<Block> OXIDIZED_COPPER_GRATE = BLOCKS.register("oxidized_copper_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).sound(SillyOdditiesSounds.COPPER_GRATE).noOcclusion()));
    public static final RegistryObject<Block> WAXED_COPPER_GRATE = BLOCKS.register("waxed_copper_grate", () -> new CopperGrateBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).sound(SillyOdditiesSounds.COPPER_GRATE).noOcclusion()));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_GRATE = BLOCKS.register("waxed_exposed_copper_grate", () -> new CopperGrateBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).sound(SillyOdditiesSounds.COPPER_GRATE).noOcclusion()));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_GRATE = BLOCKS.register("waxed_weathered_copper_grate", () -> new CopperGrateBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).sound(SillyOdditiesSounds.COPPER_GRATE).noOcclusion()));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_GRATE = BLOCKS.register("waxed_oxidized_copper_grate", () -> new CopperGrateBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).sound(SillyOdditiesSounds.COPPER_GRATE).noOcclusion()));

    public static final RegistryObject<Block> COPPER_DOOR = BLOCKS.register("copper_door", () -> new WeatheringCopperDoorBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> EXPOSED_COPPER_DOOR = BLOCKS.register("exposed_copper_door", () -> new WeatheringCopperDoorBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WEATHERED_COPPER_DOOR = BLOCKS.register("weathered_copper_door", () -> new WeatheringCopperDoorBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> OXIDIZED_COPPER_DOOR = BLOCKS.register("oxidized_copper_door", () -> new WeatheringCopperDoorBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_COPPER_DOOR = BLOCKS.register("waxed_copper_door", () -> new CopperDoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_DOOR = BLOCKS.register("waxed_exposed_copper_door", () -> new CopperDoorBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_DOOR = BLOCKS.register("waxed_weathered_copper_door", () -> new CopperDoorBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_DOOR = BLOCKS.register("waxed_oxidized_copper_door", () -> new CopperDoorBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));

    public static final RegistryObject<Block> COPPER_TRAPDOOR = BLOCKS.register("copper_trapdoor", () -> new WeatheringTrapDoorBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> EXPOSED_COPPER_TRAPDOOR = BLOCKS.register("exposed_copper_trapdoor", () -> new WeatheringTrapDoorBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WEATHERED_COPPER_TRAPDOOR = BLOCKS.register("weathered_copper_trapdoor", () -> new WeatheringTrapDoorBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> OXIDIZED_COPPER_TRAPDOOR = BLOCKS.register("oxidized_copper_trapdoor", () -> new WeatheringTrapDoorBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_COPPER_TRAPDOOR = BLOCKS.register("waxed_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_TRAPDOOR = BLOCKS.register("waxed_exposed_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_TRAPDOOR = BLOCKS.register("waxed_weathered_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_TRAPDOOR = BLOCKS.register("waxed_oxidized_copper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).noOcclusion(), SillyOdditiesBlockSetTypes.COPPER));

    public static final RegistryObject<Block> COPPER_BULB = BLOCKS.register("copper_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).sound(SillyOdditiesSounds.COPPER_BULB)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BULB = BLOCKS.register("exposed_copper_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 12 : 0).sound(SillyOdditiesSounds.COPPER_BULB)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BULB = BLOCKS.register("weathered_copper_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 8 : 0).sound(SillyOdditiesSounds.COPPER_BULB)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BULB = BLOCKS.register("oxidized_copper_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 4 : 0).sound(SillyOdditiesSounds.COPPER_BULB)));
    public static final RegistryObject<Block> WAXED_COPPER_BULB = BLOCKS.register("waxed_copper_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).sound(SillyOdditiesSounds.COPPER_BULB)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BULB = BLOCKS.register("waxed_exposed_copper_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 12 : 0).sound(SillyOdditiesSounds.COPPER_BULB)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BULB = BLOCKS.register("waxed_weathered_copper_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 8 : 0).sound(SillyOdditiesSounds.COPPER_BULB)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BULB = BLOCKS.register("waxed_oxidized_copper_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 4 : 0).sound(SillyOdditiesSounds.COPPER_BULB)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static void setupBlocks() {
        FluffyFurBlocks.weatheringCopper(CHISELED_COPPER.get(), EXPOSED_CHISELED_COPPER.get());
        FluffyFurBlocks.weatheringCopper(EXPOSED_CHISELED_COPPER.get(), WEATHERED_CHISELED_COPPER.get());
        FluffyFurBlocks.weatheringCopper(WEATHERED_CHISELED_COPPER.get(), OXIDIZED_CHISELED_COPPER.get());
        FluffyFurBlocks.weatheringCopper(COPPER_GRATE.get(), EXPOSED_COPPER_GRATE.get());
        FluffyFurBlocks.weatheringCopper(EXPOSED_COPPER_GRATE.get(), WEATHERED_COPPER_GRATE.get());
        FluffyFurBlocks.weatheringCopper(WEATHERED_COPPER_GRATE.get(), OXIDIZED_COPPER_GRATE.get());
        FluffyFurBlocks.weatheringCopper(COPPER_DOOR.get(), EXPOSED_COPPER_DOOR.get());
        FluffyFurBlocks.weatheringCopper(EXPOSED_COPPER_DOOR.get(), WEATHERED_COPPER_DOOR.get());
        FluffyFurBlocks.weatheringCopper(WEATHERED_COPPER_DOOR.get(), OXIDIZED_COPPER_DOOR.get());
        FluffyFurBlocks.weatheringCopper(COPPER_TRAPDOOR.get(), EXPOSED_COPPER_TRAPDOOR.get());
        FluffyFurBlocks.weatheringCopper(EXPOSED_COPPER_TRAPDOOR.get(), WEATHERED_COPPER_TRAPDOOR.get());
        FluffyFurBlocks.weatheringCopper(WEATHERED_COPPER_TRAPDOOR.get(), OXIDIZED_COPPER_TRAPDOOR.get());
        FluffyFurBlocks.weatheringCopper(COPPER_BULB.get(), EXPOSED_COPPER_BULB.get());
        FluffyFurBlocks.weatheringCopper(EXPOSED_COPPER_BULB.get(), WEATHERED_COPPER_BULB.get());
        FluffyFurBlocks.weatheringCopper(WEATHERED_COPPER_BULB.get(), OXIDIZED_COPPER_BULB.get());

        FluffyFurBlocks.waxedCopper(CHISELED_COPPER.get(), WAXED_CHISELED_COPPER.get());
        FluffyFurBlocks.waxedCopper(EXPOSED_CHISELED_COPPER.get(), WAXED_EXPOSED_CHISELED_COPPER.get());
        FluffyFurBlocks.waxedCopper(WEATHERED_CHISELED_COPPER.get(), WAXED_WEATHERED_CHISELED_COPPER.get());
        FluffyFurBlocks.waxedCopper(OXIDIZED_CHISELED_COPPER.get(), WAXED_OXIDIZED_CHISELED_COPPER.get());
        FluffyFurBlocks.waxedCopper(COPPER_GRATE.get(), WAXED_COPPER_GRATE.get());
        FluffyFurBlocks.waxedCopper(EXPOSED_COPPER_GRATE.get(), WAXED_EXPOSED_COPPER_GRATE.get());
        FluffyFurBlocks.waxedCopper(WEATHERED_COPPER_GRATE.get(), WAXED_WEATHERED_COPPER_GRATE.get());
        FluffyFurBlocks.waxedCopper(OXIDIZED_COPPER_GRATE.get(), WAXED_OXIDIZED_COPPER_GRATE.get());
        FluffyFurBlocks.waxedCopper(COPPER_DOOR.get(), WAXED_COPPER_DOOR.get());
        FluffyFurBlocks.waxedCopper(EXPOSED_COPPER_DOOR.get(), WAXED_EXPOSED_COPPER_DOOR.get());
        FluffyFurBlocks.waxedCopper(WEATHERED_COPPER_DOOR.get(), WAXED_WEATHERED_COPPER_DOOR.get());
        FluffyFurBlocks.waxedCopper(OXIDIZED_COPPER_DOOR.get(), WAXED_OXIDIZED_COPPER_DOOR.get());
        FluffyFurBlocks.waxedCopper(COPPER_TRAPDOOR.get(), WAXED_COPPER_TRAPDOOR.get());
        FluffyFurBlocks.waxedCopper(EXPOSED_COPPER_TRAPDOOR.get(), WAXED_EXPOSED_COPPER_TRAPDOOR.get());
        FluffyFurBlocks.waxedCopper(WEATHERED_COPPER_TRAPDOOR.get(), WAXED_WEATHERED_COPPER_TRAPDOOR.get());
        FluffyFurBlocks.waxedCopper(OXIDIZED_COPPER_TRAPDOOR.get(), WAXED_OXIDIZED_COPPER_TRAPDOOR.get());
        FluffyFurBlocks.waxedCopper(COPPER_BULB.get(), WAXED_COPPER_BULB.get());
        FluffyFurBlocks.waxedCopper(EXPOSED_COPPER_BULB.get(), WAXED_EXPOSED_COPPER_BULB.get());
        FluffyFurBlocks.waxedCopper(WEATHERED_COPPER_BULB.get(), WAXED_WEATHERED_COPPER_BULB.get());
        FluffyFurBlocks.waxedCopper(OXIDIZED_COPPER_BULB.get(), WAXED_OXIDIZED_COPPER_BULB.get());

        if (SillyOdditiesWizardsReborn.isLoaded()) {
            SillyOdditiesWizardsReborn.LoadedOnly.setupBlocks();
        }
    }
}
