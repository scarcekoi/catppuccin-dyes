package dev.scarcekoi.ctpdyes.item;

import dev.scarcekoi.ctpdyes.util.CtpDyeColour;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;

public class CtpCustomDyeItem extends DyeItem {
    public final CtpDyeColour ctpDyeColor;

    public CtpCustomDyeItem(CtpDyeColour customDyeColor) {
        super(DyeColor.WHITE, new Item.Settings());
        this.ctpDyeColor = customDyeColor;
    }

    public CtpDyeColour getCustomDyeColor() {
        return ctpDyeColor;
    }
}