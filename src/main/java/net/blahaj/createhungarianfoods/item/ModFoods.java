package net.blahaj.createhungarianfoods.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties LANGOS = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 100), 0.6f).build();

    public static final FoodProperties TEJFOLOS_LANGOS = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 300), 0.7f).build();

    public static final FoodProperties SAJTOS_TEJFOLOS_LANGOS = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 500), 0.8f).build();

}
