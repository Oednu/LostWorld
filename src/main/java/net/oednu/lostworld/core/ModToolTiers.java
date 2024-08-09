package net.oednu.lostworld.core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.oednu.lostworld.LostWorldMod;

import java.util.List;

public class ModToolTiers {
    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 50, 5f, 4.5f, 10,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT_ITEM.get())),
            new ResourceLocation(LostWorldMod.MODID, "steel"), List.of(Tiers.IRON), List.of());

}
