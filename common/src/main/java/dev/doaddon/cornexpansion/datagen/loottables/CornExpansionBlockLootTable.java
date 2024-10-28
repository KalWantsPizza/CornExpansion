package dev.doaddon.cornexpansion.datagen.loottables;

import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class CornExpansionBlockLootTable extends FabricBlockLootTableProvider {
    public CornExpansionBlockLootTable(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
    }
}
