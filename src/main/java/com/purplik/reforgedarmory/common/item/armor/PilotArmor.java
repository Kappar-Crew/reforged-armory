package com.purplik.reforgedarmory.common.item.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class PilotArmor extends ArmorSetItem {

    public PilotArmor(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
        super(p_40386_, p_40387_, p_40388_);
    }

    @Override
    public boolean canElytraFly(ItemStack stack, LivingEntity entity) {
        return hasFullSet((Player) entity);
    }

    @Override
    public boolean elytraFlightTick(ItemStack stack, LivingEntity entity, int flightTicks) {
        return hasFullSet((Player) entity);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
    }
}
