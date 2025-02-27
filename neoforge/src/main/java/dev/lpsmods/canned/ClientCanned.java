package dev.lpsmods.canned;

import dev.lpsmods.canned.core.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class ClientCanned {
    public static void init() {
        RenderType type1 = RenderType.cutout();
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.APPLE_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BAKED_POTATO_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BEETROOT_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BEETROOT_SOUP_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BREAD_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CAKE_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CARROT_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHORUS_FRUIT_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKED_BEEF_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKED_CHICKEN_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKED_COD_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKED_MUTTON_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKED_PORKCHOP_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKED_RABBIT_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKED_SALMON_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKIE_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRIED_KELP_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENCHANTED_GOLDEN_APPLE_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOW_BERRIES_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLDEN_APPLE_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLDEN_CARROT_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HONEY_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MELON_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MUSHROOM_STEW_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POISONOUS_POTATO_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTATO_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PUFFERFISH_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PUMPKIN_PIE_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RABBIT_STEW_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ROTTEN_FLESH_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPIDER_EYE_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SUSPICIOUS_STEW_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SWEET_BERRIES_CAN.get(), type1);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TROPICAL_FISH_CAN.get(), type1);
    }
}
