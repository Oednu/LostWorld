package net.oednu.lostworld.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import net.oednu.lostworld.LostWorldMod;
import net.oednu.lostworld.core.ModBlocks;


import static net.minecraft.data.worldgen.features.FeatureUtils.register;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_CHORUSCOAL_ORE_KEY = registerKey("end_choruscoal_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?,?>> context) {
        RuleTest endstoneReplaceable = new BlockMatchTest(Blocks.END_STONE);

    register(context, END_CHORUSCOAL_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceable,
            ModBlocks.CHORUSCOAL_ORE.get().defaultBlockState(), 5));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(LostWorldMod.MODID, name));

    }
}
