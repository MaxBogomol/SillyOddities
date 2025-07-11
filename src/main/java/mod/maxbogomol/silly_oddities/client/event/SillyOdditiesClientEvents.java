package mod.maxbogomol.silly_oddities.client.event;

import mod.maxbogomol.silly_oddities.client.effect.SillyOdditiesEffects;
import mod.maxbogomol.silly_oddities.common.item.NothingItem;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class SillyOdditiesClientEvents {

    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event) {
        if (event.player.level().isClientSide()) {
            SillyOdditiesEffects.firefliesAmbientEffect(event.player);
        }
    }

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        NothingItem.clientTick(event);
    }
}
