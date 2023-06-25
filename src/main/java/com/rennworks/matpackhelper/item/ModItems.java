package com.rennworks.matpackhelper.item;

import com.rennworks.matpackhelper.MatpakHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MatpakHelper.MODID);

    // shards
    public static final RegistryObject<Item> BLACK_CORUNDUMSHARD = ITEMS.register("black_corundum_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> BLUE_CORUNDUMSHARD = ITEMS.register("blue_corundum_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> GREEN_CORUNDUMSHARD = ITEMS.register("green_corundum_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> INDIGO_CORUNDUMSHARD = ITEMS.register("indigo_corundum_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ORANGE_CORUNDUMSHARD = ITEMS.register("orange_corundum_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> RED_CORUNDUMSHARD = ITEMS.register("red_corundum_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> VIOLET_CORUNDUMSHARD = ITEMS.register("violet_corundum_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> WHITE_CORUNDUMSHARD = ITEMS.register("white_corundum_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> YELLOW_CORUNDUMSHARD = ITEMS.register("yellow_corundum_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    // materials
    public static final RegistryObject<Item> TERRIBLECRYSTAL = ITEMS.register("terrible_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> LEATHERSTRIPS = ITEMS.register("leather_strips",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    // plating
    public static final RegistryObject<Item> IRONPLATING = ITEMS.register("iron_plating",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> DIAMONDPLATING = ITEMS.register("diamond_plating",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> TERRIBLEPLATING = ITEMS.register("terrible_plating",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    // register method
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
