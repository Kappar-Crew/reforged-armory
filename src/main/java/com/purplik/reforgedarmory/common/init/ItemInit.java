package com.purplik.reforgedarmory.common.init;

import com.purplik.reforgedarmory.ReforgedArmory;
import com.purplik.reforgedarmory.common.item.armor.*;
import com.purplik.reforgedarmory.common.item.weapon.Claw;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, ReforgedArmory.MOD_ID);

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(ReforgedArmory.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BANDIT_HELMET.get());
        }
    };

    // ARMOR SETS

    public static final RegistryObject<Item> BANDIT_HELMET = ITEM.register("bandit_helmet", () -> new BanditArmor(ModArmorMaterials.BANDIT, EquipmentSlot.HEAD, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> BANDIT_CHESTPLATE = ITEM.register("bandit_chestplate", () -> new BanditArmor(ModArmorMaterials.BANDIT, EquipmentSlot.CHEST, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> BANDIT_LEGGINGS = ITEM.register("bandit_leggings", () -> new BanditArmor(ModArmorMaterials.BANDIT, EquipmentSlot.LEGS, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> BANDIT_BOOTS = ITEM.register("bandit_boots", () -> new BanditArmor(ModArmorMaterials.BANDIT, EquipmentSlot.FEET, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));

    public static final RegistryObject<Item> PILOT_HELMET = ITEM.register("pilot_helmet", () -> new PilotArmor(ModArmorMaterials.PILOT, EquipmentSlot.HEAD, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> PILOT_CHESTPLATE = ITEM.register("pilot_chestplate", () -> new PilotArmor(ModArmorMaterials.PILOT, EquipmentSlot.CHEST, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> PILOT_LEGGINGS = ITEM.register("pilot_leggings", () -> new PilotArmor(ModArmorMaterials.PILOT, EquipmentSlot.LEGS, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> PILOT_BOOTS = ITEM.register("pilot_boots", () -> new PilotArmor(ModArmorMaterials.PILOT, EquipmentSlot.FEET, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));

    public static final RegistryObject<Item> FURSUIT_HELMET = ITEM.register("wolf_helmet", () -> new WolfArmor(ModArmorMaterials.BANDIT, EquipmentSlot.HEAD, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> FURSUIT_CHESTPLATE = ITEM.register("wolf_chestplate", () -> new WolfArmor(ModArmorMaterials.BANDIT, EquipmentSlot.CHEST, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> FURSUIT_LEGGINGS = ITEM.register("wolf_leggings", () -> new WolfArmor(ModArmorMaterials.BANDIT, EquipmentSlot.LEGS, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> FURSUIT_BOOTS = ITEM.register("wolf_boots", () -> new WolfArmor(ModArmorMaterials.BANDIT, EquipmentSlot.FEET, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));

    public static final RegistryObject<Item> EXPLORER_HELMET = ITEM.register("explorer_helmet", () -> new ExplorerArmor(ModArmorMaterials.EXPLORER, EquipmentSlot.HEAD, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> EXPLORER_CHESTPLATE = ITEM.register("explorer_chestplate", () -> new ExplorerArmor(ModArmorMaterials.EXPLORER, EquipmentSlot.CHEST, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> EXPLORER_LEGGINGS = ITEM.register("explorer_leggings", () -> new ExplorerArmor(ModArmorMaterials.EXPLORER, EquipmentSlot.LEGS, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> EXPLORER_BOOTS = ITEM.register("explorer_boots", () -> new ExplorerArmor(ModArmorMaterials.EXPLORER, EquipmentSlot.FEET, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));

    // [WIP] - TECHNICAL DIFFICULTIES - Arrow damage calculation
    /*
    public static final RegistryObject<Item> ARCHER_HELMET = ITEM.register("archer_helmet", () -> new ArcherArmor(ModArmorMaterials.BANDIT, EquipmentSlot.HEAD, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> ARCHER_CHESTPLATE = ITEM.register("archer_chestplate", () -> new ArcherArmor(ModArmorMaterials.BANDIT, EquipmentSlot.CHEST, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> ARCHER_LEGGINGS = ITEM.register("archer_leggings", () -> new ArcherArmor(ModArmorMaterials.BANDIT, EquipmentSlot.LEGS, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> ARCHER_BOOTS = ITEM.register("archer_boots", () -> new ArcherArmor(ModArmorMaterials.BANDIT, EquipmentSlot.FEET, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));

    // [WIP] - TECHNICAL DIFFICULTIES - Iron Will mechanic (Totem of Undying on LONG cooldown that gives you half a heart and resistance 4 for 5 seconds)

    public static final RegistryObject<Item> DWARF_HELMET = ITEM.register("dwarf_helmet", () -> new DwarfArmor(ModArmorMaterials.BANDIT, EquipmentSlot.HEAD, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> DWARF_CHESTPLATE = ITEM.register("dwarf_chestplate", () -> new DwarfArmor(ModArmorMaterials.BANDIT, EquipmentSlot.CHEST, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> DWARF_LEGGINGS = ITEM.register("dwarf_leggings", () -> new DwarfArmor(ModArmorMaterials.BANDIT, EquipmentSlot.LEGS, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    public static final RegistryObject<Item> DWARF_BOOTS = ITEM.register("dwarf_boots", () -> new DwarfArmor(ModArmorMaterials.BANDIT, EquipmentSlot.FEET, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    */



    // WEAPONS

    public static final RegistryObject<Item> Claw = ITEM.register("claw", () -> new Claw(Tiers.IRON, 0, 6f, new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
}
