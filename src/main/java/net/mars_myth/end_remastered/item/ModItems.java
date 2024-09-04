package net.mars_myth.end_remastered.item;

import net.mars_myth.end_remastered.TheEndRemastered;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item END_METAL_INGOT = registerItem("end_metal_ingot", new Item(new Item.Settings()));
    public static final Item RAW_END_METAL = registerItem("raw_end_metal", new Item(new Item.Settings()));

    public static final Item SHADOW_BERRY = registerItem("shadow_berry",
            new Item(new Item.Settings().food(ModFoodComponents.SHADOW_BERRY)));
    public static final Item COOKED_SHADOW_BERRY = registerItem("cooked_shadow_berry",
            new Item(new Item.Settings().food(ModFoodComponents.COOKED_SHADOW_BERRY)));
    public static final Item SHADOW_BERRY_JELLY = registerItem("shadow_berry_jelly",
            new Item(new Item.Settings().food(ModFoodComponents.SHADOW_BERRY_JELLY)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheEndRemastered.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheEndRemastered.LOGGER.info("Registering Mod Items for" + TheEndRemastered.MOD_ID);
    }
}
