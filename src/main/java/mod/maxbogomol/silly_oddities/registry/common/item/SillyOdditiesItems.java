package mod.maxbogomol.silly_oddities.registry.common.item;

import mod.maxbogomol.silly_oddities.SillyOddities;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SillyOdditiesItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SillyOddities.MOD_ID);

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
    }

    public static void bundleItemProperties(Item item) {
        ItemProperties.register(item, new ResourceLocation("filled"), (stack, level, entity, seed) -> BundleItem.getFullnessDisplay(stack));
    }
}
