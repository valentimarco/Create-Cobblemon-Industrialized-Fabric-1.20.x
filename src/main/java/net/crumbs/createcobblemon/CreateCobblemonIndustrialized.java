package net.crumbs.createcobblemon;

import net.crumbs.createcobblemon.block.ModBlocks;
import net.crumbs.createcobblemon.fluids.ModFluids;
import net.crumbs.createcobblemon.item.ModItemGroups;
import net.crumbs.createcobblemon.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCobblemonIndustrialized implements ModInitializer {
	public static final String MOD_ID = "create_cobblemon";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFluids.registerModFluids();
	}
}