package com.rennworks.matpackhelper.particle.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;

public class MPHDragonFireFlame extends TextureSheetParticle {

    // create the particle
    protected MPHDragonFireFlame(ClientLevel level, double xCoord, double yCoord, double zCoord,
                                 SpriteSet spriteSet, double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.friction = 0.8f;
        this.xd = xd;
        this.yd = yd;
        this.zd = zd;
        this.quadSize *= 0.85F;
        this.lifetime = 20;
        this.setSpriteFromAge(spriteSet);

        this.rCol = 1f;
        this.gCol = 1f;
        this.bCol = 1f;
    }

    // add a fadeout to the end of the particles life
    @Override
    public void tick() {
        super.tick();
        fadeOut();
    }
    private void fadeOut() {
        this.alpha = (-(1/(float)lifetime)*age+1);
    }

    // set the particle render type
    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    // set the created particle
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Provider(SpriteSet spriteSet) {
            this.sprites = spriteSet;
        }

        public Particle createParticle(SimpleParticleType particleType, ClientLevel level,
                                       double x, double y, double z,
                                       double dx, double dy, double dz) {
            return new MPHDragonFireFlame(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }
}
