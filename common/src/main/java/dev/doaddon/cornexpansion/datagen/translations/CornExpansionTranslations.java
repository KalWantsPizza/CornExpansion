package dev.doaddon.cornexpansion.datagen.translations;

import dev.doaddon.cornexpansion.datagen.advancements.CornExpansionAdvancements;
import dev.doaddon.cornexpansion.registry.CornExpansionCreativeTabs;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import dev.doaddon.cornexpansion.registry.CornExpansionTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class CornExpansionTranslations extends FabricLanguageProvider {
    public CornExpansionTranslations(FabricDataOutput output) {
        super(output, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder tb) {
        // Items
        tb.add(CornExpansionObjects.POPCORN.get(), "Popcorn");
        tb.add(CornExpansionObjects.SWEET_POPCORN.get(), "Sweet Popcorn");
        tb.add(CornExpansionObjects.BUTTERY_POPCORN.get(), "Buttery Popcorn");
        tb.add(CornExpansionObjects.CHEESY_POPCORN.get(), "Cheesy Popcorn");
        tb.add(CornExpansionObjects.CANDIED_POPCORN.get(), "Candied Popcorn");
        tb.add(CornExpansionObjects.CORN_ON_THE_COB.get(), "Corn On The Cob");

        tb.add(CornExpansionObjects.CORN_DOUGH.get(), "Corn Dough");
        tb.add(CornExpansionObjects.CORN_FLOUR.get(), "Corn Flour");
        tb.add(CornExpansionObjects.DRIED_CORN.get(), "Dried Corn");
        tb.add(CornExpansionObjects.CORNMEAL.get(), "Cornmeal");
        tb.add(CornExpansionObjects.DRIED_KERNELS.get(), "Dried Kernels");
        tb.add(CornExpansionObjects.CORN_SYRUP.get(), "Corn Syrup");

        tb.add(CornExpansionObjects.GRILLED_CORN.get(), "Grilled Corn");
        tb.add(CornExpansionObjects.GRANDMAS_CORNBREAD.get(), "Grandma's Cornbread");
        tb.add(CornExpansionObjects.CORN_SYRUP_COOKIE.get(), "Corn Syrup Cookie");

        tb.add(CornExpansionObjects.POLENTA.get(), "Polenta");
        tb.add(CornExpansionObjects.SWEET_POLENTA.get(), "Sweet Polenta");
        tb.add(CornExpansionObjects.BUTTERY_POLENTA.get(), "Buttery Polenta");
        tb.add(CornExpansionObjects.CHEESY_POLENTA.get(), "Cheesy Polenta");

        // Blocks
        tb.add(CornExpansionObjects.POPCORN_TIN_BLOCK.get(), "Popcorn Tin");
        tb.add(CornExpansionObjects.SWEET_POPCORN_TIN_BLOCK.get(), "Sweet Popcorn Tin");
        tb.add(CornExpansionObjects.BUTTERY_POPCORN_TIN_BLOCK.get(), "Buttery Popcorn Tin");
        tb.add(CornExpansionObjects.CHEESY_POPCORN_TIN_BLOCK.get(), "Cheesy Popcorn Tin");
        tb.add(CornExpansionObjects.CANDIED_POPCORN_TIN_BLOCK.get(), "Candied Popcorn Tin");

        // Tags
        tb.add("tags." + CornExpansionTags.BUTTER.location().toLanguageKey(), "Butter");
        tb.add("tags." + CornExpansionTags.CHEESE.location().toLanguageKey(), "Cheese");
        tb.add("tags." + CornExpansionTags.CORN.location().toLanguageKey(), "Corn");
        tb.add("tags." + CornExpansionTags.DRIED_CORN.location().toLanguageKey(), "Dried Corn");
        tb.add("tags." + CornExpansionTags.CANDIED_INGREDIENT.location().toLanguageKey(), "Candied Ingredient");
        tb.add("tags." + CornExpansionTags.SWEET_INGREDIENT.location().toLanguageKey(), "Sweet Ingredient");

        tb.add("tags." + CornExpansionTags.POPCORN.location().toLanguageKey(), "Popcorn");

        tb.add("tags." + CornExpansionTags.FLOUR_FABRIC.location().toLanguageKey(), "Flour");
        tb.add("tags." + CornExpansionTags.FLOUR_FORGE.location().toLanguageKey(), "Flour");

        // Creative tab
        tb.add(CornExpansionCreativeTabs.CORNEXPANSION_TAB.getKey(), "Corn Expansion");

        // Advancements
        tb.add("advancements." + CornExpansionAdvancements.ROOT_ADVANCEMENT.getId().toLanguageKey() + ".title", "Fun is Just Around the CORNer");
        tb.add("advancements." + CornExpansionAdvancements.ROOT_ADVANCEMENT.getId().toLanguageKey() + ".description", "Thanks for downloading Corn Expansion !");
        tb.add("advancements." + CornExpansionAdvancements.GET_POPCORN_ADVANCEMENT.getId().toLanguageKey() + ".title", "Always go out With A \"Pop\"");
        tb.add("advancements." + CornExpansionAdvancements.GET_POPCORN_ADVANCEMENT.getId().toLanguageKey() + ".description", "Make Popcorn by cooking Corn Kernels");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POPCORN_VARIANT_ADVANCEMENT.getId().toLanguageKey() + ".title", "Now you're Popping Off !");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POPCORN_VARIANT_ADVANCEMENT.getId().toLanguageKey() + ".description", "Craft all four variants of Popcorn");
        tb.add("advancements." + CornExpansionAdvancements.GET_POLENTA_ADVANCEMENT.getId().toLanguageKey() + ".title", "Steam-Powered Corn");
        tb.add("advancements." + CornExpansionAdvancements.GET_POLENTA_ADVANCEMENT.getId().toLanguageKey() + ".description", "Boil Cornmeal in a stove to make Polenta");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POLENTA_VARIANT_ADVANCEMENT.getId().toLanguageKey() + ".title", "Polenta of Flavors");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POLENTA_VARIANT_ADVANCEMENT.getId().toLanguageKey() + ".description", "Craft all three variants of Polenta");
        tb.add("advancements." + CornExpansionAdvancements.DRINK_CORN_SYRUP.getId().toLanguageKey() + ".title", "Corny Situation");
        tb.add("advancements." + CornExpansionAdvancements.DRINK_CORN_SYRUP.getId().toLanguageKey() + ".description", "Drink Corn Syrup");
        tb.add("advancements." + CornExpansionAdvancements.COOK_KERNELS_ON_CAMPFIRE.getId().toLanguageKey() + ".title", "These are not Marshmallows !");
        tb.add("advancements." + CornExpansionAdvancements.COOK_KERNELS_ON_CAMPFIRE.getId().toLanguageKey() + ".description", "Cook Popcorn using a Campfire");
    }
}