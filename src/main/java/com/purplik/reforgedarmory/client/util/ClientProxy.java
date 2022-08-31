package com.purplik.reforgedarmory.client.util;

import com.purplik.reforgedarmory.client.renderer.armor.model.BanditArmorModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
        value = {Dist.CLIENT},
        bus = Bus.MOD
)
public class ClientProxy {
    public static final ModelLayerLocation BANDIT_LAYER = new ModelLayerLocation(new ResourceLocation("armormod", "bandit"), "main");


    public ClientProxy() {
    }

    @SubscribeEvent
    public static void layerDefinitions(RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BANDIT_LAYER, BanditArmorModel::createBodyLayer);
    }
}
