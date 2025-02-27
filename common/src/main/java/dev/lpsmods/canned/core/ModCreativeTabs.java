package dev.lpsmods.canned.core;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import dev.lpsmods.canned.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@RegistryContainer
public class ModCreativeTabs {
    public static final RegistryEntry<CreativeModeTab> MAIN;

    private static CreativeModeTab registerTab(String name, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ModUtils.makeId(name), tab);
    }

    public static void bootstrap() {}

    static {
        MAIN = RegistryEntry.creativeModeTab(ModUtils.makeId("cans"), builder -> {
            builder.icon(() -> {return new ItemStack(ModBlocks.CAN.get());});
            builder.title(Component.translatable("itemGroup."+Constants.MOD_ID));
            builder.displayItems((CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output out) -> {
                out.accept(ModItems.CAN_OPENER.get());
                out.accept(ModBlocks.CAN.get());
                out.accept(ModBlocks.APPLE_CAN.get());
                out.accept(ModBlocks.BAKED_POTATO_CAN.get());
                out.accept(ModBlocks.BEETROOT_CAN.get());
                out.accept(ModBlocks.BEETROOT_SOUP_CAN.get());
                out.accept(ModBlocks.BREAD_CAN.get());
                out.accept(ModBlocks.CAKE_CAN.get());
                out.accept(ModBlocks.CARROT_CAN.get());
                out.accept(ModBlocks.CHORUS_FRUIT_CAN.get());
                out.accept(ModBlocks.COOKED_BEEF_CAN.get());
                out.accept(ModBlocks.COOKED_CHICKEN_CAN.get());
                out.accept(ModBlocks.COOKED_COD_CAN.get());
                out.accept(ModBlocks.COOKED_MUTTON_CAN.get());
                out.accept(ModBlocks.COOKED_PORKCHOP_CAN.get());
                out.accept(ModBlocks.COOKED_RABBIT_CAN.get());
                out.accept(ModBlocks.COOKED_SALMON_CAN.get());
                out.accept(ModBlocks.COOKIE_CAN.get());
                out.accept(ModBlocks.DRIED_KELP_CAN.get());
                out.accept(ModBlocks.ENCHANTED_GOLDEN_APPLE_CAN.get());
                out.accept(ModBlocks.GLOW_BERRIES_CAN.get());
                out.accept(ModBlocks.GOLDEN_APPLE_CAN.get());
                out.accept(ModBlocks.GOLDEN_CARROT_CAN.get());
                out.accept(ModBlocks.HONEY_CAN.get());
                out.accept(ModBlocks.MELON_CAN.get());
                out.accept(ModBlocks.MUSHROOM_STEW_CAN.get());
                out.accept(ModBlocks.POISONOUS_POTATO_CAN.get());
                out.accept(ModBlocks.POTATO_CAN.get());
                out.accept(ModBlocks.PUFFERFISH_CAN.get());
                out.accept(ModBlocks.PUMPKIN_PIE_CAN.get());
                out.accept(ModBlocks.RABBIT_STEW_CAN.get());
                out.accept(ModBlocks.ROTTEN_FLESH_CAN.get());
                out.accept(ModBlocks.SPIDER_EYE_CAN.get());
                out.accept(ModBlocks.SUSPICIOUS_STEW_CAN.get());
                out.accept(ModBlocks.SWEET_BERRIES_CAN.get());
                out.accept(ModBlocks.TROPICAL_FISH_CAN.get());
            }).build();
        });
    }
}
