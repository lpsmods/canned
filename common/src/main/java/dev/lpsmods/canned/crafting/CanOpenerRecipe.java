package dev.lpsmods.canned.crafting;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import dev.lpsmods.canned.core.ModRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class CanOpenerRecipe implements Recipe<SingleRecipeInput> {
    private final ItemStack result;
    private final Ingredient ingredient;

    public CanOpenerRecipe(Ingredient ingredient, ItemStack itemStack) {
        this.ingredient = ingredient;
        this.result = itemStack;
    }

    /**
     * Prevents "Unknown recipe category" warning.
     * */
    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public boolean matches(SingleRecipeInput singleRecipeInput, Level level) {
        if (level.isClientSide) return false;
        return this.ingredient.test(singleRecipeInput.item());
    }

    @Override
    public ItemStack assemble(SingleRecipeInput singleRecipeInput, HolderLookup.Provider provider) {
        return this.result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return this.result.copy();
    }

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> ingredients = NonNullList.create();
        ingredients.add(this.ingredient);
        return ingredients;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.CAN_OPENER_RECIPE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.CAN_OPENER_RECIPE_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<CanOpenerRecipe> {
        public static final MapCodec<CanOpenerRecipe> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
            return instance.group(
                    Ingredient.CODEC_NONEMPTY.fieldOf("ingredient").forGetter((recipe) -> recipe.ingredient),
                    ItemStack.CODEC.fieldOf("result").forGetter((recipe) -> recipe.result)
            ).apply(instance, CanOpenerRecipe::new);
        });

        @Override
        public MapCodec<CanOpenerRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, CanOpenerRecipe> streamCodec() {
            return StreamCodec.of(this::toNetwork, this::fromNetwork);
        }

        private CanOpenerRecipe fromNetwork(RegistryFriendlyByteBuf buf) {
            Ingredient ingredient = (Ingredient)Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
            ItemStack result = (ItemStack)ItemStack.STREAM_CODEC.decode(buf);
            return new CanOpenerRecipe(ingredient, result);
        }

        private void toNetwork(RegistryFriendlyByteBuf buf, CanOpenerRecipe recipe) {
            Ingredient.CONTENTS_STREAM_CODEC.encode(buf, recipe.ingredient);
            ItemStack.STREAM_CODEC.encode(buf, recipe.result);
        }
    }
}
