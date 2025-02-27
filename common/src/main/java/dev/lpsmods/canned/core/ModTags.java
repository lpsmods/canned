package dev.lpsmods.canned.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * Author: legopitstop
 */
public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CANS = createTag("cans");

        public static void bootstrap() {}

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, ModUtils.makeId(name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CANS = createTag("cans");

        public static void bootstrap() {}

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, ModUtils.makeId(name));
        }
    }
}
