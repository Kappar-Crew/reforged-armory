package com.purplik.reforgedarmory.common.init;

import com.purplik.reforgedarmory.common.item.armor.vanilla.DiamondArmor;
import com.purplik.reforgedarmory.common.item.armor.vanilla.NetheriteArmor;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanillaRebalance {

    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> DIAMOND_HELMET = ITEM.register("diamond_helmet", () -> new DiamondArmor(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_CHESTPLATE = ITEM.register("diamond_chestplate", () -> new DiamondArmor(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_LEGGINGS = ITEM.register("diamond_leggings", () -> new DiamondArmor(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_BOOTS = ITEM.register("diamond_boots", () -> new DiamondArmor(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> NETHERITE_HELMET = ITEM.register("netherite_helmet", () -> new NetheriteArmor(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_CHESTPLATE = ITEM.register("netherite_chestplate", () -> new NetheriteArmor(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGGINGS = ITEM.register("netherite_leggings", () -> new NetheriteArmor(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_BOOTS = ITEM.register("netherite_boots", () -> new NetheriteArmor(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

}
