package mod.maxbogomol.silly_oddities.integration.client.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mod.maxbogomol.silly_oddities.SillyOddities;
import mod.maxbogomol.silly_oddities.integration.common.wizards_reborn.SillyOdditiesWizardsReborn;
import mod.maxbogomol.wizards_reborn.integration.client.jei.CenserRecipeCategory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

@JeiPlugin
public class SillyOdditiesJei implements IModPlugin {

    @Nonnull
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(SillyOddities.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        if (SillyOdditiesWizardsReborn.isLoaded()) {
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.STRIPPED_BAMBOO_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            if (SillyOdditiesWizardsReborn.MalumLoadedOnly.isLoaded()) {
                registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
                registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SMOKING_PIPE.get()), CenserRecipeCategory.TYPE);
            }
        }

        if (SillyOdditiesWizardsReborn.isLoaded()) {
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.OAK_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.SPRUCE_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BIRCH_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.JUNGLE_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.ACACIA_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.DARK_OAK_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.MANGROVE_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CHERRY_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.BAMBOO_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.CRIMSON_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.ItemsLoadedOnly.WARPED_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            if (SillyOdditiesWizardsReborn.MalumLoadedOnly.isLoaded()) {
                registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.RUNEWOOD_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
                registration.addRecipeCatalyst(new ItemStack(SillyOdditiesWizardsReborn.MalumLoadedOnly.ItemsLoadedOnly.SOULWOOD_SALT_CAMPFIRE.get()), RecipeTypes.CAMPFIRE_COOKING);
            }
        }
    }
}