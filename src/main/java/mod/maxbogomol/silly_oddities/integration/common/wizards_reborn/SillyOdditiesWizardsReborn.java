package mod.maxbogomol.silly_oddities.integration.common.wizards_reborn;

import com.sammy.malum.registry.common.SoundRegistry;
import com.sammy.malum.registry.common.block.BlockRegistry;
import mod.maxbogomol.fluffy_fur.registry.client.FluffyFurModels;
import mod.maxbogomol.fluffy_fur.registry.common.block.FluffyFurBlocks;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.common.item.SillyOdditiesRenderBlockItem;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.arcane_pedestal.SillyOdditiesArcanePedestalBlock;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.arcane_pedestal.SillyOdditiesArcanePedestalBlockEntity;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.baulk.SillyOdditiesCrossBaulkBlock;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.baulk.SillyOdditiesCrossBaulkBlockEntity;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.fluid.SillyOdditiesFluidCasingBlock;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.fluid.SillyOdditiesFluidCasingBlockEntity;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.light.SillyOdditiesLightCasingBlock;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.light.SillyOdditiesLightCasingBlockEntity;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.steam.SillyOdditiesSteamCasingBlock;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.steam.SillyOdditiesSteamCasingBlockEntity;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.wissen.SillyOdditiesWissenCasingBlock;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.casing.wissen.SillyOdditiesWissenCasingBlockEntity;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.campfire.SillyOdditiesSaltCampfireBlock;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.campfire.SillyOdditiesSaltCampfireBlockEntity;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.lantern.SillyOdditiesSaltLanternBlock;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.lantern.SillyOdditiesSaltLanternBlockEntity;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.torch.SillyOdditiesSaltTorchBlock;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.torch.SillyOdditiesSaltTorchBlockEntity;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.common.block.salt.torch.SillyOdditiesSaltWallTorchBlock;
import mod.maxbogomol.silly_oddities.registry.client.SillyOdditiesModels;
import mod.maxbogomol.wizards_reborn.client.model.block.PipeModel;
import mod.maxbogomol.wizards_reborn.client.render.block.*;
import mod.maxbogomol.wizards_reborn.common.block.baulk.BaulkBlock;
import mod.maxbogomol.wizards_reborn.common.block.casing.CasingBlock;
import mod.maxbogomol.wizards_reborn.common.block.casing.FrameBlock;
import mod.maxbogomol.wizards_reborn.common.block.casing.GlassFrameBlock;
import mod.maxbogomol.wizards_reborn.common.item.SaltCampfireItem;
import mod.maxbogomol.wizards_reborn.common.item.SaltLanternItem;
import mod.maxbogomol.wizards_reborn.common.item.SaltTorchItem;
import mod.maxbogomol.wizards_reborn.common.item.equipment.SmokingPipeItem;
import mod.maxbogomol.wizards_reborn.registry.client.WizardsRebornModels;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Map;

public class SillyOdditiesWizardsReborn {
    public static boolean LOADED;
    public static String MOD_ID = "wizards_reborn";

    public static class ItemsLoadedOnly {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SillyOddities.MOD_ID);

        public static RegistryObject<Item> OAK_BAULK, OAK_CROSS_BAULK, STRIPPED_OAK_BAULK, STRIPPED_OAK_CROSS_BAULK, OAK_PLANKS_BAULK, OAK_PLANKS_CROSS_BAULK, OAK_PEDESTAL, OAK_FRAME, OAK_GLASS_FRAME, OAK_CASING, OAK_WISSEN_CASING, OAK_LIGHT_CASING, OAK_FLUID_CASING, OAK_STEAM_CASING, GILDED_OAK_PLANKS, OAK_SALT_TORCH, OAK_SALT_LANTERN, OAK_SALT_CAMPFIRE, OAK_SMOKING_PIPE;
        public static RegistryObject<Item> SPRUCE_BAULK, SPRUCE_CROSS_BAULK, STRIPPED_SPRUCE_BAULK, STRIPPED_SPRUCE_CROSS_BAULK, SPRUCE_PLANKS_BAULK, SPRUCE_PLANKS_CROSS_BAULK, SPRUCE_PEDESTAL, SPRUCE_FRAME, SPRUCE_GLASS_FRAME, SPRUCE_CASING, SPRUCE_WISSEN_CASING, SPRUCE_LIGHT_CASING, SPRUCE_FLUID_CASING, SPRUCE_STEAM_CASING, GILDED_SPRUCE_PLANKS, SPRUCE_SALT_TORCH, SPRUCE_SALT_LANTERN, SPRUCE_SALT_CAMPFIRE, SPRUCE_SMOKING_PIPE;
        public static RegistryObject<Item> BIRCH_BAULK, BIRCH_CROSS_BAULK, STRIPPED_BIRCH_BAULK, STRIPPED_BIRCH_CROSS_BAULK, BIRCH_PLANKS_BAULK, BIRCH_PLANKS_CROSS_BAULK, BIRCH_PEDESTAL, BIRCH_FRAME, BIRCH_GLASS_FRAME, BIRCH_CASING, BIRCH_WISSEN_CASING, BIRCH_LIGHT_CASING, BIRCH_FLUID_CASING, BIRCH_STEAM_CASING, GILDED_BIRCH_PLANKS, BIRCH_SALT_TORCH, BIRCH_SALT_LANTERN, BIRCH_SALT_CAMPFIRE, BIRCH_SMOKING_PIPE;
        public static RegistryObject<Item> JUNGLE_BAULK, JUNGLE_CROSS_BAULK, STRIPPED_JUNGLE_BAULK, STRIPPED_JUNGLE_CROSS_BAULK, JUNGLE_PLANKS_BAULK, JUNGLE_PLANKS_CROSS_BAULK, JUNGLE_PEDESTAL, JUNGLE_FRAME, JUNGLE_GLASS_FRAME, JUNGLE_CASING, JUNGLE_WISSEN_CASING, JUNGLE_LIGHT_CASING, JUNGLE_FLUID_CASING, JUNGLE_STEAM_CASING, GILDED_JUNGLE_PLANKS, JUNGLE_SALT_TORCH, JUNGLE_SALT_LANTERN, JUNGLE_SALT_CAMPFIRE, JUNGLE_SMOKING_PIPE;
        public static RegistryObject<Item> ACACIA_BAULK, ACACIA_CROSS_BAULK, STRIPPED_ACACIA_BAULK, STRIPPED_ACACIA_CROSS_BAULK, ACACIA_PLANKS_BAULK, ACACIA_PLANKS_CROSS_BAULK, ACACIA_PEDESTAL, ACACIA_FRAME, ACACIA_GLASS_FRAME, ACACIA_CASING, ACACIA_WISSEN_CASING, ACACIA_LIGHT_CASING, ACACIA_FLUID_CASING, ACACIA_STEAM_CASING, GILDED_ACACIA_PLANKS, ACACIA_SALT_TORCH, ACACIA_SALT_LANTERN, ACACIA_SALT_CAMPFIRE, ACACIA_SMOKING_PIPE;
        public static RegistryObject<Item> DARK_OAK_BAULK, DARK_OAK_CROSS_BAULK, STRIPPED_DARK_OAK_BAULK, STRIPPED_DARK_OAK_CROSS_BAULK, DARK_OAK_PLANKS_BAULK, DARK_OAK_PLANKS_CROSS_BAULK, DARK_OAK_PEDESTAL, DARK_OAK_FRAME, DARK_OAK_GLASS_FRAME, DARK_OAK_CASING, DARK_OAK_WISSEN_CASING, DARK_OAK_LIGHT_CASING, DARK_OAK_FLUID_CASING, DARK_OAK_STEAM_CASING, GILDED_DARK_OAK_PLANKS, DARK_OAK_SALT_TORCH, DARK_OAK_SALT_LANTERN, DARK_OAK_SALT_CAMPFIRE, DARK_OAK_SMOKING_PIPE;
        public static RegistryObject<Item> MANGROVE_BAULK, MANGROVE_CROSS_BAULK, STRIPPED_MANGROVE_BAULK, STRIPPED_MANGROVE_CROSS_BAULK, MANGROVE_PLANKS_BAULK, MANGROVE_PLANKS_CROSS_BAULK, MANGROVE_PEDESTAL, MANGROVE_FRAME, MANGROVE_GLASS_FRAME, MANGROVE_CASING, MANGROVE_WISSEN_CASING, MANGROVE_LIGHT_CASING, MANGROVE_FLUID_CASING, MANGROVE_STEAM_CASING, GILDED_MANGROVE_PLANKS, MANGROVE_SALT_TORCH, MANGROVE_SALT_LANTERN, MANGROVE_SALT_CAMPFIRE, MANGROVE_SMOKING_PIPE;
        public static RegistryObject<Item> CHERRY_BAULK, CHERRY_CROSS_BAULK, STRIPPED_CHERRY_BAULK, STRIPPED_CHERRY_CROSS_BAULK, CHERRY_PLANKS_BAULK, CHERRY_PLANKS_CROSS_BAULK, CHERRY_PEDESTAL, CHERRY_FRAME, CHERRY_GLASS_FRAME, CHERRY_CASING, CHERRY_WISSEN_CASING, CHERRY_LIGHT_CASING, CHERRY_FLUID_CASING, CHERRY_STEAM_CASING, GILDED_CHERRY_PLANKS, CHERRY_SALT_TORCH, CHERRY_SALT_LANTERN, CHERRY_SALT_CAMPFIRE, CHERRY_SMOKING_PIPE;
        public static RegistryObject<Item> BAMBOO_BAULK, BAMBOO_CROSS_BAULK, STRIPPED_BAMBOO_BAULK, STRIPPED_BAMBOO_CROSS_BAULK, BAMBOO_PLANKS_BAULK, BAMBOO_PLANKS_CROSS_BAULK, BAMBOO_MOSAIC_BAULK, BAMBOO_MOSAIC_CROSS_BAULK, BAMBOO_PEDESTAL, BAMBOO_FRAME, BAMBOO_GLASS_FRAME, BAMBOO_CASING, BAMBOO_WISSEN_CASING, BAMBOO_LIGHT_CASING, BAMBOO_FLUID_CASING, BAMBOO_STEAM_CASING, GILDED_BAMBOO_PLANKS, GILDED_BAMBOO_MOSAIC, BAMBOO_SALT_TORCH, BAMBOO_SALT_LANTERN, BAMBOO_SALT_CAMPFIRE, STRIPPED_BAMBOO_SMOKING_PIPE;
        public static RegistryObject<Item> CRIMSON_BAULK, CRIMSON_CROSS_BAULK, STRIPPED_CRIMSON_BAULK, STRIPPED_CRIMSON_CROSS_BAULK, CRIMSON_PLANKS_BAULK, CRIMSON_PLANKS_CROSS_BAULK, CRIMSON_PEDESTAL, CRIMSON_FRAME, CRIMSON_GLASS_FRAME, CRIMSON_CASING, CRIMSON_WISSEN_CASING, CRIMSON_LIGHT_CASING, CRIMSON_FLUID_CASING, CRIMSON_STEAM_CASING, GILDED_CRIMSON_PLANKS, CRIMSON_SALT_TORCH, CRIMSON_SALT_LANTERN, CRIMSON_SALT_CAMPFIRE, CRIMSON_SMOKING_PIPE;
        public static RegistryObject<Item> WARPED_BAULK, WARPED_CROSS_BAULK, STRIPPED_WARPED_BAULK, STRIPPED_WARPED_CROSS_BAULK, WARPED_PLANKS_BAULK, WARPED_PLANKS_CROSS_BAULK, WARPED_PEDESTAL, WARPED_FRAME, WARPED_GLASS_FRAME, WARPED_CASING, WARPED_WISSEN_CASING, WARPED_LIGHT_CASING, WARPED_FLUID_CASING, WARPED_STEAM_CASING, GILDED_WARPED_PLANKS, WARPED_SALT_TORCH, WARPED_SALT_LANTERN, WARPED_SALT_CAMPFIRE, WARPED_SMOKING_PIPE;
    }

    public static class BlocksLoadedOnly {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SillyOddities.MOD_ID);

        public static RegistryObject<Block> OAK_BAULK, OAK_CROSS_BAULK, STRIPPED_OAK_BAULK, STRIPPED_OAK_CROSS_BAULK, OAK_PLANKS_BAULK, OAK_PLANKS_CROSS_BAULK, OAK_PEDESTAL, OAK_FRAME, OAK_GLASS_FRAME, OAK_CASING, OAK_WISSEN_CASING, OAK_LIGHT_CASING, OAK_FLUID_CASING, OAK_STEAM_CASING, GILDED_OAK_PLANKS, OAK_SALT_TORCH, OAK_SALT_WALL_TORCH, OAK_SALT_LANTERN, OAK_SALT_CAMPFIRE;
        public static RegistryObject<Block> SPRUCE_BAULK, SPRUCE_CROSS_BAULK, STRIPPED_SPRUCE_BAULK, STRIPPED_SPRUCE_CROSS_BAULK, SPRUCE_PLANKS_BAULK, SPRUCE_PLANKS_CROSS_BAULK, SPRUCE_PEDESTAL, SPRUCE_FRAME, SPRUCE_GLASS_FRAME, SPRUCE_CASING, SPRUCE_WISSEN_CASING, SPRUCE_LIGHT_CASING, SPRUCE_FLUID_CASING, SPRUCE_STEAM_CASING, GILDED_SPRUCE_PLANKS, SPRUCE_SALT_TORCH, SPRUCE_SALT_WALL_TORCH, SPRUCE_SALT_LANTERN, SPRUCE_SALT_CAMPFIRE;
        public static RegistryObject<Block> BIRCH_BAULK, BIRCH_CROSS_BAULK, STRIPPED_BIRCH_BAULK, STRIPPED_BIRCH_CROSS_BAULK, BIRCH_PLANKS_BAULK, BIRCH_PLANKS_CROSS_BAULK, BIRCH_PEDESTAL, BIRCH_FRAME, BIRCH_GLASS_FRAME, BIRCH_CASING, BIRCH_WISSEN_CASING, BIRCH_LIGHT_CASING, BIRCH_FLUID_CASING, BIRCH_STEAM_CASING, GILDED_BIRCH_PLANKS, BIRCH_SALT_TORCH, BIRCH_SALT_WALL_TORCH, BIRCH_SALT_LANTERN, BIRCH_SALT_CAMPFIRE;
        public static RegistryObject<Block> JUNGLE_BAULK, JUNGLE_CROSS_BAULK, STRIPPED_JUNGLE_BAULK, STRIPPED_JUNGLE_CROSS_BAULK, JUNGLE_PLANKS_BAULK, JUNGLE_PLANKS_CROSS_BAULK, JUNGLE_PEDESTAL, JUNGLE_FRAME, JUNGLE_GLASS_FRAME, JUNGLE_CASING, JUNGLE_WISSEN_CASING, JUNGLE_LIGHT_CASING, JUNGLE_FLUID_CASING, JUNGLE_STEAM_CASING, GILDED_JUNGLE_PLANKS, JUNGLE_SALT_TORCH, JUNGLE_SALT_WALL_TORCH, JUNGLE_SALT_LANTERN, JUNGLE_SALT_CAMPFIRE;
        public static RegistryObject<Block> ACACIA_BAULK, ACACIA_CROSS_BAULK, STRIPPED_ACACIA_BAULK, STRIPPED_ACACIA_CROSS_BAULK, ACACIA_PLANKS_BAULK, ACACIA_PLANKS_CROSS_BAULK, ACACIA_PEDESTAL, ACACIA_FRAME, ACACIA_GLASS_FRAME, ACACIA_CASING, ACACIA_WISSEN_CASING, ACACIA_LIGHT_CASING, ACACIA_FLUID_CASING, ACACIA_STEAM_CASING, GILDED_ACACIA_PLANKS, ACACIA_SALT_TORCH, ACACIA_SALT_WALL_TORCH, ACACIA_SALT_LANTERN, ACACIA_SALT_CAMPFIRE;
        public static RegistryObject<Block> DARK_OAK_BAULK, DARK_OAK_CROSS_BAULK, STRIPPED_DARK_OAK_BAULK, STRIPPED_DARK_OAK_CROSS_BAULK, DARK_OAK_PLANKS_BAULK, DARK_OAK_PLANKS_CROSS_BAULK, DARK_OAK_PEDESTAL, DARK_OAK_FRAME, DARK_OAK_GLASS_FRAME, DARK_OAK_CASING, DARK_OAK_WISSEN_CASING, DARK_OAK_LIGHT_CASING, DARK_OAK_FLUID_CASING, DARK_OAK_STEAM_CASING, GILDED_DARK_OAK_PLANKS, DARK_OAK_SALT_TORCH, DARK_OAK_SALT_WALL_TORCH, DARK_OAK_SALT_LANTERN, DARK_OAK_SALT_CAMPFIRE;
        public static RegistryObject<Block> MANGROVE_BAULK, MANGROVE_CROSS_BAULK, STRIPPED_MANGROVE_BAULK, STRIPPED_MANGROVE_CROSS_BAULK, MANGROVE_PLANKS_BAULK, MANGROVE_PLANKS_CROSS_BAULK, MANGROVE_PEDESTAL, MANGROVE_FRAME, MANGROVE_GLASS_FRAME, MANGROVE_CASING, MANGROVE_WISSEN_CASING, MANGROVE_LIGHT_CASING, MANGROVE_FLUID_CASING, MANGROVE_STEAM_CASING, GILDED_MANGROVE_PLANKS, MANGROVE_SALT_TORCH, MANGROVE_SALT_WALL_TORCH, MANGROVE_SALT_LANTERN, MANGROVE_SALT_CAMPFIRE;
        public static RegistryObject<Block> CHERRY_BAULK, CHERRY_CROSS_BAULK, STRIPPED_CHERRY_BAULK, STRIPPED_CHERRY_CROSS_BAULK, CHERRY_PLANKS_BAULK, CHERRY_PLANKS_CROSS_BAULK, CHERRY_PEDESTAL, CHERRY_FRAME, CHERRY_GLASS_FRAME, CHERRY_CASING, CHERRY_WISSEN_CASING, CHERRY_LIGHT_CASING, CHERRY_FLUID_CASING, CHERRY_STEAM_CASING, GILDED_CHERRY_PLANKS, CHERRY_SALT_TORCH, CHERRY_SALT_WALL_TORCH, CHERRY_SALT_LANTERN, CHERRY_SALT_CAMPFIRE;
        public static RegistryObject<Block> BAMBOO_BAULK, BAMBOO_CROSS_BAULK, STRIPPED_BAMBOO_BAULK, STRIPPED_BAMBOO_CROSS_BAULK, BAMBOO_PLANKS_BAULK, BAMBOO_PLANKS_CROSS_BAULK, BAMBOO_MOSAIC_BAULK, BAMBOO_MOSAIC_CROSS_BAULK, BAMBOO_PEDESTAL, BAMBOO_FRAME, BAMBOO_GLASS_FRAME, BAMBOO_CASING, BAMBOO_WISSEN_CASING, BAMBOO_LIGHT_CASING, BAMBOO_FLUID_CASING, BAMBOO_STEAM_CASING, GILDED_BAMBOO_PLANKS, GILDED_BAMBOO_MOSAIC, BAMBOO_SALT_TORCH, BAMBOO_SALT_WALL_TORCH, BAMBOO_SALT_LANTERN, BAMBOO_SALT_CAMPFIRE;
        public static RegistryObject<Block> CRIMSON_BAULK, CRIMSON_CROSS_BAULK, STRIPPED_CRIMSON_BAULK, STRIPPED_CRIMSON_CROSS_BAULK, CRIMSON_PLANKS_BAULK, CRIMSON_PLANKS_CROSS_BAULK, CRIMSON_PEDESTAL, CRIMSON_FRAME, CRIMSON_GLASS_FRAME, CRIMSON_CASING, CRIMSON_WISSEN_CASING, CRIMSON_LIGHT_CASING, CRIMSON_FLUID_CASING, CRIMSON_STEAM_CASING, GILDED_CRIMSON_PLANKS, CRIMSON_SALT_TORCH, CRIMSON_SALT_WALL_TORCH, CRIMSON_SALT_LANTERN, CRIMSON_SALT_CAMPFIRE;
        public static RegistryObject<Block> WARPED_BAULK, WARPED_CROSS_BAULK, STRIPPED_WARPED_BAULK, STRIPPED_WARPED_CROSS_BAULK, WARPED_PLANKS_BAULK, WARPED_PLANKS_CROSS_BAULK, WARPED_PEDESTAL, WARPED_FRAME, WARPED_GLASS_FRAME, WARPED_CASING, WARPED_WISSEN_CASING, WARPED_LIGHT_CASING, WARPED_FLUID_CASING, WARPED_STEAM_CASING, GILDED_WARPED_PLANKS, WARPED_SALT_TORCH, WARPED_SALT_WALL_TORCH, WARPED_SALT_LANTERN, WARPED_SALT_CAMPFIRE;
    }

    public static class BlockEntitiesLoadedOnly {
        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SillyOddities.MOD_ID);

        public static RegistryObject<BlockEntityType<SillyOdditiesArcanePedestalBlockEntity>> ARCANE_PEDESTAL;
        public static RegistryObject<BlockEntityType<SillyOdditiesWissenCasingBlockEntity>> WISSEN_CASING;
        public static RegistryObject<BlockEntityType<SillyOdditiesLightCasingBlockEntity>> LIGHT_CASING;
        public static RegistryObject<BlockEntityType<SillyOdditiesFluidCasingBlockEntity>> FLUID_CASING;
        public static RegistryObject<BlockEntityType<SillyOdditiesSteamCasingBlockEntity>> STEAM_CASING;
        public static RegistryObject<BlockEntityType<SillyOdditiesSaltTorchBlockEntity>> SALT_TORCH;
        public static RegistryObject<BlockEntityType<SillyOdditiesSaltLanternBlockEntity>> SALT_LANTERN;
        public static RegistryObject<BlockEntityType<SillyOdditiesSaltCampfireBlockEntity>> SALT_CAMPFIRE;
        public static RegistryObject<BlockEntityType<SillyOdditiesCrossBaulkBlockEntity>> CROSS_BAULK;
    }

    public static class LoadedOnly {
        public static void makeItems() {
            //OAK
            ItemsLoadedOnly.OAK_BAULK = ItemsLoadedOnly.ITEMS.register("oak_baulk", () -> new BlockItem(BlocksLoadedOnly.OAK_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("oak_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.OAK_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_OAK_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_oak_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_OAK_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_OAK_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_oak_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_OAK_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("oak_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.OAK_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("oak_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.OAK_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_PEDESTAL = ItemsLoadedOnly.ITEMS.register("oak_pedestal", () -> new BlockItem(BlocksLoadedOnly.OAK_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_FRAME = ItemsLoadedOnly.ITEMS.register("oak_frame", () -> new BlockItem(BlocksLoadedOnly.OAK_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("oak_glass_frame", () -> new BlockItem(BlocksLoadedOnly.OAK_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_CASING = ItemsLoadedOnly.ITEMS.register("oak_casing", () -> new BlockItem(BlocksLoadedOnly.OAK_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("oak_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.OAK_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("oak_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.OAK_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("oak_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.OAK_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("oak_steam_casing", () -> new BlockItem(BlocksLoadedOnly.OAK_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_OAK_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_oak_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_OAK_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("oak_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.OAK_SALT_TORCH.get(), BlocksLoadedOnly.OAK_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.OAK_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("oak_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.OAK_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("oak_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.OAK_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.OAK_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("oak_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //SPRUCE
            ItemsLoadedOnly.SPRUCE_BAULK = ItemsLoadedOnly.ITEMS.register("spruce_baulk", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("spruce_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_SPRUCE_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_spruce_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_SPRUCE_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_spruce_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("spruce_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("spruce_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_PEDESTAL = ItemsLoadedOnly.ITEMS.register("spruce_pedestal", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_FRAME = ItemsLoadedOnly.ITEMS.register("spruce_frame", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("spruce_glass_frame", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_CASING = ItemsLoadedOnly.ITEMS.register("spruce_casing", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("spruce_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("spruce_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.SPRUCE_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("spruce_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("spruce_steam_casing", () -> new BlockItem(BlocksLoadedOnly.SPRUCE_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_SPRUCE_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_spruce_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_SPRUCE_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("spruce_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.SPRUCE_SALT_TORCH.get(), BlocksLoadedOnly.SPRUCE_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.SPRUCE_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("spruce_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.SPRUCE_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("spruce_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.SPRUCE_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.SPRUCE_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("spruce_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //BIRCH
            ItemsLoadedOnly.BIRCH_BAULK = ItemsLoadedOnly.ITEMS.register("birch_baulk", () -> new BlockItem(BlocksLoadedOnly.BIRCH_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("birch_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.BIRCH_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_BIRCH_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_birch_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_BIRCH_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_birch_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("birch_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.BIRCH_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("birch_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.BIRCH_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_PEDESTAL = ItemsLoadedOnly.ITEMS.register("birch_pedestal", () -> new BlockItem(BlocksLoadedOnly.BIRCH_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_FRAME = ItemsLoadedOnly.ITEMS.register("birch_frame", () -> new BlockItem(BlocksLoadedOnly.BIRCH_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("birch_glass_frame", () -> new BlockItem(BlocksLoadedOnly.BIRCH_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_CASING = ItemsLoadedOnly.ITEMS.register("birch_casing", () -> new BlockItem(BlocksLoadedOnly.BIRCH_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("birch_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.BIRCH_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("birch_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.BIRCH_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("birch_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.BIRCH_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("birch_steam_casing", () -> new BlockItem(BlocksLoadedOnly.BIRCH_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_BIRCH_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_birch_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_BIRCH_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("birch_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.BIRCH_SALT_TORCH.get(), BlocksLoadedOnly.BIRCH_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.BIRCH_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("birch_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.BIRCH_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("birch_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.BIRCH_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.BIRCH_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("birch_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //JUNGLE
            ItemsLoadedOnly.JUNGLE_BAULK = ItemsLoadedOnly.ITEMS.register("jungle_baulk", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("jungle_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_JUNGLE_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_jungle_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_JUNGLE_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_jungle_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("jungle_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("jungle_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_PEDESTAL = ItemsLoadedOnly.ITEMS.register("jungle_pedestal", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_FRAME = ItemsLoadedOnly.ITEMS.register("jungle_frame", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("jungle_glass_frame", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_CASING = ItemsLoadedOnly.ITEMS.register("jungle_casing", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("jungle_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("jungle_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.JUNGLE_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("jungle_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("jungle_steam_casing", () -> new BlockItem(BlocksLoadedOnly.JUNGLE_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_JUNGLE_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_jungle_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_JUNGLE_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("jungle_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.JUNGLE_SALT_TORCH.get(), BlocksLoadedOnly.JUNGLE_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.JUNGLE_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("jungle_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.JUNGLE_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("jungle_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.JUNGLE_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.JUNGLE_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("jungle_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //ACACIA
            ItemsLoadedOnly.ACACIA_BAULK = ItemsLoadedOnly.ITEMS.register("acacia_baulk", () -> new BlockItem(BlocksLoadedOnly.ACACIA_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("acacia_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.ACACIA_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_ACACIA_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_acacia_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_ACACIA_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_acacia_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("acacia_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.ACACIA_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("acacia_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.ACACIA_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_PEDESTAL = ItemsLoadedOnly.ITEMS.register("acacia_pedestal", () -> new BlockItem(BlocksLoadedOnly.ACACIA_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_FRAME = ItemsLoadedOnly.ITEMS.register("acacia_frame", () -> new BlockItem(BlocksLoadedOnly.ACACIA_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("acacia_glass_frame", () -> new BlockItem(BlocksLoadedOnly.ACACIA_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_CASING = ItemsLoadedOnly.ITEMS.register("acacia_casing", () -> new BlockItem(BlocksLoadedOnly.ACACIA_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("acacia_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.ACACIA_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("acacia_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.ACACIA_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("acacia_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.ACACIA_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("acacia_steam_casing", () -> new BlockItem(BlocksLoadedOnly.ACACIA_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_ACACIA_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_acacia_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_ACACIA_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("acacia_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.ACACIA_SALT_TORCH.get(), BlocksLoadedOnly.ACACIA_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.ACACIA_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("acacia_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.ACACIA_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("acacia_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.ACACIA_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.ACACIA_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("acacia_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //DARK_OAK
            ItemsLoadedOnly.DARK_OAK_BAULK = ItemsLoadedOnly.ITEMS.register("dark_oak_baulk", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("dark_oak_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_DARK_OAK_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_dark_oak_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_DARK_OAK_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_dark_oak_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("dark_oak_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("dark_oak_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_PEDESTAL = ItemsLoadedOnly.ITEMS.register("dark_oak_pedestal", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_FRAME = ItemsLoadedOnly.ITEMS.register("dark_oak_frame", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("dark_oak_glass_frame", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_CASING = ItemsLoadedOnly.ITEMS.register("dark_oak_casing", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("dark_oak_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("dark_oak_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.DARK_OAK_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("dark_oak_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("dark_oak_steam_casing", () -> new BlockItem(BlocksLoadedOnly.DARK_OAK_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_DARK_OAK_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_dark_oak_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_DARK_OAK_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("dark_oak_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.DARK_OAK_SALT_TORCH.get(), BlocksLoadedOnly.DARK_OAK_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.DARK_OAK_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("dark_oak_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.DARK_OAK_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("dark_oak_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.DARK_OAK_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.DARK_OAK_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("dark_oak_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //MANGROVE
            ItemsLoadedOnly.MANGROVE_BAULK = ItemsLoadedOnly.ITEMS.register("mangrove_baulk", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("mangrove_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_MANGROVE_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_mangrove_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_MANGROVE_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_mangrove_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("mangrove_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("mangrove_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_PEDESTAL = ItemsLoadedOnly.ITEMS.register("mangrove_pedestal", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_FRAME = ItemsLoadedOnly.ITEMS.register("mangrove_frame", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("mangrove_glass_frame", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_CASING = ItemsLoadedOnly.ITEMS.register("mangrove_casing", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("mangrove_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("mangrove_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.MANGROVE_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("mangrove_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("mangrove_steam_casing", () -> new BlockItem(BlocksLoadedOnly.MANGROVE_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_MANGROVE_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_mangrove_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_MANGROVE_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("mangrove_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.MANGROVE_SALT_TORCH.get(), BlocksLoadedOnly.MANGROVE_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.MANGROVE_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("mangrove_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.MANGROVE_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("mangrove_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.MANGROVE_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.MANGROVE_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("mangrove_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //CHERRY
            ItemsLoadedOnly.CHERRY_BAULK = ItemsLoadedOnly.ITEMS.register("cherry_baulk", () -> new BlockItem(BlocksLoadedOnly.CHERRY_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("cherry_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.CHERRY_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_CHERRY_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_cherry_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_CHERRY_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_cherry_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("cherry_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.CHERRY_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("cherry_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.CHERRY_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_PEDESTAL = ItemsLoadedOnly.ITEMS.register("cherry_pedestal", () -> new BlockItem(BlocksLoadedOnly.CHERRY_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_FRAME = ItemsLoadedOnly.ITEMS.register("cherry_frame", () -> new BlockItem(BlocksLoadedOnly.CHERRY_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("cherry_glass_frame", () -> new BlockItem(BlocksLoadedOnly.CHERRY_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_CASING = ItemsLoadedOnly.ITEMS.register("cherry_casing", () -> new BlockItem(BlocksLoadedOnly.CHERRY_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("cherry_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.CHERRY_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("cherry_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.CHERRY_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("cherry_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.CHERRY_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("cherry_steam_casing", () -> new BlockItem(BlocksLoadedOnly.CHERRY_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_CHERRY_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_cherry_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_CHERRY_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("cherry_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.CHERRY_SALT_TORCH.get(), BlocksLoadedOnly.CHERRY_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.CHERRY_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("cherry_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.CHERRY_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("cherry_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.CHERRY_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.CHERRY_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("cherry_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //BAMBOO
            ItemsLoadedOnly.BAMBOO_BAULK = ItemsLoadedOnly.ITEMS.register("bamboo_baulk", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("bamboo_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_BAMBOO_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_bamboo_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_BAMBOO_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_bamboo_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("bamboo_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("bamboo_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_MOSAIC_BAULK = ItemsLoadedOnly.ITEMS.register("bamboo_mosaic_baulk", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_MOSAIC_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("bamboo_mosaic_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_PEDESTAL = ItemsLoadedOnly.ITEMS.register("bamboo_pedestal", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_FRAME = ItemsLoadedOnly.ITEMS.register("bamboo_frame", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("bamboo_glass_frame", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_CASING = ItemsLoadedOnly.ITEMS.register("bamboo_casing", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("bamboo_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("bamboo_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.BAMBOO_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("bamboo_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("bamboo_steam_casing", () -> new BlockItem(BlocksLoadedOnly.BAMBOO_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_BAMBOO_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_bamboo_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_BAMBOO_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_BAMBOO_MOSAIC = ItemsLoadedOnly.ITEMS.register("gilded_bamboo_mosaic", () -> new BlockItem(BlocksLoadedOnly.GILDED_BAMBOO_MOSAIC.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("bamboo_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.BAMBOO_SALT_TORCH.get(), BlocksLoadedOnly.BAMBOO_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.BAMBOO_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("bamboo_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.BAMBOO_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.BAMBOO_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("bamboo_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.BAMBOO_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_BAMBOO_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("stripped_bamboo_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //CRIMSON
            ItemsLoadedOnly.CRIMSON_BAULK = ItemsLoadedOnly.ITEMS.register("crimson_baulk", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("crimson_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_CRIMSON_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_crimson_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_CRIMSON_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_crimson_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("crimson_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("crimson_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_PEDESTAL = ItemsLoadedOnly.ITEMS.register("crimson_pedestal", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_FRAME = ItemsLoadedOnly.ITEMS.register("crimson_frame", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("crimson_glass_frame", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_CASING = ItemsLoadedOnly.ITEMS.register("crimson_casing", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("crimson_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("crimson_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.CRIMSON_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("crimson_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("crimson_steam_casing", () -> new BlockItem(BlocksLoadedOnly.CRIMSON_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_CRIMSON_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_crimson_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_CRIMSON_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("crimson_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.CRIMSON_SALT_TORCH.get(), BlocksLoadedOnly.CRIMSON_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.CRIMSON_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("crimson_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.CRIMSON_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("crimson_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.CRIMSON_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.CRIMSON_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("crimson_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            //WARPED
            ItemsLoadedOnly.WARPED_BAULK = ItemsLoadedOnly.ITEMS.register("warped_baulk", () -> new BlockItem(BlocksLoadedOnly.WARPED_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("warped_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.WARPED_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_WARPED_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_warped_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_WARPED_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.STRIPPED_WARPED_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_warped_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_WARPED_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("warped_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.WARPED_PLANKS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("warped_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.WARPED_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_PEDESTAL = ItemsLoadedOnly.ITEMS.register("warped_pedestal", () -> new BlockItem(BlocksLoadedOnly.WARPED_PEDESTAL.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_FRAME = ItemsLoadedOnly.ITEMS.register("warped_frame", () -> new BlockItem(BlocksLoadedOnly.WARPED_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("warped_glass_frame", () -> new BlockItem(BlocksLoadedOnly.WARPED_GLASS_FRAME.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_CASING = ItemsLoadedOnly.ITEMS.register("warped_casing", () -> new BlockItem(BlocksLoadedOnly.WARPED_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("warped_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.WARPED_WISSEN_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("warped_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.WARPED_LIGHT_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("warped_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.WARPED_FLUID_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("warped_steam_casing", () -> new BlockItem(BlocksLoadedOnly.WARPED_STEAM_CASING.get(), new Item.Properties()));
            ItemsLoadedOnly.GILDED_WARPED_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_warped_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_WARPED_PLANKS.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("warped_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.WARPED_SALT_TORCH.get(), BlocksLoadedOnly.WARPED_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
            ItemsLoadedOnly.WARPED_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("warped_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.WARPED_SALT_LANTERN.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("warped_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.WARPED_SALT_CAMPFIRE.get(), new Item.Properties()));
            ItemsLoadedOnly.WARPED_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("warped_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
        }

        public static void makeBlocks() {
            //OAK
            BlocksLoadedOnly.OAK_BAULK = BlocksLoadedOnly.BLOCKS.register("oak_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
            BlocksLoadedOnly.OAK_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("oak_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
            BlocksLoadedOnly.STRIPPED_OAK_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_oak_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
            BlocksLoadedOnly.STRIPPED_OAK_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_oak_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
            BlocksLoadedOnly.OAK_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("oak_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
            BlocksLoadedOnly.OAK_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("oak_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
            BlocksLoadedOnly.OAK_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("oak_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
            BlocksLoadedOnly.OAK_FRAME = BlocksLoadedOnly.BLOCKS.register("oak_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.OAK_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("oak_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.OAK_CASING = BlocksLoadedOnly.BLOCKS.register("oak_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.OAK_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("oak_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.OAK_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("oak_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.OAK_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("oak_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.OAK_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("oak_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_OAK_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_oak_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
            BlocksLoadedOnly.OAK_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("oak_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.WOOD).sound(SoundType.WOOD)));
            BlocksLoadedOnly.OAK_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("oak_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.WOOD).sound(SoundType.WOOD)));
            BlocksLoadedOnly.OAK_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("oak_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.WOOD).sound(SoundType.WOOD)));
            BlocksLoadedOnly.OAK_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("oak_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.WOOD).sound(SoundType.WOOD)));
            //SPRUCE
            BlocksLoadedOnly.SPRUCE_BAULK = BlocksLoadedOnly.BLOCKS.register("spruce_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)));
            BlocksLoadedOnly.SPRUCE_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("spruce_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));
            BlocksLoadedOnly.STRIPPED_SPRUCE_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_spruce_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG)));
            BlocksLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_spruce_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
            BlocksLoadedOnly.SPRUCE_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("spruce_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
            BlocksLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("spruce_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
            BlocksLoadedOnly.SPRUCE_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("spruce_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
            BlocksLoadedOnly.SPRUCE_FRAME = BlocksLoadedOnly.BLOCKS.register("spruce_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.SPRUCE_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("spruce_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.SPRUCE_CASING = BlocksLoadedOnly.BLOCKS.register("spruce_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.SPRUCE_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("spruce_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.SPRUCE_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("spruce_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.SPRUCE_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("spruce_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.SPRUCE_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("spruce_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_SPRUCE_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_spruce_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
            BlocksLoadedOnly.SPRUCE_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("spruce_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.PODZOL).sound(SoundType.WOOD)));
            BlocksLoadedOnly.SPRUCE_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("spruce_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.PODZOL).sound(SoundType.WOOD)));
            BlocksLoadedOnly.SPRUCE_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("spruce_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.PODZOL).sound(SoundType.WOOD)));
            BlocksLoadedOnly.SPRUCE_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("spruce_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.PODZOL).sound(SoundType.WOOD)));
            //BIRCH
            BlocksLoadedOnly.BIRCH_BAULK = BlocksLoadedOnly.BLOCKS.register("birch_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG)));
            BlocksLoadedOnly.BIRCH_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("birch_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));
            BlocksLoadedOnly.STRIPPED_BIRCH_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_birch_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG)));
            BlocksLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_birch_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD)));
            BlocksLoadedOnly.BIRCH_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("birch_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
            BlocksLoadedOnly.BIRCH_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("birch_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
            BlocksLoadedOnly.BIRCH_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("birch_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
            BlocksLoadedOnly.BIRCH_FRAME = BlocksLoadedOnly.BLOCKS.register("birch_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BIRCH_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("birch_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BIRCH_CASING = BlocksLoadedOnly.BLOCKS.register("birch_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BIRCH_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("birch_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BIRCH_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("birch_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BIRCH_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("birch_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BIRCH_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("birch_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_BIRCH_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_birch_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
            BlocksLoadedOnly.BIRCH_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("birch_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.SAND).sound(SoundType.WOOD)));
            BlocksLoadedOnly.BIRCH_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("birch_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.SAND).sound(SoundType.WOOD)));
            BlocksLoadedOnly.BIRCH_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("birch_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.SAND).sound(SoundType.WOOD)));
            BlocksLoadedOnly.BIRCH_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("birch_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.SAND).sound(SoundType.WOOD)));
            //JUNGLE
            BlocksLoadedOnly.JUNGLE_BAULK = BlocksLoadedOnly.BLOCKS.register("jungle_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG)));
            BlocksLoadedOnly.JUNGLE_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("jungle_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));
            BlocksLoadedOnly.STRIPPED_JUNGLE_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_jungle_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG)));
            BlocksLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_jungle_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
            BlocksLoadedOnly.JUNGLE_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("jungle_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
            BlocksLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("jungle_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
            BlocksLoadedOnly.JUNGLE_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("jungle_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
            BlocksLoadedOnly.JUNGLE_FRAME = BlocksLoadedOnly.BLOCKS.register("jungle_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.JUNGLE_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("jungle_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.JUNGLE_CASING = BlocksLoadedOnly.BLOCKS.register("jungle_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.JUNGLE_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("jungle_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.JUNGLE_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("jungle_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.JUNGLE_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("jungle_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.JUNGLE_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("jungle_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_JUNGLE_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_jungle_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
            BlocksLoadedOnly.JUNGLE_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("jungle_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.DIRT).sound(SoundType.WOOD)));
            BlocksLoadedOnly.JUNGLE_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("jungle_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.DIRT).sound(SoundType.WOOD)));
            BlocksLoadedOnly.JUNGLE_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("jungle_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.DIRT).sound(SoundType.WOOD)));
            BlocksLoadedOnly.JUNGLE_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("jungle_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.DIRT).sound(SoundType.WOOD)));
            //ACACIA
            BlocksLoadedOnly.ACACIA_BAULK = BlocksLoadedOnly.BLOCKS.register("acacia_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG)));
            BlocksLoadedOnly.ACACIA_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("acacia_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));
            BlocksLoadedOnly.STRIPPED_ACACIA_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_acacia_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG)));
            BlocksLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_acacia_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD)));
            BlocksLoadedOnly.ACACIA_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("acacia_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
            BlocksLoadedOnly.ACACIA_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("acacia_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
            BlocksLoadedOnly.ACACIA_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("acacia_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
            BlocksLoadedOnly.ACACIA_FRAME = BlocksLoadedOnly.BLOCKS.register("acacia_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));
            BlocksLoadedOnly.ACACIA_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("acacia_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));
            BlocksLoadedOnly.ACACIA_CASING = BlocksLoadedOnly.BLOCKS.register("acacia_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));
            BlocksLoadedOnly.ACACIA_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("acacia_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));
            BlocksLoadedOnly.ACACIA_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("acacia_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));
            BlocksLoadedOnly.ACACIA_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("acacia_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));
            BlocksLoadedOnly.ACACIA_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("acacia_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_ACACIA_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_acacia_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
            BlocksLoadedOnly.ACACIA_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("acacia_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.WOOD)));
            BlocksLoadedOnly.ACACIA_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("acacia_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.WOOD)));
            BlocksLoadedOnly.ACACIA_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("acacia_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.WOOD)));
            BlocksLoadedOnly.ACACIA_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("acacia_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.WOOD)));
            //DARK_OAK
            BlocksLoadedOnly.DARK_OAK_BAULK = BlocksLoadedOnly.BLOCKS.register("dark_oak_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG)));
            BlocksLoadedOnly.DARK_OAK_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("dark_oak_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));
            BlocksLoadedOnly.STRIPPED_DARK_OAK_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_dark_oak_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG)));
            BlocksLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_dark_oak_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
            BlocksLoadedOnly.DARK_OAK_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("dark_oak_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
            BlocksLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("dark_oak_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
            BlocksLoadedOnly.DARK_OAK_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("dark_oak_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
            BlocksLoadedOnly.DARK_OAK_FRAME = BlocksLoadedOnly.BLOCKS.register("dark_oak_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.DARK_OAK_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("dark_oak_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.DARK_OAK_CASING = BlocksLoadedOnly.BLOCKS.register("dark_oak_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.DARK_OAK_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("dark_oak_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.DARK_OAK_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("dark_oak_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.DARK_OAK_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("dark_oak_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.DARK_OAK_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("dark_oak_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_DARK_OAK_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_dark_oak_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
            BlocksLoadedOnly.DARK_OAK_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("dark_oak_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOD)));
            BlocksLoadedOnly.DARK_OAK_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("dark_oak_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOD)));
            BlocksLoadedOnly.DARK_OAK_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("dark_oak_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOD)));
            BlocksLoadedOnly.DARK_OAK_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("dark_oak_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOD)));
            //MANGROVE
            BlocksLoadedOnly.MANGROVE_BAULK = BlocksLoadedOnly.BLOCKS.register("mangrove_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG)));
            BlocksLoadedOnly.MANGROVE_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("mangrove_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));
            BlocksLoadedOnly.STRIPPED_MANGROVE_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_mangrove_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG)));
            BlocksLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_mangrove_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));
            BlocksLoadedOnly.MANGROVE_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("mangrove_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
            BlocksLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("mangrove_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
            BlocksLoadedOnly.MANGROVE_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("mangrove_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
            BlocksLoadedOnly.MANGROVE_FRAME = BlocksLoadedOnly.BLOCKS.register("mangrove_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.MANGROVE_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("mangrove_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.MANGROVE_CASING = BlocksLoadedOnly.BLOCKS.register("mangrove_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.MANGROVE_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("mangrove_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.MANGROVE_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("mangrove_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.MANGROVE_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("mangrove_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.MANGROVE_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("mangrove_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_MANGROVE_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_mangrove_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
            BlocksLoadedOnly.MANGROVE_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("mangrove_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_RED).sound(SoundType.WOOD)));
            BlocksLoadedOnly.MANGROVE_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("mangrove_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_RED).sound(SoundType.WOOD)));
            BlocksLoadedOnly.MANGROVE_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("mangrove_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_RED).sound(SoundType.WOOD)));
            BlocksLoadedOnly.MANGROVE_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("mangrove_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_RED).sound(SoundType.WOOD)));
            //CHERRY
            BlocksLoadedOnly.CHERRY_BAULK = BlocksLoadedOnly.BLOCKS.register("cherry_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG)));
            BlocksLoadedOnly.CHERRY_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("cherry_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD)));
            BlocksLoadedOnly.STRIPPED_CHERRY_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_cherry_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG)));
            BlocksLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_cherry_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_WOOD)));
            BlocksLoadedOnly.CHERRY_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("cherry_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
            BlocksLoadedOnly.CHERRY_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("cherry_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
            BlocksLoadedOnly.CHERRY_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("cherry_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
            BlocksLoadedOnly.CHERRY_FRAME = BlocksLoadedOnly.BLOCKS.register("cherry_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CHERRY_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("cherry_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CHERRY_CASING = BlocksLoadedOnly.BLOCKS.register("cherry_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CHERRY_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("cherry_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CHERRY_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("cherry_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CHERRY_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("cherry_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CHERRY_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("cherry_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_CHERRY_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_cherry_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
            BlocksLoadedOnly.CHERRY_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("cherry_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.CHERRY_WOOD)));
            BlocksLoadedOnly.CHERRY_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("cherry_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.CHERRY_WOOD)));
            BlocksLoadedOnly.CHERRY_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("cherry_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.CHERRY_WOOD)));
            BlocksLoadedOnly.CHERRY_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("cherry_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.CHERRY_WOOD)));
            //BAMBOO
            BlocksLoadedOnly.BAMBOO_BAULK = BlocksLoadedOnly.BLOCKS.register("bamboo_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_BLOCK)));
            BlocksLoadedOnly.BAMBOO_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("bamboo_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
            BlocksLoadedOnly.STRIPPED_BAMBOO_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_bamboo_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BAMBOO_BLOCK)));
            BlocksLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_bamboo_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
            BlocksLoadedOnly.BAMBOO_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("bamboo_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
            BlocksLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("bamboo_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
            BlocksLoadedOnly.BAMBOO_MOSAIC_BAULK = BlocksLoadedOnly.BLOCKS.register("bamboo_mosaic_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC)));
            BlocksLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("bamboo_mosaic_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC)));
            BlocksLoadedOnly.BAMBOO_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("bamboo_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
            BlocksLoadedOnly.BAMBOO_FRAME = BlocksLoadedOnly.BLOCKS.register("bamboo_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BAMBOO_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("bamboo_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BAMBOO_CASING = BlocksLoadedOnly.BLOCKS.register("bamboo_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BAMBOO_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("bamboo_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BAMBOO_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("bamboo_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BAMBOO_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("bamboo_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()));
            BlocksLoadedOnly.BAMBOO_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("bamboo_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_BAMBOO_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_bamboo_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
            BlocksLoadedOnly.GILDED_BAMBOO_MOSAIC = BlocksLoadedOnly.BLOCKS.register("gilded_bamboo_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC)));
            BlocksLoadedOnly.BAMBOO_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("bamboo_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.BAMBOO_WOOD)));
            BlocksLoadedOnly.BAMBOO_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("bamboo_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.BAMBOO_WOOD)));
            BlocksLoadedOnly.BAMBOO_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("bamboo_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.BAMBOO_WOOD)));
            BlocksLoadedOnly.BAMBOO_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("bamboo_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.BAMBOO_WOOD)));
            //CRIMSON
            BlocksLoadedOnly.CRIMSON_BAULK = BlocksLoadedOnly.BLOCKS.register("crimson_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM)));
            BlocksLoadedOnly.CRIMSON_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("crimson_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE)));
            BlocksLoadedOnly.STRIPPED_CRIMSON_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_crimson_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM)));
            BlocksLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_crimson_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
            BlocksLoadedOnly.CRIMSON_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("crimson_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
            BlocksLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("crimson_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
            BlocksLoadedOnly.CRIMSON_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("crimson_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
            BlocksLoadedOnly.CRIMSON_FRAME = BlocksLoadedOnly.BLOCKS.register("crimson_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CRIMSON_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("crimson_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CRIMSON_CASING = BlocksLoadedOnly.BLOCKS.register("crimson_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CRIMSON_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("crimson_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CRIMSON_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("crimson_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CRIMSON_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("crimson_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));
            BlocksLoadedOnly.CRIMSON_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("crimson_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_CRIMSON_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_crimson_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
            BlocksLoadedOnly.CRIMSON_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("crimson_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD)));
            BlocksLoadedOnly.CRIMSON_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("crimson_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD)));
            BlocksLoadedOnly.CRIMSON_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("crimson_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD)));
            BlocksLoadedOnly.CRIMSON_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("crimson_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD)));
            //WARPED
            BlocksLoadedOnly.WARPED_BAULK = BlocksLoadedOnly.BLOCKS.register("warped_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM)));
            BlocksLoadedOnly.WARPED_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("warped_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE)));
            BlocksLoadedOnly.STRIPPED_WARPED_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_warped_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_STEM)));
            BlocksLoadedOnly.STRIPPED_WARPED_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_warped_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
            BlocksLoadedOnly.WARPED_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("warped_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
            BlocksLoadedOnly.WARPED_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("warped_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
            BlocksLoadedOnly.WARPED_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("warped_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
            BlocksLoadedOnly.WARPED_FRAME = BlocksLoadedOnly.BLOCKS.register("warped_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));
            BlocksLoadedOnly.WARPED_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("warped_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));
            BlocksLoadedOnly.WARPED_CASING = BlocksLoadedOnly.BLOCKS.register("warped_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));
            BlocksLoadedOnly.WARPED_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("warped_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));
            BlocksLoadedOnly.WARPED_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("warped_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));
            BlocksLoadedOnly.WARPED_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("warped_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));
            BlocksLoadedOnly.WARPED_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("warped_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));
            BlocksLoadedOnly.GILDED_WARPED_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_warped_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
            BlocksLoadedOnly.WARPED_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("warped_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD)));
            BlocksLoadedOnly.WARPED_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("warped_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD)));
            BlocksLoadedOnly.WARPED_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("warped_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD)));
            BlocksLoadedOnly.WARPED_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("warped_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD)));
        }

        public static void setupBlocks() {
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.OAK_BAULK.get(), BlocksLoadedOnly.STRIPPED_OAK_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.SPRUCE_BAULK.get(), BlocksLoadedOnly.STRIPPED_SPRUCE_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.BIRCH_BAULK.get(), BlocksLoadedOnly.STRIPPED_BIRCH_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.JUNGLE_BAULK.get(), BlocksLoadedOnly.STRIPPED_JUNGLE_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.ACACIA_BAULK.get(), BlocksLoadedOnly.STRIPPED_ACACIA_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.DARK_OAK_BAULK.get(), BlocksLoadedOnly.STRIPPED_DARK_OAK_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.MANGROVE_BAULK.get(), BlocksLoadedOnly.STRIPPED_MANGROVE_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.CHERRY_BAULK.get(), BlocksLoadedOnly.STRIPPED_CHERRY_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.BAMBOO_BAULK.get(), BlocksLoadedOnly.STRIPPED_BAMBOO_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.CRIMSON_BAULK.get(), BlocksLoadedOnly.STRIPPED_CRIMSON_BAULK.get());
            FluffyFurBlocks.axeStrippables(BlocksLoadedOnly.WARPED_BAULK.get(), BlocksLoadedOnly.STRIPPED_WARPED_BAULK.get());
            if (MalumLoadedOnly.isLoaded()) {
                FluffyFurBlocks.axeStrippables(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_BAULK.get(), MalumLoadedOnly.BlocksLoadedOnly.STRIPPED_RUNEWOOD_BAULK.get());
                FluffyFurBlocks.axeStrippables(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_BAULK.get(), MalumLoadedOnly.BlocksLoadedOnly.STRIPPED_SOULWOOD_BAULK.get());
            }
            //OAK
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.OAK_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.OAK_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_OAK_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_OAK_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.OAK_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.OAK_PLANKS_CROSS_BAULK.get(), 5, 20);
            //SPRUCE
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.SPRUCE_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.SPRUCE_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_SPRUCE_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.SPRUCE_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK.get(), 5, 20);
            //BIRCH
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.BIRCH_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.BIRCH_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_BIRCH_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.BIRCH_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.BIRCH_PLANKS_CROSS_BAULK.get(), 5, 20);
            //JUNGLE
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.JUNGLE_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.JUNGLE_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_JUNGLE_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.JUNGLE_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK.get(), 5, 20);
            //ACACIA
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.ACACIA_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.ACACIA_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_ACACIA_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.ACACIA_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.ACACIA_PLANKS_CROSS_BAULK.get(), 5, 20);
            //DARK_OAK
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.DARK_OAK_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.DARK_OAK_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_DARK_OAK_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.DARK_OAK_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK.get(), 5, 20);
            //MANGROVE
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.MANGROVE_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.MANGROVE_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_MANGROVE_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.MANGROVE_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK.get(), 5, 20);
            //CHERRY
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.CHERRY_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.CHERRY_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_CHERRY_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.CHERRY_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.CHERRY_PLANKS_CROSS_BAULK.get(), 5, 20);
            //BAMBOO
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.BAMBOO_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.BAMBOO_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_BAMBOO_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.BAMBOO_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK.get(), 5, 20);
            //CRIMSON
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.CRIMSON_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.CRIMSON_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_CRIMSON_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.CRIMSON_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK.get(), 5, 20);
            //WARPED
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.WARPED_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.WARPED_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_WARPED_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.STRIPPED_WARPED_CROSS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.WARPED_PLANKS_BAULK.get(), 5, 20);
            FluffyFurBlocks.fireBlock(BlocksLoadedOnly.WARPED_PLANKS_CROSS_BAULK.get(), 5, 20);
            if (MalumLoadedOnly.isLoaded()) {
                //RUNEWOOD
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_CROSS_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.STRIPPED_RUNEWOOD_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_PLANKS_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK.get(), 5, 20);
                //SOULWOOD
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_CROSS_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.STRIPPED_SOULWOOD_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_PLANKS_BAULK.get(), 5, 20);
                FluffyFurBlocks.fireBlock(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK.get(), 5, 20);
            }
        }

        public static void makeBlockEntities() {
            BlockEntitiesLoadedOnly.ARCANE_PEDESTAL = BlockEntitiesLoadedOnly.BLOCK_ENTITIES.register("arcane_pedestal", () -> BlockEntityType.Builder.of(SillyOdditiesArcanePedestalBlockEntity::new, getArcanePedestalBlocks()).build(null));
            BlockEntitiesLoadedOnly.WISSEN_CASING = BlockEntitiesLoadedOnly.BLOCK_ENTITIES.register("wissen_casing", () -> BlockEntityType.Builder.of(SillyOdditiesWissenCasingBlockEntity::new, getWissenCasingBlocks()).build(null));
            BlockEntitiesLoadedOnly.LIGHT_CASING = BlockEntitiesLoadedOnly.BLOCK_ENTITIES.register("light_casing", () -> BlockEntityType.Builder.of(SillyOdditiesLightCasingBlockEntity::new, getLightCasingBlocks()).build(null));
            BlockEntitiesLoadedOnly.FLUID_CASING = BlockEntitiesLoadedOnly.BLOCK_ENTITIES.register("fluid_casing", () -> BlockEntityType.Builder.of(SillyOdditiesFluidCasingBlockEntity::new, getFluidCasingBlocks()).build(null));
            BlockEntitiesLoadedOnly.STEAM_CASING = BlockEntitiesLoadedOnly.BLOCK_ENTITIES.register("steam_casing", () -> BlockEntityType.Builder.of(SillyOdditiesSteamCasingBlockEntity::new, getSteamCasingBlocks()).build(null));
            BlockEntitiesLoadedOnly.SALT_TORCH = BlockEntitiesLoadedOnly.BLOCK_ENTITIES.register("salt_torch", () -> BlockEntityType.Builder.of(SillyOdditiesSaltTorchBlockEntity::new, getSaltTorchBlocks()).build(null));
            BlockEntitiesLoadedOnly.SALT_LANTERN =BlockEntitiesLoadedOnly. BLOCK_ENTITIES.register("salt_lantern", () -> BlockEntityType.Builder.of(SillyOdditiesSaltLanternBlockEntity::new, getSaltLanternBlocks()).build(null));
            BlockEntitiesLoadedOnly.SALT_CAMPFIRE = BlockEntitiesLoadedOnly.BLOCK_ENTITIES.register("salt_campfire", () -> BlockEntityType.Builder.of(SillyOdditiesSaltCampfireBlockEntity::new, getSaltCampfireBlocks()).build(null));
            BlockEntitiesLoadedOnly.CROSS_BAULK = BlockEntitiesLoadedOnly.BLOCK_ENTITIES.register("cross_baulk", () -> BlockEntityType.Builder.of(SillyOdditiesCrossBaulkBlockEntity::new, getCrossBaulkBlocks()).build(null));
        }

        public static Block[] getArcanePedestalBlocks() {
            ArrayList<Block> matchingBlocks = new ArrayList<>();
            matchingBlocks.add(BlocksLoadedOnly.OAK_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_PEDESTAL.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_PEDESTAL.get());
            if (MalumLoadedOnly.isLoaded()) {
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_PEDESTAL.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_PEDESTAL.get());
            }
            return matchingBlocks.toArray(new Block[0]);
        }

        public static Block[] getWissenCasingBlocks() {
            ArrayList<Block> matchingBlocks = new ArrayList<>();
            matchingBlocks.add(BlocksLoadedOnly.OAK_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_WISSEN_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_WISSEN_CASING.get());
            if (MalumLoadedOnly.isLoaded()) {
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_WISSEN_CASING.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_WISSEN_CASING.get());
            }
            return matchingBlocks.toArray(new Block[0]);
        }

        public static Block[] getLightCasingBlocks() {
            ArrayList<Block> matchingBlocks = new ArrayList<>();
            matchingBlocks.add(BlocksLoadedOnly.OAK_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_LIGHT_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_LIGHT_CASING.get());
            if (MalumLoadedOnly.isLoaded()) {
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_LIGHT_CASING.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_LIGHT_CASING.get());
            }
            return matchingBlocks.toArray(new Block[0]);
        }

        public static Block[] getFluidCasingBlocks() {
            ArrayList<Block> matchingBlocks = new ArrayList<>();
            matchingBlocks.add(BlocksLoadedOnly.OAK_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_FLUID_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_FLUID_CASING.get());
            if (MalumLoadedOnly.isLoaded()) {
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_FLUID_CASING.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_FLUID_CASING.get());
            }
            return matchingBlocks.toArray(new Block[0]);
        }

        public static Block[] getSteamCasingBlocks() {
            ArrayList<Block> matchingBlocks = new ArrayList<>();
            matchingBlocks.add(BlocksLoadedOnly.OAK_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_STEAM_CASING.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_STEAM_CASING.get());
            if (MalumLoadedOnly.isLoaded()) {
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_STEAM_CASING.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_STEAM_CASING.get());
            }
            return matchingBlocks.toArray(new Block[0]);
        }

        public static Block[] getSaltTorchBlocks() {
            ArrayList<Block> matchingBlocks = new ArrayList<>();
            matchingBlocks.add(BlocksLoadedOnly.OAK_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.OAK_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_SALT_WALL_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_SALT_TORCH.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_SALT_WALL_TORCH.get());
            if (MalumLoadedOnly.isLoaded()) {
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_SALT_TORCH.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_SALT_WALL_TORCH.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_SALT_TORCH.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_SALT_WALL_TORCH.get());
            }
            return matchingBlocks.toArray(new Block[0]);
        }

        public static Block[] getSaltLanternBlocks() {
            ArrayList<Block> matchingBlocks = new ArrayList<>();
            matchingBlocks.add(BlocksLoadedOnly.OAK_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_SALT_LANTERN.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_SALT_LANTERN.get());
            if (MalumLoadedOnly.isLoaded()) {
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_SALT_LANTERN.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_SALT_LANTERN.get());
            }
            return matchingBlocks.toArray(new Block[0]);
        }

        public static Block[] getSaltCampfireBlocks() {
            ArrayList<Block> matchingBlocks = new ArrayList<>();
            matchingBlocks.add(BlocksLoadedOnly.OAK_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_SALT_CAMPFIRE.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_SALT_CAMPFIRE.get());
            if (MalumLoadedOnly.isLoaded()) {
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_SALT_CAMPFIRE.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_SALT_CAMPFIRE.get());
            }
            return matchingBlocks.toArray(new Block[0]);
        }

        public static Block[] getCrossBaulkBlocks() {
            ArrayList<Block> matchingBlocks = new ArrayList<>();
            matchingBlocks.add(BlocksLoadedOnly.OAK_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_OAK_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.OAK_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.BIRCH_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.ACACIA_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.CHERRY_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.STRIPPED_WARPED_CROSS_BAULK.get());
            matchingBlocks.add(BlocksLoadedOnly.WARPED_PLANKS_CROSS_BAULK.get());
            if (MalumLoadedOnly.isLoaded()) {
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_CROSS_BAULK.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_CROSS_BAULK.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK.get());
                matchingBlocks.add(MalumLoadedOnly.BlocksLoadedOnly.SOULWOOD_TILES_CROSS_BAULK.get());
            }
            return matchingBlocks.toArray(new Block[0]);
        }
    }

    public static class MalumLoadedOnly {
        public static boolean LOADED;
        public static String MOD_ID = "malum";

        public static class ItemsLoadedOnly {
            public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SillyOddities.MOD_ID);

            public static RegistryObject<Item> RUNEWOOD_BAULK, RUNEWOOD_CROSS_BAULK, STRIPPED_RUNEWOOD_BAULK, STRIPPED_RUNEWOOD_CROSS_BAULK, RUNEWOOD_BOARDS_BAULK, RUNEWOOD_BOARDS_CROSS_BAULK, RUNEWOOD_PLANKS_BAULK, RUNEWOOD_PLANKS_CROSS_BAULK, RUNEWOOD_TILES_BAULK, RUNEWOOD_TILES_CROSS_BAULK, RUNEWOOD_PEDESTAL, RUNEWOOD_FRAME, RUNEWOOD_GLASS_FRAME, RUNEWOOD_CASING, RUNEWOOD_WISSEN_CASING, RUNEWOOD_LIGHT_CASING, RUNEWOOD_FLUID_CASING, RUNEWOOD_STEAM_CASING, GILDED_RUNEWOOD_BOARDS, GILDED_RUNEWOOD_PLANKS, GILDED_RUNEWOOD_TILES, RUNEWOOD_SALT_TORCH, RUNEWOOD_SALT_LANTERN, RUNEWOOD_SALT_CAMPFIRE, RUNEWOOD_SMOKING_PIPE;
            public static RegistryObject<Item> SOULWOOD_BAULK, SOULWOOD_CROSS_BAULK, STRIPPED_SOULWOOD_BAULK, STRIPPED_SOULWOOD_CROSS_BAULK, SOULWOOD_BOARDS_BAULK, SOULWOOD_BOARDS_CROSS_BAULK, SOULWOOD_PLANKS_BAULK, SOULWOOD_PLANKS_CROSS_BAULK, SOULWOOD_TILES_BAULK, SOULWOOD_TILES_CROSS_BAULK, SOULWOOD_PEDESTAL, SOULWOOD_FRAME, SOULWOOD_GLASS_FRAME, SOULWOOD_CASING, SOULWOOD_WISSEN_CASING, SOULWOOD_LIGHT_CASING, SOULWOOD_FLUID_CASING, SOULWOOD_STEAM_CASING, GILDED_SOULWOOD_BOARDS, GILDED_SOULWOOD_PLANKS, GILDED_SOULWOOD_TILES, SOULWOOD_SALT_TORCH, SOULWOOD_SALT_LANTERN, SOULWOOD_SALT_CAMPFIRE, SOULWOOD_SMOKING_PIPE;
        }

        public static class BlocksLoadedOnly {
            public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SillyOddities.MOD_ID);

            public static RegistryObject<Block> RUNEWOOD_BAULK, RUNEWOOD_CROSS_BAULK, STRIPPED_RUNEWOOD_BAULK, STRIPPED_RUNEWOOD_CROSS_BAULK, RUNEWOOD_BOARDS_BAULK, RUNEWOOD_BOARDS_CROSS_BAULK, RUNEWOOD_PLANKS_BAULK, RUNEWOOD_PLANKS_CROSS_BAULK, RUNEWOOD_TILES_BAULK, RUNEWOOD_TILES_CROSS_BAULK, RUNEWOOD_PEDESTAL, RUNEWOOD_FRAME, RUNEWOOD_GLASS_FRAME, RUNEWOOD_CASING, RUNEWOOD_WISSEN_CASING, RUNEWOOD_LIGHT_CASING, RUNEWOOD_FLUID_CASING, RUNEWOOD_STEAM_CASING, GILDED_RUNEWOOD_BOARDS, GILDED_RUNEWOOD_PLANKS, GILDED_RUNEWOOD_TILES, RUNEWOOD_SALT_TORCH, RUNEWOOD_SALT_WALL_TORCH, RUNEWOOD_SALT_LANTERN, RUNEWOOD_SALT_CAMPFIRE;
            public static RegistryObject<Block> SOULWOOD_BAULK, SOULWOOD_CROSS_BAULK, STRIPPED_SOULWOOD_BAULK, STRIPPED_SOULWOOD_CROSS_BAULK, SOULWOOD_BOARDS_BAULK, SOULWOOD_BOARDS_CROSS_BAULK, SOULWOOD_PLANKS_BAULK, SOULWOOD_PLANKS_CROSS_BAULK, SOULWOOD_TILES_BAULK, SOULWOOD_TILES_CROSS_BAULK, SOULWOOD_PEDESTAL, SOULWOOD_FRAME, SOULWOOD_GLASS_FRAME, SOULWOOD_CASING, SOULWOOD_WISSEN_CASING, SOULWOOD_LIGHT_CASING, SOULWOOD_FLUID_CASING, SOULWOOD_STEAM_CASING, GILDED_SOULWOOD_BOARDS, GILDED_SOULWOOD_PLANKS, GILDED_SOULWOOD_TILES, SOULWOOD_SALT_TORCH, SOULWOOD_SALT_WALL_TORCH, SOULWOOD_SALT_LANTERN, SOULWOOD_SALT_CAMPFIRE;
        }

        public static class LoadedOnly {
            public static void makeItems() {
                //RUNEWOOD
                ItemsLoadedOnly.RUNEWOOD_BAULK = ItemsLoadedOnly.ITEMS.register("runewood_baulk", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("runewood_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.STRIPPED_RUNEWOOD_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_runewood_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_RUNEWOOD_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_runewood_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_BOARDS_BAULK = ItemsLoadedOnly.ITEMS.register("runewood_boards_baulk", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_BOARDS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("runewood_boards_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("runewood_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_PLANKS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("runewood_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_TILES_BAULK = ItemsLoadedOnly.ITEMS.register("runewood_tiles_baulk", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_TILES_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("runewood_tiles_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_PEDESTAL = ItemsLoadedOnly.ITEMS.register("runewood_pedestal", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_PEDESTAL.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_FRAME = ItemsLoadedOnly.ITEMS.register("runewood_frame", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_FRAME.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("runewood_glass_frame", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_GLASS_FRAME.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_CASING = ItemsLoadedOnly.ITEMS.register("runewood_casing", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("runewood_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_WISSEN_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("runewood_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.RUNEWOOD_LIGHT_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("runewood_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_FLUID_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("runewood_steam_casing", () -> new BlockItem(BlocksLoadedOnly.RUNEWOOD_STEAM_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.GILDED_RUNEWOOD_BOARDS = ItemsLoadedOnly.ITEMS.register("gilded_runewood_boards", () -> new BlockItem(BlocksLoadedOnly.GILDED_RUNEWOOD_BOARDS.get(), new Item.Properties()));
                ItemsLoadedOnly.GILDED_RUNEWOOD_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_runewood_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_RUNEWOOD_PLANKS.get(), new Item.Properties()));
                ItemsLoadedOnly.GILDED_RUNEWOOD_TILES = ItemsLoadedOnly.ITEMS.register("gilded_runewood_tiles", () -> new BlockItem(BlocksLoadedOnly.GILDED_RUNEWOOD_TILES.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("runewood_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.RUNEWOOD_SALT_TORCH.get(), BlocksLoadedOnly.RUNEWOOD_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
                ItemsLoadedOnly.RUNEWOOD_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("runewood_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.RUNEWOOD_SALT_LANTERN.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("runewood_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.RUNEWOOD_SALT_CAMPFIRE.get(), new Item.Properties()));
                ItemsLoadedOnly.RUNEWOOD_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("runewood_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
                //SOULWOOD
                ItemsLoadedOnly.SOULWOOD_BAULK = ItemsLoadedOnly.ITEMS.register("soulwood_baulk", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("soulwood_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.STRIPPED_SOULWOOD_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_soulwood_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_SOULWOOD_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("stripped_soulwood_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_BOARDS_BAULK = ItemsLoadedOnly.ITEMS.register("soulwood_boards_baulk", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_BOARDS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("soulwood_boards_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_PLANKS_BAULK = ItemsLoadedOnly.ITEMS.register("soulwood_planks_baulk", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_PLANKS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("soulwood_planks_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_TILES_BAULK = ItemsLoadedOnly.ITEMS.register("soulwood_tiles_baulk", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_TILES_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_TILES_CROSS_BAULK = ItemsLoadedOnly.ITEMS.register("soulwood_tiles_cross_baulk", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_TILES_CROSS_BAULK.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_PEDESTAL = ItemsLoadedOnly.ITEMS.register("soulwood_pedestal", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_PEDESTAL.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_FRAME = ItemsLoadedOnly.ITEMS.register("soulwood_frame", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_FRAME.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_GLASS_FRAME = ItemsLoadedOnly.ITEMS.register("soulwood_glass_frame", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_GLASS_FRAME.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_CASING = ItemsLoadedOnly.ITEMS.register("soulwood_casing", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_WISSEN_CASING = ItemsLoadedOnly.ITEMS.register("soulwood_wissen_casing", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_WISSEN_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_LIGHT_CASING = ItemsLoadedOnly.ITEMS.register("soulwood_light_casing", () -> new SillyOdditiesRenderBlockItem(BlocksLoadedOnly.SOULWOOD_LIGHT_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_FLUID_CASING = ItemsLoadedOnly.ITEMS.register("soulwood_fluid_casing", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_FLUID_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_STEAM_CASING = ItemsLoadedOnly.ITEMS.register("soulwood_steam_casing", () -> new BlockItem(BlocksLoadedOnly.SOULWOOD_STEAM_CASING.get(), new Item.Properties()));
                ItemsLoadedOnly.GILDED_SOULWOOD_BOARDS = ItemsLoadedOnly.ITEMS.register("gilded_soulwood_boards", () -> new BlockItem(BlocksLoadedOnly.GILDED_SOULWOOD_BOARDS.get(), new Item.Properties()));
                ItemsLoadedOnly.GILDED_SOULWOOD_PLANKS = ItemsLoadedOnly.ITEMS.register("gilded_soulwood_planks", () -> new BlockItem(BlocksLoadedOnly.GILDED_SOULWOOD_PLANKS.get(), new Item.Properties()));
                ItemsLoadedOnly.GILDED_SOULWOOD_TILES = ItemsLoadedOnly.ITEMS.register("gilded_soulwood_tiles", () -> new BlockItem(BlocksLoadedOnly.GILDED_SOULWOOD_TILES.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_SALT_TORCH = ItemsLoadedOnly.ITEMS.register("soulwood_salt_torch", () -> new SaltTorchItem(BlocksLoadedOnly.SOULWOOD_SALT_TORCH.get(), BlocksLoadedOnly.SOULWOOD_SALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
                ItemsLoadedOnly.SOULWOOD_SALT_LANTERN = ItemsLoadedOnly.ITEMS.register("soulwood_salt_lantern", () -> new SaltLanternItem(BlocksLoadedOnly.SOULWOOD_SALT_LANTERN.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_SALT_CAMPFIRE = ItemsLoadedOnly.ITEMS.register("soulwood_salt_campfire", () -> new SaltCampfireItem(BlocksLoadedOnly.SOULWOOD_SALT_CAMPFIRE.get(), new Item.Properties()));
                ItemsLoadedOnly.SOULWOOD_SMOKING_PIPE = ItemsLoadedOnly.ITEMS.register("soulwood_smoking_pipe", () -> new SmokingPipeItem(new Item.Properties().stacksTo(1)));
            }

            public static void makeBlocks() {
                //RUNEWOOD
                BlocksLoadedOnly.RUNEWOOD_BAULK = BlocksLoadedOnly.BLOCKS.register("runewood_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_LOG.get())));
                BlocksLoadedOnly.RUNEWOOD_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("runewood_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD.get())));
                BlocksLoadedOnly.STRIPPED_RUNEWOOD_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_runewood_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.STRIPPED_RUNEWOOD_LOG.get())));
                BlocksLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_runewood_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.STRIPPED_RUNEWOOD.get())));
                BlocksLoadedOnly.RUNEWOOD_BOARDS_BAULK = BlocksLoadedOnly.BLOCKS.register("runewood_boards_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_BOARDS.get())));
                BlocksLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("runewood_boards_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_BOARDS.get())));
                BlocksLoadedOnly.RUNEWOOD_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("runewood_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get())));
                BlocksLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("runewood_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get())));
                BlocksLoadedOnly.RUNEWOOD_TILES_BAULK = BlocksLoadedOnly.BLOCKS.register("runewood_tiles_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_TILES.get())));
                BlocksLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("runewood_tiles_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_TILES.get())));
                BlocksLoadedOnly.RUNEWOOD_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("runewood_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get())));
                BlocksLoadedOnly.RUNEWOOD_FRAME = BlocksLoadedOnly.BLOCKS.register("runewood_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.RUNEWOOD_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("runewood_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.RUNEWOOD_CASING = BlocksLoadedOnly.BLOCKS.register("runewood_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.RUNEWOOD_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("runewood_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.RUNEWOOD_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("runewood_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.RUNEWOOD_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("runewood_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.RUNEWOOD_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("runewood_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.GILDED_RUNEWOOD_BOARDS = BlocksLoadedOnly.BLOCKS.register("gilded_runewood_boards", () -> new Block(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_BOARDS.get())));
                BlocksLoadedOnly.GILDED_RUNEWOOD_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_runewood_planks", () -> new Block(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_PLANKS.get())));
                BlocksLoadedOnly.GILDED_RUNEWOOD_TILES = BlocksLoadedOnly.BLOCKS.register("gilded_runewood_tiles", () -> new Block(BlockBehaviour.Properties.copy(BlockRegistry.RUNEWOOD_TILES.get())));
                BlocksLoadedOnly.RUNEWOOD_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("runewood_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundRegistry.RUNEWOOD)));
                BlocksLoadedOnly.RUNEWOOD_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("runewood_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundRegistry.RUNEWOOD)));
                BlocksLoadedOnly.RUNEWOOD_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("runewood_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundRegistry.RUNEWOOD)));
                BlocksLoadedOnly.RUNEWOOD_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("runewood_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundRegistry.RUNEWOOD)));
                //SOULWOOD
                BlocksLoadedOnly.SOULWOOD_BAULK = BlocksLoadedOnly.BLOCKS.register("soulwood_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_LOG.get())));
                BlocksLoadedOnly.SOULWOOD_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("soulwood_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD.get())));
                BlocksLoadedOnly.STRIPPED_SOULWOOD_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_soulwood_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.STRIPPED_SOULWOOD_LOG.get())));
                BlocksLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("stripped_soulwood_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.STRIPPED_SOULWOOD.get())));
                BlocksLoadedOnly.SOULWOOD_BOARDS_BAULK = BlocksLoadedOnly.BLOCKS.register("soulwood_boards_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_BOARDS.get())));
                BlocksLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("soulwood_boards_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_BOARDS.get())));
                BlocksLoadedOnly.SOULWOOD_PLANKS_BAULK = BlocksLoadedOnly.BLOCKS.register("soulwood_planks_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get())));
                BlocksLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("soulwood_planks_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get())));
                BlocksLoadedOnly.SOULWOOD_TILES_BAULK = BlocksLoadedOnly.BLOCKS.register("soulwood_tiles_baulk", () -> new BaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_TILES.get())));
                BlocksLoadedOnly.SOULWOOD_TILES_CROSS_BAULK = BlocksLoadedOnly.BLOCKS.register("soulwood_tiles_cross_baulk", () -> new SillyOdditiesCrossBaulkBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_TILES.get())));
                BlocksLoadedOnly.SOULWOOD_PEDESTAL = BlocksLoadedOnly.BLOCKS.register("soulwood_pedestal", () -> new SillyOdditiesArcanePedestalBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get())));
                BlocksLoadedOnly.SOULWOOD_FRAME = BlocksLoadedOnly.BLOCKS.register("soulwood_frame", () -> new FrameBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.SOULWOOD_GLASS_FRAME = BlocksLoadedOnly.BLOCKS.register("soulwood_glass_frame", () -> new GlassFrameBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.SOULWOOD_CASING = BlocksLoadedOnly.BLOCKS.register("soulwood_casing", () -> new CasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.SOULWOOD_WISSEN_CASING = BlocksLoadedOnly.BLOCKS.register("soulwood_wissen_casing", () -> new SillyOdditiesWissenCasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.SOULWOOD_LIGHT_CASING = BlocksLoadedOnly.BLOCKS.register("soulwood_light_casing", () -> new SillyOdditiesLightCasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.SOULWOOD_FLUID_CASING = BlocksLoadedOnly.BLOCKS.register("soulwood_fluid_casing", () -> new SillyOdditiesFluidCasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.SOULWOOD_STEAM_CASING = BlocksLoadedOnly.BLOCKS.register("soulwood_steam_casing", () -> new SillyOdditiesSteamCasingBlock(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get()).noOcclusion()));
                BlocksLoadedOnly.GILDED_SOULWOOD_BOARDS = BlocksLoadedOnly.BLOCKS.register("gilded_soulwood_boards", () -> new Block(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_BOARDS.get())));
                BlocksLoadedOnly.GILDED_SOULWOOD_PLANKS = BlocksLoadedOnly.BLOCKS.register("gilded_soulwood_planks", () -> new Block(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_PLANKS.get())));
                BlocksLoadedOnly.GILDED_SOULWOOD_TILES = BlocksLoadedOnly.BLOCKS.register("gilded_soulwood_tiles", () -> new Block(BlockBehaviour.Properties.copy(BlockRegistry.SOULWOOD_TILES.get())));
                BlocksLoadedOnly.SOULWOOD_SALT_TORCH = BlocksLoadedOnly.BLOCKS.register("soulwood_salt_torch", () -> new SillyOdditiesSaltTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_PURPLE).sound(SoundRegistry.SOULWOOD)));
                BlocksLoadedOnly.SOULWOOD_SALT_WALL_TORCH = BlocksLoadedOnly.BLOCKS.register("soulwood_salt_wall_torch", () -> new SillyOdditiesSaltWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_PURPLE).sound(SoundRegistry.SOULWOOD)));
                BlocksLoadedOnly.SOULWOOD_SALT_LANTERN = BlocksLoadedOnly.BLOCKS.register("soulwood_salt_lantern", () -> new SillyOdditiesSaltLanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_PURPLE).sound(SoundRegistry.SOULWOOD)));
                BlocksLoadedOnly.SOULWOOD_SALT_CAMPFIRE = BlocksLoadedOnly.BLOCKS.register("soulwood_salt_campfire", () -> new SillyOdditiesSaltCampfireBlock(BlockBehaviour.Properties.copy(Blocks.CAMPFIRE).lightLevel((state) -> state.getValue(BlockStateProperties.LIT) ? 15 : 0).mapColor(MapColor.TERRACOTTA_PURPLE).sound(SoundRegistry.SOULWOOD)));
            }
        }

        public static boolean isLoaded() {
            return LOADED;
        }
    }

    public static class ModelsLoadedOnly {
        public static ModelResourceLocation OAK_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("oak_light_casing_piece");
        public static ModelResourceLocation SPRUCE_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("spruce_light_casing_piece");
        public static ModelResourceLocation BIRCH_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("birch_light_casing_piece");
        public static ModelResourceLocation JUNGLE_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("jungle_light_casing_piece");
        public static ModelResourceLocation ACACIA_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("acacia_light_casing_piece");
        public static ModelResourceLocation DARK_OAK_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("dark_oak_light_casing_piece");
        public static ModelResourceLocation MANGROVE_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("mangrove_light_casing_piece");
        public static ModelResourceLocation CHERRY_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("cherry_light_casing_piece");
        public static ModelResourceLocation BAMBOO_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("bamboo_light_casing_piece");
        public static ModelResourceLocation CRIMSON_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("crimson_light_casing_piece");
        public static ModelResourceLocation WARPED_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("warped_light_casing_piece");
        public static ModelResourceLocation RUNEWOOD_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("runewood_light_casing_piece");
        public static ModelResourceLocation SOULWOOD_LIGHT_CASING_PIECE = SillyOdditiesModels.addCustomModel("soulwood_light_casing_piece");

        public static ArrayList<PipeModel> oakFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> spruceFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> birchFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> jungleFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> acaciaFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> darkOakFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> mangroveFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> cherryFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> bambooFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> crimsonFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> warpedFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> runewoodFluidCasing = new ArrayList<>();
        public static ArrayList<PipeModel> soulwoodFluidCasing = new ArrayList<>();

        public static ArrayList<PipeModel> oakSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> spruceSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> birchSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> jungleSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> acaciaSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> darkOakSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> mangroveSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> cherrySteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> bambooSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> crimsonSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> warpedSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> runewoodSteamCasing = new ArrayList<>();
        public static ArrayList<PipeModel> soulwoodSteamCasing = new ArrayList<>();

        public static PipeModel oakCrossBaulk;
        public static PipeModel strippedOakCrossBaulk;
        public static PipeModel oakPlanksCrossBaulk;
        public static PipeModel spruceCrossBaulk;
        public static PipeModel strippedSpruceCrossBaulk;
        public static PipeModel sprucePlanksCrossBaulk;
        public static PipeModel birchCrossBaulk;
        public static PipeModel strippedBirchCrossBaulk;
        public static PipeModel birchPlanksCrossBaulk;
        public static PipeModel jungleCrossBaulk;
        public static PipeModel strippedJungleCrossBaulk;
        public static PipeModel junglePlanksCrossBaulk;
        public static PipeModel acaciaCrossBaulk;
        public static PipeModel strippedAcaciaCrossBaulk;
        public static PipeModel acaciaPlanksCrossBaulk;
        public static PipeModel darkOakCrossBaulk;
        public static PipeModel strippedDarkOakCrossBaulk;
        public static PipeModel darkOakPlanksCrossBaulk;
        public static PipeModel mangroveCrossBaulk;
        public static PipeModel strippedMangroveCrossBaulk;
        public static PipeModel mangrovePlanksCrossBaulk;
        public static PipeModel cherryCrossBaulk;
        public static PipeModel strippedCherryCrossBaulk;
        public static PipeModel cherryPlanksCrossBaulk;
        public static PipeModel bambooCrossBaulk;
        public static PipeModel strippedBambooCrossBaulk;
        public static PipeModel bambooPlanksCrossBaulk;
        public static PipeModel bambooMosaicCrossBaulk;
        public static PipeModel crimsonCrossBaulk;
        public static PipeModel strippedCrimsonCrossBaulk;
        public static PipeModel crimsonPlanksCrossBaulk;
        public static PipeModel warpedCrossBaulk;
        public static PipeModel strippedWarpedCrossBaulk;
        public static PipeModel warpedPlanksCrossBaulk;
        public static PipeModel runewoodCrossBaulk;
        public static PipeModel strippedRunewoodCrossBaulk;
        public static PipeModel runewoodBoardsCrossBaulk;
        public static PipeModel runewoodPlanksCrossBaulk;
        public static PipeModel runewoodTilesCrossBaulk;
        public static PipeModel soulwoodCrossBaulk;
        public static PipeModel strippedSoulwoodCrossBaulk;
        public static PipeModel soulwoodBoardsCrossBaulk;
        public static PipeModel soulwoodPlanksCrossBaulk;
        public static PipeModel soulwoodTilesCrossBaulk;

        //OAK
        public static final ModelResourceLocation OAK_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("oak_cross_baulk_center");
        public static final ModelResourceLocation OAK_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("oak_cross_baulk_connection");
        public static final ModelResourceLocation OAK_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("oak_cross_baulk_end");
        public static final ModelResourceLocation OAK_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("oak_cross_baulk_connection_opposite");
        public static final ModelResourceLocation OAK_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("oak_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_OAK_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_oak_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_OAK_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_oak_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_OAK_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_oak_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_OAK_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_oak_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_OAK_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_oak_cross_baulk_end_opposite");

        public static final ModelResourceLocation OAK_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("oak_planks_cross_baulk_center");
        public static final ModelResourceLocation OAK_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("oak_planks_cross_baulk_connection");
        public static final ModelResourceLocation OAK_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("oak_planks_cross_baulk_end");
        public static final ModelResourceLocation OAK_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("oak_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation OAK_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("oak_planks_cross_baulk_end_opposite");
        //SPRUCE
        public static final ModelResourceLocation SPRUCE_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("spruce_cross_baulk_center");
        public static final ModelResourceLocation SPRUCE_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("spruce_cross_baulk_connection");
        public static final ModelResourceLocation SPRUCE_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("spruce_cross_baulk_end");
        public static final ModelResourceLocation SPRUCE_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("spruce_cross_baulk_connection_opposite");
        public static final ModelResourceLocation SPRUCE_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("spruce_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_SPRUCE_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_spruce_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_SPRUCE_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_spruce_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_SPRUCE_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_spruce_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_SPRUCE_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_spruce_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_SPRUCE_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_spruce_cross_baulk_end_opposite");

        public static final ModelResourceLocation SPRUCE_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("spruce_planks_cross_baulk_center");
        public static final ModelResourceLocation SPRUCE_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("spruce_planks_cross_baulk_connection");
        public static final ModelResourceLocation SPRUCE_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("spruce_planks_cross_baulk_end");
        public static final ModelResourceLocation SPRUCE_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("spruce_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation SPRUCE_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("spruce_planks_cross_baulk_end_opposite");
        //BIRCH
        public static final ModelResourceLocation BIRCH_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("birch_cross_baulk_center");
        public static final ModelResourceLocation BIRCH_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("birch_cross_baulk_connection");
        public static final ModelResourceLocation BIRCH_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("birch_cross_baulk_end");
        public static final ModelResourceLocation BIRCH_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("birch_cross_baulk_connection_opposite");
        public static final ModelResourceLocation BIRCH_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("birch_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_BIRCH_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_birch_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_BIRCH_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_birch_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_BIRCH_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_birch_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_BIRCH_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_birch_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_BIRCH_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_birch_cross_baulk_end_opposite");

        public static final ModelResourceLocation BIRCH_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("birch_planks_cross_baulk_center");
        public static final ModelResourceLocation BIRCH_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("birch_planks_cross_baulk_connection");
        public static final ModelResourceLocation BIRCH_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("birch_planks_cross_baulk_end");
        public static final ModelResourceLocation BIRCH_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("birch_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation BIRCH_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("birch_planks_cross_baulk_end_opposite");
        //JUNGLE
        public static final ModelResourceLocation JUNGLE_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("jungle_cross_baulk_center");
        public static final ModelResourceLocation JUNGLE_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("jungle_cross_baulk_connection");
        public static final ModelResourceLocation JUNGLE_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("jungle_cross_baulk_end");
        public static final ModelResourceLocation JUNGLE_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("jungle_cross_baulk_connection_opposite");
        public static final ModelResourceLocation JUNGLE_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("jungle_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_JUNGLE_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_jungle_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_JUNGLE_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_jungle_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_JUNGLE_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_jungle_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_JUNGLE_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_jungle_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_JUNGLE_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_jungle_cross_baulk_end_opposite");

        public static final ModelResourceLocation JUNGLE_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("jungle_planks_cross_baulk_center");
        public static final ModelResourceLocation JUNGLE_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("jungle_planks_cross_baulk_connection");
        public static final ModelResourceLocation JUNGLE_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("jungle_planks_cross_baulk_end");
        public static final ModelResourceLocation JUNGLE_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("jungle_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation JUNGLE_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("jungle_planks_cross_baulk_end_opposite");
        //ACACIA
        public static final ModelResourceLocation ACACIA_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("acacia_cross_baulk_center");
        public static final ModelResourceLocation ACACIA_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("acacia_cross_baulk_connection");
        public static final ModelResourceLocation ACACIA_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("acacia_cross_baulk_end");
        public static final ModelResourceLocation ACACIA_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("acacia_cross_baulk_connection_opposite");
        public static final ModelResourceLocation ACACIA_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("acacia_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_ACACIA_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_acacia_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_ACACIA_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_acacia_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_ACACIA_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_acacia_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_ACACIA_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_acacia_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_ACACIA_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_acacia_cross_baulk_end_opposite");

        public static final ModelResourceLocation ACACIA_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("acacia_planks_cross_baulk_center");
        public static final ModelResourceLocation ACACIA_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("acacia_planks_cross_baulk_connection");
        public static final ModelResourceLocation ACACIA_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("acacia_planks_cross_baulk_end");
        public static final ModelResourceLocation ACACIA_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("acacia_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation ACACIA_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("acacia_planks_cross_baulk_end_opposite");
        //DARK_OAK
        public static final ModelResourceLocation DARK_OAK_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("dark_oak_cross_baulk_center");
        public static final ModelResourceLocation DARK_OAK_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("dark_oak_cross_baulk_connection");
        public static final ModelResourceLocation DARK_OAK_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("dark_oak_cross_baulk_end");
        public static final ModelResourceLocation DARK_OAK_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("dark_oak_cross_baulk_connection_opposite");
        public static final ModelResourceLocation DARK_OAK_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("dark_oak_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_DARK_OAK_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_dark_oak_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_DARK_OAK_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_dark_oak_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_DARK_OAK_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_dark_oak_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_DARK_OAK_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_dark_oak_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_DARK_OAK_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_dark_oak_cross_baulk_end_opposite");

        public static final ModelResourceLocation DARK_OAK_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("dark_oak_planks_cross_baulk_center");
        public static final ModelResourceLocation DARK_OAK_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("dark_oak_planks_cross_baulk_connection");
        public static final ModelResourceLocation DARK_OAK_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("dark_oak_planks_cross_baulk_end");
        public static final ModelResourceLocation DARK_OAK_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("dark_oak_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation DARK_OAK_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("dark_oak_planks_cross_baulk_end_opposite");
        //MANGROVE
        public static final ModelResourceLocation MANGROVE_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("mangrove_cross_baulk_center");
        public static final ModelResourceLocation MANGROVE_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("mangrove_cross_baulk_connection");
        public static final ModelResourceLocation MANGROVE_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("mangrove_cross_baulk_end");
        public static final ModelResourceLocation MANGROVE_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("mangrove_cross_baulk_connection_opposite");
        public static final ModelResourceLocation MANGROVE_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("mangrove_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_MANGROVE_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_mangrove_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_MANGROVE_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_mangrove_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_MANGROVE_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_mangrove_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_MANGROVE_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_mangrove_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_MANGROVE_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_mangrove_cross_baulk_end_opposite");

        public static final ModelResourceLocation MANGROVE_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("mangrove_planks_cross_baulk_center");
        public static final ModelResourceLocation MANGROVE_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("mangrove_planks_cross_baulk_connection");
        public static final ModelResourceLocation MANGROVE_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("mangrove_planks_cross_baulk_end");
        public static final ModelResourceLocation MANGROVE_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("mangrove_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation MANGROVE_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("mangrove_planks_cross_baulk_end_opposite");
        //CHERRY
        public static final ModelResourceLocation CHERRY_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("cherry_cross_baulk_center");
        public static final ModelResourceLocation CHERRY_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("cherry_cross_baulk_connection");
        public static final ModelResourceLocation CHERRY_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("cherry_cross_baulk_end");
        public static final ModelResourceLocation CHERRY_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("cherry_cross_baulk_connection_opposite");
        public static final ModelResourceLocation CHERRY_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("cherry_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_CHERRY_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_cherry_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_CHERRY_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_cherry_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_CHERRY_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_cherry_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_CHERRY_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_cherry_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_CHERRY_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_cherry_cross_baulk_end_opposite");

        public static final ModelResourceLocation CHERRY_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("cherry_planks_cross_baulk_center");
        public static final ModelResourceLocation CHERRY_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("cherry_planks_cross_baulk_connection");
        public static final ModelResourceLocation CHERRY_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("cherry_planks_cross_baulk_end");
        public static final ModelResourceLocation CHERRY_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("cherry_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation CHERRY_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("cherry_planks_cross_baulk_end_opposite");
        //BAMBOO
        public static final ModelResourceLocation BAMBOO_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("bamboo_cross_baulk_center");
        public static final ModelResourceLocation BAMBOO_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("bamboo_cross_baulk_connection");
        public static final ModelResourceLocation BAMBOO_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("bamboo_cross_baulk_end");
        public static final ModelResourceLocation BAMBOO_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("bamboo_cross_baulk_connection_opposite");
        public static final ModelResourceLocation BAMBOO_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("bamboo_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_BAMBOO_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_bamboo_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_BAMBOO_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_bamboo_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_BAMBOO_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_bamboo_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_BAMBOO_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_bamboo_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_BAMBOO_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_bamboo_cross_baulk_end_opposite");

        public static final ModelResourceLocation BAMBOO_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("bamboo_planks_cross_baulk_center");
        public static final ModelResourceLocation BAMBOO_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("bamboo_planks_cross_baulk_connection");
        public static final ModelResourceLocation BAMBOO_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("bamboo_planks_cross_baulk_end");
        public static final ModelResourceLocation BAMBOO_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("bamboo_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation BAMBOO_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("bamboo_planks_cross_baulk_end_opposite");

        public static final ModelResourceLocation BAMBOO_MOSAIC_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("bamboo_mosaic_cross_baulk_center");
        public static final ModelResourceLocation BAMBOO_MOSAIC_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("bamboo_mosaic_cross_baulk_connection");
        public static final ModelResourceLocation BAMBOO_MOSAIC_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("bamboo_mosaic_cross_baulk_end");
        public static final ModelResourceLocation BAMBOO_MOSAIC_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("bamboo_mosaic_cross_baulk_connection_opposite");
        public static final ModelResourceLocation BAMBOO_MOSAIC_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("bamboo_mosaic_cross_baulk_end_opposite");
        //CRIMSON
        public static final ModelResourceLocation CRIMSON_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("crimson_cross_baulk_center");
        public static final ModelResourceLocation CRIMSON_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("crimson_cross_baulk_connection");
        public static final ModelResourceLocation CRIMSON_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("crimson_cross_baulk_end");
        public static final ModelResourceLocation CRIMSON_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("crimson_cross_baulk_connection_opposite");
        public static final ModelResourceLocation CRIMSON_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("crimson_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_CRIMSON_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_crimson_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_CRIMSON_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_crimson_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_CRIMSON_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_crimson_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_CRIMSON_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_crimson_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_CRIMSON_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_crimson_cross_baulk_end_opposite");

        public static final ModelResourceLocation CRIMSON_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("crimson_planks_cross_baulk_center");
        public static final ModelResourceLocation CRIMSON_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("crimson_planks_cross_baulk_connection");
        public static final ModelResourceLocation CRIMSON_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("crimson_planks_cross_baulk_end");
        public static final ModelResourceLocation CRIMSON_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("crimson_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation CRIMSON_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("crimson_planks_cross_baulk_end_opposite");
        //WARPED
        public static final ModelResourceLocation WARPED_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("warped_cross_baulk_center");
        public static final ModelResourceLocation WARPED_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("warped_cross_baulk_connection");
        public static final ModelResourceLocation WARPED_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("warped_cross_baulk_end");
        public static final ModelResourceLocation WARPED_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("warped_cross_baulk_connection_opposite");
        public static final ModelResourceLocation WARPED_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("warped_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_WARPED_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_warped_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_WARPED_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_warped_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_WARPED_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_warped_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_WARPED_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_warped_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_WARPED_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_warped_cross_baulk_end_opposite");

        public static final ModelResourceLocation WARPED_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("warped_planks_cross_baulk_center");
        public static final ModelResourceLocation WARPED_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("warped_planks_cross_baulk_connection");
        public static final ModelResourceLocation WARPED_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("warped_planks_cross_baulk_end");
        public static final ModelResourceLocation WARPED_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("warped_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation WARPED_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("warped_planks_cross_baulk_end_opposite");
        //RUNEWOOD
        public static final ModelResourceLocation RUNEWOOD_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("runewood_cross_baulk_center");
        public static final ModelResourceLocation RUNEWOOD_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("runewood_cross_baulk_connection");
        public static final ModelResourceLocation RUNEWOOD_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("runewood_cross_baulk_end");
        public static final ModelResourceLocation RUNEWOOD_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("runewood_cross_baulk_connection_opposite");
        public static final ModelResourceLocation RUNEWOOD_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("runewood_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_RUNEWOOD_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_runewood_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_RUNEWOOD_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_runewood_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_RUNEWOOD_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_runewood_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_RUNEWOOD_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_runewood_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_RUNEWOOD_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_runewood_cross_baulk_end_opposite");

        public static final ModelResourceLocation RUNEWOOD_BOARDS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("runewood_boards_cross_baulk_center");
        public static final ModelResourceLocation RUNEWOOD_BOARDS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("runewood_boards_cross_baulk_connection");
        public static final ModelResourceLocation RUNEWOOD_BOARDS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("runewood_boards_cross_baulk_end");
        public static final ModelResourceLocation RUNEWOOD_BOARDS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("runewood_boards_cross_baulk_connection_opposite");
        public static final ModelResourceLocation RUNEWOOD_BOARDS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("runewood_boards_cross_baulk_end_opposite");

        public static final ModelResourceLocation RUNEWOOD_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("runewood_planks_cross_baulk_center");
        public static final ModelResourceLocation RUNEWOOD_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("runewood_planks_cross_baulk_connection");
        public static final ModelResourceLocation RUNEWOOD_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("runewood_planks_cross_baulk_end");
        public static final ModelResourceLocation RUNEWOOD_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("runewood_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation RUNEWOOD_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("runewood_planks_cross_baulk_end_opposite");

        public static final ModelResourceLocation RUNEWOOD_TILES_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("runewood_tiles_cross_baulk_center");
        public static final ModelResourceLocation RUNEWOOD_TILES_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("runewood_tiles_cross_baulk_connection");
        public static final ModelResourceLocation RUNEWOOD_TILES_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("runewood_tiles_cross_baulk_end");
        public static final ModelResourceLocation RUNEWOOD_TILES_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("runewood_tiles_cross_baulk_connection_opposite");
        public static final ModelResourceLocation RUNEWOOD_TILES_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("runewood_tiles_cross_baulk_end_opposite");
        //SOULWOOD
        public static final ModelResourceLocation SOULWOOD_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("soulwood_cross_baulk_center");
        public static final ModelResourceLocation SOULWOOD_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("soulwood_cross_baulk_connection");
        public static final ModelResourceLocation SOULWOOD_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("soulwood_cross_baulk_end");
        public static final ModelResourceLocation SOULWOOD_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("soulwood_cross_baulk_connection_opposite");
        public static final ModelResourceLocation SOULWOOD_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("soulwood_cross_baulk_end_opposite");

        public static final ModelResourceLocation STRIPPED_SOULWOOD_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("stripped_soulwood_cross_baulk_center");
        public static final ModelResourceLocation STRIPPED_SOULWOOD_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("stripped_soulwood_cross_baulk_connection");
        public static final ModelResourceLocation STRIPPED_SOULWOOD_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("stripped_soulwood_cross_baulk_end");
        public static final ModelResourceLocation STRIPPED_SOULWOOD_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("stripped_soulwood_cross_baulk_connection_opposite");
        public static final ModelResourceLocation STRIPPED_SOULWOOD_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("stripped_soulwood_cross_baulk_end_opposite");

        public static final ModelResourceLocation SOULWOOD_BOARDS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("soulwood_boards_cross_baulk_center");
        public static final ModelResourceLocation SOULWOOD_BOARDS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("soulwood_boards_cross_baulk_connection");
        public static final ModelResourceLocation SOULWOOD_BOARDS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("soulwood_boards_cross_baulk_end");
        public static final ModelResourceLocation SOULWOOD_BOARDS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("soulwood_boards_cross_baulk_connection_opposite");
        public static final ModelResourceLocation SOULWOOD_BOARDS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("soulwood_boards_cross_baulk_end_opposite");

        public static final ModelResourceLocation SOULWOOD_PLANKS_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("soulwood_planks_cross_baulk_center");
        public static final ModelResourceLocation SOULWOOD_PLANKS_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("soulwood_planks_cross_baulk_connection");
        public static final ModelResourceLocation SOULWOOD_PLANKS_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("soulwood_planks_cross_baulk_end");
        public static final ModelResourceLocation SOULWOOD_PLANKS_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("soulwood_planks_cross_baulk_connection_opposite");
        public static final ModelResourceLocation SOULWOOD_PLANKS_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("soulwood_planks_cross_baulk_end_opposite");

        public static final ModelResourceLocation SOULWOOD_TILES_CROSS_BAULK_CENTER = SillyOdditiesModels.addCustomModel("soulwood_tiles_cross_baulk_center");
        public static final ModelResourceLocation SOULWOOD_TILES_CROSS_BAULK_CONNECTION = SillyOdditiesModels.addCustomModel("soulwood_tiles_cross_baulk_connection");
        public static final ModelResourceLocation SOULWOOD_TILES_CROSS_BAULK_END = SillyOdditiesModels.addCustomModel("soulwood_tiles_cross_baulk_end");
        public static final ModelResourceLocation SOULWOOD_TILES_CROSS_BAULK_CONNECTION_2 = SillyOdditiesModels.addCustomModel("soulwood_tiles_cross_baulk_connection_opposite");
        public static final ModelResourceLocation SOULWOOD_TILES_CROSS_BAULK_END_2 = SillyOdditiesModels.addCustomModel("soulwood_tiles_cross_baulk_end_opposite");
    }

    public static class ClientLoadedOnly {
        public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
            BlockEntityRenderers.register(BlockEntitiesLoadedOnly.ARCANE_PEDESTAL.get(), (r) -> new ArcanePedestalRenderer());
            BlockEntityRenderers.register(BlockEntitiesLoadedOnly.WISSEN_CASING.get(), (r) -> new WissenCasingRenderer());
            BlockEntityRenderers.register(BlockEntitiesLoadedOnly.LIGHT_CASING.get(), (r) -> new LightCasingRenderer());
            BlockEntityRenderers.register(BlockEntitiesLoadedOnly.FLUID_CASING.get(), (r) -> new FluidCasingRenderer());
            BlockEntityRenderers.register(BlockEntitiesLoadedOnly.STEAM_CASING.get(), (r) -> new SteamCasingRenderer());
            BlockEntityRenderers.register(BlockEntitiesLoadedOnly.SALT_CAMPFIRE.get(), (r) -> new SaltCampfireRenderer());
        }

        public static void modelRegistry(ModelEvent.RegisterAdditional event) {
            event.register(ModelsLoadedOnly.OAK_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.SPRUCE_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.BIRCH_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.JUNGLE_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.ACACIA_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.DARK_OAK_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.MANGROVE_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.CHERRY_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.BAMBOO_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.CRIMSON_LIGHT_CASING_PIECE);
            event.register(ModelsLoadedOnly.WARPED_LIGHT_CASING_PIECE);
            if (MalumLoadedOnly.isLoaded()) {
                event.register(ModelsLoadedOnly.RUNEWOOD_LIGHT_CASING_PIECE);
                event.register(ModelsLoadedOnly.SOULWOOD_LIGHT_CASING_PIECE);
            }

            //OAK
            event.register(ModelsLoadedOnly.OAK_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.OAK_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.OAK_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.OAK_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.OAK_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_OAK_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_OAK_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_OAK_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_OAK_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_OAK_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.OAK_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.OAK_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.OAK_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.OAK_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.OAK_PLANKS_CROSS_BAULK_END_2);
            //SPRUCE
            event.register(ModelsLoadedOnly.SPRUCE_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.SPRUCE_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.SPRUCE_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.SPRUCE_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.SPRUCE_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK_END_2);
            //BIRCH
            event.register(ModelsLoadedOnly.BIRCH_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.BIRCH_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.BIRCH_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.BIRCH_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.BIRCH_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.BIRCH_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.BIRCH_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.BIRCH_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.BIRCH_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.BIRCH_PLANKS_CROSS_BAULK_END_2);
            //JUNGLE
            event.register(ModelsLoadedOnly.JUNGLE_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.JUNGLE_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.JUNGLE_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.JUNGLE_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.JUNGLE_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK_END_2);
            //ACACIA
            event.register(ModelsLoadedOnly.ACACIA_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.ACACIA_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.ACACIA_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.ACACIA_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.ACACIA_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.ACACIA_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.ACACIA_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.ACACIA_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.ACACIA_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.ACACIA_PLANKS_CROSS_BAULK_END_2);
            //DARK_OAK
            event.register(ModelsLoadedOnly.DARK_OAK_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.DARK_OAK_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.DARK_OAK_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.DARK_OAK_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.DARK_OAK_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK_END_2);
            //MANGROVE
            event.register(ModelsLoadedOnly.MANGROVE_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.MANGROVE_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.MANGROVE_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.MANGROVE_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.MANGROVE_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK_END_2);
            //CHERRY
            event.register(ModelsLoadedOnly.CHERRY_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.CHERRY_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.CHERRY_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.CHERRY_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.CHERRY_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.CHERRY_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.CHERRY_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.CHERRY_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.CHERRY_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.CHERRY_PLANKS_CROSS_BAULK_END_2);
            //BAMBOO
            event.register(ModelsLoadedOnly.BAMBOO_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.BAMBOO_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.BAMBOO_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.BAMBOO_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.BAMBOO_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK_END_2);
            //CRIMSON
            event.register(ModelsLoadedOnly.CRIMSON_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.CRIMSON_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.CRIMSON_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.CRIMSON_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.CRIMSON_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK_END_2);
            //WARPED
            event.register(ModelsLoadedOnly.WARPED_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.WARPED_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.WARPED_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.WARPED_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.WARPED_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.STRIPPED_WARPED_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.STRIPPED_WARPED_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.STRIPPED_WARPED_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.STRIPPED_WARPED_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.STRIPPED_WARPED_CROSS_BAULK_END_2);

            event.register(ModelsLoadedOnly.WARPED_PLANKS_CROSS_BAULK_CENTER);
            event.register(ModelsLoadedOnly.WARPED_PLANKS_CROSS_BAULK_CONNECTION);
            event.register(ModelsLoadedOnly.WARPED_PLANKS_CROSS_BAULK_END);
            event.register(ModelsLoadedOnly.WARPED_PLANKS_CROSS_BAULK_CONNECTION_2);
            event.register(ModelsLoadedOnly.WARPED_PLANKS_CROSS_BAULK_END_2);
            if (MalumLoadedOnly.isLoaded()) {
                //RUNEWOOD
                event.register(ModelsLoadedOnly.RUNEWOOD_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.RUNEWOOD_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.RUNEWOOD_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.RUNEWOOD_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.RUNEWOOD_CROSS_BAULK_END_2);

                event.register(ModelsLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK_END_2);

                event.register(ModelsLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK_END_2);

                event.register(ModelsLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK_END_2);

                event.register(ModelsLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK_END_2);
                //SOULWOOD
                event.register(ModelsLoadedOnly.SOULWOOD_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.SOULWOOD_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.SOULWOOD_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.SOULWOOD_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.SOULWOOD_CROSS_BAULK_END_2);

                event.register(ModelsLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK_END_2);

                event.register(ModelsLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK_END_2);

                event.register(ModelsLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK_END_2);

                event.register(ModelsLoadedOnly.SOULWOOD_TILES_CROSS_BAULK_CENTER);
                event.register(ModelsLoadedOnly.SOULWOOD_TILES_CROSS_BAULK_CONNECTION);
                event.register(ModelsLoadedOnly.SOULWOOD_TILES_CROSS_BAULK_END);
                event.register(ModelsLoadedOnly.SOULWOOD_TILES_CROSS_BAULK_CONNECTION_2);
                event.register(ModelsLoadedOnly.SOULWOOD_TILES_CROSS_BAULK_END_2);
            }
        }

        public static void modelBake(ModelEvent.ModifyBakingResult event) {
            Map<ResourceLocation, BakedModel> map = event.getModels();

            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.OAK_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.SPRUCE_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.BIRCH_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.JUNGLE_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.ACACIA_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.DARK_OAK_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.MANGROVE_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.CHERRY_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.BAMBOO_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.CRIMSON_LIGHT_CASING.getId());
            FluffyFurModels.addCustomRenderItemModel(map, ItemsLoadedOnly.WARPED_LIGHT_CASING.getId());
            if (MalumLoadedOnly.isLoaded()) {
                FluffyFurModels.addCustomRenderItemModel(map, MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_LIGHT_CASING.getId());
                FluffyFurModels.addCustomRenderItemModel(map, MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_LIGHT_CASING.getId());
            }

            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "oak_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.oakFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "oak_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.oakFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "spruce_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.spruceFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "spruce_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.spruceFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "birch_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.birchFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "birch_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.birchFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "jungle_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.jungleFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "jungle_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.jungleFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "acacia_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.acaciaFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "acacia_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.acaciaFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "dark_oak_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.darkOakFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "dark_oak_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.darkOakFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "mangrove_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.mangroveFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "mangrove_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.mangroveFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "cherry_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.cherryFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "cherry_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.cherryFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.bambooFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.bambooFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "crimson_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.crimsonFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "crimson_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.crimsonFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "warped_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.warpedFluidCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "warped_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.warpedFluidCasing, true);
            if (MalumLoadedOnly.isLoaded()) {
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.runewoodFluidCasing, true);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.runewoodFluidCasing, true);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_fluid_casing", "powered=false", "fluid_pipe", ModelsLoadedOnly.soulwoodFluidCasing, true);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_fluid_casing", "powered=true", "fluid_pipe", ModelsLoadedOnly.soulwoodFluidCasing, true);
            }

            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "oak_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.oakSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "oak_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.oakSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "spruce_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.spruceSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "spruce_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.spruceSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "birch_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.birchSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "birch_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.birchSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "jungle_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.jungleSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "jungle_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.jungleSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "acacia_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.acaciaSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "acacia_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.acaciaSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "dark_oak_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.darkOakSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "dark_oak_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.darkOakSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "mangrove_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.mangroveSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "mangrove_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.mangroveSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "cherry_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.cherrySteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "cherry_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.cherrySteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.bambooSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.bambooSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "crimson_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.crimsonSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "crimson_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.crimsonSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "warped_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.warpedSteamCasing, true);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "warped_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.warpedSteamCasing, true);
            if (MalumLoadedOnly.isLoaded()) {
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.runewoodSteamCasing, true);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.runewoodSteamCasing, true);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_steam_casing", "powered=false", "steam_pipe", ModelsLoadedOnly.soulwoodSteamCasing, true);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_steam_casing", "powered=true", "steam_pipe", ModelsLoadedOnly.soulwoodSteamCasing, true);
            }

            //OAK
            ModelsLoadedOnly.oakCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.OAK_CROSS_BAULK_CENTER), "oak_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "oak_cross_baulk", "waterlogged=false", ModelsLoadedOnly.oakCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "oak_cross_baulk", "waterlogged=true", ModelsLoadedOnly.oakCrossBaulk);
            ModelsLoadedOnly.strippedOakCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_OAK_CROSS_BAULK_CENTER), "stripped_oak_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_oak_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedOakCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_oak_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedOakCrossBaulk);
            ModelsLoadedOnly.oakPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.OAK_PLANKS_CROSS_BAULK_CENTER), "oak_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "oak_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.oakPlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "oak_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.oakPlanksCrossBaulk);
            //SPRUCE
            ModelsLoadedOnly.spruceCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.SPRUCE_CROSS_BAULK_CENTER), "spruce_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "spruce_cross_baulk", "waterlogged=false", ModelsLoadedOnly.spruceCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "spruce_cross_baulk", "waterlogged=true", ModelsLoadedOnly.spruceCrossBaulk);
            ModelsLoadedOnly.strippedSpruceCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_SPRUCE_CROSS_BAULK_CENTER), "stripped_spruce_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_spruce_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedSpruceCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_spruce_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedSpruceCrossBaulk);
            ModelsLoadedOnly.sprucePlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.SPRUCE_PLANKS_CROSS_BAULK_CENTER), "spruce_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "spruce_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.sprucePlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "spruce_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.sprucePlanksCrossBaulk);
            //BIRCH
            ModelsLoadedOnly.birchCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.BIRCH_CROSS_BAULK_CENTER), "birch_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "birch_cross_baulk", "waterlogged=false", ModelsLoadedOnly.birchCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "birch_cross_baulk", "waterlogged=true", ModelsLoadedOnly.birchCrossBaulk);
            ModelsLoadedOnly.strippedBirchCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_BIRCH_CROSS_BAULK_CENTER), "stripped_birch_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_birch_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedBirchCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_birch_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedBirchCrossBaulk);
            ModelsLoadedOnly.birchPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.BIRCH_PLANKS_CROSS_BAULK_CENTER), "birch_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "birch_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.birchPlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "birch_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.birchPlanksCrossBaulk);
            //JUNGLE
            ModelsLoadedOnly.jungleCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.JUNGLE_CROSS_BAULK_CENTER), "jungle_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "jungle_cross_baulk", "waterlogged=false", ModelsLoadedOnly.jungleCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "jungle_cross_baulk", "waterlogged=true", ModelsLoadedOnly.jungleCrossBaulk);
            ModelsLoadedOnly.strippedJungleCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_JUNGLE_CROSS_BAULK_CENTER), "stripped_jungle_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_jungle_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedJungleCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_jungle_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedJungleCrossBaulk);
            ModelsLoadedOnly.junglePlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.JUNGLE_PLANKS_CROSS_BAULK_CENTER), "jungle_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "jungle_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.junglePlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "jungle_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.junglePlanksCrossBaulk);
            //ACACIA
            ModelsLoadedOnly.acaciaCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.ACACIA_CROSS_BAULK_CENTER), "acacia_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "acacia_cross_baulk", "waterlogged=false", ModelsLoadedOnly.acaciaCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "acacia_cross_baulk", "waterlogged=true", ModelsLoadedOnly.acaciaCrossBaulk);
            ModelsLoadedOnly.strippedAcaciaCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_ACACIA_CROSS_BAULK_CENTER), "stripped_acacia_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_acacia_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedAcaciaCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_acacia_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedAcaciaCrossBaulk);
            ModelsLoadedOnly.acaciaPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.ACACIA_PLANKS_CROSS_BAULK_CENTER), "acacia_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "acacia_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.acaciaPlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "acacia_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.acaciaPlanksCrossBaulk);
            //DARK_OAK
            ModelsLoadedOnly.darkOakCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.DARK_OAK_CROSS_BAULK_CENTER), "dark_oak_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "dark_oak_cross_baulk", "waterlogged=false", ModelsLoadedOnly.darkOakCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "dark_oak_cross_baulk", "waterlogged=true", ModelsLoadedOnly.darkOakCrossBaulk);
            ModelsLoadedOnly.strippedDarkOakCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_DARK_OAK_CROSS_BAULK_CENTER), "stripped_dark_oak_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_dark_oak_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedDarkOakCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_dark_oak_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedDarkOakCrossBaulk);
            ModelsLoadedOnly.darkOakPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.DARK_OAK_PLANKS_CROSS_BAULK_CENTER), "dark_oak_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "dark_oak_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.darkOakPlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "dark_oak_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.darkOakPlanksCrossBaulk);
            //MANGROVE
            ModelsLoadedOnly.mangroveCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.MANGROVE_CROSS_BAULK_CENTER), "mangrove_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "mangrove_cross_baulk", "waterlogged=false", ModelsLoadedOnly.mangroveCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "mangrove_cross_baulk", "waterlogged=true", ModelsLoadedOnly.mangroveCrossBaulk);
            ModelsLoadedOnly.strippedMangroveCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_MANGROVE_CROSS_BAULK_CENTER), "stripped_mangrove_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_mangrove_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedMangroveCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_mangrove_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedMangroveCrossBaulk);
            ModelsLoadedOnly.mangrovePlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.MANGROVE_PLANKS_CROSS_BAULK_CENTER), "mangrove_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "mangrove_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.mangrovePlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "mangrove_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.mangrovePlanksCrossBaulk);
            //CHERRY
            ModelsLoadedOnly.cherryCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.CHERRY_CROSS_BAULK_CENTER), "cherry_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "cherry_cross_baulk", "waterlogged=false", ModelsLoadedOnly.cherryCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "cherry_cross_baulk", "waterlogged=true", ModelsLoadedOnly.cherryCrossBaulk);
            ModelsLoadedOnly.strippedCherryCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_CHERRY_CROSS_BAULK_CENTER), "stripped_cherry_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_cherry_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedCherryCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_cherry_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedCherryCrossBaulk);
            ModelsLoadedOnly.cherryPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.CHERRY_PLANKS_CROSS_BAULK_CENTER), "cherry_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "cherry_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.cherryPlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "cherry_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.cherryPlanksCrossBaulk);
            //BAMBOO
            ModelsLoadedOnly.bambooCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.BAMBOO_CROSS_BAULK_CENTER), "bamboo_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_cross_baulk", "waterlogged=false", ModelsLoadedOnly.bambooCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_cross_baulk", "waterlogged=true", ModelsLoadedOnly.bambooCrossBaulk);
            ModelsLoadedOnly.strippedBambooCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_BAMBOO_CROSS_BAULK_CENTER), "stripped_bamboo_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_bamboo_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedBambooCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_bamboo_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedBambooCrossBaulk);
            ModelsLoadedOnly.bambooPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.BAMBOO_PLANKS_CROSS_BAULK_CENTER), "bamboo_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.bambooPlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.bambooPlanksCrossBaulk);
            ModelsLoadedOnly.bambooMosaicCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.BAMBOO_MOSAIC_CROSS_BAULK_CENTER), "bamboo_mosaic_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_mosaic_cross_baulk", "waterlogged=false", ModelsLoadedOnly.bambooMosaicCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "bamboo_mosaic_cross_baulk", "waterlogged=true", ModelsLoadedOnly.bambooMosaicCrossBaulk);
            //CRIMSON
            ModelsLoadedOnly.crimsonCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.CRIMSON_CROSS_BAULK_CENTER), "crimson_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "crimson_cross_baulk", "waterlogged=false", ModelsLoadedOnly.crimsonCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "crimson_cross_baulk", "waterlogged=true", ModelsLoadedOnly.crimsonCrossBaulk);
            ModelsLoadedOnly.strippedCrimsonCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_CRIMSON_CROSS_BAULK_CENTER), "stripped_crimson_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_crimson_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedCrimsonCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_crimson_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedCrimsonCrossBaulk);
            ModelsLoadedOnly.crimsonPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.CRIMSON_PLANKS_CROSS_BAULK_CENTER), "crimson_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "crimson_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.crimsonPlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "crimson_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.crimsonPlanksCrossBaulk);
            //WARPED
            ModelsLoadedOnly.warpedCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.WARPED_CROSS_BAULK_CENTER), "warped_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "warped_cross_baulk", "waterlogged=false", ModelsLoadedOnly.warpedCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "warped_cross_baulk", "waterlogged=true", ModelsLoadedOnly.warpedCrossBaulk);
            ModelsLoadedOnly.strippedWarpedCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_WARPED_CROSS_BAULK_CENTER), "stripped_warped_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_warped_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedWarpedCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_warped_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedWarpedCrossBaulk);
            ModelsLoadedOnly.warpedPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.WARPED_PLANKS_CROSS_BAULK_CENTER), "warped_planks_cross_baulk", SillyOddities.MOD_ID);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "warped_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.warpedPlanksCrossBaulk);
            WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "warped_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.warpedPlanksCrossBaulk);
            if (MalumLoadedOnly.isLoaded()) {
                //RUNEWOOD
                ModelsLoadedOnly.runewoodCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.RUNEWOOD_CROSS_BAULK_CENTER), "runewood_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_cross_baulk", "waterlogged=false", ModelsLoadedOnly.runewoodCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_cross_baulk", "waterlogged=true", ModelsLoadedOnly.runewoodCrossBaulk);
                ModelsLoadedOnly.strippedRunewoodCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_RUNEWOOD_CROSS_BAULK_CENTER), "stripped_runewood_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_runewood_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedRunewoodCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_runewood_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedRunewoodCrossBaulk);
                ModelsLoadedOnly.runewoodBoardsCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.RUNEWOOD_BOARDS_CROSS_BAULK_CENTER), "runewood_boards_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_boards_cross_baulk", "waterlogged=false", ModelsLoadedOnly.runewoodBoardsCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_boards_cross_baulk", "waterlogged=true", ModelsLoadedOnly.runewoodBoardsCrossBaulk);
                ModelsLoadedOnly.runewoodPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.RUNEWOOD_PLANKS_CROSS_BAULK_CENTER), "runewood_planks_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.runewoodPlanksCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.runewoodPlanksCrossBaulk);
                ModelsLoadedOnly.runewoodTilesCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.RUNEWOOD_TILES_CROSS_BAULK_CENTER), "runewood_tiles_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_tiles_cross_baulk", "waterlogged=false", ModelsLoadedOnly.runewoodTilesCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "runewood_tiles_cross_baulk", "waterlogged=true", ModelsLoadedOnly.runewoodTilesCrossBaulk);
                //SOULWOOD
                ModelsLoadedOnly.soulwoodCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.SOULWOOD_CROSS_BAULK_CENTER), "soulwood_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_cross_baulk", "waterlogged=false", ModelsLoadedOnly.soulwoodCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_cross_baulk", "waterlogged=true", ModelsLoadedOnly.soulwoodCrossBaulk);
                ModelsLoadedOnly.strippedSoulwoodCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.STRIPPED_SOULWOOD_CROSS_BAULK_CENTER), "stripped_soulwood_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_soulwood_cross_baulk", "waterlogged=false", ModelsLoadedOnly.strippedSoulwoodCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "stripped_soulwood_cross_baulk", "waterlogged=true", ModelsLoadedOnly.strippedSoulwoodCrossBaulk);
                ModelsLoadedOnly.soulwoodBoardsCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.SOULWOOD_BOARDS_CROSS_BAULK_CENTER), "soulwood_boards_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_boards_cross_baulk", "waterlogged=false", ModelsLoadedOnly.soulwoodBoardsCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_boards_cross_baulk", "waterlogged=true", ModelsLoadedOnly.soulwoodBoardsCrossBaulk);
                ModelsLoadedOnly.soulwoodPlanksCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.SOULWOOD_PLANKS_CROSS_BAULK_CENTER), "soulwood_planks_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_planks_cross_baulk", "waterlogged=false", ModelsLoadedOnly.soulwoodPlanksCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_planks_cross_baulk", "waterlogged=true", ModelsLoadedOnly.soulwoodPlanksCrossBaulk);
                ModelsLoadedOnly.soulwoodTilesCrossBaulk = new PipeModel(map.get(ModelsLoadedOnly.SOULWOOD_TILES_CROSS_BAULK_CENTER), "soulwood_tiles_cross_baulk", SillyOddities.MOD_ID);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_tiles_cross_baulk", "waterlogged=false", ModelsLoadedOnly.soulwoodTilesCrossBaulk);
                WizardsRebornModels.addPipeModel(map, SillyOddities.MOD_ID, "soulwood_tiles_cross_baulk", "waterlogged=true", ModelsLoadedOnly.soulwoodTilesCrossBaulk);
            }
        }

        public static void completeModelBake(ModelEvent.BakingCompleted event) {
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.oakFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.spruceFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.birchFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.jungleFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.acaciaFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.darkOakFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.mangroveFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.cherryFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.bambooFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.crimsonFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.warpedFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.runewoodFluidCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.soulwoodFluidCasing, event.getModelManager());

            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.oakSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.spruceSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.birchSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.jungleSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.acaciaSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.darkOakSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.mangroveSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.cherrySteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.bambooSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.crimsonSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.warpedSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.runewoodSteamCasing, event.getModelManager());
            WizardsRebornModels.bakePipeModel(ModelsLoadedOnly.soulwoodSteamCasing, event.getModelManager());

            ModelsLoadedOnly.oakCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedOakCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.oakPlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.spruceCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedSpruceCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.sprucePlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.birchCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedBirchCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.birchPlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.jungleCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedJungleCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.junglePlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.acaciaCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedAcaciaCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.acaciaPlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.darkOakCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedDarkOakCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.darkOakPlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.mangroveCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedMangroveCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.mangrovePlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.cherryCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedCherryCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.cherryPlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.bambooCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedBambooCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.bambooPlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.bambooMosaicCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.crimsonCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedCrimsonCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.crimsonPlanksCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.warpedCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.strippedWarpedCrossBaulk.init(event.getModelManager());
            ModelsLoadedOnly.warpedPlanksCrossBaulk.init(event.getModelManager());
            if (MalumLoadedOnly.isLoaded()) {
                ModelsLoadedOnly.runewoodCrossBaulk.init(event.getModelManager());
                ModelsLoadedOnly.strippedRunewoodCrossBaulk.init(event.getModelManager());
                ModelsLoadedOnly.runewoodBoardsCrossBaulk.init(event.getModelManager());
                ModelsLoadedOnly.runewoodPlanksCrossBaulk.init(event.getModelManager());
                ModelsLoadedOnly.runewoodTilesCrossBaulk.init(event.getModelManager());
                ModelsLoadedOnly.soulwoodCrossBaulk.init(event.getModelManager());
                ModelsLoadedOnly.strippedSoulwoodCrossBaulk.init(event.getModelManager());
                ModelsLoadedOnly.soulwoodBoardsCrossBaulk.init(event.getModelManager());
                ModelsLoadedOnly.soulwoodPlanksCrossBaulk.init(event.getModelManager());
                ModelsLoadedOnly.soulwoodTilesCrossBaulk.init(event.getModelManager());
            }
        }
    }

    public static void init(IEventBus eventBus) {
        LOADED = ModList.get().isLoaded(MOD_ID);
        MalumLoadedOnly.LOADED = ModList.get().isLoaded(MalumLoadedOnly.MOD_ID);

        if (isLoaded()) {
            LoadedOnly.makeItems();
            LoadedOnly.makeBlocks();
            LoadedOnly.makeBlockEntities();
            if (MalumLoadedOnly.isLoaded()) {
                MalumLoadedOnly.LoadedOnly.makeItems();
                MalumLoadedOnly.LoadedOnly.makeBlocks();
            }

            ItemsLoadedOnly.ITEMS.register(eventBus);
            BlocksLoadedOnly.BLOCKS.register(eventBus);
            BlockEntitiesLoadedOnly.BLOCK_ENTITIES.register(eventBus);
            if (MalumLoadedOnly.isLoaded()) {
                MalumLoadedOnly.ItemsLoadedOnly.ITEMS.register(eventBus);
                MalumLoadedOnly.BlocksLoadedOnly.BLOCKS.register(eventBus);
            }
        }
    }

    public static boolean isLoaded() {
        return LOADED;
    }
}
