package net.mars_myth.end_remastered.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mars_myth.end_remastered.block.ModBlocks;
import net.mars_myth.end_remastered.block.custom.ShadowBerryCropBlock;
import net.mars_myth.end_remastered.item.ModItems;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.SHADOW_BERRY_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(ShadowBerryCropBlock.AGE, 5));
        this.addDrop(ModBlocks.SHADOW_BERRY_CROP, this.cropDrops(ModBlocks.SHADOW_BERRY_CROP, ModItems.SHADOW_BERRY, ModItems.SHADOW_BERRY_SEEDS, builder));
    }
}
