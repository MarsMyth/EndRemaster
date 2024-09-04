package net.mars_myth.end_remastered;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mars_myth.end_remastered.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class TheEndRemasteredClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHADOW_BERRY_CROP, RenderLayer.getCutout());
    }
}
