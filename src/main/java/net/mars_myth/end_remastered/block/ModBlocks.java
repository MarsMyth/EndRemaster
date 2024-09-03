package net.mars_myth.end_remastered.block;

import net.mars_myth.end_remastered.TheEndRemastered;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.METAL).requiresTool()));

    public static final Block END_MULCH = registerBlock("end_mulch",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.GRASS)));

    public static final Block END_MULCH_BRICKS = registerBlock("end_mulch_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.MUD_BRICKS).requiresTool()));


    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.STONE).requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheEndRemastered.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheEndRemastered.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TheEndRemastered.LOGGER.info("Registering Mod Blocks for" + TheEndRemastered.MOD_ID);
    }
}
