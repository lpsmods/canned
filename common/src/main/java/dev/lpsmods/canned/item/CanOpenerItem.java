package dev.lpsmods.canned.item;

import dev.lpsmods.canned.core.ModRecipes;
import dev.lpsmods.canned.crafting.CanOpenerRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

public class CanOpenerItem extends DiggerItem {
    public CanOpenerItem(Tier tier, Item.Properties settings) {
        super(tier, BlockTags.MINEABLE_WITH_AXE, settings);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player user, InteractionHand hand) {
        if (level.isClientSide) {return InteractionResultHolder.pass(user.getItemInHand(hand));}
        ItemStack input = getIngredient(user, hand);
        ItemStack stack = user.getItemInHand(hand);
        Optional<RecipeHolder<CanOpenerRecipe>> recipe = getCurrentRecipe(level, input);
        if (recipe.isPresent()) {
            input.shrink(1);
            ItemStack output = recipe.get().value().getResultItem(null);
            user.addItem(output);
            user.getCooldowns().addCooldown(this, 10);
            if (!user.isCreative()) {
                stack.setDamageValue(stack.getDamageValue()+1);
            }
            return InteractionResultHolder.success(stack);
        }
        return super.use(level, user, hand);
    }

    private ItemStack getIngredient(Player user, InteractionHand hand) {
        if (hand == InteractionHand.MAIN_HAND) {
            return user.getItemInHand(InteractionHand.OFF_HAND);
        }
        return user.getItemInHand(InteractionHand.MAIN_HAND);
    }

    private Optional<RecipeHolder<CanOpenerRecipe>> getCurrentRecipe(Level level, ItemStack stack) {
        SingleRecipeInput input = new SingleRecipeInput(stack);
        return level.getRecipeManager().getRecipeFor(ModRecipes.CAN_OPENER_RECIPE_TYPE.get(), input, level);
    }

    @Override
    public boolean canAttackBlock(BlockState state, Level level, BlockPos pos, Player player) {
        return !player.isCreative();
    }
}
