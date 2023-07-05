package com.rennworks.matpackhelper.registry;

import com.rennworks.matpackhelper.block.MPHBlastFurnaceBlock;
import com.rennworks.matpackhelper.block.entity.MPHBlastFurnaceBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import vazkii.arl.util.RegistryHelper;
import vazkii.quark.base.module.QuarkModule;

import java.util.function.ToIntFunction;

public class MPHBlastFurnaces extends QuarkModule {
    public static BlockEntityType<MPHBlastFurnaceBlockEntity> blockEntityType;

    public static Block deepslateBlastFurnace, blackstoneBlastFurnace;

    @Override
    public void register() {
        deepslateBlastFurnace = new MPHBlastFurnaceBlock("deepslate", this, Properties.copy(Blocks.DEEPSLATE).lightLevel(litBlockEmission(13)));
        blackstoneBlastFurnace = new MPHBlastFurnaceBlock("end_stone", this, Properties.copy(Blocks.END_STONE).lightLevel(litBlockEmission(13)));

        blockEntityType = BlockEntityType.Builder.of(MPHBlastFurnaceBlockEntity::new, deepslateBlastFurnace, blackstoneBlastFurnace).build(null);
        RegistryHelper.register(blockEntityType, "variant_furnace", Registry.BLOCK_ENTITY_TYPE_REGISTRY);
    }

    private static ToIntFunction<BlockState> litBlockEmission(int lightLevel) {
        return (isLit) -> {
            return (Boolean)isLit.getValue(BlockStateProperties.LIT) ? lightLevel : 0;
        };
    }
}
