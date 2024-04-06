package net.kaupenjoe.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MITHRIL = registerItem("mithril", new Item(new FabricItemSettings()));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new FabricItemSettings()));
    public static final Item HARD_IRON = registerItem("hard_iron", new Item(new FabricItemSettings()));
    public static final Item SOFT_IRON = registerItem("soft_iron", new Item(new FabricItemSettings()));
    public static final Item STEEL = registerItem("steel", new Item(new FabricItemSettings()));
    public static final Item IMPURE_STEEL = registerItem("impure_steel", new Item(new FabricItemSettings()));
    public static final Item BRONZE = registerItem("bronze", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(MITHRIL);
        entries.add(RAW_MITHRIL);
        entries.add(SOFT_IRON);
        entries.add(HARD_IRON);
        entries.add(STEEL);
        entries.add(BRONZE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
