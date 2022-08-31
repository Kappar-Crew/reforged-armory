package com.purplik.reforgedarmory.common.item.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.UUID;

public class DwarfArmor extends ArmorSetItem {

    public DwarfArmor(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
        super(p_40386_, p_40387_, p_40388_);
    }

    private static AttributeModifier getAttackModifier() {
        return new AttributeModifier(UUID.fromString("b2a5f6c2-1dff-11ed-861d-0242ac120002"), "armormod:the_way_of_nature", 2, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {

        AttributeInstance attributeInstance = player.getAttribute(Attributes.ATTACK_DAMAGE);
        AttributeModifier attackModifier = getAttackModifier();

        boolean hasModifier = attributeInstance.hasModifier(attackModifier);



        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);

        ItemStack mainhand = player.getItemBySlot(EquipmentSlot.MAINHAND);

        if(helmet.getItem() instanceof DwarfArmor && chestplate.getItem() instanceof DwarfArmor && leggings.getItem() instanceof DwarfArmor && boots.getItem() instanceof DwarfArmor) {
            if(!hasModifier && player.getHealth() < 0.5f) {
                player.setHealth(1.0F);
            }/* else {
                if(hasModifier && !(mainhand.getItem() instanceof BowItem || mainhand.getItem() instanceof CrossbowItem)) {
                    attributeInstance.removeModifier(attackModifier);
                }
            }*/
        }

    }

}
