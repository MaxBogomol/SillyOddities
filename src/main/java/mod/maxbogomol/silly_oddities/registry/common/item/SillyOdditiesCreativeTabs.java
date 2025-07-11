package mod.maxbogomol.silly_oddities.registry.common.item;

import mod.maxbogomol.fluffy_fur.common.creativetab.MultiCreativeTab;
import mod.maxbogomol.fluffy_fur.common.creativetab.SubCreativeTab;
import mod.maxbogomol.fluffy_fur.common.creativetab.SubCreativeTabStack;
import mod.maxbogomol.fluffy_fur.util.ColorUtil;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.config.SillyOdditiesConfig;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.silly_oddities.registry.common.painting.SillyOdditiesPaintings;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.entity.decoration.PaintingVariants;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;
import java.util.function.Supplier;

public class SillyOdditiesCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SillyOddities.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SILLY_ODDITIES = CREATIVE_MODE_TABS.register("tab",
            () -> MultiCreativeTab.builder().icon(() -> new ItemStack(Items.BUNDLE))
                    .title(Component.translatable("creative_tab.silly_oddities"))
                    .withLabelColor(ColorUtil.packColor(255, 55, 48, 54))
                    .withBackgroundLocation(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_item_tab.png"))
                    .withTabsImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_tabs.png"))
                    .withSubArrowsImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_sub_arrows.png"))
                    .multiBuild());

    public static final SubCreativeTabStack ALL =
            SubCreativeTabStack.create()
                    .subTitle(Component.translatable("creative_tab.silly_oddities"))
                    .withSubTabImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_sub_tab.png"));

    public static final SubCreativeTab TUFF =
            SubCreativeTab.create().subIcon(() -> new ItemStack(SillyOdditiesItems.CHISELED_TUFF.get()))
                    .title(Component.translatable("creative_tab.silly_oddities").append(": ").append(Component.translatable("creative_tab.silly_oddities.sub.tuff")))
                    .subTitle(Component.translatable("creative_tab.silly_oddities.sub.tuff"))
                    .withSubTabImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_sub_tab.png"))
                    .setSubShow(() -> SillyOdditiesConfig.TUFF_DATAPACK.get());

    public static final SubCreativeTab COPPER =
            SubCreativeTab.create().subIcon(() -> new ItemStack(SillyOdditiesItems.CHISELED_COPPER.get()))
                    .title(Component.translatable("creative_tab.silly_oddities").append(": ").append(Component.translatable("creative_tab.silly_oddities.sub.copper")))
                    .subTitle(Component.translatable("creative_tab.silly_oddities.sub.copper"))
                    .withSubTabImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_sub_tab.png"))
                    .setSubShow(() -> SillyOdditiesConfig.COPPER_DATAPACK.get());

    public static final SubCreativeTab PLANTS =
            SubCreativeTab.create().subIcon(() -> new ItemStack(SillyOdditiesItems.WILDFLOWERS.get()))
                    .title(Component.translatable("creative_tab.silly_oddities").append(": ").append(Component.translatable("creative_tab.silly_oddities.sub.plants")))
                    .subTitle(Component.translatable("creative_tab.silly_oddities.sub.plants"))
                    .withSubTabImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_sub_tab.png"))
                    .setSubShow(() -> SillyOdditiesConfig.PLANTS_DATAPACK.get());

    public static final SubCreativeTab BUNDLES =
            SubCreativeTab.create().subIcon(() -> new ItemStack(SillyOdditiesItems.PINK_BUNDLE.get()))
                    .title(Component.translatable("creative_tab.silly_oddities").append(": ").append(Component.translatable("creative_tab.silly_oddities.sub.bundles")))
                    .subTitle(Component.translatable("creative_tab.silly_oddities.sub.bundles"))
                    .withSubTabImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_sub_tab.png"))
                    .setSubShow(() -> SillyOdditiesConfig.BUNDLES_DATAPACK.get());

    public static final SubCreativeTab PAINTINGS =
            SubCreativeTab.create().subIcon(() -> new ItemStack(Items.PAINTING))
                    .title(Component.translatable("creative_tab.silly_oddities").append(": ").append(Component.translatable("creative_tab.silly_oddities.sub.paintings")))
                    .subTitle(Component.translatable("creative_tab.silly_oddities.sub.paintings"))
                    .withSubTabImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_sub_tab.png"))
                    .setSubShow(() -> SillyOdditiesConfig.PAINTINGS_DATAPACK.get());

    public static final SubCreativeTab WIZARDS_REBORN =
            SubCreativeTab.create().subIcon(() -> new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_CASING.get()))
                    .title(Component.translatable("creative_tab.silly_oddities.sub").append(": ").append(Component.translatable("creative_tab.silly_oddities.sub.wizards_reborn")))
                    .subTitle(Component.translatable("creative_tab.silly_oddities.sub.wizards_reborn"))
                    .withSubTabImage(new ResourceLocation(SillyOddities.MOD_ID, "textures/gui/silly_oddities_sub_tab.png"))
                    .setSubShow(() -> SillyOdditiesConfig.WIZRDS_REBORN_INTEGRATION_DATAPACK.get());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static void init() {
        if (SillyOdditiesCreativeTabs.SILLY_ODDITIES.get() instanceof MultiCreativeTab multiCreativeTab) {
            multiCreativeTab.addSubTab(ALL);
            multiCreativeTab.addSubTab(TUFF);
            multiCreativeTab.addSubTab(COPPER);
            multiCreativeTab.addSubTab(PLANTS);
            multiCreativeTab.addSubTab(BUNDLES);
            multiCreativeTab.addSubTab(PAINTINGS);

            if (SillyOdditiesWizardsReborn.isLoaded()) {
                multiCreativeTab.addSubTab(WIZARDS_REBORN);
            }
        }
    }

    public static void addCreativeTabContent(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == SillyOdditiesCreativeTabs.SILLY_ODDITIES.getKey()) {
            boolean added = false;

            if (SillyOdditiesConfig.TUFF_DATAPACK.get()) {
                addInSub(event, TUFF, () -> Items.TUFF);
                addInSub(event, TUFF, SillyOdditiesItems.TUFF_STAIRS);
                addInSub(event, TUFF, SillyOdditiesItems.TUFF_SLAB);
                addInSub(event, TUFF, SillyOdditiesItems.TUFF_WALL);
                addInSub(event, TUFF, SillyOdditiesItems.CHISELED_TUFF);
                addInSub(event, TUFF, SillyOdditiesItems.POLISHED_TUFF);
                addInSub(event, TUFF, SillyOdditiesItems.POLISHED_TUFF_STAIRS);
                addInSub(event, TUFF, SillyOdditiesItems.POLISHED_TUFF_SLAB);
                addInSub(event, TUFF, SillyOdditiesItems.POLISHED_TUFF_WALL);
                addInSub(event, TUFF, SillyOdditiesItems.TUFF_BRICKS);
                addInSub(event, TUFF, SillyOdditiesItems.TUFF_BRICKS_STAIRS);
                addInSub(event, TUFF, SillyOdditiesItems.TUFF_BRICKS_SLAB);
                addInSub(event, TUFF, SillyOdditiesItems.TUFF_BRICKS_WALL);
                addInSub(event, TUFF, SillyOdditiesItems.CHISELED_TUFF_BRICKS);
                added = true;
            }

            if (SillyOdditiesConfig.COPPER_DATAPACK.get()) {
                addInSub(event, COPPER, SillyOdditiesItems.CHISELED_COPPER);
                addInSub(event, COPPER, SillyOdditiesItems.EXPOSED_CHISELED_COPPER);
                addInSub(event, COPPER, SillyOdditiesItems.WEATHERED_CHISELED_COPPER);
                addInSub(event, COPPER, SillyOdditiesItems.OXIDIZED_CHISELED_COPPER);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_CHISELED_COPPER);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_EXPOSED_CHISELED_COPPER);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_WEATHERED_CHISELED_COPPER);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_OXIDIZED_CHISELED_COPPER);

                addInSub(event, COPPER, SillyOdditiesItems.COPPER_GRATE);
                addInSub(event, COPPER, SillyOdditiesItems.EXPOSED_COPPER_GRATE);
                addInSub(event, COPPER, SillyOdditiesItems.WEATHERED_COPPER_GRATE);
                addInSub(event, COPPER, SillyOdditiesItems.OXIDIZED_COPPER_GRATE);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_COPPER_GRATE);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_EXPOSED_COPPER_GRATE);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_WEATHERED_COPPER_GRATE);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_OXIDIZED_COPPER_GRATE);

                addInSub(event, COPPER, SillyOdditiesItems.COPPER_DOOR);
                addInSub(event, COPPER, SillyOdditiesItems.EXPOSED_COPPER_DOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WEATHERED_COPPER_DOOR);
                addInSub(event, COPPER, SillyOdditiesItems.OXIDIZED_COPPER_DOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_COPPER_DOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_EXPOSED_COPPER_DOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_WEATHERED_COPPER_DOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_OXIDIZED_COPPER_DOOR);

                addInSub(event, COPPER, SillyOdditiesItems.COPPER_TRAPDOOR);
                addInSub(event, COPPER, SillyOdditiesItems.EXPOSED_COPPER_TRAPDOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WEATHERED_COPPER_TRAPDOOR);
                addInSub(event, COPPER, SillyOdditiesItems.OXIDIZED_COPPER_TRAPDOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_COPPER_TRAPDOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_EXPOSED_COPPER_TRAPDOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_WEATHERED_COPPER_TRAPDOOR);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_OXIDIZED_COPPER_TRAPDOOR);

                addInSub(event, COPPER, SillyOdditiesItems.COPPER_BULB);
                addInSub(event, COPPER, SillyOdditiesItems.EXPOSED_COPPER_BULB);
                addInSub(event, COPPER, SillyOdditiesItems.WEATHERED_COPPER_BULB);
                addInSub(event, COPPER, SillyOdditiesItems.OXIDIZED_COPPER_BULB);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_COPPER_BULB);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_EXPOSED_COPPER_BULB);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_WEATHERED_COPPER_BULB);
                addInSub(event, COPPER, SillyOdditiesItems.WAXED_OXIDIZED_COPPER_BULB);
                added = true;
            }

            if (SillyOdditiesConfig.PLANTS_DATAPACK.get()) {
                addInSub(event, PLANTS, SillyOdditiesItems.LEAF_LITTER);
                addInSub(event, PLANTS, SillyOdditiesItems.WILDFLOWERS);
                addInSub(event, PLANTS, SillyOdditiesItems.BUSH);
                addInSub(event, PLANTS, SillyOdditiesItems.FIREFLY_BUSH);
                addInSub(event, PLANTS, SillyOdditiesItems.CACTUS_FLOWER);
                addInSub(event, PLANTS, SillyOdditiesItems.SHORT_DRY_GRASS);
                addInSub(event, PLANTS, SillyOdditiesItems.TALL_DRY_GRASS);
                added = true;
            }

            if (SillyOdditiesConfig.BUNDLES_DATAPACK.get()) {
                addInSub(event, BUNDLES, () -> Items.BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.WHITE_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.LIGHT_GRAY_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.GRAY_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.BLACK_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.BROWN_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.RED_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.ORANGE_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.YELLOW_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.LIME_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.GREEN_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.CYAN_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.LIGHT_BLUE_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.BLUE_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.PURPLE_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.MAGENTA_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.PINK_BUNDLE);
                addInSub(event, BUNDLES, SillyOdditiesItems.RAINBOW_BUNDLE);
                added = true;
            }

            if (SillyOdditiesConfig.PAINTINGS_DATAPACK.get()) {
                addInSub(event, PAINTINGS, getPaintingItem(PaintingVariants.EARTH));
                addInSub(event, PAINTINGS, getPaintingItem(PaintingVariants.WIND));
                addInSub(event, PAINTINGS, getPaintingItem(PaintingVariants.WATER));
                addInSub(event, PAINTINGS, getPaintingItem(PaintingVariants.FIRE));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.MEDITATIVE));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.PRAIRE_RIDE));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.BAROQUE));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.HUMBLE));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.UNPACKED));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.BACKYARD));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.BOUQUET));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.CAVEBIRD));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.CHANGING));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.COTAN));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.ENDBOSS));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.FERN));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.FINDING));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.LOWMIST));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.ORB));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.OWLEMONS));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.PASSAGE));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.POND));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.SUNFLOWERS));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.TIDES));
                addInSub(event, PAINTINGS, getPaintingItem(SillyOdditiesPaintings.GOOD_BOY));
                added = true;
            }

            if (SillyOdditiesWizardsReborn.isLoaded() && SillyOdditiesConfig.WIZRDS_REBORN_INTEGRATION_DATAPACK.get()) {
                //OAK
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_OAK_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_OAK_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_OAK_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SMOKING_PIPE);
                //SPRUCE
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_SPRUCE_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_SPRUCE_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SMOKING_PIPE);
                //BIRCH
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BIRCH_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_BIRCH_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SMOKING_PIPE);
                //JUNGLE
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_JUNGLE_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_JUNGLE_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SMOKING_PIPE);
                //ACACIA
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_ACACIA_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_ACACIA_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SMOKING_PIPE);
                //DARK_OAK
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_DARK_OAK_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_DARK_OAK_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SMOKING_PIPE);
                //MANGROVE
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_MANGROVE_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_MANGROVE_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SMOKING_PIPE);
                //CHERRY
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_CHERRY_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_CHERRY_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SMOKING_PIPE);
                //BAMBOO
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BAMBOO_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_MOSAIC_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_BAMBOO_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_BAMBOO_MOSAIC);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BAMBOO_SMOKING_PIPE);
                //CRIMSON
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_CRIMSON_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_CRIMSON_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SMOKING_PIPE);
                //WARPED
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_WARPED_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_WARPED_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_PLANKS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_PLANKS_CROSS_BAULK);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_PEDESTAL);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_GLASS_FRAME);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_WISSEN_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_LIGHT_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_FLUID_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_STEAM_CASING);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.GILDED_WARPED_PLANKS);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SALT_TORCH);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SALT_LANTERN);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SALT_CAMPFIRE);
                addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SMOKING_PIPE);

                if (SillyOdditiesWizardsReborn.MalumLoadedOnly.isLoaded()) {
                    //RUNEWOOD
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.STRIPPED_RUNEWOOD_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_BOARDS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_PLANKS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_TILES_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_PEDESTAL);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_FRAME);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_GLASS_FRAME);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_WISSEN_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_LIGHT_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_FLUID_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_STEAM_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_RUNEWOOD_BOARDS);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_RUNEWOOD_PLANKS);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_RUNEWOOD_TILES);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SALT_TORCH);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SALT_LANTERN);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SALT_CAMPFIRE);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SMOKING_PIPE);
                    //SOULWOOD
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.STRIPPED_SOULWOOD_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_BOARDS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_PLANKS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_TILES_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_TILES_CROSS_BAULK);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_PEDESTAL);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_FRAME);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_GLASS_FRAME);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_WISSEN_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_LIGHT_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_FLUID_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_STEAM_CASING);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_SOULWOOD_BOARDS);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_SOULWOOD_PLANKS);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.GILDED_SOULWOOD_TILES);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SALT_TORCH);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SALT_LANTERN);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SALT_CAMPFIRE);
                    addInSub(event, WIZARDS_REBORN, SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SMOKING_PIPE);
                }
                added = true;
            }

            if (!added) {
                event.accept(SillyOdditiesItems.NOTHING);
            }
        }
    }

    public static void addInSub(BuildCreativeModeTabContentsEvent event, SubCreativeTab subTab, Supplier<? extends ItemLike> item) {
        event.accept(item);
        subTab.addDisplayItem(item.get());
    }

    public static void addInSub(BuildCreativeModeTabContentsEvent event, SubCreativeTab subTab, ItemStack item) {
        event.accept(item);
        subTab.addDisplayItem(item);
    }

    public static void addInSub(BuildCreativeModeTabContentsEvent event, SubCreativeTab subTab, Collection<ItemStack> items) {
        event.acceptAll(items);
        subTab.addDisplayItems(items);
    }

    public static ItemStack getPaintingItem(RegistryObject<PaintingVariant> paintingVariant) {
        ItemStack itemStack = new ItemStack(Items.PAINTING);
        CompoundTag compoundtag = itemStack.getOrCreateTagElement("EntityTag");
        Painting.storeVariant(compoundtag, paintingVariant.getHolder().get());
        return itemStack;
    }

    public static ItemStack getPaintingItem(ResourceKey<PaintingVariant> paintingVariant) {
        ItemStack itemStack = new ItemStack(Items.PAINTING);
        CompoundTag compoundtag = itemStack.getOrCreateTagElement("EntityTag");
        Painting.storeVariant(compoundtag, BuiltInRegistries.PAINTING_VARIANT.getHolderOrThrow(paintingVariant));
        return itemStack;
    }
}