package mod.maxbogomol.silly_oddities.registry.common;

import mod.maxbogomol.silly_oddities.SillyOddities;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
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
    
    public static final ForgeSoundType POLISHED_TUFF = new ForgeSoundType(1f, 1f, POLISHED_TUFF_BREAK, POLISHED_TUFF_STEP, POLISHED_TUFF_PLACE, POLISHED_TUFF_HIT, POLISHED_TUFF_FALL);
    public static final ForgeSoundType TUFF_BRICKS = new ForgeSoundType(1f, 1f, TUFF_BRICKS_BREAK, TUFF_BRICKS_STEP, TUFF_BRICKS_PLACE, TUFF_BRICKS_HIT, TUFF_BRICKS_FALL);

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
