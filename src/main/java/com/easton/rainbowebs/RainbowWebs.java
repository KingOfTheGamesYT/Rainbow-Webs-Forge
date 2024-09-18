package com.easton.rainbowebs;

import com.easton.rainbowebs.util.RegistryHandler;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("rainbowebs")
public class RainbowWebs {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rainbowebs";

    public RainbowWebs() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        RegistryHandler.init();

        modEventBus.addListener(this::addCreative);
        MinecraftForge.EVENT_BUS.register(LootTableLoadEvent.class);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event) {

    }
    private void doClientStuff(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.RED_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BLUE_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BLACK_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BROWN_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.CYAN_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.GRAY_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.GREEN_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIGHT_BLUE_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIGHT_GRAY_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIME_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.MAGENTA_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.ORANGE_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.PINK_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.PURPLE_COBWEB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.YELLOW_COBWEB.get(), RenderType.cutout());
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
          event.accept(RegistryHandler.RED_COBWEB);
            event.accept(RegistryHandler.BLUE_COBWEB);
            event.accept(RegistryHandler.BLACK_COBWEB);
            event.accept(RegistryHandler.BROWN_COBWEB);
            event.accept(RegistryHandler.CYAN_COBWEB);
            event.accept(RegistryHandler.GRAY_COBWEB);
            event.accept(RegistryHandler.GREEN_COBWEB);
            event.accept(RegistryHandler.LIGHT_BLUE_COBWEB);
            event.accept(RegistryHandler.LIGHT_GRAY_COBWEB);
            event.accept(RegistryHandler.LIME_COBWEB);
            event.accept(RegistryHandler.MAGENTA_COBWEB);
            event.accept(RegistryHandler.ORANGE_COBWEB);
            event.accept(RegistryHandler.PINK_COBWEB);
            event.accept(RegistryHandler.PURPLE_COBWEB);
            event.accept(RegistryHandler.YELLOW_COBWEB);
        }
        }

    private static TagKey<Block> create(String p_203847_) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(p_203847_));
    }

    }


