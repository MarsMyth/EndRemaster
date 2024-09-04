package net.mars_myth.end_remastered.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SHADOW_BERRY = new FoodComponent.Builder().
            nutrition(3).saturationModifier(0.25f).build();
    public static final FoodComponent COOKED_SHADOW_BERRY = new FoodComponent.Builder().
            nutrition(6).saturationModifier(0.5f).build();
    public static final FoodComponent SHADOW_BERRY_JELLY = new FoodComponent.Builder().
            nutrition(1).saturationModifier(0.95f).snack().build();

}
