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
        }
    }
}