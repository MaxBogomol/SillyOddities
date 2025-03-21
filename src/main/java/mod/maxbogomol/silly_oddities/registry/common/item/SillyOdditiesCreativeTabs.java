package mod.maxbogomol.silly_oddities.registry.common.item;

import mod.maxbogomol.fluffy_fur.util.ColorUtil;
import mod.maxbogomol.silly_oddities.SillyOddities;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = SillyOddities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SillyOdditiesCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SillyOddities.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SILLY_ODDITIES = CREATIVE_MODE_TABS.register("tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.BUNDLE))
                    .title(Component.translatable("creative_tab.silly_oddities"))
                    .withLabelColor(ColorUtil.packColor(255, 55, 48, 54))
                    .withBackgroundLocation(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_item_tab.png"))
                    .withTabsImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_tabs.png"))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static void addCreativeTabContent(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == SillyOdditiesCreativeTabs.SILLY_ODDITIES.getKey()) {
            event.accept(Items.BUNDLE);
            event.accept(SillyOdditiesItems.WHITE_BUNDLE);
            event.accept(SillyOdditiesItems.LIGHT_GRAY_BUNDLE);
            event.accept(SillyOdditiesItems.GRAY_BUNDLE);
            event.accept(SillyOdditiesItems.BLACK_BUNDLE);
            event.accept(SillyOdditiesItems.BROWN_BUNDLE);
            event.accept(SillyOdditiesItems.RED_BUNDLE);
            event.accept(SillyOdditiesItems.ORANGE_BUNDLE);
            event.accept(SillyOdditiesItems.YELLOW_BUNDLE);
            event.accept(SillyOdditiesItems.LIME_BUNDLE);
            event.accept(SillyOdditiesItems.GREEN_BUNDLE);
            event.accept(SillyOdditiesItems.CYAN_BUNDLE);
            event.accept(SillyOdditiesItems.LIGHT_BLUE_BUNDLE);
            event.accept(SillyOdditiesItems.BLUE_BUNDLE);
            event.accept(SillyOdditiesItems.PURPLE_BUNDLE);
            event.accept(SillyOdditiesItems.MAGENTA_BUNDLE);
            event.accept(SillyOdditiesItems.PINK_BUNDLE);
            event.accept(SillyOdditiesItems.RAINBOW_BUNDLE);

            event.accept(Items.TUFF);
            event.accept(SillyOdditiesItems.TUFF_STAIRS);
            event.accept(SillyOdditiesItems.TUFF_SLAB);
            event.accept(SillyOdditiesItems.TUFF_WALL);
            event.accept(SillyOdditiesItems.CHISELED_TUFF);
            event.accept(SillyOdditiesItems.POLISHED_TUFF);
            event.accept(SillyOdditiesItems.POLISHED_TUFF_STAIRS);
            event.accept(SillyOdditiesItems.POLISHED_TUFF_SLAB);
            event.accept(SillyOdditiesItems.POLISHED_TUFF_WALL);
            event.accept(SillyOdditiesItems.TUFF_BRICKS);
            event.accept(SillyOdditiesItems.TUFF_BRICKS_STAIRS);
            event.accept(SillyOdditiesItems.TUFF_BRICKS_SLAB);
            event.accept(SillyOdditiesItems.TUFF_BRICKS_WALL);
            event.accept(SillyOdditiesItems.CHISELED_TUFF_BRICKS);

            event.accept(SillyOdditiesItems.CHISELED_COPPER);
            event.accept(SillyOdditiesItems.EXPOSED_CHISELED_COPPER);
            event.accept(SillyOdditiesItems.WEATHERED_CHISELED_COPPER);
            event.accept(SillyOdditiesItems.OXIDIZED_CHISELED_COPPER);
            event.accept(SillyOdditiesItems.WAXED_CHISELED_COPPER);
            event.accept(SillyOdditiesItems.WAXED_EXPOSED_CHISELED_COPPER);
            event.accept(SillyOdditiesItems.WAXED_WEATHERED_CHISELED_COPPER);
            event.accept(SillyOdditiesItems.WAXED_OXIDIZED_CHISELED_COPPER);

            event.accept(SillyOdditiesItems.COPPER_GRATE);
            event.accept(SillyOdditiesItems.EXPOSED_COPPER_GRATE);
            event.accept(SillyOdditiesItems.WEATHERED_COPPER_GRATE);
            event.accept(SillyOdditiesItems.OXIDIZED_COPPER_GRATE);
            event.accept(SillyOdditiesItems.WAXED_COPPER_GRATE);
            event.accept(SillyOdditiesItems.WAXED_EXPOSED_COPPER_GRATE);
            event.accept(SillyOdditiesItems.WAXED_WEATHERED_COPPER_GRATE);
            event.accept(SillyOdditiesItems.WAXED_OXIDIZED_COPPER_GRATE);

            event.accept(SillyOdditiesItems.COPPER_DOOR);
            event.accept(SillyOdditiesItems.EXPOSED_COPPER_DOOR);
            event.accept(SillyOdditiesItems.WEATHERED_COPPER_DOOR);
            event.accept(SillyOdditiesItems.OXIDIZED_COPPER_DOOR);
            event.accept(SillyOdditiesItems.WAXED_COPPER_DOOR);
            event.accept(SillyOdditiesItems.WAXED_EXPOSED_COPPER_DOOR);
            event.accept(SillyOdditiesItems.WAXED_WEATHERED_COPPER_DOOR);
            event.accept(SillyOdditiesItems.WAXED_OXIDIZED_COPPER_DOOR);

            event.accept(SillyOdditiesItems.COPPER_TRAPDOOR);
            event.accept(SillyOdditiesItems.EXPOSED_COPPER_TRAPDOOR);
            event.accept(SillyOdditiesItems.WEATHERED_COPPER_TRAPDOOR);
            event.accept(SillyOdditiesItems.OXIDIZED_COPPER_TRAPDOOR);
            event.accept(SillyOdditiesItems.WAXED_COPPER_TRAPDOOR);
            event.accept(SillyOdditiesItems.WAXED_EXPOSED_COPPER_TRAPDOOR);
            event.accept(SillyOdditiesItems.WAXED_WEATHERED_COPPER_TRAPDOOR);
            event.accept(SillyOdditiesItems.WAXED_OXIDIZED_COPPER_TRAPDOOR);

            event.accept(SillyOdditiesItems.COPPER_BULB);
            event.accept(SillyOdditiesItems.EXPOSED_COPPER_BULB);
            event.accept(SillyOdditiesItems.WEATHERED_COPPER_BULB);
            event.accept(SillyOdditiesItems.OXIDIZED_COPPER_BULB);
            event.accept(SillyOdditiesItems.WAXED_COPPER_BULB);
            event.accept(SillyOdditiesItems.WAXED_EXPOSED_COPPER_BULB);
            event.accept(SillyOdditiesItems.WAXED_WEATHERED_COPPER_BULB);
            event.accept(SillyOdditiesItems.WAXED_OXIDIZED_COPPER_BULB);
        }
    }
}