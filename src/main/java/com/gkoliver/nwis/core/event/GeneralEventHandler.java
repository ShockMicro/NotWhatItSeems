package com.gkoliver.nwis.core.event;

import com.gkoliver.nwis.NotWhatItSeems;
import com.gkoliver.nwis.common.gui.ImposterContainer;
import com.gkoliver.nwis.core.config.NWISConfig;
import com.gkoliver.nwis.core.keybind.InverseKeybind;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid=NotWhatItSeems.MODID)
public class GeneralEventHandler {
	@SubscribeEvent
    public static void commonSetup(final FMLCommonSetupEvent event)
    {
		
    }
}
