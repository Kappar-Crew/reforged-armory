package com.purplik.reforgedarmory.common.item.armor;

import com.purplik.reforgedarmory.common.item.weapon.Claw;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.UUID;

public class WolfArmor extends ArmorSetItem {

    public WolfArmor(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
        super(p_40386_, p_40387_, p_40388_);
    }

    private static AttributeModifier getAttackModifier() {
        return new AttributeModifier(UUID.fromString("f076f59e-1505-11ed-861d-0242ac120002"), "armormod:the_way_of_nature", 2, AttributeModifier.Operation.MULTIPLY_TOTAL);
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

        if(helmet.getItem() instanceof WolfArmor && chestplate.getItem() instanceof WolfArmor && leggings.getItem() instanceof WolfArmor && boots.getItem() instanceof WolfArmor) {
            if(!hasModifier && (mainhand.isEmpty() || mainhand.getItem() instanceof Claw)) {
                attributeInstance.addTransientModifier(attackModifier);
            } else {
                if(hasModifier && !mainhand.isEmpty()) {
                    attributeInstance.removeModifier(attackModifier);
                }
            }
        }

    }

}
