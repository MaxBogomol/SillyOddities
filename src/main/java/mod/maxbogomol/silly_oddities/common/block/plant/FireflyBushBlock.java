package mod.maxbogomol.silly_oddities.common.block.plant;

import mod.maxbogomol.fluffy_fur.client.particle.GenericParticle;
import mod.maxbogomol.fluffy_fur.client.particle.ParticleBuilder;
import mod.maxbogomol.fluffy_fur.client.particle.data.ColorParticleData;
import mod.maxbogomol.fluffy_fur.client.particle.data.GenericParticleData;
import mod.maxbogomol.fluffy_fur.client.particle.data.SpinParticleData;
import mod.maxbogomol.fluffy_fur.common.easing.Easing;
import mod.maxbogomol.fluffy_fur.registry.client.FluffyFurParticles;
import mod.maxbogomol.silly_oddities.config.SillyOdditiesClientConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.awt.*;
import java.util.function.Consumer;

public class FireflyBushBlock extends GrassBushBlock {

    public static Color fireflyColor = new Color(204, 255, 88);

    public FireflyBushBlock(Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        ClientLevel clientLevel = Minecraft.getInstance().level;
        if (SillyOdditiesClientConfig.FIREFLY_BUSH_EFFECT.get()) {
            if (clientLevel.getBrightness(LightLayer.SKY, pos) <= 13 || clientLevel.getStarBrightness(0) > 0.1f) {
                if (random.nextFloat() < 0.7) {
                    final Consumer<GenericParticle> randomTarget = p -> {
                        if (p.getAge() % 5 == 0 && random.nextFloat() < 0.4f) {
                            float speed = 0.1f;
                            double x = (random.nextFloat() - 0.5f) * speed;
                            double y = (random.nextFloat() - 0.5f) * speed;
                            double z = (random.nextFloat() - 0.5f) * speed;
                            p.setSpeed(p.getSpeed().subtract(x, y, z));
                        }
                    };
                    ParticleBuilder.create(FluffyFurParticles.SQUARE)
                            .setColorData(ColorParticleData.create(fireflyColor).build())
                            .setTransparencyData(GenericParticleData.create(0, 1f, 0).setEasing(Easing.SINE_IN_OUT).build())
                            .setScaleData(GenericParticleData.create(0.05f).build())
                            .setSpinData(SpinParticleData.create().randomSpin(0.001f).build())
                            .addTickActor(randomTarget)
                            .setLifetime(38, 144)
                            .flatRandomOffset(5, 5, 5)
                            .randomVelocity(0.15f)
                            .spawn(level, pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F);
                }
            }
        }
    }
}
