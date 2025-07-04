package mod.maxbogomol.silly_oddities.common.event;

import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesItems;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class SillyOdditiesEvents {
    @SubscribeEvent
    public void addCustomWandererTrades(WandererTradesEvent event) {
        event.getGenericTrades().add(new VillagerTrades.ItemsForEmeralds(SillyOdditiesItems.WILDFLOWERS.get(), 1, 1, 8, 1));
        event.getGenericTrades().add(new VillagerTrades.ItemsForEmeralds(SillyOdditiesItems.BUSH.get(), 1, 1, 8, 1));
        event.getGenericTrades().add(new VillagerTrades.ItemsForEmeralds(SillyOdditiesItems.FIREFLY_BUSH.get(), 1, 1, 8, 1));
        event.getGenericTrades().add(new VillagerTrades.ItemsForEmeralds(SillyOdditiesItems.SHORT_DRY_GRASS.get(), 1, 1, 8, 1));
        event.getGenericTrades().add(new VillagerTrades.ItemsForEmeralds(SillyOdditiesItems.TALL_DRY_GRASS.get(), 1, 1, 8, 1));
    }
}
