package mod.maxbogomol.silly_oddities.client.pack;

import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.config.SillyOdditiesClientConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimplePreparableReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;

public class SillyOdditiesResourcePacksReloadListener extends SimplePreparableReloadListener<Object> {

    @Override
    protected Object prepare(ResourceManager resourceManager, ProfilerFiller profiler) {
        if (SillyOdditiesClientConfig.AUTO_RESOURCEPACK_CONFIG.get()) {
            SillyOdditiesClientConfig.SPAWN_EGGS_RESOURCEPACK.set(false);
            SillyOdditiesClientConfig.BAT_RESOURCEPACK.set(false);
            SillyOdditiesClientConfig.HORSE_LEATHER_ARMOR_RESOURCEPACK.set(false);
            for (Pack pack : Minecraft.getInstance().getResourcePackRepository().getSelectedPacks()) {
                if (pack.getId().equals(SillyOddities.MOD_ID + ":spawn_eggs")) SillyOdditiesClientConfig.SPAWN_EGGS_RESOURCEPACK.set(true);
                if (pack.getId().equals(SillyOddities.MOD_ID + ":bat")) SillyOdditiesClientConfig.BAT_RESOURCEPACK.set(true);
                if (pack.getId().equals(SillyOddities.MOD_ID + ":horse_leather_armor")) SillyOdditiesClientConfig.HORSE_LEATHER_ARMOR_RESOURCEPACK.set(true);
            }
        }

        return null;
    }

    @Override
    protected void apply(Object object, ResourceManager resourceManager, ProfilerFiller profiler) {

    }
}
