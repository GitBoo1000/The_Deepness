package com.boo.deepdark.item;

import com.boo.deepdark.TheDeepness;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SCULLITE = registerItem("scullite", new Item(new Item.Settings()));
    public static final Item RAW_SCULLITE = registerItem("raw_scullite", new Item(new Item.Settings()));
    public static final Item PROCESSED_SCULLITE_CRYSTAL = registerItem("processed_scullite_crystal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
     return Registry.register(Registries.ITEM, Identifier.of(TheDeepness.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheDeepness.LOGGER.info("Registering Mod Items for " + TheDeepness.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SCULLITE);
            entries.add(RAW_SCULLITE);
            entries.add(PROCESSED_SCULLITE_CRYSTAL);
        });
    }
}