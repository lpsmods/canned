package dev.lpsmods.canned.core;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import dev.lpsmods.canned.block.CanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

@RegistryContainer
public class ModBlocks {
    public static final RegistryEntry<Block> CAN;
    public static final RegistryEntry<Block> APPLE_CAN;
    public static final RegistryEntry<Block> BAKED_POTATO_CAN;
    public static final RegistryEntry<Block> BEETROOT_CAN;
    public static final RegistryEntry<Block> BEETROOT_SOUP_CAN;
    public static final RegistryEntry<Block> BREAD_CAN;
    public static final RegistryEntry<Block> CAKE_CAN;
    public static final RegistryEntry<Block> CARROT_CAN;
    public static final RegistryEntry<Block> CHORUS_FRUIT_CAN;
    public static final RegistryEntry<Block> COOKED_BEEF_CAN;
    public static final RegistryEntry<Block> COOKED_CHICKEN_CAN;
    public static final RegistryEntry<Block> COOKED_COD_CAN;
    public static final RegistryEntry<Block> COOKED_MUTTON_CAN;
    public static final RegistryEntry<Block> COOKED_PORKCHOP_CAN;
    public static final RegistryEntry<Block> COOKED_RABBIT_CAN;
    public static final RegistryEntry<Block> COOKED_SALMON_CAN;
    public static final RegistryEntry<Block> COOKIE_CAN;
    public static final RegistryEntry<Block> DRIED_KELP_CAN;
    public static final RegistryEntry<Block> ENCHANTED_GOLDEN_APPLE_CAN;
    public static final RegistryEntry<Block> GLOW_BERRIES_CAN;
    public static final RegistryEntry<Block> GOLDEN_APPLE_CAN;
    public static final RegistryEntry<Block> GOLDEN_CARROT_CAN;
    public static final RegistryEntry<Block> HONEY_CAN;
    public static final RegistryEntry<Block> MELON_CAN;
    public static final RegistryEntry<Block> MUSHROOM_STEW_CAN;
    public static final RegistryEntry<Block> POISONOUS_POTATO_CAN;
    public static final RegistryEntry<Block> POTATO_CAN;
    public static final RegistryEntry<Block> PUFFERFISH_CAN;
    public static final RegistryEntry<Block> PUMPKIN_PIE_CAN;
    public static final RegistryEntry<Block> RABBIT_STEW_CAN;
    public static final RegistryEntry<Block> ROTTEN_FLESH_CAN;
    public static final RegistryEntry<Block> SPIDER_EYE_CAN;
    public static final RegistryEntry<Block> SUSPICIOUS_STEW_CAN;
    public static final RegistryEntry<Block> SWEET_BERRIES_CAN;
    public static final RegistryEntry<Block> TROPICAL_FISH_CAN;

    private static RegistryEntry<Block> can(String name) {
        return RegistryEntry.blockWithItem(ModUtils.makeId(name), () -> new CanBlock(BlockBehaviour.Properties.of().destroyTime(0.5F).explosionResistance(0.5F).sound(SoundType.LANTERN).mapColor(MapColor.COLOR_GRAY).forceSolidOn().noOcclusion()));
    }

    static {
        CAN = can("can");
        APPLE_CAN = can("apple_can");
        BAKED_POTATO_CAN = can("baked_potato_can");
        BEETROOT_CAN = can("beetroot_can");
        BEETROOT_SOUP_CAN = can("beetroot_soup_can");
        BREAD_CAN = can("bread_can");
        CAKE_CAN = can("cake_can");
        CARROT_CAN = can("carrot_can");
        CHORUS_FRUIT_CAN = can("chorus_fruit_can");
        COOKED_BEEF_CAN = can("cooked_beef_can");
        COOKED_CHICKEN_CAN = can("cooked_chicken_can");
        COOKED_COD_CAN = can("cooked_cod_can");
        COOKED_MUTTON_CAN = can("cooked_mutton_can");
        COOKED_PORKCHOP_CAN = can("cooked_porkchop_can");
        COOKED_RABBIT_CAN = can("cooked_rabbit_can");
        COOKED_SALMON_CAN = can("cooked_salmon_can");
        COOKIE_CAN = can("cookie_can");
        DRIED_KELP_CAN = can("dried_kelp_can");
        ENCHANTED_GOLDEN_APPLE_CAN = can("enchanted_golden_apple_can");
        GLOW_BERRIES_CAN = can("glow_berries_can");
        GOLDEN_APPLE_CAN = can("golden_apple_can");
        GOLDEN_CARROT_CAN = can("golden_carrot_can");
        HONEY_CAN = can("honey_can");
        MELON_CAN = can("melon_can");
        MUSHROOM_STEW_CAN = can("mushroom_stew_can");
        POISONOUS_POTATO_CAN = can("poisonous_potato_can");
        POTATO_CAN = can("potato_can");
        PUFFERFISH_CAN = can("pufferfish_can");
        PUMPKIN_PIE_CAN = can("pumpkin_pie_can");
        RABBIT_STEW_CAN = can("rabbit_stew_can");
        ROTTEN_FLESH_CAN = can("rotten_flesh_can");
        SPIDER_EYE_CAN = can("spider_eye_can");
        SUSPICIOUS_STEW_CAN = can("suspicious_stew_can");
        SWEET_BERRIES_CAN = can("sweet_berries_can");
        TROPICAL_FISH_CAN = can("tropical_fish_can");
    }
}
