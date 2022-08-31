package com.purplik.reforgedarmory.common.item.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class ArmorSetItem extends ArmorItem {
    public ArmorSetItem(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
        super(p_40386_, p_40387_, p_40388_);
    }

    public boolean hasFullSet(Player player) {

        ItemStack helmet = player.getInventory().getArmor(0);
        ItemStack chestplate = player.getInventory().getArmor(1);
        ItemStack leggings = player.getInventory().getArmor(2);
        ItemStack boots = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }
}
