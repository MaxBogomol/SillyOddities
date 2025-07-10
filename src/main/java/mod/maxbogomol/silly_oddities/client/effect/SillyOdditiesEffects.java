package mod.maxbogomol.silly_oddities.client.effect;

import mod.maxbogomol.fluffy_fur.client.particle.GenericParticle;
import mod.maxbogomol.fluffy_fur.client.particle.ParticleBuilder;
import mod.maxbogomol.fluffy_fur.client.particle.data.ColorParticleData;
import mod.maxbogomol.fluffy_fur.client.particle.data.GenericParticleData;
import mod.maxbogomol.fluffy_fur.client.particle.data.SpinParticleData;
import mod.maxbogomol.fluffy_fur.common.easing.Easing;
import mod.maxbogomol.fluffy_fur.registry.client.FluffyFurParticles;
import mod.maxbogomol.silly_oddities.config.SillyOdditiesClientConfig;
import mod.maxbogomol.silly_oddities.registry.common.levelgen.SillyOdditiesBiomeTags;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;

import java.awt.*;
import java.util.Random;
import java.util.function.Consumer;

public class SillyOdditiesEffects {

    public static Color fireflyColor = new Color(204, 255, 88);

    public static Random random = new Random();

    public static void firefliesAmbientEffect(Player player) {
        Level level = player.level();
        if (SillyOdditiesClientConfig.FIREFLIES_AMBIENT_EFFECT.get()) {
            if (level.getBiome(player.blockPosition()).is(SillyOdditiesBiomeTags.FIREFLIES_AMBIENT)) {
                ClientLevel clientLevel = Minecraft.getInstance().level;
                if (clientLevel.getBrightness(LightLayer.SKY, player.blockPosition()) >= 10 && clientLevel.getStarBrightness(0) > 0.1f) {
                    if (random.nextFloat() < 0.1) {
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
                                .flatRandomOffset(15, 10, 15)
                                .randomVelocity(0.15f)
                                .spawn(level, player.position().add(0, 5, 0));
                    }
                }
            }
        }
    }
}
