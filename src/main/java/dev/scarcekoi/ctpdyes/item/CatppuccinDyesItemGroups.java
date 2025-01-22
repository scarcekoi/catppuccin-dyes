package dev.scarcekoi.ctpdyes.item;

import dev.scarcekoi.ctpdyes.CatppuccinDyes;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CatppuccinDyesItemGroups {
    public static final ItemGroup LATTE_DYES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CatppuccinDyes.MOD_ID, "latte_dyes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.latte_dyes"))
                    .icon(() -> new ItemStack(CatppuccinDyesItems.LATTE_MAUVE_DYE)).entries((displayContext, entries) -> {
                        entries.add(CatppuccinDyesItems.LATTE_ROSEWATER_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_FLAMINGO_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_PINK_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_MAUVE_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_RED_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_MAROON_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_PEACH_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_YELLOW_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_GREEN_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_TEAL_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_SKY_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_SAPPHIRE_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_BLUE_DYE);
                        entries.add(CatppuccinDyesItems.LATTE_LAVENDER_DYE);
                    }).build());
    public static final ItemGroup FRAPPE_DYES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CatppuccinDyes.MOD_ID, "frappe_dyes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.frappe_dyes"))
                    .icon(() -> new ItemStack(CatppuccinDyesItems.FRAPPE_MAUVE_DYE)).entries((displayContext, entries) -> {
                        entries.add(CatppuccinDyesItems.FRAPPE_ROSEWATER_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_FLAMINGO_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_PINK_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_MAUVE_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_RED_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_MAROON_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_PEACH_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_YELLOW_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_GREEN_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_TEAL_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_SKY_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_SAPPHIRE_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_BLUE_DYE);
                        entries.add(CatppuccinDyesItems.FRAPPE_LAVENDER_DYE);
                    }).build());
    public static final ItemGroup MACCHIATO_DYES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CatppuccinDyes.MOD_ID, "macchiato_dyes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.macchiato_dyes"))
                    .icon(() -> new ItemStack(CatppuccinDyesItems.MACCHIATO_MAUVE_DYE)).entries((displayContext, entries) -> {
                        entries.add(CatppuccinDyesItems.MACCHIATO_ROSEWATER_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_FLAMINGO_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_PINK_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_MAUVE_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_RED_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_MAROON_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_PEACH_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_YELLOW_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_GREEN_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_TEAL_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_SKY_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_SAPPHIRE_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_BLUE_DYE);
                        entries.add(CatppuccinDyesItems.MACCHIATO_LAVENDER_DYE);
                    }).build());
    public static final ItemGroup MOCHA_DYES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CatppuccinDyes.MOD_ID, "mocha_dyes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mocha_dyes"))
                    .icon(() -> new ItemStack(CatppuccinDyesItems.MOCHA_MAUVE_DYE)).entries((displayContext, entries) -> {
                        entries.add(CatppuccinDyesItems.MOCHA_ROSEWATER_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_FLAMINGO_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_PINK_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_MAUVE_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_RED_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_MAROON_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_PEACH_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_YELLOW_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_GREEN_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_TEAL_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_SKY_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_SAPPHIRE_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_BLUE_DYE);
                        entries.add(CatppuccinDyesItems.MOCHA_LAVENDER_DYE);
                    }).build());

    public static void registerModItemGroups() {
        CatppuccinDyes.LOGGER.info("Registering Mod Item Groups for " + CatppuccinDyes.MOD_ID);
    }
}
