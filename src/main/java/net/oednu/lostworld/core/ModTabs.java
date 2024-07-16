package net.oednu.lostworld.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.oednu.lostworld.LostWorldMod;

import static net.oednu.lostworld.core.ModItems.*;


public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LostWorldMod.MODID);

    public static final RegistryObject<CreativeModeTab> BEDROCKFORGED = TABS.register("bedrockforged", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> BEDROCKFORGEDBRICKS_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(BEDROCKFORGEDBRICKS_ITEM.get());
                output.accept(BEDROCKFORGEDBRICKSSLAB_ITEM.get());
                output.accept(BEDROCKFORGEDBRICKSSTAIRS_ITEM.get());
                output.accept(BEDROCKFORGEDBRICKSWALL_ITEM.get());
                output.accept(BEDROCKFORGEDBRICKSBUTTON_ITEM.get());
                output.accept(BEDROCKFORGEDBRICKSDOOR_ITEM.get());
                output.accept(BEDROCKFORGEDPLANK_ITEM.get());
                output.accept(BEDROCKFORGEDLOG_ITEM.get());
                output.accept(BEDROCKFORGEDSLAB_ITEM.get());
                output.accept(BEDROCKFORGEDSTAIRS_ITEM.get());
                output.accept(BEDROCKFORGEDWALL_ITEM.get());
                output.accept(BEDROCKFORGEDFENCE_ITEM.get());
                output.accept(BEDROCKFORGEDTRAPDOOR_ITEM.get());
                output.accept(BEDROCKFORGEDGLASS_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());


}
