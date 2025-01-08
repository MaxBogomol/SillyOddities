package mod.maxbogomol.silly_oddities;

import mod.maxbogomol.fluffy_fur.FluffyFur;
import mod.maxbogomol.fluffy_fur.common.proxy.ClientProxy;
import mod.maxbogomol.fluffy_fur.common.proxy.ISidedProxy;
import mod.maxbogomol.fluffy_fur.common.proxy.ServerProxy;
import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesCreativeTabs;
import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("silly_oddities")
public class SillyOddities {
    public static final String MOD_ID = "silly_oddities";
    public static final String NAME = "Silly Oddities";
    public static final String VERSION = "0.1";
    public static final int VERSION_NUMBER = 1;

    public static final ISidedProxy proxy = DistExecutor.unsafeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);
    public static final Logger LOGGER = LogManager.getLogger();

    public SillyOddities() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SillyOdditiesItems.register(eventBus);
/*
        PurrfectBlocks.register(eventBus);
        PurrfectBlockEnteties.register(eventBus);*/

        DistExecutor.unsafeCallWhenOn(Dist.CLIENT, () -> () -> {
            SillyOdditiesClient.ClientOnly.clientInit();
            return new Object();
        });

        eventBus.addListener(this::setup);
        eventBus.addListener(SillyOdditiesClient::clientSetup);

        SillyOdditiesCreativeTabs.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //hi();
    }

    public static void hi() {
        FluffyFur.LOGGER.info("Hi Purrfect! You are very cute :3");
        LOGGER.info("OMG! Fluffy Fur! Haiii I love you very much :3");
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerCaps(RegisterCapabilitiesEvent event) {

        }
    }
}