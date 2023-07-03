package com.rennworks.matpackhelper.block.entity;

import com.rennworks.matpackhelper.registry.MPHBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MPHBlastFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    public MPHBlastFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(MPHBlockEntityTypes.DEEPSLATE_BLAST_FURNACE.get(), pos, state, RecipeType.BLASTING);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.blast_furnace");
    }

    @Override
    protected int getBurnDuration(ItemStack itemStack) {
        return super.getBurnDuration(itemStack) / 2;
    }

    protected AbstractContainerMenu createMenu(int recipeBook, Inventory inventory) {
        return new BlastFurnaceMenu(recipeBook, inventory, this, this.dataAccess);
    }
}
