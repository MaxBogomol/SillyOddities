package mod.maxbogomol.silly_oddities;

import mod.maxbogomol.fluffy_fur.common.proxy.ClientProxy;
import mod.maxbogomol.fluffy_fur.common.proxy.ISidedProxy;
import mod.maxbogomol.fluffy_fur.common.proxy.ServerProxy;
import mod.maxbogomol.silly_oddities.common.event.SillyOdditiesEvents;
import mod.maxbogomol.silly_oddities.config.SillyOdditiesConfig;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.silly_oddities.registry.common.SillyOdditiesSounds;
import mod.maxbogomol.silly_oddities.registry.common.block.SillyOdditiesBlocks;
import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesCreativeTabs;
import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesItems;
import mod.maxbogomol.silly_oddities.registry.common.painting.SillyOdditiesPaintings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("silly_oddities")
public class SillyOddities {
    public static final String MOD_ID = "silly_oddities";
    public static final String NAME = "Silly Oddities";
    public static final String VERSION = "0.1.1";
    public static final int VERSION_NUMBER = 2;

    public static final ISidedProxy proxy = DistExecutor.unsafeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);
    public static final Logger LOGGER = LogManager.getLogger();

    public SillyOddities() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SillyOdditiesItems.register(eventBus);
        SillyOdditiesBlocks.register(eventBus);
        SillyOdditiesSounds.register(eventBus);
        SillyOdditiesPaintings.register(eventBus);

        SillyOdditiesWizardsReborn.init(eventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SillyOdditiesConfig.SPEC);

        DistExecutor.unsafeCallWhenOn(Dist.CLIENT, () -> () -> {
            SillyOdditiesClient.ClientOnly.clientInit();
            return new Object();
        });

        eventBus.addListener(this::setup);
        eventBus.addListener(SillyOdditiesClient::clientSetup);

        SillyOdditiesCreativeTabs.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new SillyOdditiesEvents());
    }

    private void setup(final FMLCommonSetupEvent event) {
        hi();

        SillyOdditiesBlocks.setupBlocks();
        SillyOdditiesItems.setupItems();
    }

    public static void hi() {

    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerCaps(RegisterCapabilitiesEvent event) {

        }
    }
}