package com.purplik.reforgedarmory.common.item.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.UUID;

public class ExplorerArmor extends ArmorSetItem {

    public ExplorerArmor(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Properties properties) {
        super(armorMaterial, equipmentSlot, properties);
    }

    private static AttributeModifier getSpeedModifier(Player player) {
        return new AttributeModifier(UUID.fromString("373d919c-f25f-48bf-ade4-c460d757f8e5"), "armormod:bandits_luck", (0.05 * amountOfArmorPieces(player)), AttributeModifier.Operation.MULTIPLY_TOTAL);
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

        if(amountOfArmorPieces(player) == 4) {
            player.maxUpStep = 1f;
        } else {
            player.maxUpStep = 0.6f;
        }
    }

    public static double amountOfArmorPieces(Player player) {

        ItemStack helmet = player.getInventory().getArmor(0);
        ItemStack chestplate = player.getInventory().getArmor(1);
        ItemStack leggings = player.getInventory().getArmor(2);
        ItemStack boots = player.getInventory().getArmor(3);

        int amount = 0;

        if(!helmet.isEmpty() && helmet.getItem() instanceof ExplorerArmor) {amount++;}
        if(!chestplate.isEmpty() && chestplate.getItem() instanceof ExplorerArmor) {amount++;}
        if(!leggings.isEmpty() && leggings.getItem() instanceof ExplorerArmor) {amount++;}
        if(!boots.isEmpty() && boots.getItem() instanceof ExplorerArmor) {amount++;}

        return amount;
    }

    @Override
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return true;
    }
}
