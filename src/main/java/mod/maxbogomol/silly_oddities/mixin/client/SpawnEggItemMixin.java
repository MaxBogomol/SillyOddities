package mod.maxbogomol.silly_oddities.mixin.client;

import mod.maxbogomol.silly_oddities.registry.client.SillyOdditiesResourcePacks;
import net.minecraft.world.item.SpawnEggItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SpawnEggItem.class)
public abstract class SpawnEggItemMixin {

    @Inject(at = @At("HEAD"), method = "getColor", cancellable = true)
    private void silly_oddities$getColor(int tintIndex, CallbackInfoReturnable<Integer> cir) {
        SillyOdditiesResourcePacks.addEggItems();
        SpawnEggItem self = (SpawnEggItem) ((Object) this);
        if (SillyOdditiesResourcePacks.eggItems.contains(self)) {
            cir.setReturnValue(-1);
        }
    }
}
