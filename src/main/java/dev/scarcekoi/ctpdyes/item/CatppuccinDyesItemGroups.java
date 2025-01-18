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
    public static final ItemGroup MOCHA_DYES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CatppuccinDyes.MOD_ID, "mocha_dyes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mocha_dyes"))
                    .icon(() -> new ItemStack(CatppuccinDyesItems.MOCHA_MAUVE_DYE)).entries((displayContext, entries) -> {
                        entries.add(CatppuccinDyesItems.MOCHA_MAUVE_DYE);
                    }).build());

    public static void registerModItemGroups() {
        CatppuccinDyes.LOGGER.info("Registering Mod Item Groups for " + CatppuccinDyes.MOD_ID);
    }
}
