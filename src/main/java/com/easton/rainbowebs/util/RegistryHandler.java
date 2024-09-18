package com.easton.rainbowebs.util;

import com.easton.rainbowebs.RainbowWebs;
import com.easton.rainbowebs.blocks.ColorWeb;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RainbowWebs.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RainbowWebs.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Blocks
    public static final RegistryObject<Block> RED_COBWEB = registerBlock("red_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> BLACK_COBWEB = registerBlock("black_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> BLUE_COBWEB = registerBlock("blue_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> BROWN_COBWEB = registerBlock("brown_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> CYAN_COBWEB = registerBlock("cyan_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> GRAY_COBWEB = registerBlock("gray_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> GREEN_COBWEB = registerBlock("green_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_COBWEB = registerBlock("light_blue_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_COBWEB = registerBlock("light_gray_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> LIME_COBWEB = registerBlock("lime_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_COBWEB = registerBlock("magenta_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> ORANGE_COBWEB = registerBlock("orange_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> PINK_COBWEB = registerBlock("pink_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);
    public static final RegistryObject<Block> PURPLE_COBWEB = registerBlock("purple_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS
    );
    public static final RegistryObject<Block> YELLOW_COBWEB = registerBlock("yellow_cobweb", ColorWeb::new, CreativeModeTabs.NATURAL_BLOCKS);

    //Block Items
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, ResourceKey<CreativeModeTab> naturalBlocks) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return RegistryHandler.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}