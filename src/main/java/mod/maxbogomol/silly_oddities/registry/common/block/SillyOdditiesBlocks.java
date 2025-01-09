package mod.maxbogomol.silly_oddities.registry.common.block;

import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.registry.common.SillyOdditiesSounds;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
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

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
