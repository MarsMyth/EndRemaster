package net.mars_myth.end_remastered.item;

import net.mars_myth.end_remastered.TheEndRemastered;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_ENDERITE = registerItem("raw_enderite", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheEndRemastered.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheEndRemastered.LOGGER.info("Registering Mod Items for" + TheEndRemastered.MOD_ID);
    }
}
