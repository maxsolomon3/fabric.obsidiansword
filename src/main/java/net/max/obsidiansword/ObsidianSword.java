package net.max.obsidiansword;

import net.fabricmc.api.ModInitializer;

import net.max.obsidiansword.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObsidianSword implements ModInitializer {
	public static final String MOD_ID = "obsidiansword";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}