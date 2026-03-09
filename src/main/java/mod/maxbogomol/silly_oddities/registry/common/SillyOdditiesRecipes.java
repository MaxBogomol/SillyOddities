package mod.maxbogomol.silly_oddities.registry.common;

import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.common.recipe.BundleShapelessRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SillyOdditiesRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SillyOddities.MOD_ID);

    public static final RegistryObject<BundleShapelessRecipe.Serializer> CRAFTING_SHAPELESS_BUNDLES = RECIPE_SERIALIZERS.register("crafting_shapeless_bundles", BundleShapelessRecipe.Serializer::new);

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
    }
}
