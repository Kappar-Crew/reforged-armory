package com.purplik.reforgedarmory.common.item.armor.vanilla;

import com.purplik.reforgedarmory.common.item.armor.ArmorSetItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.UUID;

public class NetheriteArmor extends ArmorSetItem {

    public NetheriteArmor(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Properties properties) {
        super(armorMaterial, equipmentSlot, properties);
    }

    private static AttributeModifier getSpeedModifier(Player player) {
        return new AttributeModifier(UUID.fromString("805cf4f0-1cdc-11ed-861d-0242ac120002"), "armormod:heavy", (-0.1 * amountOfArmorPieces(player)), AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        AttributeInstance attributeInstance = player.getAttribute(Attributes.MOVEMENT_SPEED);
        AttributeModifier speedModifier = getSpeedModifier(player);

        boolean hasModifier = attributeInstance.hasModifier(speedModifier);
        double lastValue = 0;

        attributeInstance.removeModifier(speedModifier);

        if(amountOfArmorPieces(player) > 1) {
            if(lastValue != amountOfArmorPieces(player)) {
                attributeInstance.addTransientModifier(speedModifier);
            }
            lastValue = amountOfArmorPieces(player);
        }

    }

    public static double amountOfArmorPieces(Player player) {

        ItemStack helmet = player.getInventory().getArmor(0);
        ItemStack chestplate = player.getInventory().getArmor(1);
        ItemStack leggins = player.getInventory().getArmor(2);
        ItemStack boots = player.getInventory().getArmor(3);

        int amount = 0;

        if(!helmet.isEmpty() && helmet.getItem() instanceof NetheriteArmor) {amount++;}
        if(!chestplate.isEmpty() && chestplate.getItem() instanceof NetheriteArmor) {amount++;}
        if(!leggins.isEmpty() && leggins.getItem() instanceof NetheriteArmor) {amount++;}
        if(!boots.isEmpty() && boots.getItem() instanceof NetheriteArmor) {amount++;}

        return amount;
    }
}
