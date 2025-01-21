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
        Supplier<Integer> ordinalSupplier = () -> dyeColors.getLast().ordinal() + 1;
        Supplier<Integer> idSupplier = () -> dyeColors.getLast().getId() + 1;
        dyeColors.add(invokeNew("CUSTOM_COLOR1", ordinalSupplier.get(), idSupplier.get(), "custom_color1", 0xff00ff, MapColor.MAGENTA, 0xff00ff, 0xff00ff));
        dyeColors.add(invokeNew("CUSTOM_COLOR2", ordinalSupplier.get(), idSupplier.get(), "custom_color2", 0x7700ff, MapColor.PURPLE, 0x7700ff, 0x7700ff));

        field_7953 = dyeColors.toArray(DyeColor[]::new);
    }
}