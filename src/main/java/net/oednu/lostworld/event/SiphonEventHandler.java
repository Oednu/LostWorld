package net.oednu.lostworld.event;

import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.oednu.lostworld.core.ModEnchantments;

@Mod.EventBusSubscriber(modid = "lostworld")
public class SiphonEventHandler {

    @SubscribeEvent
    public static void onLivingDamage(LivingDamageEvent event) {
        DamageSource source = event.getSource();
        if (source.getEntity() instanceof Player) {
            Player player = (Player) source.getEntity();
            LivingEntity target = event.getEntity();
            ItemStack weapon = player.getMainHandItem();

            // Check if the weapon has the Siphon enchantment
            int siphonLevel = EnchantmentHelper.getItemEnchantmentLevel(ModEnchantments.SIPHON.get(), weapon);
            if (siphonLevel > 0) {
                // Calculate the siphon chance based on the level
                float siphonChance = 0.15f + (siphonLevel - 1) * 0.15f;
                float damageDealt = event.getAmount();

                // Check if siphon effect will apply based on chance
                boolean siphonWorks = player.level().random.nextFloat() < siphonChance;

                if (siphonWorks) {
                    // Calculate experience cost (damage dealt * 1.5)
                    int xpCost = Math.round(damageDealt * 2.5f);

                    // Get the total experience in points
                    int currentXp = (int) (player.experienceLevel * 100 + player.experienceProgress * 100);

                    // Check if player has enough experience
                    if (currentXp >= xpCost) {
                        // Apply siphon effect and remove experience
                        player.heal(damageDealt);

                        // Remove experience points first
                        if (player.experienceProgress * 100 >= xpCost) {
                            player.giveExperiencePoints(-xpCost);
                        } else {
                            // Remove the remainder from levels
                            int remainingXpRequired = xpCost - (int) (player.experienceProgress * 100);
                            int levelsToRemove = (remainingXpRequired + 99) / 100; // rounding up
                            player.giveExperiencePoints(-(int) (player.experienceProgress * 100));
                            player.giveExperienceLevels(-levelsToRemove);
                        }
                    } else {
                        // Not enough experience, siphon fails
                        player.displayClientMessage(Component.translatable("message.insufficient_xp"), true);
                    }
                } else {
                    // Siphon didn't work, apply half the experience cost
                    int xpCost = Math.round(damageDealt * 1.5f);
                    int currentXp = (int) (player.experienceLevel * 100 + player.experienceProgress * 100);

                    // Remove experience points first
                    if (currentXp >= xpCost) {
                        player.giveExperiencePoints(-xpCost);
                    } else {
                        // Remove the remainder from levels
                        int remainingXpRequired = xpCost - (int) (player.experienceProgress * 100);
                        int levelsToRemove = (remainingXpRequired + 99) / 100; // rounding up
                        player.giveExperiencePoints(-(int) (player.experienceProgress * 100));
                        player.giveExperienceLevels(-levelsToRemove);
                    }
                }
            }
        }
    }
}