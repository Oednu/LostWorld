package net.oednu.lostworld.core;

import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oednu.lostworld.custom.ForgeHammerItem;
import net.oednu.lostworld.custom.FuelItem;
import net.oednu.lostworld.custom.KeyItem;

import static net.oednu.lostworld.LostWorldMod.MODID;
import static net.oednu.lostworld.core.ModBlocks.*;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);


    //Blocks


    public static final RegistryObject<Item> BEDROCKFORGEDBRICKS_ITEM = ITEMS.register("bedrockforgedbricks",
            () -> new BlockItem(BEDROCKFORGEDBRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDBRICKSSLAB_ITEM = ITEMS.register("bedrockforgedbricksslab",
            () -> new BlockItem(BEDROCKFORGEDBRICKSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDBRICKSSTAIRS_ITEM = ITEMS.register("bedrockforgedbricksstairs",
            () -> new BlockItem(BEDROCKFORGEDBRICKSSTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDBRICKSWALL_ITEM = ITEMS.register("bedrockforgedbrickswall",
            () -> new BlockItem(BEDROCKFORGEDBRICKSWALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDBRICKSBUTTON_ITEM = ITEMS.register("bedrockforgedbricksbutton",
            () -> new BlockItem(BEDROCKFORGEDBRICKSBUTTON.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDBRICKSDOOR_ITEM = ITEMS.register("bedrockforgedbricksdoor",
            () -> new BlockItem(BEDROCKFORGEDBRICKSDOOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDPLANK_ITEM = ITEMS.register("bedrockforgedplank",
            () -> new BlockItem(BEDROCKFORGEDPLANK.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDSLAB_ITEM = ITEMS.register("bedrockforgedslab",
            () -> new BlockItem(BEDROCKFORGEDSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDSTAIRS_ITEM = ITEMS.register("bedrockforgedstairs",
            () -> new BlockItem(BEDROCKFORGEDSTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDWALL_ITEM = ITEMS.register("bedrockforgedwall",
            () -> new BlockItem(BEDROCKFORGEDWALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDFENCE_ITEM = ITEMS.register("bedrockforgedfence",
            () -> new BlockItem(BEDROCKFORGEDFENCE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDTRAPDOOR_ITEM = ITEMS.register("bedrockforgedtrapdoor",
            () -> new BlockItem(BEDROCKFORGEDTRAPDOOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDLOG_ITEM = ITEMS.register("bedrockforgedlog",
     () -> new BlockItem(BEDROCKFORGEDLOG.get(), new Item.Properties()));

    public static final RegistryObject<Item> BEDROCKFORGEDGLASS_ITEM = ITEMS.register("bedrockforgedglass",
            () -> new BlockItem(BEDROCKFORGEDGLASS.get(), new Item.Properties()));

    //Items
    public static final RegistryObject<Item> STEEL_INGOT_ITEM = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEELBLOCK_ITEM = ITEMS.register("steelblock",
            () -> new BlockItem(STEELBLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT_ITEM = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZEBLOCK_ITEM = ITEMS.register("bronzeblock",
            () -> new BlockItem(BRONZEBLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> SHADDERIRON_ITEM = ITEMS.register("shadderiron",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHADDERGOLD_ITEM = ITEMS.register("shaddergold",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHADDERCOPPER_ITEM = ITEMS.register("shaddercopper",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHADDERNETHERITE_ITEM = ITEMS.register("shaddernetherite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHADDERSTEEL_ITEM = ITEMS.register("shaddersteel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHADDERBRONZE_ITEM = ITEMS.register("shadderbronze",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHADDERDIAMOND_ITEM = ITEMS.register("shadderdiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHADDEREMERALD_ITEM = ITEMS.register("shadderemerald",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMALG_ITEM = ITEMS.register("amalg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHORUSCOAL_ORE_ITEM = ITEMS.register("end_choruscoal_ore",
            () -> new BlockItem(CHORUSCOAL_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHORUSSHARD_ITEM = ITEMS.register("chorusshard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHORUSCOAL_ITEM = ITEMS.register("choruscoal",
            () -> new FuelItem(new Item.Properties(), 24000));

    public static final RegistryObject<Item> COMPRESSEDCHORUSCOAL_ITEM = ITEMS.register("compressedchoruscoal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEELBEAM_ITEM = ITEMS.register("steelbeam",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>REINFORCEDSTEELBEAM_ITEM = ITEMS.register("reinforcedsteelbeam",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>DYINGLIGHTS_MUSICDISC = ITEMS.register("dyinglights_musicdisc",
            () -> new RecordItem(8, ModSounds.DYINGLIGHTS_MUSICDISC, new Item.Properties().rarity(Rarity.RARE).stacksTo(1), 3020));

    public static final RegistryObject<Item> FORGEHEAD_ITEM = ITEMS.register("forgehead",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FORGEHAMMER_ITEM = ITEMS.register("forgehammer",
        () -> new ForgeHammerItem(new Item.Properties()));

    public static final RegistryObject<Item> GREYKEY_ITEM = ITEMS.register("greykey",
            () -> new KeyItem(new Item.Properties()));


    ///Stone forged blocks

    public static final RegistryObject<Item> STONEFORGEDPLANKS_ITEM = ITEMS.register("stoneforgedplanks",
            () -> new BlockItem(STONEFORGEDPLANKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> STONEFORGEDSLAB_ITEM = ITEMS.register("stoneforgedslab",
            () -> new BlockItem(STONEFORGEDSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> STONEFORGEDSTAIRS_ITEM = ITEMS.register("stoneforgedstairs",
            () -> new BlockItem(STONEFORGEDSTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> STONEFORGEDWALL_ITEM = ITEMS.register("stoneforgedwall",
            () -> new BlockItem(STONEFORGEDWALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> STONEFORGEDTRAPDOOR_ITEM = ITEMS.register("stoneforgedtrapdoor",
            () -> new BlockItem(STONEFORGEDTRAPDOOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> STONEBRICKSLIGHT_ITEM = ITEMS.register("stonebrickslight",
            () -> new BlockItem(STONEBRICKSLIGHT.get(), new Item.Properties()));

    public static final RegistryObject<Item> MOSSYSTONEBRICKSLIGHT_ITEM = ITEMS.register("mossystonebrickslight",
            () -> new BlockItem(MOSSYSTONEBRICKSLIGHT.get(), new Item.Properties()));

    ///Obsidian forged blocks

    public static final RegistryObject<Item> OBSIDIANFORGEDBRICKS_ITEM = ITEMS.register("obsidianforgedbricks",
            () -> new BlockItem(OBSIDIANFORGEDBRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIANFORGEDBRICKSSLAB_ITEM = ITEMS.register("obsidianforgedbricksslab",
            () -> new BlockItem(OBSIDIANFORGEDBRICKSSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIANFORGEDBRICKSSTAIRS_ITEM = ITEMS.register("obsidianforgedbricksstairs",
            () -> new BlockItem(OBSIDIANFORGEDBRICKSSTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIANFORGEDBRICKSWALL_ITEM = ITEMS.register("obsidianforgedbrickswall",
            () -> new BlockItem(OBSIDIANFORGEDBRICKSWALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIANFORGEDBRICKSLIGHT_ITEM = ITEMS.register("obsidianforgedbrickslight",
            () -> new BlockItem(OBSIDIANFORGEDBRICKSLIGHT.get(), new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIANFORGEDPLANKS_ITEM = ITEMS.register("obsidianforgedplanks",
            () -> new BlockItem(OBSIDIANFORGEDPLANKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIANFORGEDPLANKSSLAB_ITEM = ITEMS.register("obsidianforgedplanksslab",
            () -> new BlockItem(OBSIDIANFORGEDPLANKSSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIANFORGEDPLANKSSTAIRS_ITEM = ITEMS.register("obsidianforgedplanksstairs",
            () -> new BlockItem(OBSIDIANFORGEDPLANKSSTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIANFORGEDPLANKSWALL_ITEM = ITEMS.register("obsidianforgedplankswall",
            () -> new BlockItem(OBSIDIANFORGEDPLANKSWALL.get(), new Item.Properties()));

}
