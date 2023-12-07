package com.rennworks.matpackhelper.mixin;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(Items.class)
public abstract class TestMixin implements IEventBus {


}
