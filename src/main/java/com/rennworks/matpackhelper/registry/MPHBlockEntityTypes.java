package com.rennworks.matpackhelper.registry;

import com.rennworks.matpackhelper.MatpakHelper;
import com.rennworks.matpackhelper.block.entity.MPHDeepslateBlastFurnaceBlockEntity;
import com.rennworks.matpackhelper.block.entity.MPHEndstoneBlastFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MPHBlockEntityTypes {

    public static final DeferredRegister<BlockEntityType<?>> TILES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MatpakHelper.MODID);

    //block entity registries
    public static final RegistryObject<BlockEntityType<MPHDeepslateBlastFurnaceBlockEntity>> DEEPSLATE_BLAST_FURNACE =
            TILES.register("deepslate_blast_furnace",
                    () -> BlockEntityType.Builder.of(MPHDeepslateBlastFurnaceBlockEntity::new,
                            MPHBlocks.DEEPSLATE_BLAST_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<MPHEndstoneBlastFurnaceBlockEntity>> ENDSTONE_BLAST_FURNACE =
            TILES.register("endstone_blast_furnace",
                    () -> BlockEntityType.Builder.of(MPHEndstoneBlastFurnaceBlockEntity::new,
                            MPHBlocks.ENDSTONE_BLAST_FURNACE.get()).build(null));

    public static void register(IEventBus eventBus) {
        TILES.register(eventBus);
    }

}
