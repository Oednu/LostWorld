package net.oednu.lostworld.core;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oednu.lostworld.custom.Bedrockforgedlog;

import static net.minecraft.core.registries.BuiltInRegistries.REGISTRY;
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
            () -> new DoorBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).noOcclusion().strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE), BlockSetType.IRON));

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
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).noOcclusion().explosionResistance(1000000).mapColor(MapColor.NONE), BlockSetType.IRON));

    public static final RegistryObject<Block> BEDROCKFORGEDGLASS = BLOCKS.register("bedrockforgedglass",
            () -> new GlassBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).noOcclusion().strength(-1).explosionResistance(1000000).mapColor(MapColor.NONE)));

    public static final RegistryObject<Block> BEDROCKFORGEDLOG = BLOCKS.register("bedrockforgedlog", () -> new Bedrockforgedlog());

}
