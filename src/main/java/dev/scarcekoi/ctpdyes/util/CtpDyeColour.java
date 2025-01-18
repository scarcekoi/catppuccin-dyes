package dev.scarcekoi.ctpdyes.util;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import net.minecraft.block.MapColor;
import com.mojang.serialization.Codec;
import org.jetbrains.annotations.Nullable;

public enum CtpDyeColour {
    WHITE(0, "white", "#ffffff"),

    // Latte
    LATTE_ROSEWATER(16, "latte_rosewater", "#dc8a78"),
    LATTE_FLAMINGO(17, "latte_flamingo", "#dd7878"),
    LATTE_PINK(18, "latte_pink", "#ea76cb"),
    LATTE_MAUVE(19, "latte_mauve", "#8839ef"),
    LATTE_RED(20, "latte_red", "#d20f39"),
    LATTE_MAROON(21, "latte_maroon", "#e64553"),
    LATTE_PEACH(22, "latte_peach", "#fe640b"),
    LATTE_YELLOW(23, "latte_yellow", "#df8e1d"),
    LATTE_GREEN(24, "latte_green", "#40a02b"),
    LATTE_TEAL(25, "latte_teal", "#179299"),
    LATTE_SKY(26, "latte_sky", "#04a5e5"),
    LATTE_SAPPHIRE(27, "latte_sapphire", "#209fb5"),
    LATTE_BLUE(28, "latte_blue", "#1e66f5"),
    LATTE_LAVENDER(29, "latte_lavender", "#7287fd"),

    // Frappe
    FRAPPE_ROSEWATER(30, "frappe_rosewater", "#f2d5cf"),
    FRAPPE_FLAMINGO(31, "frappe_flamingo", "#eebebe"),
    FRAPPE_PINK(32, "frappe_pink", "#f4b8e4"),
    FRAPPE_MAUVE(33, "frappe_mauve", "#ca9ee6"),
    FRAPPE_RED(34, "frappe_red", "#e78284"),
    FRAPPE_MAROON(35, "frappe_maroon", "#ea999c"),
    FRAPPE_PEACH(36, "frappe_peach", "#ef9f76"),
    FRAPPE_YELLOW(37, "frappe_yellow", "#e5c890"),
    FRAPPE_GREEN(38, "frappe_green", "#a6d189"),
    FRAPPE_TEAL(39, "frappe_teal", "#81c8be"),
    FRAPPE_SKY(40, "frappe_sky", "#99d1db"),
    FRAPPE_SAPPHIRE(41, "frappe_sapphire", "#85c1dc"),
    FRAPPE_BLUE(42, "frappe_blue", "#8caaee"),
    FRAPPE_LAVENDER(43, "frappe_lavender", "#babbf1"),

    // Macchiato
    MACCHIATO_ROSEWATER(44, "macchiato_rosewater", "#f4dbd6"),
    MACCHIATO_FLAMINGO(45, "macchiato_flamingo", "#f0c6c6"),
    MACCHIATO_PINK(46, "macchiato_pink", "#f5bde6"),
    MACCHIATO_MAUVE(47, "macchiato_mauve", "#c6a0f6"),
    MACCHIATO_RED(48, "macchiato_red", "#ed8796"),
    MACCHIATO_MAROON(49, "macchiato_maroon", "#ee99a0"),
    MACCHIATO_PEACH(50, "macchiato_peach", "#f5a97f"),
    MACCHIATO_YELLOW(51, "macchiato_yellow", "#eed49f"),
    MACCHIATO_GREEN(52, "macchiato_green", "#a6da95"),
    MACCHIATO_TEAL(53, "macchiato_teal", "#8bd5ca"),
    MACCHIATO_SKY(54, "macchiato_sky", "#91d7e3"),
    MACCHIATO_SAPPHIRE(55, "macchiato_sapphire", "#7dc4e4"),
    MACCHIATO_BLUE(56, "macchiato_blue", "#8aadf4"),
    MACCHIATO_LAVENDER(57, "macchiato_lavender", "#b7bdf8"),

    // Mocha
    MOCHA_ROSEWATER(58, "mocha_rosewater", "#f5e0dc"),
    MOCHA_FLAMINGO(59, "mocha_flamingo", "#f2cdcd"),
    MOCHA_PINK(60, "mocha_pink", "#f5c2e7"),
    MOCHA_MAUVE(61, "mocha_mauve", "#cba6f7"),
    MOCHA_RED(62, "mocha_red", "#f38ba8"),
    MOCHA_MAROON(63, "mocha_maroon", "#eba0ac"),
    MOCHA_PEACH(64, "mocha_peach", "#fab387"),
    MOCHA_YELLOW(65, "mocha_yellow", "#f9e2af"),
    MOCHA_GREEN(66, "mocha_green", "#a6e3a1"),
    MOCHA_TEAL(67, "mocha_teal", "#94e2d5"),
    MOCHA_SKY(68, "mocha_sky", "#89dceb"),
    MOCHA_SAPPHIRE(69, "mocha_sapphire", "#74c7ec"),
    MOCHA_BLUE(70, "mocha_blue", "#89b4fa"),
    MOCHA_LAVENDER(71, "mocha_lavender", "#b4befe");

    private static final IntFunction<CtpDyeColour> BY_ID = createIdToValueFunction(values(), WHITE);
    private static final Int2ObjectOpenHashMap<CtpDyeColour> BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap<>(
            Arrays.stream(values()).collect(Collectors.toMap(color -> color.fireworkColor, color -> color))
    );
    public static final Codec<CtpDyeColour> CODEC = Codec.STRING.xmap(name -> byName(name, WHITE), CtpDyeColour::getName);
    private final int id;
    private final String name;
    private final MapColor mapColor;
    private final float[] colorComponents;
    private final int fireworkColor;
    private final int signColor;

    private CtpDyeColour(int id, String name, String hexColor) {
        this.id = id;
        this.name = name;
        this.mapColor = MapColor.WHITE;
        this.signColor = parseHexColor(hexColor);
        this.fireworkColor = this.signColor;
        int color = this.signColor;
        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = color & 0xFF;
        this.colorComponents = new float[]{r / 255.0F, g / 255.0F, b / 255.0F};
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float[] getColorComponents() {
        return this.colorComponents;
    }

    public MapColor getMapColor() {
        return this.mapColor;
    }

    public int getFireworkColor() {
        return this.fireworkColor;
    }

    public int getSignColor() {
        return this.signColor;
    }

    public static CtpDyeColour byId(int id) {
        return BY_ID.apply(id);
    }

    @Nullable
    public static CtpDyeColour byName(String name, @Nullable CtpDyeColour defaultColor) {
        return Arrays.stream(values())
                .filter(color -> color.name.equals(name))
                .findFirst()
                .orElse(defaultColor);
    }

    @Nullable
    public static CtpDyeColour byFireworkColor(int color) {
        return BY_FIREWORK_COLOR.get(color);
    }

    public String toString() {
        return this.name;
    }

    private static IntFunction<CtpDyeColour> createIdToValueFunction(CtpDyeColour[] values, CtpDyeColour defaultValue) {
        return id -> {
            if (id < 0 || id >= values.length) {
                return defaultValue;
            }
            return values[id];
        };
    }

    private static int parseHexColor(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }
        return Integer.parseInt(hex, 16);
    }
}