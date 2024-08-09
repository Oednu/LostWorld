package net.oednu.lostworld.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.oednu.lostworld.LostWorldMod;
import net.oednu.lostworld.core.ModBlocks;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LostWorldMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STEELBLOCK.get(),
                        ModBlocks.BRONZEBLOCK.get());




        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CHORUSCOAL_ORE.get());


        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OBSIDIANFORGEDBRICKS.get(),
                        ModBlocks.OBSIDIANFORGEDPLANKS.get(),
                        ModBlocks.OBSIDIANFORGEDBRICKSSLAB.get(),
                        ModBlocks.OBSIDIANFORGEDBRICKSSTAIRS.get(),
                        ModBlocks.OBSIDIANFORGEDBRICKSWALL.get(),
                        ModBlocks.OBSIDIANFORGEDBRICKSLIGHT.get(),
                        ModBlocks.OBSIDIANFORGEDPLANKSSLAB.get(),
                        ModBlocks.OBSIDIANFORGEDPLANKSSTAIRS.get(),
                        ModBlocks.OBSIDIANFORGEDPLANKSWALL.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STONEFORGEDPLANKS.get(),
                ModBlocks.STONEFORGEDSLAB.get(),
                ModBlocks.STONEFORGEDSTAIRS.get(),
                ModBlocks.STONEFORGEDWALL.get(),
                ModBlocks.STONEFORGEDTRAPDOOR.get());

        //this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                //.add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.BEDROCKFORGEDFENCE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.BEDROCKFORGEDBRICKSWALL.get(),
                ModBlocks.BEDROCKFORGEDWALL.get(),
                ModBlocks.STONEFORGEDWALL.get(),
                ModBlocks.OBSIDIANFORGEDBRICKSWALL.get(),
                ModBlocks.OBSIDIANFORGEDPLANKSWALL.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.STONEFORGEDPLANKS.get(),
                ModBlocks.OBSIDIANFORGEDPLANKS.get());


    }
}
