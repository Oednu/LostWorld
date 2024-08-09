package net.oednu.lostworld.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.oednu.lostworld.core.ModToolTiers;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ForgeHammerItem extends AxeItem {
    public ForgeHammerItem(Properties properties) {
        super(ModToolTiers.STEEL, 5, 2,  new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1).defaultDurability(ModToolTiers.STEEL.getUses()));
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lostworld.forgehammer"));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lostworld.shift"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
