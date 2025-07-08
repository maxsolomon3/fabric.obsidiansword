package util;

import net.max.obsidiansword.ObsidianSword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_OBSIDIAN_TOOL = createTag("needs_obsidian_tool");
        public static final TagKey<Block> INCORRECT_FOR_OBSIDIAN_TOOL = createTag("incorrect_for_obsidian_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ObsidianSword.MOD_ID, name));
        }
    }
}
