package net.oednu.lostworld.event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.oednu.lostworld.LostWorldMod;

@Mod.EventBusSubscriber(modid = LostWorldMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GravityHandler {

    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {
        LivingEntity entity = event.getEntity();

        // Check if the entity is in the End dimension
        if (entity.level().dimension() == Level.END) {

            // Ensure the entity is a player
            if (entity instanceof Player player) {

                // Detect if the player has jumped by checking upward velocity
                if (player.onGround() && player.getDeltaMovement().y > 0) {
                    // Increase the jump height to simulate moonwalk
                    player.setDeltaMovement(player.getDeltaMovement().x, 1.2, player.getDeltaMovement().z); // Jump 2 blocks high
                }

                // If the player is falling, slow down the falling speed to simulate lower gravity
                double currentYVelocity = player.getDeltaMovement().y;
                if (currentYVelocity < 0) { // Only slow down if falling
                    player.setDeltaMovement(player.getDeltaMovement().x, currentYVelocity * 0.7, player.getDeltaMovement().z);
                }
            }
        }
    }
}
