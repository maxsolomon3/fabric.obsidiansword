package net.max.obsidiansword.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ObsidianSwordItem extends SwordItem {
    public ObsidianSwordItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}
