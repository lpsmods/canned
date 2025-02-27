package dev.lpsmods.canned;

import dev.lpsmods.canned.core.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class ClientCanned implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RenderType type1 = RenderType.cutout();
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.APPLE_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAKED_POTATO_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BEETROOT_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BEETROOT_SOUP_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BREAD_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAKE_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CARROT_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHORUS_FRUIT_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOKED_BEEF_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOKED_CHICKEN_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOKED_COD_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOKED_MUTTON_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOKED_PORKCHOP_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOKED_RABBIT_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOKED_SALMON_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOKIE_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DRIED_KELP_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENCHANTED_GOLDEN_APPLE_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_BERRIES_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOLDEN_APPLE_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOLDEN_CARROT_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HONEY_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MELON_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MUSHROOM_STEW_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POISONOUS_POTATO_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTATO_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PUFFERFISH_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PUMPKIN_PIE_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RABBIT_STEW_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROTTEN_FLESH_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPIDER_EYE_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SUSPICIOUS_STEW_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SWEET_BERRIES_CAN.get(), type1);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TROPICAL_FISH_CAN.get(), type1);
    }
}
