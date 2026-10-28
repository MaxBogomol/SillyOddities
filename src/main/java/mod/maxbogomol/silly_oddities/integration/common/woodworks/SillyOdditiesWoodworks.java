package mod.maxbogomol.silly_oddities.integration.common.woodworks;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;

public class SillyOdditiesWoodworks {
    public static boolean LOADED;
    public static String MOD_ID = "woodworks";

    public static void init(IEventBus eventBus) {
        LOADED = ModList.get().isLoaded(MOD_ID);
    }

    public static boolean isLoaded() {
        return LOADED;
    }
}