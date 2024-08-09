package net.oednu.lostworld.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.oednu.lostworld.LostWorldMod.MODID;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> BEDROCKFORGED = TABS.register("bedrockforged",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BEDROCKFORGEDBRICKS.get()))
                    .title(Component.translatable("creativetabs.bedrockforged"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.BEDROCKFORGEDBRICKS_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDBRICKSSLAB_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDBRICKSSTAIRS_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDBRICKSWALL_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDBRICKSBUTTON_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDBRICKSDOOR_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDPLANK_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDLOG_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDSLAB_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDSTAIRS_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDWALL_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDFENCE_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDTRAPDOOR_ITEM.get());
                        output.accept(ModItems.BEDROCKFORGEDGLASS_ITEM.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> SHARDDERD = TABS.register("shardderd",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHADDERIRON_ITEM.get()))
                    .title(Component.translatable("creativetabs.shardderd"))
                    .displayItems((parameters, output) -> {

                        output.accept(Items.IRON_INGOT);
                        //shadder
                        output.accept(ModItems.SHADDERIRON_ITEM.get());


                        output.accept(Items.GOLD_INGOT);
                        //shadder
                        output.accept(ModItems.SHADDERGOLD_ITEM.get());


                        output.accept(Items.COPPER_INGOT);
                        //shadder
                        output.accept(ModItems.SHADDERCOPPER_ITEM.get());

                        output.accept(ModItems.STEEL_INGOT_ITEM.get());
                        output.accept(ModItems.STEELBLOCK_ITEM.get());
                        //shadder
                        output.accept(ModItems.SHADDERSTEEL_ITEM.get());


                        output.accept(ModItems.BRONZE_INGOT_ITEM.get());
                        output.accept(ModItems.BRONZEBLOCK_ITEM.get());
                        //shadder
                        output.accept(ModItems.SHADDERBRONZE_ITEM.get());


                        output.accept(Items.NETHERITE_INGOT);
                        //shadder
                        output.accept(ModItems.SHADDERNETHERITE_ITEM.get());


                        output.accept(Items.DIAMOND);
                        //shadder
                        output.accept(ModItems.SHADDERDIAMOND_ITEM.get());



                        output.accept(Items.EMERALD);
                        //shadder
                        output.accept(ModItems.SHADDEREMERALD_ITEM.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BLOCKS_STUFF = TABS.register("blocks_stuff",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STONEBRICKSLIGHT_ITEM.get()))
                    .title(Component.translatable("creativetabs.blocks_stuff"))
                    .displayItems((parameters, output) -> {

                        ///stone
                        output.accept(ModItems.STONEFORGEDPLANKS_ITEM.get());
                        output.accept(ModItems.STONEFORGEDSLAB_ITEM.get());
                        output.accept(ModItems.STONEFORGEDSTAIRS_ITEM.get());
                        output.accept(ModItems.STONEFORGEDWALL_ITEM.get());
                        output.accept(ModItems.STONEFORGEDTRAPDOOR_ITEM.get());
                        output.accept(ModItems.STONEBRICKSLIGHT_ITEM.get());
                        output.accept(ModItems.MOSSYSTONEBRICKSLIGHT_ITEM.get());

                        ///obsidian
                        output.accept(ModItems.OBSIDIANFORGEDBRICKS_ITEM.get());
                        output.accept(ModItems.OBSIDIANFORGEDBRICKSSLAB_ITEM.get());
                        output.accept(ModItems.OBSIDIANFORGEDBRICKSSTAIRS_ITEM.get());
                        output.accept(ModItems.OBSIDIANFORGEDBRICKSWALL_ITEM.get());
                        output.accept(ModItems.OBSIDIANFORGEDBRICKSLIGHT_ITEM.get());
                        output.accept(ModItems.OBSIDIANFORGEDPLANKS_ITEM.get());
                        output.accept(ModItems.OBSIDIANFORGEDPLANKSSLAB_ITEM.get());
                        output.accept(ModItems.OBSIDIANFORGEDPLANKSSTAIRS_ITEM.get());
                        output.accept(ModItems.OBSIDIANFORGEDPLANKSWALL_ITEM.get());

                        //ore
                        output.accept(ModItems.CHORUSCOAL_ORE_ITEM.get());



                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> TOOLS = TABS.register("tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FORGEHAMMER_ITEM.get()))
                    .title(Component.translatable("creativetabs.tools"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.CHORUSSHARD_ITEM.get());
                        output.accept(ModItems.CHORUSCOAL_ITEM.get());
                        output.accept(ModItems.COMPRESSEDCHORUSCOAL_ITEM.get());

                        output.accept(ModItems.STEELBEAM_ITEM.get());
                        output.accept(ModItems.REINFORCEDSTEELBEAM_ITEM.get());
                        output.accept(ModItems.FORGEHEAD_ITEM.get());
                        output.accept(ModItems.FORGEHAMMER_ITEM.get());
                        output.accept(ModItems.GREYKEY_ITEM.get());



                    })
                    .build());

}
