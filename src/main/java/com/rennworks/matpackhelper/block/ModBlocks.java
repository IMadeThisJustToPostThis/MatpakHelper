package com.rennworks.matpackhelper.block;

import com.rennworks.matpackhelper.MatpakHelper;
import com.rennworks.matpackhelper.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MatpakHelper.MODID);

    // block registries
    public static final RegistryObject<Block> RAWTUNGSTEN_BRICKS = registerBlock("raw_tungsten_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(5.0f, 6.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // stair registries

    public static final RegistryObject<Block> RAWTUNGSTEN_BRICKSTAIRS = registerBlock("raw_tungsten_brick_stairs",
            () -> new StairBlock(RAWTUNGSTEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(RAWTUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // slab registries

    // register methods
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
