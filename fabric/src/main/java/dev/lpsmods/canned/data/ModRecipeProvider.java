package dev.lpsmods.canned.data;

import dev.lpsmods.canned.Constants;
import dev.lpsmods.canned.core.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        // Can Opener
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CAN_OPENER.get()).pattern(" N").pattern("N ").define('N', Items.IRON_NUGGET).unlockedBy("hasIronNugget", FabricRecipeProvider.has(Items.IRON_NUGGET)).save(exporter);

        // Cans
        BuiltInRegistries.BLOCK.stream().filter(block -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(Constants.MOD_ID)).forEach(entry -> {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, entry).requires(entry, 8).save(exporter);
        });
    }
}
