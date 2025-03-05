package net.blahaj.createhungarianfoods.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties LANGOS = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 100), 0.6f).build();

    public static final FoodProperties SOUR_CREAM_LANGOS = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 300), 0.7f).build();

    public static final FoodProperties SOUR_CREAM_AND_CHEESE_LANGOS = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 500), 0.8f).build();

    public static final FoodProperties GOD_LANGOS = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 1000), 0.9f).build();

    public static final FoodProperties SOUR_CREAM = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 50), 0.5f).build();
}
