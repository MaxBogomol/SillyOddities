package mod.maxbogomol.silly_oddities.registry.common.item;

import mod.maxbogomol.fluffy_fur.common.item.FuelBlockItem;
import mod.maxbogomol.fluffy_fur.registry.common.item.FluffyFurItems;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.common.item.GrassBushItem;
import mod.maxbogomol.silly_oddities.common.item.NothingItem;
import mod.maxbogomol.silly_oddities.registry.common.block.SillyOdditiesBlocks;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SillyOdditiesItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SillyOddities.MOD_ID);

    public static final RegistryObject<Item> TUFF_STAIRS = ITEMS.register("tuff_stairs", () -> new BlockItem(SillyOdditiesBlocks.TUFF_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUFF_SLAB = ITEMS.register("tuff_slab", () -> new BlockItem(SillyOdditiesBlocks.TUFF_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUFF_WALL = ITEMS.register("tuff_wall", () -> new BlockItem(SillyOdditiesBlocks.TUFF_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_TUFF = ITEMS.register("chiseled_tuff", () -> new BlockItem(SillyOdditiesBlocks.CHISELED_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF = ITEMS.register("polished_tuff", () -> new BlockItem(SillyOdditiesBlocks.POLISHED_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_STAIRS = ITEMS.register("polished_tuff_stairs", () -> new BlockItem(SillyOdditiesBlocks.POLISHED_TUFF_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_SLAB = ITEMS.register("polished_tuff_slab", () -> new BlockItem(SillyOdditiesBlocks.POLISHED_TUFF_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_WALL = ITEMS.register("polished_tuff_wall", () -> new BlockItem(SillyOdditiesBlocks.POLISHED_TUFF_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUFF_BRICKS = ITEMS.register("tuff_bricks", () -> new BlockItem(SillyOdditiesBlocks.TUFF_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUFF_BRICKS_STAIRS = ITEMS.register("tuff_bricks_stairs", () -> new BlockItem(SillyOdditiesBlocks.TUFF_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUFF_BRICKS_SLAB = ITEMS.register("tuff_bricks_slab", () -> new BlockItem(SillyOdditiesBlocks.TUFF_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUFF_BRICKS_WALL = ITEMS.register("tuff_bricks_wall", () -> new BlockItem(SillyOdditiesBlocks.TUFF_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_TUFF_BRICKS = ITEMS.register("chiseled_tuff_bricks", () -> new BlockItem(SillyOdditiesBlocks.CHISELED_TUFF_BRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHISELED_COPPER = ITEMS.register("chiseled_copper", () -> new BlockItem(SillyOdditiesBlocks.CHISELED_COPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_CHISELED_COPPER = ITEMS.register("exposed_chiseled_copper", () -> new BlockItem(SillyOdditiesBlocks.EXPOSED_CHISELED_COPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_CHISELED_COPPER = ITEMS.register("weathered_chiseled_copper", () -> new BlockItem(SillyOdditiesBlocks.WEATHERED_CHISELED_COPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_CHISELED_COPPER = ITEMS.register("oxidized_chiseled_copper", () -> new BlockItem(SillyOdditiesBlocks.OXIDIZED_CHISELED_COPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_CHISELED_COPPER = ITEMS.register("waxed_chiseled_copper", () -> new BlockItem(SillyOdditiesBlocks.WAXED_CHISELED_COPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_EXPOSED_CHISELED_COPPER = ITEMS.register("waxed_exposed_chiseled_copper", () -> new BlockItem(SillyOdditiesBlocks.WAXED_EXPOSED_CHISELED_COPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_WEATHERED_CHISELED_COPPER = ITEMS.register("waxed_weathered_chiseled_copper", () -> new BlockItem(SillyOdditiesBlocks.WAXED_WEATHERED_CHISELED_COPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_OXIDIZED_CHISELED_COPPER = ITEMS.register("waxed_oxidized_chiseled_copper", () -> new BlockItem(SillyOdditiesBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get(), new Item.Properties()));

    public static final RegistryObject<Item> COPPER_GRATE = ITEMS.register("copper_grate", () -> new BlockItem(SillyOdditiesBlocks.COPPER_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_GRATE = ITEMS.register("exposed_copper_grate", () -> new BlockItem(SillyOdditiesBlocks.EXPOSED_COPPER_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_GRATE = ITEMS.register("weathered_copper_grate", () -> new BlockItem(SillyOdditiesBlocks.WEATHERED_COPPER_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_GRATE = ITEMS.register("oxidized_copper_grate", () -> new BlockItem(SillyOdditiesBlocks.OXIDIZED_COPPER_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_GRATE = ITEMS.register("waxed_copper_grate", () -> new BlockItem(SillyOdditiesBlocks.WAXED_COPPER_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_GRATE = ITEMS.register("waxed_exposed_copper_grate", () -> new BlockItem(SillyOdditiesBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_GRATE = ITEMS.register("waxed_weathered_copper_grate", () -> new BlockItem(SillyOdditiesBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_GRATE = ITEMS.register("waxed_oxidized_copper_grate", () -> new BlockItem(SillyOdditiesBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> COPPER_DOOR = ITEMS.register("copper_door", () -> new BlockItem(SillyOdditiesBlocks.COPPER_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_DOOR = ITEMS.register("exposed_copper_door", () -> new BlockItem(SillyOdditiesBlocks.EXPOSED_COPPER_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_DOOR = ITEMS.register("weathered_copper_door", () -> new BlockItem(SillyOdditiesBlocks.WEATHERED_COPPER_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_DOOR = ITEMS.register("oxidized_copper_door", () -> new BlockItem(SillyOdditiesBlocks.OXIDIZED_COPPER_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_DOOR = ITEMS.register("waxed_copper_door", () -> new BlockItem(SillyOdditiesBlocks.WAXED_COPPER_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_DOOR = ITEMS.register("waxed_exposed_copper_door", () -> new BlockItem(SillyOdditiesBlocks.WAXED_EXPOSED_COPPER_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_DOOR = ITEMS.register("waxed_weathered_copper_door", () -> new BlockItem(SillyOdditiesBlocks.WAXED_WEATHERED_COPPER_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_DOOR = ITEMS.register("waxed_oxidized_copper_door", () -> new BlockItem(SillyOdditiesBlocks.WAXED_OXIDIZED_COPPER_DOOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> COPPER_TRAPDOOR = ITEMS.register("copper_trapdoor", () -> new BlockItem(SillyOdditiesBlocks.COPPER_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_TRAPDOOR = ITEMS.register("exposed_copper_trapdoor", () -> new BlockItem(SillyOdditiesBlocks.EXPOSED_COPPER_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_TRAPDOOR = ITEMS.register("weathered_copper_trapdoor", () -> new BlockItem(SillyOdditiesBlocks.WEATHERED_COPPER_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_TRAPDOOR = ITEMS.register("oxidized_copper_trapdoor", () -> new BlockItem(SillyOdditiesBlocks.OXIDIZED_COPPER_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_TRAPDOOR = ITEMS.register("waxed_copper_trapdoor", () -> new BlockItem(SillyOdditiesBlocks.WAXED_COPPER_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_TRAPDOOR = ITEMS.register("waxed_exposed_copper_trapdoor", () -> new BlockItem(SillyOdditiesBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_TRAPDOOR = ITEMS.register("waxed_weathered_copper_trapdoor", () -> new BlockItem(SillyOdditiesBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_TRAPDOOR = ITEMS.register("waxed_oxidized_copper_trapdoor", () -> new BlockItem(SillyOdditiesBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> COPPER_BULB = ITEMS.register("copper_bulb", () -> new BlockItem(SillyOdditiesBlocks.COPPER_BULB.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_BULB = ITEMS.register("exposed_copper_bulb", () -> new BlockItem(SillyOdditiesBlocks.EXPOSED_COPPER_BULB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_BULB = ITEMS.register("weathered_copper_bulb", () -> new BlockItem(SillyOdditiesBlocks.WEATHERED_COPPER_BULB.get(), new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_BULB = ITEMS.register("oxidized_copper_bulb", () -> new BlockItem(SillyOdditiesBlocks.OXIDIZED_COPPER_BULB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_COPPER_BULB = ITEMS.register("waxed_copper_bulb", () -> new BlockItem(SillyOdditiesBlocks.WAXED_COPPER_BULB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_BULB = ITEMS.register("waxed_exposed_copper_bulb", () -> new BlockItem(SillyOdditiesBlocks.WAXED_EXPOSED_COPPER_BULB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_BULB = ITEMS.register("waxed_weathered_copper_bulb", () -> new BlockItem(SillyOdditiesBlocks.WAXED_WEATHERED_COPPER_BULB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_BULB = ITEMS.register("waxed_oxidized_copper_bulb", () -> new BlockItem(SillyOdditiesBlocks.WAXED_OXIDIZED_COPPER_BULB.get(), new Item.Properties()));

    public static final RegistryObject<Item> LEAF_LITTER = ITEMS.register("leaf_litter", () -> new FuelBlockItem(SillyOdditiesBlocks.LEAF_LITTER.get(), new Item.Properties(), 100));
    public static final RegistryObject<Item> WILDFLOWERS = ITEMS.register("wildflowers", () -> new BlockItem(SillyOdditiesBlocks.WILDFLOWERS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BUSH = ITEMS.register("bush", () -> new GrassBushItem(SillyOdditiesBlocks.BUSH.get(), new Item.Properties()));
    public static final RegistryObject<Item> FIREFLY_BUSH = ITEMS.register("firefly_bush", () -> new BlockItem(SillyOdditiesBlocks.FIREFLY_BUSH.get(), new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_FLOWER = ITEMS.register("cactus_flower", () -> new BlockItem(SillyOdditiesBlocks.CACTUS_FLOWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SHORT_DRY_GRASS = ITEMS.register("short_dry_grass", () -> new BlockItem(SillyOdditiesBlocks.SHORT_DRY_GRASS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TALL_DRY_GRASS = ITEMS.register("tall_dry_grass", () -> new BlockItem(SillyOdditiesBlocks.TALL_DRY_GRASS.get(), new Item.Properties()));

    public static final RegistryObject<Item> WHITE_BUNDLE = ITEMS.register("white_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIGHT_GRAY_BUNDLE = ITEMS.register("light_gray_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GRAY_BUNDLE = ITEMS.register("gray_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLACK_BUNDLE = ITEMS.register("black_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BROWN_BUNDLE = ITEMS.register("brown_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RED_BUNDLE = ITEMS.register("red_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ORANGE_BUNDLE = ITEMS.register("orange_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> YELLOW_BUNDLE = ITEMS.register("yellow_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIME_BUNDLE = ITEMS.register("lime_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GREEN_BUNDLE = ITEMS.register("green_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CYAN_BUNDLE = ITEMS.register("cyan_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIGHT_BLUE_BUNDLE = ITEMS.register("light_blue_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLUE_BUNDLE = ITEMS.register("blue_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PURPLE_BUNDLE = ITEMS.register("purple_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAGENTA_BUNDLE = ITEMS.register("magenta_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINK_BUNDLE = ITEMS.register("pink_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RAINBOW_BUNDLE = ITEMS.register("rainbow_bundle", () -> new BundleItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> NOTHING = ITEMS.register("nothing", () -> new NothingItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    @Mod.EventBusSubscriber(modid = SillyOddities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientRegistryEvents {
        @SubscribeEvent
        public static void registerItems(FMLClientSetupEvent event) {
            bundleItemProperties(WHITE_BUNDLE.get());
            bundleItemProperties(LIGHT_GRAY_BUNDLE.get());
            bundleItemProperties(GRAY_BUNDLE.get());
            bundleItemProperties(BLACK_BUNDLE.get());
            bundleItemProperties(BROWN_BUNDLE.get());
            bundleItemProperties(RED_BUNDLE.get());
            bundleItemProperties(ORANGE_BUNDLE.get());
            bundleItemProperties(YELLOW_BUNDLE.get());
            bundleItemProperties(LIME_BUNDLE.get());
            bundleItemProperties(GREEN_BUNDLE.get());
            bundleItemProperties(CYAN_BUNDLE.get());
            bundleItemProperties(LIGHT_BLUE_BUNDLE.get());
            bundleItemProperties(BLUE_BUNDLE.get());
            bundleItemProperties(PURPLE_BUNDLE.get());
            bundleItemProperties(MAGENTA_BUNDLE.get());
            bundleItemProperties(PINK_BUNDLE.get());
            bundleItemProperties(RAINBOW_BUNDLE.get());
        }

        @SubscribeEvent
        public static void registerItemColorHandlers(RegisterColorHandlersEvent.Item event) {
            event.register(new GrassBushItem.ColorHandler(), BUSH.get());
        }
    }

    public static void setupItems() {
        FluffyFurItems.composterItem(0.3F, LEAF_LITTER.get());
        FluffyFurItems.composterItem(0.3F, WILDFLOWERS.get());
        FluffyFurItems.composterItem(0.3F, BUSH.get());
        FluffyFurItems.composterItem(0.3F, FIREFLY_BUSH.get());
        FluffyFurItems.composterItem(0.1F, CACTUS_FLOWER.get());
        FluffyFurItems.composterItem(0.3F, SHORT_DRY_GRASS.get());
        FluffyFurItems.composterItem(0.3F, TALL_DRY_GRASS.get());
    }

    @OnlyIn(Dist.CLIENT)
    public static void bundleItemProperties(Item item) {
        ItemProperties.register(item, new ResourceLocation("filled"), (stack, level, entity, seed) -> BundleItem.getFullnessDisplay(stack));
    }
}
