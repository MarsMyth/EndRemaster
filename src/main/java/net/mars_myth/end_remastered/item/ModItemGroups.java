package net.mars_myth.end_remastered.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mars_myth.end_remastered.TheEndRemastered;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup END_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheEndRemastered.MOD_ID, "end_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.end_items"))
                    .icon(() -> new ItemStack(Blocks.END_STONE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ENDERITE_INGOT);
                         entries.add(ModItems.RAW_ENDERITE);

                    }).build());


    public static void registerItemGroups() {
        TheEndRemastered.LOGGER.info("Registering Mod Item Groups for" + TheEndRemastered.MOD_ID);
    }
}
