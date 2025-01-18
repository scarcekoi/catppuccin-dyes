package dev.scarcekoi.ctpdyes;

import dev.scarcekoi.ctpdyes.item.CatppuccinDyesItemGroups;
import dev.scarcekoi.ctpdyes.item.CatppuccinDyesItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatppuccinDyes implements ModInitializer {
	public static final String MOD_ID = "ctpdyes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CatppuccinDyesItems.registerModItems();
		CatppuccinDyesItemGroups.registerModItemGroups();
	}
}