package com.rennworks.matpackhelper.block;

import com.rennworks.matpackhelper.block.entity.MPHBlastFurnaceBlockEntity;
import com.rennworks.matpackhelper.registry.MPHBlastFurnaces;
import com.rennworks.matpackhelper.registry.MPHBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import vazkii.arl.util.RegistryHelper;
import vazkii.quark.base.block.IQuarkBlock;
import vazkii.quark.base.module.QuarkModule;

import javax.annotation.Nullable;
import java.util.function.BooleanSupplier;

public class MPHBlastFurnaceBlock extends AbstractFurnaceBlock implements IQuarkBlock {

    private final QuarkModule module;

    public MPHBlastFurnaceBlock(String type, QuarkModule module, Properties props) {
        super(props);

        RegistryHelper.registerBlock(this, type + "_blast_furnace");
        RegistryHelper.setCreativeTab(this, CreativeModeTab.TAB_DECORATIONS);

        this.module = module;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MPHBlastFurnaceBlockEntity(pos, state);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level world, BlockState state, BlockEntityType<T> blockEntity) {
        return createFurnaceTicker(world, blockEntity, MPHBlastFurnaces.blockEntityType);
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof MPHBlastFurnaceBlockEntity) {
            player.openMenu((MenuProvider)blockEntity);
            player.awardStat(Stats.INTERACT_WITH_BLAST_FURNACE);
        }
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if ((Boolean)state.getValue(LIT)) {
            double $$4 = (double)pos.getX() + 0.5;
            double $$5 = (double)pos.getY();
            double $$6 = (double)pos.getZ() + 0.5;
            if (random.nextDouble() < 0.1) {
                level.playLocalSound($$4, $$5, $$6, SoundEvents.BLASTFURNACE_FIRE_CRACKLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction $$7 = (Direction)state.getValue(FACING);
            Direction.Axis $$8 = $$7.getAxis();
            double $$9 = 0.52;
            double $$10 = random.nextDouble() * 0.6 - 0.3;
            double $$11 = $$8 == Axis.X ? (double)$$7.getStepX() * $$9 : $$10;
            double $$12 = random.nextDouble() * 9.0 / 16.0;
            double $$13 = $$8 == Axis.Z ? (double)$$7.getStepZ() * $$9 : $$10;
            level.addParticle(ParticleTypes.SMOKE, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public QuarkModule getModule() {
        return module;
    }

    @Override
    public IQuarkBlock setCondition(BooleanSupplier condition) {
        return this;
    }

    @Override
    public boolean doesConditionApply() {
        return true;
    }
}
