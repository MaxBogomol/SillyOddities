package mod.maxbogomol.silly_oddities.registry.common.item;

import mod.maxbogomol.fluffy_fur.util.ColorUtil;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.silly_oddities.registry.common.SillyOdditiesPaintings;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.decoration.PaintingVariant;
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

            event.accept(getPaintingItem(SillyOdditiesPaintings.MEDITATIVE));
            event.accept(getPaintingItem(SillyOdditiesPaintings.PRAIRE_RIDE));
            event.accept(getPaintingItem(SillyOdditiesPaintings.BAROQUE));
            event.accept(getPaintingItem(SillyOdditiesPaintings.HUMBLE));
            event.accept(getPaintingItem(SillyOdditiesPaintings.UNPACKED));
            event.accept(getPaintingItem(SillyOdditiesPaintings.BACKYARD));
            event.accept(getPaintingItem(SillyOdditiesPaintings.BOUQUET));
            event.accept(getPaintingItem(SillyOdditiesPaintings.CAVEBIRD));
            event.accept(getPaintingItem(SillyOdditiesPaintings.CHANGING));
            event.accept(getPaintingItem(SillyOdditiesPaintings.COTAN));
            event.accept(getPaintingItem(SillyOdditiesPaintings.ENDBOSS));
            event.accept(getPaintingItem(SillyOdditiesPaintings.FERN));
            event.accept(getPaintingItem(SillyOdditiesPaintings.FINDING));
            event.accept(getPaintingItem(SillyOdditiesPaintings.LOWMIST));
            event.accept(getPaintingItem(SillyOdditiesPaintings.ORB));
            event.accept(getPaintingItem(SillyOdditiesPaintings.OWLEMONS));
            event.accept(getPaintingItem(SillyOdditiesPaintings.PASSAGE));
            event.accept(getPaintingItem(SillyOdditiesPaintings.POND));
            event.accept(getPaintingItem(SillyOdditiesPaintings.SUNFLOWERS));
            event.accept(getPaintingItem(SillyOdditiesPaintings.TIDES));

            if (SillyOdditiesWizardsReborn.isLoaded()) {
                //OAK
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_OAK_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_OAK_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_OAK_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SMOKING_PIPE);
                //SPRUCE
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_SPRUCE_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_SPRUCE_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SMOKING_PIPE);
                //BIRCH
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BIRCH_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_BIRCH_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SMOKING_PIPE);
                //JUNGLE
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_JUNGLE_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_JUNGLE_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SMOKING_PIPE);
                //ACACIA
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_ACACIA_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_ACACIA_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SMOKING_PIPE);
                //DARK_OAK
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_DARK_OAK_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_DARK_OAK_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SMOKING_PIPE);
                //MANGROVE
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_MANGROVE_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_MANGROVE_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SMOKING_PIPE);
                //CHERRY
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_CHERRY_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_CHERRY_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SMOKING_PIPE);
                //BAMBOO
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BAMBOO_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_MOSAIC_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_BAMBOO_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_BAMBOO_MOSAIC);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BAMBOO_SMOKING_PIPE);
                //CRIMSON
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_CRIMSON_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_CRIMSON_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SMOKING_PIPE);
                //WARPED
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_WARPED_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_WARPED_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_PLANKS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_PLANKS_CROSS_BAULK);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_PEDESTAL);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_GLASS_FRAME);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_WISSEN_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_LIGHT_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_FLUID_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_STEAM_CASING);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_WARPED_PLANKS);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SALT_TORCH);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SALT_LANTERN);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SALT_CAMPFIRE);
                event.accept(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SMOKING_PIPE);

                if (SillyOdditiesWizardsReborn.MalumLoadedOnly.isLoaded()) {
                    //RUNEWOOD
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.STRIPPED_RUNEWOOD_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_BOARDS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_PLANKS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_TILES_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_PEDESTAL);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_FRAME);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_GLASS_FRAME);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_WISSEN_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_LIGHT_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_FLUID_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_STEAM_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_RUNEWOOD_BOARDS);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_RUNEWOOD_PLANKS);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_RUNEWOOD_TILES);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SALT_TORCH);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SALT_LANTERN);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SALT_CAMPFIRE);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SMOKING_PIPE);
                    //SOULWOOD
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.STRIPPED_SOULWOOD_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_BOARDS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_PLANKS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_TILES_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_TILES_CROSS_BAULK);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_PEDESTAL);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_FRAME);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_GLASS_FRAME);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_WISSEN_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_LIGHT_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_FLUID_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_STEAM_CASING);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_SOULWOOD_BOARDS);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_SOULWOOD_PLANKS);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_SOULWOOD_TILES);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SALT_TORCH);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SALT_LANTERN);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SALT_CAMPFIRE);
                    event.accept(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SMOKING_PIPE);
                }
            }
        }
    }

    public static ItemStack getPaintingItem(RegistryObject<PaintingVariant> paintingVariant) {
        ItemStack itemStack = new ItemStack(Items.PAINTING);
        CompoundTag compoundtag = itemStack.getOrCreateTagElement("EntityTag");
        Painting.storeVariant(compoundtag, paintingVariant.getHolder().get());
        return itemStack;
    }
}