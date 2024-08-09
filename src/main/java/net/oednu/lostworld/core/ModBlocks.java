package net.oednu.lostworld.core;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oednu.lostworld.custom.LockingDoorBlock;

import static net.oednu.lostworld.LostWorldMod.MODID;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);


    public static final RegistryObject<Block> BEDROCKFORGEDBRICKS = BLOCKS.register("bedrockforgedbricks",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BEDROCKFORGEDBRICKSLAB = BLOCKS.register("bedrockforgedbricksslab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BEDROCKFORGEDBRICKSSTAIRS = BLOCKS.register("bedrockforgedbricksstairs",
            () -> new StairBlock(() -> ModBlocks.BEDROCKFORGEDBRICKS.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE))));

    public static final RegistryObject<Block> BEDROCKFORGEDBRICKSWALL = BLOCKS.register("bedrockforgedbrickswall",
            () -> new WallBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).dynamicShape().forceSolidOn().mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BEDROCKFORGEDBRICKSBUTTON = BLOCKS.register("bedrockforgedbricksbutton",
            () -> new ButtonBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> BEDROCKFORGEDBRICKSDOOR = BLOCKS.register("bedrockforgedbricksdoor",
            () -> new LockingDoorBlock(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> BEDROCKFORGEDPLANK = BLOCKS.register("bedrockforgedplank",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BEDROCKFORGEDSLAB = BLOCKS.register("bedrockforgedslab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BEDROCKFORGEDSTAIRS = BLOCKS.register("bedrockforgedstairs",
            () -> new StairBlock(() -> ModBlocks.BEDROCKFORGEDBRICKS.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE))));

    public static final RegistryObject<Block> BEDROCKFORGEDWALL = BLOCKS.register("bedrockforgedwall",
            () -> new WallBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).dynamicShape().explosionResistance(1000000).forceSolidOn().strength(-1).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BEDROCKFORGEDFENCE = BLOCKS.register("bedrockforgedfence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BEDROCKFORGEDTRAPDOOR = BLOCKS.register("bedrockforgedtrapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).noOcclusion().explosionResistance(1000000).mapColor(MapColor.NONE), BlockSetType.OAK));

    public static final RegistryObject<Block> BEDROCKFORGEDGLASS = BLOCKS.register("bedrockforgedglass",
            () -> new GlassBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).noOcclusion().strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BEDROCKFORGEDLOG = BLOCKS.register("bedrockforgedlog",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BRONZEBLOCK = BLOCKS.register("bronzeblock",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(5).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> STEELBLOCK = BLOCKS.register("steelblock",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> CHORUSCOAL_ORE = BLOCKS.register("end_choruscoal_ore",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3).mapColor(MapColor.NONE)));


    ///stone Forged Blocks

    public static final RegistryObject<Block> STONEFORGEDPLANKS = BLOCKS.register("stoneforgedplanks",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(2).explosionResistance(6).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> STONEFORGEDSLAB = BLOCKS.register("stoneforgedslab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(2).explosionResistance(6).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> STONEFORGEDSTAIRS = BLOCKS.register("stoneforgedstairs",
            () -> new StairBlock(() -> ModBlocks.STONEFORGEDPLANKS.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(2).explosionResistance(6).mapColor(MapColor.NONE))));

    public static final RegistryObject<Block> STONEFORGEDWALL = BLOCKS.register("stoneforgedwall",
            () -> new WallBlock(BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(2).explosionResistance(6).dynamicShape().forceSolidOn().mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> STONEFORGEDTRAPDOOR = BLOCKS.register("stoneforgedtrapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(2).noOcclusion().explosionResistance(6).mapColor(MapColor.NONE), BlockSetType.OAK));

    public static final RegistryObject<Block> STONEBRICKSLIGHT = BLOCKS.register("stonebrickslight",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2).explosionResistance(6).mapColor(MapColor.NONE).lightLevel((state) -> 10)));

    public static final RegistryObject<Block> MOSSYSTONEBRICKSLIGHT = BLOCKS.register("mossystonebrickslight",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2).explosionResistance(6).mapColor(MapColor.NONE).lightLevel((state) -> 10)));

    ///obsidian Forged Blocks

    public static final RegistryObject<Block> OBSIDIANFORGEDBRICKS = BLOCKS.register("obsidianforgedbricks",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(50).explosionResistance(1200).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> OBSIDIANFORGEDBRICKSSLAB = BLOCKS.register("obsidianforgedbricksslab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(50).explosionResistance(1200).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> OBSIDIANFORGEDBRICKSSTAIRS = BLOCKS.register("obsidianforgedbricksstairs",
            () -> new StairBlock(() -> ModBlocks.STONEFORGEDPLANKS.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(50).explosionResistance(1200).mapColor(MapColor.NONE))));

    public static final RegistryObject<Block> OBSIDIANFORGEDBRICKSWALL = BLOCKS.register("obsidianforgedbrickswall",
            () -> new WallBlock(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(50).explosionResistance(1200).dynamicShape().forceSolidOn().mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> OBSIDIANFORGEDBRICKSLIGHT = BLOCKS.register("obsidianforgedbrickslight",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(50).explosionResistance(1200).mapColor(MapColor.NONE).lightLevel((state) -> 10)));

    public static final RegistryObject<Block> OBSIDIANFORGEDPLANKS = BLOCKS.register("obsidianforgedplanks",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(50).explosionResistance(1200).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> OBSIDIANFORGEDPLANKSSLAB = BLOCKS.register("obsidianforgedplanksslab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(50).explosionResistance(1200).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> OBSIDIANFORGEDPLANKSSTAIRS = BLOCKS.register("obsidianforgedplanksstairs",
            () -> new StairBlock(() -> ModBlocks.STONEFORGEDPLANKS.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(50).explosionResistance(1200).mapColor(MapColor.NONE))));

    public static final RegistryObject<Block> OBSIDIANFORGEDPLANKSWALL = BLOCKS.register("obsidianforgedplankswall",
            () -> new WallBlock(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(50).explosionResistance(1200).dynamicShape().forceSolidOn().mapColor(MapColor.NONE)));

}
