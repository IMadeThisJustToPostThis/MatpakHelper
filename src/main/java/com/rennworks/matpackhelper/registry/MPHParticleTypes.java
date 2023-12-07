package com.rennworks.matpackhelper.registry;

import java.util.function.Function;

import com.rennworks.matpackhelper.MatpakHelper;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MPHParticleTypes {

    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MatpakHelper.MODID);

    //public static final RegistryObject<SimpleParticleType> DRAGON_FIRE_FLAME =
    //        PARTICLE_TYPES.register("dragon_fire_particle", () -> new SimpleParticleType(false));

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
