package mod.maxbogomol.silly_oddities.client.event;

import mod.maxbogomol.silly_oddities.client.effect.SillyOdditiesEffects;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class SillyOdditiesClientEvents {

    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event) {
        if (event.player.level().isClientSide()) {
            SillyOdditiesEffects.firefliesAmbientEffect(event.player);
        }
    }
}
