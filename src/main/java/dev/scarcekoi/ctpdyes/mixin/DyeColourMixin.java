package dev.scarcekoi.ctpdyes.mixin;

import com.google.common.collect.Lists;
import net.minecraft.block.MapColor;
import net.minecraft.util.DyeColor;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.function.Supplier;

@Mixin(DyeColor.class)
public abstract class DyeColourMixin {

    @Final
    @Shadow
    @Mutable
    private static DyeColor[] field_7953;

    @Invoker("<init>")
    private static DyeColor invokeNew(String internalName, int ordinal, int id, String name, int color, MapColor mapColor, int fireworkColor, int signColor) {
        throw new IllegalStateException();
    }

    @Inject(method = "<clinit>", at = @At(value = "FIELD", target = "Lnet/minecraft/util/DyeColor;field_7953:[Lnet/minecraft/util/DyeColor;", shift = At.Shift.AFTER, opcode = Opcodes.PUTSTATIC))
    private static void addNullDyeColorValue(CallbackInfo ci) {
        ArrayList<DyeColor> dyeColors = Lists.newArrayList(field_7953);
        Supplier<Integer> ordinalSupplier = () -> dyeColors.get(dyeColors.size() - 1).ordinal() + 1;
        Supplier<Integer> idSupplier = () -> dyeColors.get(dyeColors.size() - 1).getId() + 1;
        // Latte
        dyeColors.add(invokeNew("LATTE_ROSEWATER", ordinalSupplier.get(), idSupplier.get(), "latte_rosewater", 0xdc8a78, MapColor.TERRACOTTA_ORANGE, 0xdc8a78, 0xdc8a78));
        dyeColors.add(invokeNew("LATTE_FLAMINGO", ordinalSupplier.get(), idSupplier.get(), "latte_flamingo", 0xdd7878, MapColor.TERRACOTTA_RED, 0xdd7878, 0xdd7878));
        dyeColors.add(invokeNew("LATTE_PINK", ordinalSupplier.get(), idSupplier.get(), "latte_pink", 0xea76cb, MapColor.PINK, 0xea76cb, 0xea76cb));
        dyeColors.add(invokeNew("LATTE_MAUVE", ordinalSupplier.get(), idSupplier.get(), "latte_mauve", 0x8839ef, MapColor.PURPLE, 0x8839ef, 0x8839ef));
        dyeColors.add(invokeNew("LATTE_RED", ordinalSupplier.get(), idSupplier.get(), "latte_red", 0xd20f39, MapColor.RED, 0xd20f39, 0xd20f39));
        dyeColors.add(invokeNew("LATTE_MAROON", ordinalSupplier.get(), idSupplier.get(), "latte_maroon", 0xe64553, MapColor.TERRACOTTA_RED, 0xe64553, 0xe64553));
        dyeColors.add(invokeNew("LATTE_PEACH", ordinalSupplier.get(), idSupplier.get(), "latte_peach", 0xfe640b, MapColor.TERRACOTTA_ORANGE, 0xfe640b, 0xfe640b));
        dyeColors.add(invokeNew("LATTE_YELLOW", ordinalSupplier.get(), idSupplier.get(), "latte_yellow", 0xdf8e1d, MapColor.YELLOW, 0xdf8e1d, 0xdf8e1d));
        dyeColors.add(invokeNew("LATTE_GREEN", ordinalSupplier.get(), idSupplier.get(), "latte_green", 0x40a02b, MapColor.GREEN, 0x40a02b, 0x40a02b));
        dyeColors.add(invokeNew("LATTE_TEAL", ordinalSupplier.get(), idSupplier.get(), "latte_teal", 0x179299, MapColor.GREEN, 0x179299, 0x179299));
        dyeColors.add(invokeNew("LATTE_SKY", ordinalSupplier.get(), idSupplier.get(), "latte_sky", 0x04a5e5, MapColor.LIGHT_BLUE, 0x04a5e5, 0x04a5e5));
        dyeColors.add(invokeNew("LATTE_SAPPHIRE", ordinalSupplier.get(), idSupplier.get(), "latte_sapphire", 0x209fb5, MapColor.CYAN, 0x209fb5, 0x209fb5));
        dyeColors.add(invokeNew("LATTE_BLUE", ordinalSupplier.get(), idSupplier.get(), "latte_blue", 0x1e66f5, MapColor.BLUE, 0x1e66f5, 0x1e66f5));
        dyeColors.add(invokeNew("LATTE_LAVENDER", ordinalSupplier.get(), idSupplier.get(), "latte_lavender", 0x7287fd, MapColor.PURPLE, 0x7287fd, 0x7287fd));

        // Frappe
        dyeColors.add(invokeNew("FRAPPE_ROSEWATER", ordinalSupplier.get(), idSupplier.get(), "frappe_rosewater", 0xf2d5cf, MapColor.PINK, 0xf2d5cf, 0xf2d5cf));
        dyeColors.add(invokeNew("FRAPPE_FLAMINGO", ordinalSupplier.get(), idSupplier.get(), "frappe_flamingo", 0xeebebe, MapColor.RED, 0xeebebe, 0xeebebe));
        dyeColors.add(invokeNew("FRAPPE_PINK", ordinalSupplier.get(), idSupplier.get(), "frappe_pink", 0xf4b8e4, MapColor.PINK, 0xf4b8e4, 0xf4b8e4));
        dyeColors.add(invokeNew("FRAPPE_MAUVE", ordinalSupplier.get(), idSupplier.get(), "frappe_mauve", 0xca9ee6, MapColor.PURPLE, 0xca9ee6, 0xca9ee6));
        dyeColors.add(invokeNew("FRAPPE_RED", ordinalSupplier.get(), idSupplier.get(), "frappe_red", 0xe78284, MapColor.RED, 0xe78284, 0xe78284));
        dyeColors.add(invokeNew("FRAPPE_MAROON", ordinalSupplier.get(), idSupplier.get(), "frappe_maroon", 0xea999c, MapColor.RED, 0xea999c, 0xea999c));
        dyeColors.add(invokeNew("FRAPPE_PEACH", ordinalSupplier.get(), idSupplier.get(), "frappe_peach", 0xef9f76, MapColor.ORANGE, 0xef9f76, 0xef9f76));
        dyeColors.add(invokeNew("FRAPPE_YELLOW", ordinalSupplier.get(), idSupplier.get(), "frappe_yellow", 0xe5c890, MapColor.YELLOW, 0xe5c890, 0xe5c890));
        dyeColors.add(invokeNew("FRAPPE_GREEN", ordinalSupplier.get(), idSupplier.get(), "frappe_green", 0xa6d189, MapColor.GREEN, 0xa6d189, 0xa6d189));
        dyeColors.add(invokeNew("FRAPPE_TEAL", ordinalSupplier.get(), idSupplier.get(), "frappe_teal", 0x81c8be, MapColor.GREEN, 0x81c8be, 0x81c8be));
        dyeColors.add(invokeNew("FRAPPE_SKY", ordinalSupplier.get(), idSupplier.get(), "frappe_sky", 0x99d1db, MapColor.LIGHT_BLUE, 0x99d1db, 0x99d1db));
        dyeColors.add(invokeNew("FRAPPE_SAPPHIRE", ordinalSupplier.get(), idSupplier.get(), "frappe_sapphire", 0x85c1dc, MapColor.CYAN, 0x85c1dc, 0x85c1dc));
        dyeColors.add(invokeNew("FRAPPE_BLUE", ordinalSupplier.get(), idSupplier.get(), "frappe_blue", 0x8caaee, MapColor.BLUE, 0x8caaee, 0x8caaee));
        dyeColors.add(invokeNew("FRAPPE_LAVENDER", ordinalSupplier.get(), idSupplier.get(), "frappe_lavender", 0xbabbf1, MapColor.PURPLE, 0xbabbf1, 0xbabbf1));

        // Macchiato
        dyeColors.add(invokeNew("MACCHIATO_ROSEWATER", ordinalSupplier.get(), idSupplier.get(), "macchiato_rosewater", 0xf4dbd6, MapColor.PINK, 0xf4dbd6, 0xf4dbd6));
        dyeColors.add(invokeNew("MACCHIATO_FLAMINGO", ordinalSupplier.get(), idSupplier.get(), "macchiato_flamingo", 0xf0c6c6, MapColor.RED, 0xf0c6c6, 0xf0c6c6));
        dyeColors.add(invokeNew("MACCHIATO_PINK", ordinalSupplier.get(), idSupplier.get(), "macchiato_pink", 0xf5bde6, MapColor.PINK, 0xf5bde6, 0xf5bde6));
        dyeColors.add(invokeNew("MACCHIATO_MAUVE", ordinalSupplier.get(), idSupplier.get(), "macchiato_mauve", 0xc6a0f6, MapColor.PURPLE, 0xc6a0f6, 0xc6a0f6));
        dyeColors.add(invokeNew("MACCHIATO_RED", ordinalSupplier.get(), idSupplier.get(), "macchiato_red", 0xed8796, MapColor.RED, 0xed8796, 0xed8796));
        dyeColors.add(invokeNew("MACCHIATO_MAROON", ordinalSupplier.get(), idSupplier.get(), "macchiato_maroon", 0xee99a0, MapColor.RED, 0xee99a0, 0xee99a0));
        dyeColors.add(invokeNew("MACCHIATO_PEACH", ordinalSupplier.get(), idSupplier.get(), "macchiato_peach", 0xf5a97f, MapColor.ORANGE, 0xf5a97f, 0xf5a97f));
        dyeColors.add(invokeNew("MACCHIATO_YELLOW", ordinalSupplier.get(), idSupplier.get(), "macchiato_yellow", 0xeed49f, MapColor.YELLOW, 0xeed49f, 0xeed49f));
        dyeColors.add(invokeNew("MACCHIATO_GREEN", ordinalSupplier.get(), idSupplier.get(), "macchiato_green", 0xa6da95, MapColor.GREEN, 0xa6da95, 0xa6da95));
        dyeColors.add(invokeNew("MACCHIATO_TEAL", ordinalSupplier.get(), idSupplier.get(), "macchiato_teal", 0x8bd5ca, MapColor.GREEN, 0x8bd5ca, 0x8bd5ca));
        dyeColors.add(invokeNew("MACCHIATO_SKY", ordinalSupplier.get(), idSupplier.get(), "macchiato_sky", 0x91d7e3, MapColor.LIGHT_BLUE, 0x91d7e3, 0x91d7e3));
        dyeColors.add(invokeNew("MACCHIATO_SAPPHIRE", ordinalSupplier.get(), idSupplier.get(), "macchiato_sapphire", 0x7dc4e4, MapColor.CYAN, 0x7dc4e4, 0x7dc4e4));
        dyeColors.add(invokeNew("MACCHIATO_BLUE", ordinalSupplier.get(), idSupplier.get(), "macchiato_blue", 0x8aadf4, MapColor.BLUE, 0x8aadf4, 0x8aadf4));
        dyeColors.add(invokeNew("MACCHIATO_LAVENDER", ordinalSupplier.get(), idSupplier.get(), "macchiato_lavender", 0xb7bdf8, MapColor.PURPLE, 0xb7bdf8, 0xb7bdf8));

        // Mocha
        dyeColors.add(invokeNew("MOCHA_ROSEWATER", ordinalSupplier.get(), idSupplier.get(), "mocha_rosewater", 0xf5e0dc, MapColor.PINK, 0xf5e0dc, 0xf5e0dc));
        dyeColors.add(invokeNew("MOCHA_FLAMINGO", ordinalSupplier.get(), idSupplier.get(), "mocha_flamingo", 0xf2cdcd, MapColor.RED, 0xf2cdcd, 0xf2cdcd));
        dyeColors.add(invokeNew("MOCHA_PINK", ordinalSupplier.get(), idSupplier.get(), "mocha_pink", 0xf5c2e7, MapColor.PINK, 0xf5c2e7, 0xf5c2e7));
        dyeColors.add(invokeNew("MOCHA_MAUVE", ordinalSupplier.get(), idSupplier.get(), "mocha_mauve", 0xcba6f7, MapColor.PURPLE, 0xcba6f7, 0xcba6f7));
        dyeColors.add(invokeNew("MOCHA_RED", ordinalSupplier.get(), idSupplier.get(), "mocha_red", 0xf38ba8, MapColor.RED, 0xf38ba8, 0xf38ba8));
        dyeColors.add(invokeNew("MOCHA_MAROON", ordinalSupplier.get(), idSupplier.get(), "mocha_maroon", 0xeba0ac, MapColor.RED, 0xeba0ac, 0xeba0ac));
        dyeColors.add(invokeNew("MOCHA_PEACH", ordinalSupplier.get(), idSupplier.get(), "mocha_peach", 0xfab387, MapColor.ORANGE, 0xfab387, 0xfab387));
        dyeColors.add(invokeNew("MOCHA_YELLOW", ordinalSupplier.get(), idSupplier.get(), "mocha_yellow", 0xf9e2af, MapColor.YELLOW, 0xf9e2af, 0xf9e2af));
        dyeColors.add(invokeNew("MOCHA_GREEN", ordinalSupplier.get(), idSupplier.get(), "mocha_green", 0xa6e3a1, MapColor.GREEN, 0xa6e3a1, 0xa6e3a1));
        dyeColors.add(invokeNew("MOCHA_TEAL", ordinalSupplier.get(), idSupplier.get(), "mocha_teal", 0x94e2d5, MapColor.GREEN, 0x94e2d5, 0x94e2d5));
        dyeColors.add(invokeNew("MOCHA_SKY", ordinalSupplier.get(), idSupplier.get(), "mocha_sky", 0x89dceb, MapColor.LIGHT_BLUE, 0x89dceb, 0x89dceb));
        dyeColors.add(invokeNew("MOCHA_SAPPHIRE", ordinalSupplier.get(), idSupplier.get(), "mocha_sapphire", 0x74c7ec, MapColor.CYAN, 0x74c7ec, 0x74c7ec));
        dyeColors.add(invokeNew("MOCHA_BLUE", ordinalSupplier.get(), idSupplier.get(), "mocha_blue", 0x89b4fa, MapColor.BLUE, 0x89b4fa, 0x89b4fa));
        dyeColors.add(invokeNew("MOCHA_LAVENDER", ordinalSupplier.get(), idSupplier.get(), "mocha_lavender", 0xb4befe, MapColor.PURPLE, 0xb4befe, 0xb4befe));

        field_7953 = dyeColors.toArray(DyeColor[]::new);
    }
}