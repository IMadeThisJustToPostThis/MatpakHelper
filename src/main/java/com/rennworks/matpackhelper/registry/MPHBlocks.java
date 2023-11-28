package com.rennworks.matpackhelper.registry;

import com.rennworks.matpackhelper.MatpakHelper;
import com.rennworks.matpackhelper.block.MPHDeepslateBlastFurnaceBlock;
import com.rennworks.matpackhelper.block.MPHEndstoneBlastFurnaceBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class MPHBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MatpakHelper.MODID);

    // block registries
    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(10.0f, 20.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_DARK_METAL_BLOCK = registerBlock("raw_dark_metal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(50.0f, 1200.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_VINTAGE_METAL_BLOCK = registerBlock("raw_vintage_metal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(3.0f, 6.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // brick registries
    public static final RegistryObject<Block> RAW_TUNGSTEN_BRICKS = registerBlock("raw_tungsten_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(RAW_TUNGSTEN_BLOCK.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_DARK_METAL_BRICKS = registerBlock("raw_dark_metal_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(RAW_DARK_METAL_BLOCK.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_VINTAGE_METAL_BRICKS = registerBlock("raw_vintage_metal_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(RAW_VINTAGE_METAL_BLOCK.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_SILVER_BRICKS = registerBlock("raw_silver_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(5.0f, 6.0f)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // stair registries
    public static final RegistryObject<Block> RAW_TUNGSTEN_BRICK_STAIRS = registerBlock("raw_tungsten_brick_stairs",
            () -> new StairBlock(RAW_TUNGSTEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(RAW_TUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_DARK_METAL_BRICK_STAIRS = registerBlock("raw_dark_metal_brick_stairs",
            () -> new StairBlock(RAW_DARK_METAL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(RAW_DARK_METAL_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_VINTAGE_METAL_BRICK_STAIRS = registerBlock("raw_vintage_metal_brick_stairs",
            () -> new StairBlock(RAW_VINTAGE_METAL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(RAW_VINTAGE_METAL_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_SILVER_BRICK_STAIRS = registerBlock("raw_silver_brick_stairs",
            () -> new StairBlock(RAW_SILVER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(RAW_SILVER_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_DEEPSLATE_STAIRS = registerBlock("smooth_deepslate_stairs",
            () -> new StairBlock(SMOOTH_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(SMOOTH_DEEPSLATE.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_END_STONE_STAIRS = registerBlock("smooth_end_stone_stairs",
            () -> new StairBlock(SMOOTH_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(SMOOTH_END_STONE.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // slab registries
    public static final RegistryObject<Block> RAW_TUNGSTEN_BRICK_SLAB = registerBlock("raw_tungsten_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(RAW_TUNGSTEN_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_DARK_METAL_BRICK_SLAB = registerBlock("raw_dark_metal_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(RAW_DARK_METAL_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_VINTAGE_METAL_BRICK_SLAB = registerBlock("raw_vintage_metal_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(RAW_VINTAGE_METAL_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_SILVER_BRICK_SLAB = registerBlock("raw_silver_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(RAW_SILVER_BRICKS.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_DEEPSLATE_SLAB = registerBlock("smooth_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(SMOOTH_DEEPSLATE.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_END_STONE_SLAB = registerBlock("smooth_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(SMOOTH_END_STONE.get())),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    // fence registries

    // fencegate registries

    // wall registries

    // blast furnace registries
    public static final RegistryObject<Block> DEEPSLATE_BLAST_FURNACE = registerBlock("deepslate_blast_furnace",
            () -> new MPHDeepslateBlastFurnaceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(3.0F,6.0F).sound(SoundType.DEEPSLATE).lightLevel(litBlockEmission(13))),
            CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> ENDSTONE_BLAST_FURNACE = registerBlock("end_stone_blast_furnace",
            () -> new MPHEndstoneBlastFurnaceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(3.0F,9.0F).lightLevel(litBlockEmission(13))),
            CreativeModeTab.TAB_DECORATIONS);

    // register methods
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return MPHItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    //emission method
    private static ToIntFunction<BlockState> litBlockEmission(int lightLevel) {
        return (isLit) -> {
            return (Boolean)isLit.getValue(BlockStateProperties.LIT) ? lightLevel : 0;
        };
    }
}
