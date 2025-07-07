package net.max.obsidiansword.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.max.obsidiansword.ObsidianSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword",new Item(new Item.Settings()));

    public static void registerModItems()
    {
        ObsidianSword.LOGGER.info("Registering mod items for: " + ObsidianSword.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {fabricItemGroupEntries.add(OBSIDIAN_SWORD);});
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(ObsidianSword.MOD_ID,name),item);
    }
}
