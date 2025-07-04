package mod.maxbogomol.silly_oddities.registry.common;

import mod.maxbogomol.silly_oddities.SillyOddities;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SillyOdditiesSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, SillyOddities.MOD_ID);

    public static final RegistryObject<SoundEvent> POLISHED_TUFF_BREAK = SOUND_EVENTS.register("polished_tuff_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "polished_tuff_break")));
    public static final RegistryObject<SoundEvent> POLISHED_TUFF_STEP = SOUND_EVENTS.register("polished_tuff_step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "polished_tuff_step")));
    public static final RegistryObject<SoundEvent> POLISHED_TUFF_PLACE = SOUND_EVENTS.register("polished_tuff_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "polished_tuff_place")));
    public static final RegistryObject<SoundEvent> POLISHED_TUFF_HIT = SOUND_EVENTS.register("polished_tuff_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "polished_tuff_hit")));
    public static final RegistryObject<SoundEvent> POLISHED_TUFF_FALL = SOUND_EVENTS.register("polished_tuff_fall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "polished_tuff_fall")));

    public static final RegistryObject<SoundEvent> TUFF_BRICKS_BREAK = SOUND_EVENTS.register("tuff_bricks_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "tuff_bricks_break")));
    public static final RegistryObject<SoundEvent> TUFF_BRICKS_STEP = SOUND_EVENTS.register("tuff_bricks_step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "tuff_bricks_step")));
    public static final RegistryObject<SoundEvent> TUFF_BRICKS_PLACE = SOUND_EVENTS.register("tuff_bricks_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "tuff_bricks_place")));
    public static final RegistryObject<SoundEvent> TUFF_BRICKS_HIT = SOUND_EVENTS.register("tuff_bricks_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "tuff_bricks_hit")));
    public static final RegistryObject<SoundEvent> TUFF_BRICKS_FALL = SOUND_EVENTS.register("tuff_bricks_fall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "tuff_bricks_fall")));

    public static final RegistryObject<SoundEvent> COPPER_GRATE_BREAK = SOUND_EVENTS.register("copper_grate_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_grate_break")));
    public static final RegistryObject<SoundEvent> COPPER_GRATE_STEP = SOUND_EVENTS.register("copper_grate_step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_grate_step")));
    public static final RegistryObject<SoundEvent> COPPER_GRATE_PLACE = SOUND_EVENTS.register("copper_grate_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_grate_place")));
    public static final RegistryObject<SoundEvent> COPPER_GRATE_HIT = SOUND_EVENTS.register("copper_grate_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_grate_hit")));
    public static final RegistryObject<SoundEvent> COPPER_GRATE_FALL = SOUND_EVENTS.register("copper_grate_fall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_grate_fall")));

    public static final RegistryObject<SoundEvent> COPPER_DOOR_CLOSE = SOUND_EVENTS.register("copper_door_close", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_door_close")));
    public static final RegistryObject<SoundEvent> COPPER_DOOR_OPEN = SOUND_EVENTS.register("copper_door_open", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_door_open")));
    public static final RegistryObject<SoundEvent> COPPER_TRAPDOOR_CLOSE = SOUND_EVENTS.register("copper_trapdoor_close", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_trapdoor_close")));
    public static final RegistryObject<SoundEvent> COPPER_TRAPDOOR_OPEN = SOUND_EVENTS.register("copper_trapdoor_open", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_trapdoor_open")));

    public static final RegistryObject<SoundEvent> COPPER_BULB_BREAK = SOUND_EVENTS.register("copper_bulb_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_bulb_break")));
    public static final RegistryObject<SoundEvent> COPPER_BULB_STEP = SOUND_EVENTS.register("copper_bulb_step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_bulb_step")));
    public static final RegistryObject<SoundEvent> COPPER_BULB_PLACE = SOUND_EVENTS.register("copper_bulb_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_bulb_place")));
    public static final RegistryObject<SoundEvent> COPPER_BULB_HIT = SOUND_EVENTS.register("copper_bulb_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_bulb_hit")));
    public static final RegistryObject<SoundEvent> COPPER_BULB_FALL = SOUND_EVENTS.register("copper_bulb_fall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_bulb_fall")));
    public static final RegistryObject<SoundEvent> COPPER_BULB_TURN_OFF = SOUND_EVENTS.register("copper_bulb_turn_off", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_bulb_turn_off")));
    public static final RegistryObject<SoundEvent> COPPER_BULB_TURN_ON = SOUND_EVENTS.register("copper_bulb_turn_on", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "copper_bulb_turn_on")));

    public static final RegistryObject<SoundEvent> LEAF_LITTER_BREAK = SOUND_EVENTS.register("leaf_litter_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "leaf_litter_break")));
    public static final RegistryObject<SoundEvent> LEAF_LITTER_STEP = SOUND_EVENTS.register("leaf_litter_step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "leaf_litter_step")));
    public static final RegistryObject<SoundEvent> LEAF_LITTER_PLACE = SOUND_EVENTS.register("leaf_litter_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "leaf_litter_place")));
    public static final RegistryObject<SoundEvent> LEAF_LITTER_HIT = SOUND_EVENTS.register("leaf_litter_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "leaf_litter_hit")));
    public static final RegistryObject<SoundEvent> LEAF_LITTER_FALL = SOUND_EVENTS.register("leaf_litter_fall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "leaf_litter_fall")));

    public static final RegistryObject<SoundEvent> CACTUS_FLOWER_BREAK = SOUND_EVENTS.register("cactus_flower_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "cactus_flower_break")));
    public static final RegistryObject<SoundEvent> CACTUS_FLOWER_PLACE = SOUND_EVENTS.register("cactus_flower_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SillyOddities.MOD_ID, "cactus_flower_place")));

    public static final ForgeSoundType POLISHED_TUFF = new ForgeSoundType(1f, 1f, POLISHED_TUFF_BREAK, POLISHED_TUFF_STEP, POLISHED_TUFF_PLACE, POLISHED_TUFF_HIT, POLISHED_TUFF_FALL);
    public static final ForgeSoundType TUFF_BRICKS = new ForgeSoundType(1f, 1f, TUFF_BRICKS_BREAK, TUFF_BRICKS_STEP, TUFF_BRICKS_PLACE, TUFF_BRICKS_HIT, TUFF_BRICKS_FALL);
    public static final ForgeSoundType COPPER_GRATE = new ForgeSoundType(1f, 1f, COPPER_GRATE_BREAK, COPPER_GRATE_STEP, COPPER_GRATE_PLACE, COPPER_GRATE_HIT, COPPER_GRATE_FALL);
    public static final ForgeSoundType COPPER_BULB = new ForgeSoundType(1f, 1f, COPPER_BULB_BREAK, COPPER_BULB_STEP, COPPER_BULB_PLACE, COPPER_BULB_HIT, COPPER_BULB_FALL);

    public static final ForgeSoundType LEAF_LITTER = new ForgeSoundType(1f, 1f, LEAF_LITTER_BREAK, LEAF_LITTER_STEP, LEAF_LITTER_PLACE, LEAF_LITTER_HIT, LEAF_LITTER_FALL);
    public static final ForgeSoundType FIREFLY_BUSH = new ForgeSoundType(1f, 1f, () -> SoundEvents.SWEET_BERRY_BUSH_BREAK, () -> SoundEvents.GRASS_STEP, () -> SoundEvents.SWEET_BERRY_BUSH_PLACE, () -> SoundEvents.GRASS_HIT, () -> SoundEvents.GRASS_FALL);
    public static final ForgeSoundType CACTUS_FLOWER = new ForgeSoundType(1f, 1f, CACTUS_FLOWER_BREAK, () -> SoundEvents.PINK_PETALS_STEP, CACTUS_FLOWER_PLACE, () -> SoundEvents.PINK_PETALS_HIT, () -> SoundEvents.PINK_PETALS_FALL);

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
