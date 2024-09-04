package net.mars_myth.end_remastered.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mars_myth.end_remastered.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.END_METAL_ORE)
                .add(ModBlocks.END_METAL_BLOCK)
                .add(ModBlocks.ENDER_LAMP)
                .add(ModBlocks.END_MULCH_BRICKS)
                .add(ModBlocks.END_MULCH)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.END_METAL_BLOCK)
                .add(ModBlocks.END_METAL_ORE)
                .add(ModBlocks.ENDER_LAMP)
                .add(ModBlocks.END_MULCH_BRICKS)
        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.END_MULCH)
        ;

    }
}
