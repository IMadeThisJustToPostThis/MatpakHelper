package com.rennworks.matpackhelper.block;

import com.rennworks.matpackhelper.MatpakHelper;
import com.rennworks.matpackhelper.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
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
    public static final RegistryObject<Block> RAWTUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(10.0f, 20.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWDARKMETAL_BLOCK = registerBlock("raw_dark_metal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(50.0f, 1200.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWVINTAGEMETAL_BLOCK = registerBlock("raw_vintage_metal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(3.0f, 6.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // brick registries
    public static final RegistryObject<Block> RAWTUNGSTEN_BRICKS = registerBlock("raw_tungsten_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(10.0f, 20.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWDARKMETAL_BRICKS = registerBlock("raw_dark_metal_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(50.0f, 1200.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWVINTAGEMETAL_BRICKS = registerBlock("raw_vintage_metal_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(3.0f, 6.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWSILVER_BRICKS = registerBlock("raw_silver_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(5.0f, 6.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // stair registries
    public static final RegistryObject<Block> RAWTUNGSTEN_BRICKSTAIRS = registerBlock("raw_tungsten_brick_stairs",
            () -> new StairBlock(RAWTUNGSTEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(RAWTUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWDARKMETAL_BRICKSTAIRS = registerBlock("raw_dark_metal_brick_stairs",
            () -> new StairBlock(RAWTUNGSTEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(RAWTUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWVINTAGEMETAL_BRICKSTAIRS = registerBlock("raw_vintage_metal_brick_stairs",
            () -> new StairBlock(RAWTUNGSTEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(RAWTUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWSILVER_BRICKSTAIRS = registerBlock("raw_silver_brick_stairs",
            () -> new StairBlock(RAWTUNGSTEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(RAWTUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // slab registries
    public static final RegistryObject<Block> RAWTUNGSTEN_BRICKSLAB = registerBlock("raw_tungsten_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWTUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWDARKMETAL_BRICKSLAB = registerBlock("raw_dark_metal_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWTUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWVINTAGEMETAL_BRICKSLAB = registerBlock("raw_vintage_metal_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWTUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAWSILVER_BRICKSLAB = registerBlock("raw_silver_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWTUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // fence registries

    // fencegate registries

    // wall registries

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
