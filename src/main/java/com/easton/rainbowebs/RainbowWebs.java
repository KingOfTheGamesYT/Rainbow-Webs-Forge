package com.easton.rainbowebs;


import com.easton.rainbowebs.util.RegistryHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



// The value here should match an entry in the META-INF/mods.toml file
@Mod("rainbowebs")
public class RainbowWebs {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rainbowebs";

    public RainbowWebs() {

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event) {

    }
    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(RegistryHandler.RED_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.BLUE_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.BLACK_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.BROWN_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CYAN_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.GRAY_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.GREEN_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.LIGHT_BLUE_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.LIGHT_GRAY_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.LIME_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.MAGENTA_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.ORANGE_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.PINK_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.PURPLE_COBWEB.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.YELLOW_COBWEB.get(), RenderType.getCutout());

    }
}


