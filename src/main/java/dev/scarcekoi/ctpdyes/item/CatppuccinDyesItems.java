package dev.scarcekoi.ctpdyes.item;

import dev.scarcekoi.ctpdyes.CatppuccinDyes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class CatppuccinDyesItems {
    // Latte
    static DyeColor latteRosewater = DyeColor.valueOf("LATTE_ROSEWATER");
    static DyeColor latteFlamingo = DyeColor.valueOf("LATTE_FLAMINGO");
    static DyeColor lattePink = DyeColor.valueOf("LATTE_PINK");
    static DyeColor latteMauve = DyeColor.valueOf("LATTE_MAUVE");
    static DyeColor latteRed = DyeColor.valueOf("LATTE_RED");
    static DyeColor latteMaroon = DyeColor.valueOf("LATTE_MAROON");
    static DyeColor lattePeach = DyeColor.valueOf("LATTE_PEACH");
    static DyeColor latteYellow = DyeColor.valueOf("LATTE_YELLOW");
    static DyeColor latteGreen = DyeColor.valueOf("LATTE_GREEN");
    static DyeColor latteTeal = DyeColor.valueOf("LATTE_TEAL");
    static DyeColor latteSky = DyeColor.valueOf("LATTE_SKY");
    static DyeColor latteSapphire = DyeColor.valueOf("LATTE_SAPPHIRE");
    static DyeColor latteBlue = DyeColor.valueOf("LATTE_BLUE");
    static DyeColor latteLavender = DyeColor.valueOf("LATTE_LAVENDER");

    // Frappe
    static DyeColor frappeRosewater = DyeColor.valueOf("FRAPPE_ROSEWATER");
    static DyeColor frappeFlamingo = DyeColor.valueOf("FRAPPE_FLAMINGO");
    static DyeColor frappePink = DyeColor.valueOf("FRAPPE_PINK");
    static DyeColor frappeMauve = DyeColor.valueOf("FRAPPE_MAUVE");
    static DyeColor frappeRed = DyeColor.valueOf("FRAPPE_RED");
    static DyeColor frappeMaroon = DyeColor.valueOf("FRAPPE_MAROON");
    static DyeColor frappePeach = DyeColor.valueOf("FRAPPE_PEACH");
    static DyeColor frappeYellow = DyeColor.valueOf("FRAPPE_YELLOW");
    static DyeColor frappeGreen = DyeColor.valueOf("FRAPPE_GREEN");
    static DyeColor frappeTeal = DyeColor.valueOf("FRAPPE_TEAL");
    static DyeColor frappeSky = DyeColor.valueOf("FRAPPE_SKY");
    static DyeColor frappeSapphire = DyeColor.valueOf("FRAPPE_SAPPHIRE");
    static DyeColor frappeBlue = DyeColor.valueOf("FRAPPE_BLUE");
    static DyeColor frappeLavender = DyeColor.valueOf("FRAPPE_LAVENDER");

    // Macchiato
    static DyeColor macchiatoRosewater = DyeColor.valueOf("MACCHIATO_ROSEWATER");
    static DyeColor macchiatoFlamingo = DyeColor.valueOf("MACCHIATO_FLAMINGO");
    static DyeColor macchiatoPink = DyeColor.valueOf("MACCHIATO_PINK");
    static DyeColor macchiatoMauve = DyeColor.valueOf("MACCHIATO_MAUVE");
    static DyeColor macchiatoRed = DyeColor.valueOf("MACCHIATO_RED");
    static DyeColor macchiatoMaroon = DyeColor.valueOf("MACCHIATO_MAROON");
    static DyeColor macchiatoPeach = DyeColor.valueOf("MACCHIATO_PEACH");
    static DyeColor macchiatoYellow = DyeColor.valueOf("MACCHIATO_YELLOW");
    static DyeColor macchiatoGreen = DyeColor.valueOf("MACCHIATO_GREEN");
    static DyeColor macchiatoTeal = DyeColor.valueOf("MACCHIATO_TEAL");
    static DyeColor macchiatoSky = DyeColor.valueOf("MACCHIATO_SKY");
    static DyeColor macchiatoSapphire = DyeColor.valueOf("MACCHIATO_SAPPHIRE");
    static DyeColor macchiatoBlue = DyeColor.valueOf("MACCHIATO_BLUE");
    static DyeColor macchiatoLavender = DyeColor.valueOf("MACCHIATO_LAVENDER");

    // Mocha
    static DyeColor mochaRosewater = DyeColor.valueOf("MOCHA_ROSEWATER");
    static DyeColor mochaFlamingo = DyeColor.valueOf("MOCHA_FLAMINGO");
    static DyeColor mochaPink = DyeColor.valueOf("MOCHA_PINK");
    static DyeColor mochaMauve = DyeColor.valueOf("MOCHA_MAUVE");
    static DyeColor mochaRed = DyeColor.valueOf("MOCHA_RED");
    static DyeColor mochaMaroon = DyeColor.valueOf("MOCHA_MAROON");
    static DyeColor mochaPeach = DyeColor.valueOf("MOCHA_PEACH");
    static DyeColor mochaYellow = DyeColor.valueOf("MOCHA_YELLOW");
    static DyeColor mochaGreen = DyeColor.valueOf("MOCHA_GREEN");
    static DyeColor mochaTeal = DyeColor.valueOf("MOCHA_TEAL");
    static DyeColor mochaSky = DyeColor.valueOf("MOCHA_SKY");
    static DyeColor mochaSapphire = DyeColor.valueOf("MOCHA_SAPPHIRE");
    static DyeColor mochaBlue = DyeColor.valueOf("MOCHA_BLUE");
    static DyeColor mochaLavender = DyeColor.valueOf("MOCHA_LAVENDER");

    // Latte
    public static final DyeItem LATTE_ROSEWATER_DYE = (DyeItem) registerItem("latte_rosewater_dye", new DyeItem(latteRosewater, new FabricItemSettings()));
    public static final DyeItem LATTE_FLAMINGO_DYE = (DyeItem) registerItem("latte_flamingo_dye", new DyeItem(latteFlamingo, new FabricItemSettings()));
    public static final DyeItem LATTE_PINK_DYE = (DyeItem) registerItem("latte_pink_dye", new DyeItem(lattePink, new FabricItemSettings()));
    public static final DyeItem LATTE_MAUVE_DYE = (DyeItem) registerItem("latte_mauve_dye", new DyeItem(latteMauve, new FabricItemSettings()));
    public static final DyeItem LATTE_RED_DYE = (DyeItem) registerItem("latte_red_dye", new DyeItem(latteRed, new FabricItemSettings()));
    public static final DyeItem LATTE_MAROON_DYE = (DyeItem) registerItem("latte_maroon_dye", new DyeItem(latteMaroon, new FabricItemSettings()));
    public static final DyeItem LATTE_PEACH_DYE = (DyeItem) registerItem("latte_peach_dye", new DyeItem(lattePeach, new FabricItemSettings()));
    public static final DyeItem LATTE_YELLOW_DYE = (DyeItem) registerItem("latte_yellow_dye", new DyeItem(latteYellow, new FabricItemSettings()));
    public static final DyeItem LATTE_GREEN_DYE = (DyeItem) registerItem("latte_green_dye", new DyeItem(latteGreen, new FabricItemSettings()));
    public static final DyeItem LATTE_TEAL_DYE = (DyeItem) registerItem("latte_teal_dye", new DyeItem(latteTeal, new FabricItemSettings()));
    public static final DyeItem LATTE_SKY_DYE = (DyeItem) registerItem("latte_sky_dye", new DyeItem(latteSky, new FabricItemSettings()));
    public static final DyeItem LATTE_SAPPHIRE_DYE = (DyeItem) registerItem("latte_sapphire_dye", new DyeItem(latteSapphire, new FabricItemSettings()));
    public static final DyeItem LATTE_BLUE_DYE = (DyeItem) registerItem("latte_blue_dye", new DyeItem(latteBlue, new FabricItemSettings()));
    public static final DyeItem LATTE_LAVENDER_DYE = (DyeItem) registerItem("latte_lavender_dye", new DyeItem(latteLavender, new FabricItemSettings()));

    // Frappe
    public static final DyeItem FRAPPE_ROSEWATER_DYE = (DyeItem) registerItem("frappe_rosewater_dye", new DyeItem(frappeRosewater, new FabricItemSettings()));
    public static final DyeItem FRAPPE_FLAMINGO_DYE = (DyeItem) registerItem("frappe_flamingo_dye", new DyeItem(frappeFlamingo, new FabricItemSettings()));
    public static final DyeItem FRAPPE_PINK_DYE = (DyeItem) registerItem("frappe_pink_dye", new DyeItem(frappePink, new FabricItemSettings()));
    public static final DyeItem FRAPPE_MAUVE_DYE = (DyeItem) registerItem("frappe_mauve_dye", new DyeItem(frappeMauve, new FabricItemSettings()));
    public static final DyeItem FRAPPE_RED_DYE = (DyeItem) registerItem("frappe_red_dye", new DyeItem(frappeRed, new FabricItemSettings()));
    public static final DyeItem FRAPPE_MAROON_DYE = (DyeItem) registerItem("frappe_maroon_dye", new DyeItem(frappeMaroon, new FabricItemSettings()));
    public static final DyeItem FRAPPE_PEACH_DYE = (DyeItem) registerItem("frappe_peach_dye", new DyeItem(frappePeach, new FabricItemSettings()));
    public static final DyeItem FRAPPE_YELLOW_DYE = (DyeItem) registerItem("frappe_yellow_dye", new DyeItem(frappeYellow, new FabricItemSettings()));
    public static final DyeItem FRAPPE_GREEN_DYE = (DyeItem) registerItem("frappe_green_dye", new DyeItem(frappeGreen, new FabricItemSettings()));
    public static final DyeItem FRAPPE_TEAL_DYE = (DyeItem) registerItem("frappe_teal_dye", new DyeItem(frappeTeal, new FabricItemSettings()));
    public static final DyeItem FRAPPE_SKY_DYE = (DyeItem) registerItem("frappe_sky_dye", new DyeItem(frappeSky, new FabricItemSettings()));
    public static final DyeItem FRAPPE_SAPPHIRE_DYE = (DyeItem) registerItem("frappe_sapphire_dye", new DyeItem(frappeSapphire, new FabricItemSettings()));
    public static final DyeItem FRAPPE_BLUE_DYE = (DyeItem) registerItem("frappe_blue_dye", new DyeItem(frappeBlue, new FabricItemSettings()));
    public static final DyeItem FRAPPE_LAVENDER_DYE = (DyeItem) registerItem("frappe_lavender_dye", new DyeItem(frappeLavender, new FabricItemSettings()));

    // Macchiato
    public static final DyeItem MACCHIATO_ROSEWATER_DYE = (DyeItem) registerItem("macchiato_rosewater_dye", new DyeItem(macchiatoRosewater, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_FLAMINGO_DYE = (DyeItem) registerItem("macchiato_flamingo_dye", new DyeItem(macchiatoFlamingo, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_PINK_DYE = (DyeItem) registerItem("macchiato_pink_dye", new DyeItem(macchiatoPink, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_MAUVE_DYE = (DyeItem) registerItem("macchiato_mauve_dye", new DyeItem(macchiatoMauve, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_RED_DYE = (DyeItem) registerItem("macchiato_red_dye", new DyeItem(macchiatoRed, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_MAROON_DYE = (DyeItem) registerItem("macchiato_maroon_dye", new DyeItem(macchiatoMaroon, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_PEACH_DYE = (DyeItem) registerItem("macchiato_peach_dye", new DyeItem(macchiatoPeach, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_YELLOW_DYE = (DyeItem) registerItem("macchiato_yellow_dye", new DyeItem(macchiatoYellow, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_GREEN_DYE = (DyeItem) registerItem("macchiato_green_dye", new DyeItem(macchiatoGreen, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_TEAL_DYE = (DyeItem) registerItem("macchiato_teal_dye", new DyeItem(macchiatoTeal, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_SKY_DYE = (DyeItem) registerItem("macchiato_sky_dye", new DyeItem(macchiatoSky, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_SAPPHIRE_DYE = (DyeItem) registerItem("macchiato_sapphire_dye", new DyeItem(macchiatoSapphire, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_BLUE_DYE = (DyeItem) registerItem("macchiato_blue_dye", new DyeItem(macchiatoBlue, new FabricItemSettings()));
    public static final DyeItem MACCHIATO_LAVENDER_DYE = (DyeItem) registerItem("macchiato_lavender_dye", new DyeItem(macchiatoLavender, new FabricItemSettings()));

    // Mocha
    public static final DyeItem MOCHA_ROSEWATER_DYE = (DyeItem) registerItem("mocha_rosewater_dye", new DyeItem(mochaRosewater, new FabricItemSettings()));
    public static final DyeItem MOCHA_FLAMINGO_DYE = (DyeItem) registerItem("mocha_flamingo_dye", new DyeItem(mochaFlamingo, new FabricItemSettings()));
    public static final DyeItem MOCHA_PINK_DYE = (DyeItem) registerItem("mocha_pink_dye", new DyeItem(mochaPink, new FabricItemSettings()));
    public static final DyeItem MOCHA_MAUVE_DYE = (DyeItem) registerItem("mocha_mauve_dye", new DyeItem(mochaMauve, new FabricItemSettings()));
    public static final DyeItem MOCHA_RED_DYE = (DyeItem) registerItem("mocha_red_dye", new DyeItem(mochaRed, new FabricItemSettings()));
    public static final DyeItem MOCHA_MAROON_DYE = (DyeItem) registerItem("mocha_maroon_dye", new DyeItem(mochaMaroon, new FabricItemSettings()));
    public static final DyeItem MOCHA_PEACH_DYE = (DyeItem) registerItem("mocha_peach_dye", new DyeItem(mochaPeach, new FabricItemSettings()));
    public static final DyeItem MOCHA_YELLOW_DYE = (DyeItem) registerItem("mocha_yellow_dye", new DyeItem(mochaYellow, new FabricItemSettings()));
    public static final DyeItem MOCHA_GREEN_DYE = (DyeItem) registerItem("mocha_green_dye", new DyeItem(mochaGreen, new FabricItemSettings()));
    public static final DyeItem MOCHA_TEAL_DYE = (DyeItem) registerItem("mocha_teal_dye", new DyeItem(mochaTeal, new FabricItemSettings()));
    public static final DyeItem MOCHA_SKY_DYE = (DyeItem) registerItem("mocha_sky_dye", new DyeItem(mochaSky, new FabricItemSettings()));
    public static final DyeItem MOCHA_SAPPHIRE_DYE = (DyeItem) registerItem("mocha_sapphire_dye", new DyeItem(mochaSapphire, new FabricItemSettings()));
    public static final DyeItem MOCHA_BLUE_DYE = (DyeItem) registerItem("mocha_blue_dye", new DyeItem(mochaBlue, new FabricItemSettings()));
    public static final DyeItem MOCHA_LAVENDER_DYE = (DyeItem) registerItem("mocha_lavender_dye", new DyeItem(mochaLavender, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CatppuccinDyes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CatppuccinDyes.LOGGER.info("Registering Mod Items for " + CatppuccinDyes.MOD_ID);
    }
}