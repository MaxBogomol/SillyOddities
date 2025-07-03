package mod.maxbogomol.silly_oddities.common.block;

import mod.maxbogomol.silly_oddities.registry.common.block.SillyOdditiesBlocks;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class SillyOdditiesBlockColor {

    private static final Plants PLANTS_INSTANCE = new Plants();

    public static final Block[] PLANTS = {
            SillyOdditiesBlocks.WILDFLOWERS.get(),
            SillyOdditiesBlocks.BUSH.get()
    };

    public static Plants getPlantsInstance() {
        return PLANTS_INSTANCE;
    }

    public static class Plants implements BlockColor {
        @Override
        public int getColor(BlockState state, @Nullable BlockAndTintGetter level, @Nullable BlockPos pos, int tintIndex) {
            if (state.getBlock() == SillyOdditiesBlocks.WILDFLOWERS.get() && tintIndex == 1) {
                return level != null && pos != null ? BiomeColors.getAverageGrassColor(level, pos) : -1;
            }
            if (state.getBlock() == SillyOdditiesBlocks.BUSH.get() && tintIndex == 0) {
                return level != null && pos != null ? BiomeColors.getAverageGrassColor(level, pos) : -1;
            }
            return -1;
        }
    }
}
