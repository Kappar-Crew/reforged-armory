package com.purplik.reforgedarmory.common.init;

import com.purplik.reforgedarmory.ReforgedArmory;
import com.purplik.reforgedarmory.common.block.AscendtionTable;
import com.purplik.reforgedarmory.common.block.AscendtionTableBlockEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, ReforgedArmory.MOD_ID);
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, ReforgedArmory.MOD_ID);

    public static final RegistryObject<Block> ASCENDTION_TABLE = BLOCK.register("ascendtion_table", () -> new AscendtionTable(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Item> ASCENDTION_TABLE_BLOCK = makeBlockItem(ASCENDTION_TABLE);

    public static <B extends Block> RegistryObject<Item> makeBlockItem(RegistryObject<Block> block) {
        return ITEM.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(ItemInit.CREATIVE_TAB)));
    }
}