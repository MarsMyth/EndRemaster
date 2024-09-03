package net.mars_myth.end_remastered.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mars_myth.end_remastered.block.ModBlocks;
import net.mars_myth.end_remastered.block.custom.EnderLampBlock;
import net.mars_myth.end_remastered.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.entity.ai.brain.MemoryQuery;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_MULCH);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_MULCH_BRICKS);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.ENDER_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier =  blockStateModelGenerator.createSubModel(ModBlocks.ENDER_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.ENDER_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(EnderLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENDERITE_INGOT, Models.GENERATED);
          itemModelGenerator.register(ModItems.RAW_ENDERITE, Models.GENERATED);

    }
}
