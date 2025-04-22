package net.elchi.omniamod;

import net.elchi.omniamod.block.ModBlocks;
import net.elchi.omniamod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OmniaMod implements ModInitializer {
	public static final String MOD_ID = "omniamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}