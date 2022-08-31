package com.purplik.reforgedarmory.common.item.weapon;

import com.purplik.reforgedarmory.common.item.armor.WolfArmor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class Claw extends SwordItem {
    public Claw(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {

        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack leggins = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);

        ItemStack offhand = player.getItemBySlot(EquipmentSlot.OFFHAND);

        if(helmet.getItem() instanceof WolfArmor && chestplate.getItem() instanceof WolfArmor && leggins.getItem() instanceof WolfArmor && boots.getItem() instanceof WolfArmor) {

            if(offhand.getItem() instanceof Claw) {
                player.heal(this.getDamage() * 1.5f);
            } else if (!(offhand.getItem() instanceof ShieldItem)) {
                player.heal(this.getDamage());
            }

        }
        return super.onLeftClickEntity(stack, player, entity);
    }
}
