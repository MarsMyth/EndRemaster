package net.mars_myth.end_remastered;

import net.fabricmc.api.ModInitializer;

import net.mars_myth.end_remastered.block.ModBlocks;
import net.mars_myth.end_remastered.item.ModItemGroups;
import net.mars_myth.end_remastered.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// This is the main Class
public class TheEndRemastered implements ModInitializer {
	public static final String MOD_ID = "end-remastered";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");


		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}