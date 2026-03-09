package mod.maxbogomol.silly_oddities.common.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import mod.maxbogomol.silly_oddities.registry.common.SillyOdditiesRecipes;
import mod.maxbogomol.silly_oddities.registry.common.item.SillyOdditiesItemTags;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class BundleShapelessRecipe extends ShapelessRecipe {

    public BundleShapelessRecipe(ResourceLocation id, String group, CraftingBookCategory category, ItemStack result, NonNullList<Ingredient> ingredients) {
        super(id, group, category, result, ingredients);
    }

    @Override
    public boolean matches(CraftingContainer container, Level level) {
        if (super.matches(container, level)) {
            for (int i = 0; i < container.getContainerSize(); ++i) {
                ItemStack itemStack = container.getItem(i);
                if (itemStack.is(SillyOdditiesItemTags.BUNDLES)) return true;
            }
        }

        return false;
    }

    @Override
    public ItemStack assemble(CraftingContainer container, RegistryAccess registryAccess) {
        ItemStack bundle = ItemStack.EMPTY;
        ItemStack result = getResultItem(registryAccess).copy();
        for (int i = 0; i < container.getContainerSize(); ++i) {
            ItemStack itemStack = container.getItem(i);
            if (itemStack.is(SillyOdditiesItemTags.BUNDLES)) {
                bundle = itemStack;
                break;
            }
        }
        if (!bundle.isEmpty()) {
            if (bundle.hasTag()) {
                result.setTag(bundle.getTag().copy());
            }
        }

        return result;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return SillyOdditiesRecipes.CRAFTING_SHAPELESS_BUNDLES.get();
    }

    public static class Serializer implements RecipeSerializer<BundleShapelessRecipe> {

        @Override
        public BundleShapelessRecipe fromJson(ResourceLocation recipeId, JsonObject json) {
            String s = GsonHelper.getAsString(json, "group", "");
            CraftingBookCategory craftingBookCategory = CraftingBookCategory.CODEC.byName(GsonHelper.getAsString(json, "category", (String)null), CraftingBookCategory.MISC);
            NonNullList<Ingredient> nonNullList = itemsFromJson(GsonHelper.getAsJsonArray(json, "ingredients"));
            if (nonNullList.isEmpty()) {
                throw new JsonParseException("No ingredients for shapeless recipe");
            } else if (nonNullList.size() > 3 * 3) {
                throw new JsonParseException("Too many ingredients for shapeless recipe. The maximum is " + (3 * 3));
            } else {
                ItemStack itemStack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));
                return new BundleShapelessRecipe(recipeId, s, craftingBookCategory, itemStack, nonNullList);
            }
        }

        private static NonNullList<Ingredient> itemsFromJson(JsonArray ingredientArray) {
            NonNullList<Ingredient> nonNullList = NonNullList.create();
            for (int i = 0; i < ingredientArray.size(); ++i) {
                Ingredient ingredient = Ingredient.fromJson(ingredientArray.get(i), false);
                if (true || !ingredient.isEmpty()) {
                    nonNullList.add(ingredient);
                }
            }
            return nonNullList;
        }

        @Nullable
        @Override
        public BundleShapelessRecipe fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buffer) {
            String s = buffer.readUtf();
            CraftingBookCategory craftingBookCategory = buffer.readEnum(CraftingBookCategory.class);
            int i = buffer.readVarInt();
            NonNullList<Ingredient> nonNullList = NonNullList.withSize(i, Ingredient.EMPTY);
            nonNullList.replaceAll(ignored -> Ingredient.fromNetwork(buffer));
            ItemStack itemStack = buffer.readItem();
            return new BundleShapelessRecipe(recipeId, s, craftingBookCategory, itemStack, nonNullList);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buffer, BundleShapelessRecipe recipe) {
            buffer.writeUtf(recipe.getGroup());
            buffer.writeEnum(recipe.category());
            buffer.writeVarInt(recipe.getIngredients().size());
            for (Ingredient ingredient : recipe.getIngredients()) {
                ingredient.toNetwork(buffer);
            }
            buffer.writeItem(recipe.getResultItem(RegistryAccess.EMPTY));
        }
    }
}
