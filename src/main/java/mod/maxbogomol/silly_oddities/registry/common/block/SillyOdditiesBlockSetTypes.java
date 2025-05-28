package mod.maxbogomol.silly_oddities.registry.common.block;

import mod.maxbogomol.silly_oddities.registry.common.SillyOdditiesSounds;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class SillyOdditiesBlockSetTypes {
    public static final BlockSetType COPPER = BlockSetType.register(new BlockSetType("copper", true,
            SoundType.COPPER,
            SillyOdditiesSounds.COPPER_DOOR_CLOSE.get(), SillyOdditiesSounds.COPPER_DOOR_OPEN.get(),
            SillyOdditiesSounds.COPPER_TRAPDOOR_CLOSE.get(), SillyOdditiesSounds.COPPER_TRAPDOOR_OPEN.get(),
            SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF, SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));
}
