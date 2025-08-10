package com.boo.deepdark;

import com.boo.deepdark.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheDeepness implements ModInitializer {
	public static final String MOD_ID = "deepdark";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric mod! Loading was successful!"); // to be removed in final version
		ModItems.registerModItems();
	}
}