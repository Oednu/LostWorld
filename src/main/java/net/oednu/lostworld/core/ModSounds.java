package net.oednu.lostworld.core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oednu.lostworld.LostWorldMod;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LostWorldMod.MODID);

        public static final RegistryObject<SoundEvent> DYINGLIGHTS_MUSICDISC = registerSoundEvent("dyinglights");





    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENT.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(LostWorldMod.MODID, name)));
    }

    public static void register(IEventBus eventBus) {SOUND_EVENT.register(eventBus);}
}
