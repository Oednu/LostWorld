package net.oednu.lostworld.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oednu.lostworld.LostWorldMod;
import net.oednu.lostworld.core.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LostWorldMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


        blockWithItem(ModBlocks.BEDROCKFORGEDBRICKS);
        blockWithItem(ModBlocks.BEDROCKFORGEDGLASS);
        blockWithItem(ModBlocks.BEDROCKFORGEDPLANK);
        blockWithItem(ModBlocks.BRONZEBLOCK);
        blockWithItem(ModBlocks.STEELBLOCK);
        blockWithItem(ModBlocks.CHORUSCOAL_ORE);
        blockWithItem(ModBlocks.STONEFORGEDPLANKS);
        blockWithItem(ModBlocks.OBSIDIANFORGEDBRICKS);
        blockWithItem(ModBlocks.OBSIDIANFORGEDPLANKS);
        blockWithItem(ModBlocks.STONEBRICKSLIGHT);
        blockWithItem(ModBlocks.MOSSYSTONEBRICKSLIGHT);
        blockWithItem(ModBlocks.OBSIDIANFORGEDBRICKSLIGHT);
        blockWithItem(ModBlocks.GOLDFORGEDBRICKS);

        stairsBlock(((StairBlock) ModBlocks.BEDROCKFORGEDBRICKSSTAIRS.get()), blockTexture(ModBlocks.BEDROCKFORGEDBRICKS.get()));
        stairsBlock(((StairBlock) ModBlocks.BEDROCKFORGEDSTAIRS.get()), blockTexture(ModBlocks.BEDROCKFORGEDPLANK.get()));
        stairsBlock(((StairBlock) ModBlocks.STONEFORGEDSTAIRS.get()), blockTexture(ModBlocks.STONEFORGEDPLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.OBSIDIANFORGEDPLANKSSTAIRS.get()), blockTexture(ModBlocks.OBSIDIANFORGEDPLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.OBSIDIANFORGEDBRICKSSTAIRS.get()), blockTexture(ModBlocks.OBSIDIANFORGEDBRICKS.get()));

        slabBlock(((SlabBlock) ModBlocks.BEDROCKFORGEDSLAB.get()), blockTexture(ModBlocks.BEDROCKFORGEDPLANK.get()), blockTexture(ModBlocks.BEDROCKFORGEDPLANK.get()));
        slabBlock(((SlabBlock) ModBlocks.BEDROCKFORGEDBRICKSLAB.get()), blockTexture(ModBlocks.BEDROCKFORGEDBRICKS.get()), blockTexture(ModBlocks.BEDROCKFORGEDBRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.STONEFORGEDSLAB.get()), blockTexture(ModBlocks.STONEFORGEDPLANKS.get()), blockTexture(ModBlocks.STONEFORGEDPLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.OBSIDIANFORGEDBRICKSSLAB.get()), blockTexture(ModBlocks.OBSIDIANFORGEDBRICKS.get()), blockTexture(ModBlocks.OBSIDIANFORGEDBRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.OBSIDIANFORGEDPLANKSSLAB.get()), blockTexture(ModBlocks.OBSIDIANFORGEDPLANKS.get()), blockTexture(ModBlocks.OBSIDIANFORGEDPLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.BEDROCKFORGEDBRICKSBUTTON.get()), blockTexture(ModBlocks.BEDROCKFORGEDBRICKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.BEDROCKFORGEDFENCE.get()), blockTexture(ModBlocks.BEDROCKFORGEDPLANK.get()));

        wallBlock(((WallBlock) ModBlocks.BEDROCKFORGEDBRICKSWALL.get()), blockTexture(ModBlocks.BEDROCKFORGEDBRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.BEDROCKFORGEDWALL.get()), blockTexture(ModBlocks.BEDROCKFORGEDPLANK.get()));
        wallBlock(((WallBlock) ModBlocks.STONEFORGEDWALL.get()), blockTexture(ModBlocks.STONEFORGEDPLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.OBSIDIANFORGEDBRICKSWALL.get()), blockTexture(ModBlocks.OBSIDIANFORGEDBRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.OBSIDIANFORGEDPLANKSWALL.get()), blockTexture(ModBlocks.OBSIDIANFORGEDPLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.BEDROCKFORGEDBRICKSDOOR.get()), modLoc("block/bedrockforgeddoor_bottom"), modLoc("block/bedrockforgeddoor_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.GRANDDOOR.get()), modLoc("block/granddoor_bottom"), modLoc("block/granddoor_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.BEDROCKFORGEDTRAPDOOR.get()), modLoc("block/bedrockforgedplank"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.STONEFORGEDTRAPDOOR.get()), modLoc("block/stoneforgedplanks"), true, "cutout");

        logBlock((RotatedPillarBlock) ModBlocks.BEDROCKFORGEDLOG.get());

        blockItem(ModBlocks.BEDROCKFORGEDLOG);


    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(LostWorldMod.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
