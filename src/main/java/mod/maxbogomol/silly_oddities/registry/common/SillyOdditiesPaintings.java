package mod.maxbogomol.silly_oddities.registry.common;

import mod.maxbogomol.silly_oddities.SillyOddities;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SillyOdditiesPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, SillyOddities.MOD_ID);

    public static final RegistryObject<PaintingVariant> MEDITATIVE = PAINTING_VARIANTS.register("meditative", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> PRAIRE_RIDE = PAINTING_VARIANTS.register("prairie_ride", () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> BAROQUE = PAINTING_VARIANTS.register("baroque", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> HUMBLE = PAINTING_VARIANTS.register("humble", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> UNPACKED = PAINTING_VARIANTS.register("unpacked", () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> BACKYARD = PAINTING_VARIANTS.register("backyard", () -> new PaintingVariant(48, 64));
    public static final RegistryObject<PaintingVariant> BOUQUET = PAINTING_VARIANTS.register("bouquet", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> CAVEBIRD = PAINTING_VARIANTS.register("cavebird", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> CHANGING = PAINTING_VARIANTS.register("changing", () -> new PaintingVariant(64, 32));
    public static final RegistryObject<PaintingVariant> COTAN = PAINTING_VARIANTS.register("cotan", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> ENDBOSS = PAINTING_VARIANTS.register("endboss", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> FERN = PAINTING_VARIANTS.register("fern", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> FINDING = PAINTING_VARIANTS.register("finding", () -> new PaintingVariant(64, 32));
    public static final RegistryObject<PaintingVariant> LOWMIST = PAINTING_VARIANTS.register("lowmist", () -> new PaintingVariant(64, 32));
    public static final RegistryObject<PaintingVariant> ORB = PAINTING_VARIANTS.register("orb", () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> OWLEMONS = PAINTING_VARIANTS.register("owlemons", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> PASSAGE = PAINTING_VARIANTS.register("passage", () -> new PaintingVariant(64, 32));
    public static final RegistryObject<PaintingVariant> POND = PAINTING_VARIANTS.register("pond", () -> new PaintingVariant(48, 64));
    public static final RegistryObject<PaintingVariant> SUNFLOWERS = PAINTING_VARIANTS.register("sunflowers", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> TIDES = PAINTING_VARIANTS.register("tides", () -> new PaintingVariant(48, 48));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
