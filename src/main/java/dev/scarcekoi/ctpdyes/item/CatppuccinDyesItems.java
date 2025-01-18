package dev.scarcekoi.ctpdyes.item;

import dev.scarcekoi.ctpdyes.CatppuccinDyes;
import dev.scarcekoi.ctpdyes.util.CtpDyeColour;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CatppuccinDyesItems {
    // Latte

    // Frappe

    // Macchiato

    // Mocha
    public static final DyeItem MOCHA_MAUVE_DYE = (DyeItem) registerItem("mocha_mauve_dye", new CtpCustomDyeItem(CtpDyeColour.MOCHA_MAUVE));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CatppuccinDyes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CatppuccinDyes.LOGGER.info("Registering Mod Items for " + CatppuccinDyes.MOD_ID);
    }
}