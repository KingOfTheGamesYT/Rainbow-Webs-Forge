package com.easton.rainbowwebs.util;


import com.easton.rainbowwebs.RainbowWebs;
import com.easton.rainbowwebs.blocks.BlockBase;
import com.easton.rainbowwebs.blocks.BlockItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RainbowWebs.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RainbowWebs.MOD_ID);


    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }


    //Blocks
    public static final RegistryObject<Block> RED_COBWEB = BLOCKS.register("red_cobweb", BlockBase::new);

    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", BlockBase::new);

    public static final RegistryObject<Block> SALT_ORE_BLOCK = BLOCKS.register("salt_ore_block", BlockBase::new);

    public static final RegistryObject<Block> SAPPHIRE_ORE_BLOCK = BLOCKS.register("sapphire_ore_block", BlockBase::new);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", BlockBase::new);

    public static final RegistryObject<Block> EYE_OF_ENDER_BLOCK = BLOCKS.register("eye_of_ender_block", BlockBase::new);

    public static final RegistryObject<Block> ENDER_PEARL_BLOCK = BLOCKS.register("ender_pearl_block", BlockBase::new);

    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", BlockBase::new);

    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", BlockBase::new);

    public static final RegistryObject<Block> COMPRESSED_POPPY_BLOCK = BLOCKS.register("compressed_poppy_block", BlockBase::new);

    public static final RegistryObject<Block> STICKY_BLOCK = BLOCKS.register("sticky_block", BlockBase::new);

    public static final RegistryObject<Block> DARK_BROWN_BLOCK = BLOCKS.register("dark_brown_block", BlockBase::new);

    public static final RegistryObject<Block> DARK_ORANGE_BLOCK = BLOCKS.register("dark_orange_block", BlockBase::new);

    public static final RegistryObject<Block> ORANGE_BLOCK = BLOCKS.register("orange_block", BlockBase::new);

    public static final RegistryObject<Block> BROWN_BLOCK = BLOCKS.register("brown_block", BlockBase::new);

    //Block Items
    public static final RegistryObject<Item> RED_COBWEB_ITEM = ITEMS.register("red_cobweb", () -> new BlockItemBase(RED_COBWEB.get()));

    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ITEMS.register("amethyst_block", () -> new BlockItemBase(AMETHYST_BLOCK.get()));

    public static final RegistryObject<Item> SALT_ORE_BLOCK_ITEM = ITEMS.register("salt_ore_block", () -> new BlockItemBase(SALT_ORE_BLOCK.get()));

    public static final RegistryObject<Item> SAPPHIRE_ORE_BLOCK_ITEM = ITEMS.register("sapphire_ore_block", () -> new BlockItemBase(SAPPHIRE_ORE_BLOCK.get()));

    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block", () -> new BlockItemBase(SAPPHIRE_BLOCK.get()));

    public static final RegistryObject<Item> EYE_OF_ENDER_BLOCK_ITEM = ITEMS.register("eye_of_ender_block", () -> new BlockItemBase(EYE_OF_ENDER_BLOCK.get()));

    public static final RegistryObject<Item> ENDER_PEARL_BLOCK_ITEM = ITEMS.register("ender_pearl_block", () -> new BlockItemBase(ENDER_PEARL_BLOCK.get()));

    public static final RegistryObject<Item> URANIUM_BLOCK_ITEM = ITEMS.register("uranium_block", () -> new BlockItemBase(URANIUM_BLOCK.get()));

    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block", () -> new BlockItemBase(TITANIUM_BLOCK.get()));

    public static final RegistryObject<Item> COMPRESSED_POPPY_BLOCK_ITEM = ITEMS.register("compressed_poppy_block", () -> new BlockItemBase(COMPRESSED_POPPY_BLOCK.get()));

    public static final RegistryObject<Item> STICKY_BLOCK_ITEM = ITEMS.register("sticky_block", () -> new BlockItemBase(STICKY_BLOCK.get()));

    public static final RegistryObject<Item> DARK_BROWN_BLOCK_ITEM = ITEMS.register("dark_brown_block", () -> new BlockItemBase(DARK_BROWN_BLOCK.get()));

    public static final RegistryObject<Item> DARK_ORANGE_BLOCK_ITEM = ITEMS.register("dark_orange_block", () -> new BlockItemBase(DARK_ORANGE_BLOCK.get()));

    public static final RegistryObject<Item> ORANGE_BLOCK_ITEM = ITEMS.register("orange_block", () -> new BlockItemBase(ORANGE_BLOCK.get()));

    public static final RegistryObject<Item> BROWN_BLOCK_ITEM = ITEMS.register("brown_block", () -> new BlockItemBase(BROWN_BLOCK.get()));

}