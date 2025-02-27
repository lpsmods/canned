package dev.lpsmods.canned.core;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import dev.lpsmods.canned.crafting.CanOpenerRecipe;
import net.minecraft.world.item.crafting.RecipeType;

@RegistryContainer
public class ModRecipes {
    public static final RegistryEntry<CanOpenerRecipe.Serializer> CAN_OPENER_RECIPE_SERIALIZER;
    public static final RegistryEntry<RecipeType<CanOpenerRecipe>> CAN_OPENER_RECIPE_TYPE;

    static {
        CAN_OPENER_RECIPE_SERIALIZER = RegistryEntry.recipeSerializer(ModUtils.makeId("can_opener"), CanOpenerRecipe.Serializer::new);
        CAN_OPENER_RECIPE_TYPE = RegistryEntry.recipeType(ModUtils.makeId("can_opener"));
    }
}
