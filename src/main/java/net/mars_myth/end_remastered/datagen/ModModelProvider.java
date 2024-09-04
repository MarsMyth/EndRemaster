package net.mars_myth.end_remastered.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mars_myth.end_remastered.block.ModBlocks;
import net.mars_myth.end_remastered.block.custom.EnderLampBlock;
import net.mars_myth.end_remastered.block.custom.ShadowBerryCropBlock;
import net.mars_myth.end_remastered.item.ModItems;
import net.minecraft.data.client.*;
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

    blockStateModelGenerator.registerCrop(ModBlocks.SHADOW_BERRY_CROP, ShadowBerryCropBlock.AGE, 0,1,2,3,4,5);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.END_METAL_INGOT, Models.GENERATED);
          itemModelGenerator.register(ModItems.RAW_END_METAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.COOKED_SHADOW_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHADOW_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHADOW_BERRY_JELLY, Models.GENERATED);


    }
}
