package net.oednu.lostworld.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.oednu.lostworld.LostWorldMod;
import net.oednu.lostworld.core.ModItems;
import net.oednu.lostworld.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, LostWorldMod.MODID);
    }

    @Override
    protected void start() {

        add("chorusshard_from_shulker", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/shulker")).build() }, ModItems.CHORUSSHARD_ITEM.get()));

        add("greykey_from_end_city_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build() }, ModItems.GREYKEY_ITEM.get()));

        add("greykey_from_nether_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build() }, ModItems.GREYKEY_ITEM.get()));

        add("greykey_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build() }, ModItems.GREYKEY_ITEM.get()));


    }
}
