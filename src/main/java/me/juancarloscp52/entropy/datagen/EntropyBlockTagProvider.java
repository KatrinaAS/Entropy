package me.juancarloscp52.entropy.datagen;

import java.util.concurrent.CompletableFuture;

import me.juancarloscp52.entropy.EntropyTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class EntropyBlockTagProvider extends BlockTagProvider {
    public EntropyBlockTagProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(EntropyTags.NOT_REPLACED_BY_EVENTS).add(Blocks.BEDROCK, Blocks.END_PORTAL, Blocks.END_PORTAL_FRAME);
        getOrCreateTagBuilder(EntropyTags.IGNORED_BY_MIDAS_TOUCH).addTag(EntropyTags.NOT_REPLACED_BY_EVENTS).add(Blocks.AIR,
                Blocks.GOLD_BLOCK,
                Blocks.GOLD_ORE,
                Blocks.RAW_GOLD_BLOCK,
                Blocks.NETHER_GOLD_ORE);
        getOrCreateTagBuilder(EntropyTags.VOID_SIGHT_BREAKS).add(Blocks.CHEST,
                Blocks.TRAPPED_CHEST,
                Blocks.BARREL,
                Blocks.FURNACE,
                Blocks.BLAST_FURNACE,
                Blocks.SMOKER);
    }
}
