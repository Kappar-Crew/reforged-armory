package com.purplik.reforgedarmory;


import com.purplik.reforgedarmory.common.init.BlockInit;
import com.purplik.reforgedarmory.common.init.ItemInit;
import com.purplik.reforgedarmory.common.init.VanillaRebalance;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ReforgedArmory.MOD_ID)
public class ReforgedArmory
{
    public static final String MOD_ID = "reforgedarmory";

    public ReforgedArmory()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        ItemInit.ITEM.register(modEventBus);
        VanillaRebalance.ITEM.register(modEventBus);
        BlockInit.BLOCK.register(modEventBus);
        BlockInit.ITEM.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }
}
