package com.rennworks.matpackhelper;

import com.mojang.logging.LogUtils;
import com.rennworks.matpackhelper.registry.MPHBlockEntityTypes;
import com.rennworks.matpackhelper.registry.MPHBlocks;
import com.rennworks.matpackhelper.registry.MPHItems;
import com.rennworks.matpackhelper.registry.MPHParticleTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MatpakHelper.MODID)
public class MatpakHelper {
    public static final String MODID = "matpakhelper";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MatpakHelper() {
        IEventBus mphEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MPHItems.register(mphEventBus);
        MPHBlocks.register(mphEventBus);
        MPHBlockEntityTypes.register(mphEventBus);
        MPHParticleTypes.register(mphEventBus);

        mphEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
