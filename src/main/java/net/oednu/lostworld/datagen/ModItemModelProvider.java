package net.oednu.lostworld.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oednu.lostworld.LostWorldMod;
import net.oednu.lostworld.core.ModBlocks;
import net.oednu.lostworld.core.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LostWorldMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.STEEL_INGOT_ITEM);
        simpleItem(ModItems.BRONZE_INGOT_ITEM);
        simpleItem(ModItems.AMALG_ITEM);
        simpleItem(ModItems.CHORUSSHARD_ITEM);
        simpleItem(ModItems.CHORUSCOAL_ITEM);
        simpleItem(ModItems.COMPRESSEDCHORUSCOAL_ITEM);
        simpleItem(ModItems.STEELBEAM_ITEM);
        simpleItem(ModItems.REINFORCEDSTEELBEAM_ITEM);
        simpleItem(ModItems.SHADDERBRONZE_ITEM);
        simpleItem(ModItems.SHADDERCOPPER_ITEM);
        simpleItem(ModItems.SHADDERIRON_ITEM);
        simpleItem(ModItems.SHADDERGOLD_ITEM);
        simpleItem(ModItems.SHADDERDIAMOND_ITEM);
        simpleItem(ModItems.SHADDEREMERALD_ITEM);
        simpleItem(ModItems.SHADDERNETHERITE_ITEM);
        simpleItem(ModItems.SHADDERSTEEL_ITEM);
        simpleItem(ModItems.DYINGLIGHTS_MUSICDISC);
        simpleItem(ModItems.FORGEHEAD_ITEM);
        simpleItem(ModItems.FORGEHAMMER_ITEM);
        simpleItem(ModItems.GREYKEY_ITEM);
        simpleItem(ModItems.GRANDKEY_ITEM);

        simpleBlockItem(ModBlocks.BEDROCKFORGEDBRICKSDOOR);
        simpleBlockItem(ModBlocks.GRANDDOOR);

        fenceItem(ModBlocks.BEDROCKFORGEDFENCE, ModBlocks.BEDROCKFORGEDPLANK);
        buttonItem(ModBlocks.BEDROCKFORGEDBRICKSBUTTON, ModBlocks.BEDROCKFORGEDBRICKS);
        wallItem(ModBlocks.BEDROCKFORGEDBRICKSWALL, ModBlocks.BEDROCKFORGEDBRICKS);
        wallItem(ModBlocks.BEDROCKFORGEDWALL, ModBlocks.BEDROCKFORGEDPLANK);
        wallItem(ModBlocks.STONEFORGEDWALL, ModBlocks.STONEFORGEDPLANKS);
        wallItem(ModBlocks.OBSIDIANFORGEDBRICKSWALL, ModBlocks.OBSIDIANFORGEDBRICKS);
        wallItem(ModBlocks.OBSIDIANFORGEDPLANKSWALL , ModBlocks.OBSIDIANFORGEDPLANKS);

        evenSimplerBlockItem(ModBlocks.BEDROCKFORGEDBRICKSLAB);
        evenSimplerBlockItem(ModBlocks.BEDROCKFORGEDSLAB);
        evenSimplerBlockItem(ModBlocks.STONEFORGEDSLAB);
        evenSimplerBlockItem(ModBlocks.OBSIDIANFORGEDBRICKSSLAB);
        evenSimplerBlockItem(ModBlocks.OBSIDIANFORGEDPLANKSSLAB);

        evenSimplerBlockItem(ModBlocks.BEDROCKFORGEDBRICKSSTAIRS);
        evenSimplerBlockItem(ModBlocks.BEDROCKFORGEDSTAIRS);
        evenSimplerBlockItem(ModBlocks.STONEFORGEDSTAIRS);
        evenSimplerBlockItem(ModBlocks.OBSIDIANFORGEDBRICKSSTAIRS);
        evenSimplerBlockItem(ModBlocks.OBSIDIANFORGEDPLANKSSTAIRS);

        trapdoorItem(ModBlocks.BEDROCKFORGEDTRAPDOOR);
        trapdoorItem(ModBlocks.STONEFORGEDTRAPDOOR);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LostWorldMod.MODID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(LostWorldMod.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(LostWorldMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(LostWorldMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(LostWorldMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LostWorldMod.MODID,"item/" + item.getId().getPath()));
    }
}
