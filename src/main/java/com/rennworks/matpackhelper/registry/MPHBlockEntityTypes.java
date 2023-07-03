package com.rennworks.matpackhelper.registry;

import com.rennworks.matpackhelper.MatpakHelper;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MPHBlockEntityTypes {

    public static final DeferredRegister<BlockEntityType<?>> TILES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MatpakHelper.MODID);

    public static void register(IEventBus eventBus) {
        TILES.register(eventBus);
    }

}
