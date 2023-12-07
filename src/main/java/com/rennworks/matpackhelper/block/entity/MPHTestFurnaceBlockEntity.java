package com.rennworks.matpackhelper.block.entity;

import com.rennworks.matpackhelper.registry.MPHBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MPHTestFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    public MPHTestFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(MPHBlockEntityTypes.TEST_FURNACE.get(), pos, state, RecipeType.SMELTING);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.test_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int recipeBook, Inventory inventory) {
        return new FurnaceMenu(recipeBook, inventory, this, this.dataAccess);
    }
}
