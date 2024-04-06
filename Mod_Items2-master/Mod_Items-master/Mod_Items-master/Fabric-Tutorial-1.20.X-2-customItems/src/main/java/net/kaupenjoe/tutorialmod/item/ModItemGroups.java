package net.kaupenjoe.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MITHRIL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "mithril"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.MITHRIL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MITHRIL);
                        entries.add(ModItems.RAW_MITHRIL);
                        entries.add(ModItems.SOFT_IRON);
                        entries.add(ModItems.HARD_IRON);
                        entries.add(ModItems.STEEL);
                        entries.add(ModItems.IMPURE_STEEL);
                        entries.add(ModItems.BRONZE);



                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
