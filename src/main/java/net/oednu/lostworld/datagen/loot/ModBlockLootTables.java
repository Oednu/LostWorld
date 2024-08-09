package net.oednu.lostworld.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.oednu.lostworld.core.ModBlocks;
import net.oednu.lostworld.core.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.BEDROCKFORGEDBRICKS.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDBRICKSSTAIRS.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDBRICKSWALL.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDBRICKSBUTTON.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDGLASS.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDPLANK.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDSTAIRS.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDWALL.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDFENCE.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDTRAPDOOR.get());
        this.dropSelf(ModBlocks.BRONZEBLOCK.get());
        this.dropSelf(ModBlocks.STEELBLOCK.get());
        this.dropSelf(ModBlocks.STONEFORGEDPLANKS.get());
        this.dropSelf(ModBlocks.STONEFORGEDSTAIRS.get());
        this.dropSelf(ModBlocks.STONEFORGEDWALL.get());
        this.dropSelf(ModBlocks.STONEFORGEDTRAPDOOR.get());
        this.dropSelf(ModBlocks.OBSIDIANFORGEDBRICKS.get());
        this.dropSelf(ModBlocks.OBSIDIANFORGEDBRICKSSTAIRS.get());
        this.dropSelf(ModBlocks.OBSIDIANFORGEDBRICKSWALL.get());
        this.dropSelf(ModBlocks.OBSIDIANFORGEDPLANKS.get());
        this.dropSelf(ModBlocks.OBSIDIANFORGEDPLANKSSTAIRS.get());
        this.dropSelf(ModBlocks.OBSIDIANFORGEDPLANKSWALL.get());
        this.dropSelf(ModBlocks.OBSIDIANFORGEDBRICKSLIGHT.get());
        this.dropSelf(ModBlocks.BEDROCKFORGEDLOG.get());
        this.dropSelf(ModBlocks.STONEBRICKSLIGHT.get());
        this.dropSelf(ModBlocks.MOSSYSTONEBRICKSLIGHT.get());


        this.add(ModBlocks.CHORUSCOAL_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.CHORUSCOAL_ORE.get(), ModItems.CHORUSSHARD_ITEM.get()));

        this.add(ModBlocks.BEDROCKFORGEDBRICKSLAB.get(),
                block -> createSlabItemTable(ModBlocks.BEDROCKFORGEDBRICKSLAB.get()));
        this.add(ModBlocks.BEDROCKFORGEDSLAB.get(),
                block -> createSlabItemTable(ModBlocks.BEDROCKFORGEDSLAB.get()));
        this.add(ModBlocks.STONEFORGEDSLAB.get(),
                block -> createSlabItemTable(ModBlocks.STONEFORGEDSLAB.get()));
        this.add(ModBlocks.OBSIDIANFORGEDBRICKSSLAB.get(),
                block -> createSlabItemTable(ModBlocks.OBSIDIANFORGEDBRICKSSLAB.get()));
        this.add(ModBlocks.OBSIDIANFORGEDPLANKSSLAB.get(),
                block -> createSlabItemTable(ModBlocks.OBSIDIANFORGEDPLANKSSLAB.get()));

        this.add(ModBlocks.BEDROCKFORGEDBRICKSDOOR.get(),
                block -> createDoorTable(ModBlocks.BEDROCKFORGEDBRICKSDOOR.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
