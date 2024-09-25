package net.oednu.lostworld.enchantment;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.List;

public class SiphonEnchantment extends Enchantment {

    public SiphonEnchantment(Rarity rarity, EnchantmentCategory category, EquipmentSlot... slots) {
        super(rarity, category, slots);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean canEnchant(ItemStack stack) {
        // Only allow Siphon enchantment on swords, axes, tridents, bows, and crossbows
        if (stack.getItem() instanceof SwordItem ||
                stack.getItem() instanceof AxeItem ||
                stack.getItem() instanceof TridentItem ||
                stack.getItem() instanceof BowItem ||
                stack.getItem() instanceof CrossbowItem) {

        }
        return false;
    }

    @Override
    protected boolean checkCompatibility(Enchantment ench) {
        return this != ench && !List.of(Enchantments.MENDING, Enchantments.UNBREAKING).contains(ench);
    }


    @Override
    public boolean isTreasureOnly() {
        // Make this enchantment treasure-only (cannot be obtained from the enchanting table)
        return true;
    }

    @Override
    public boolean isDiscoverable() {
        // Allow this enchantment to appear in loot and enchanted books
        return true;
    }

    public void onEntityDamaged(LivingEntity user, Entity target, int level, float damageDealt) {
        // Ensure the target is a living entity
        if (target instanceof LivingEntity && user instanceof Player) {
            LivingEntity targetLiving = (LivingEntity) target;

            // Calculate the siphon chance based on enchantment level
            float siphonChance = 0.15f + (level - 1) * 0.15f;

            // Apply the siphon effect based on the chance
            if (user.getCommandSenderWorld().random.nextFloat() < siphonChance) {
                user.heal(damageDealt);
            }
        }
    }
}
