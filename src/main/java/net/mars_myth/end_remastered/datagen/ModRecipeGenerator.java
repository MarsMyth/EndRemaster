package net.mars_myth.end_remastered.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mars_myth.end_remastered.block.ModBlocks;
import net.mars_myth.end_remastered.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> SHADOW_BERRY_SMELTABLES = List.of(ModItems.SHADOW_BERRY);
        List<ItemConvertible> END_METAL_SMELT = List.of(ModItems.RAW_END_METAL, ModBlocks.END_METAL_ORE);

        offerSmelting(exporter, SHADOW_BERRY_SMELTABLES, RecipeCategory.MISC, ModItems.COOKED_SHADOW_BERRY,
                0.4f, 200, "shadow_berry");

        offerSmelting(exporter, END_METAL_SMELT, RecipeCategory.MISC, ModItems.END_METAL_INGOT,
                0.4f, 250, "end_metal");
        offerBlasting(exporter, END_METAL_SMELT, RecipeCategory.MISC, ModItems.END_METAL_INGOT,
                0.4f, 125, "end_metal");


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SHADOW_BERRY_JELLY, 4)
                .pattern("SB")
                .pattern("SS")
                .input('S', Items.SUGAR)
                .input('B', ModItems.SHADOW_BERRY)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.SHADOW_BERRY), conditionsFromItem(ModItems.SHADOW_BERRY))
                .offerTo(exporter);



        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.END_METAL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.END_METAL_BLOCK);


    }
}
