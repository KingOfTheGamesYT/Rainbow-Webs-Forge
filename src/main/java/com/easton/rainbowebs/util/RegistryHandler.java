package com.easton.rainbowebs.util;


import com.easton.rainbowebs.RainbowWebs;
import com.easton.rainbowebs.blocks.ColorWeb;
import com.easton.rainbowebs.blocks.BlockItemBase;
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
    public static final RegistryObject<Block> RED_COBWEB = BLOCKS.register("red_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> BLACK_COBWEB = BLOCKS.register("black_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> BLUE_COBWEB = BLOCKS.register("blue_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> BROWN_COBWEB = BLOCKS.register("brown_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> CYAN_COBWEB = BLOCKS.register("cyan_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> GRAY_COBWEB = BLOCKS.register("gray_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> GREEN_COBWEB = BLOCKS.register("green_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> LIGHT_BLUE_COBWEB = BLOCKS.register("light_blue_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> LIGHT_GRAY_COBWEB = BLOCKS.register("light_gray_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> LIME_COBWEB = BLOCKS.register("lime_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> MAGENTA_COBWEB = BLOCKS.register("magenta_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> ORANGE_COBWEB = BLOCKS.register("orange_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> PINK_COBWEB = BLOCKS.register("pink_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> PURPLE_COBWEB = BLOCKS.register("purple_cobweb", ColorWeb::new);
    public static final RegistryObject<Block> YELLOW_COBWEB = BLOCKS.register("yellow_cobweb", ColorWeb::new);


    //Block Items
    public static final RegistryObject<Item> RED_COBWEB_ITEM = ITEMS.register("red_cobweb", () -> new BlockItemBase(RED_COBWEB.get()));
    public static final RegistryObject<Item> BLACK_COBWEB_ITEM = ITEMS.register("black_cobweb", () -> new BlockItemBase(BLACK_COBWEB.get()));
    public static final RegistryObject<Item> BLUE_COBWEB_ITEM = ITEMS.register("blue_cobweb", () -> new BlockItemBase(BLUE_COBWEB.get()));
    public static final RegistryObject<Item> BROWN_COBWEB_ITEM = ITEMS.register("brown_cobweb", () -> new BlockItemBase(BROWN_COBWEB.get()));
    public static final RegistryObject<Item> CYAN_COBWEB_ITEM = ITEMS.register("cyan_cobweb", () -> new BlockItemBase(CYAN_COBWEB.get()));
    public static final RegistryObject<Item> GRAY_COBWEB_ITEM = ITEMS.register("gray_cobweb", () -> new BlockItemBase(GRAY_COBWEB.get()));
    public static final RegistryObject<Item> GREEN_COBWEB_ITEM = ITEMS.register("green_cobweb", () -> new BlockItemBase(GREEN_COBWEB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_COBWEB_ITEM = ITEMS.register("light_blue_cobweb", () -> new BlockItemBase(LIGHT_BLUE_COBWEB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_COBWEB_ITEM = ITEMS.register("light_gray_cobweb", () -> new BlockItemBase(LIGHT_GRAY_COBWEB.get()));
    public static final RegistryObject<Item> LIME_COBWEB_ITEM = ITEMS.register("lime_cobweb", () -> new BlockItemBase(LIME_COBWEB.get()));
    public static final RegistryObject<Item> MAGENTA_COBWEB_ITEM = ITEMS.register("magenta_cobweb", () -> new BlockItemBase(MAGENTA_COBWEB.get()));
    public static final RegistryObject<Item> ORANGE_COBWEB_ITEM = ITEMS.register("orange_cobweb", () -> new BlockItemBase(ORANGE_COBWEB.get()));
    public static final RegistryObject<Item> PINK_COBWEB_ITEM = ITEMS.register("pink_cobweb", () -> new BlockItemBase(PINK_COBWEB.get()));
    public static final RegistryObject<Item> PURPLE_COBWEB_ITEM = ITEMS.register("purple_cobweb", () -> new BlockItemBase(PURPLE_COBWEB.get()));
    public static final RegistryObject<Item> YELLOW_COBWEB_ITEM = ITEMS.register("yellow_cobweb", () -> new BlockItemBase(YELLOW_COBWEB.get()));


}