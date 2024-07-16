package net.oednu.lostworld.core;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.oednu.lostworld.LostWorldMod.MODID;
import static net.oednu.lostworld.core.ModBlocks.*;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

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



}
