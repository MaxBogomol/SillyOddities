package mod.maxbogomol.silly_oddities.mixin.common;

import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesItemTags;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(BundleItem.class)
public abstract class BundleItemMixin {

    @Inject(at = @At("HEAD"), method = "getMatchingItem", cancellable = true)
    private static void silly_oddities$getMatchingItem(ItemStack stack, ListTag list, CallbackInfoReturnable<Optional<CompoundTag>> cir) {
        if (stack.is(SillyOdditiesItemTags.BUNDLES)) {
            cir.setReturnValue(Optional.empty());
        }
    }

    @Inject(at = @At("HEAD"), method = "getWeight", cancellable = true)
    private static void silly_oddities$getWeight(ItemStack stack, CallbackInfoReturnable<Integer> cir) {
        if (stack.is(SillyOdditiesItemTags.BUNDLES)) {
            cir.setReturnValue(4 + BundleItem.getContentWeight(stack));
        }
    }
}
