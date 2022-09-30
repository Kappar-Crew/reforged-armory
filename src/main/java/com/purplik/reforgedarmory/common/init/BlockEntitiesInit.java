package com.purplik.reforgedarmory.common.init;

import com.purplik.reforgedarmory.ReforgedArmory;
//import com.purplik.reforgedarmory.common.block.AscendtionTable;
//import com.purplik.reforgedarmory.common.block.AscendtionTableBlockEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntitiesInit {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ReforgedArmory.MOD_ID);

//    public static final RegistryObject<Block> ASCENDTION_TABLE = BLOCK_ENTITY.register("ascendtion_table", () -> BlockEntityType.Builder.of(AscendtionTableBlockEntity::new, BlockInit.ASCENDTION_TABLE.get()).build(null));
}