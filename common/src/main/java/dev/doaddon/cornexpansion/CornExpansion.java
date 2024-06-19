package dev.doaddon.cornexpansion;

import dev.doaddon.cornexpansion.registry.CornExpansionCreativeTabs;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import dev.doaddon.cornexpansion.registry.CornExpansionBlocks;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CornExpansion {
    public static final String MOD_ID = "cornexpansion";

    public static final Logger LOGGER = LoggerFactory.getLogger("[Let's Do Addon] Corn Expansion");

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static void init() {
        CornExpansionBlocks.init();
        CornExpansionObjects.init();
        CornExpansionCreativeTabs.init();

        LOGGER.info("Finished initializing !");
    }
}
