package net.elchi.omniamod.item;

import net.elchi.omniamod.OmniaMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_DIAMOND = registerItem("pink_diamond", new Item(new Item.Settings()));
    public static final Item RAW_PINK_DIAMOND = registerItem("raw_pink_diamond", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OmniaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OmniaMod.LOGGER.info("Registering Mod Items for " + OmniaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_DIAMOND);
            fabricItemGroupEntries.add(RAW_PINK_DIAMOND);
        });
    }
}
