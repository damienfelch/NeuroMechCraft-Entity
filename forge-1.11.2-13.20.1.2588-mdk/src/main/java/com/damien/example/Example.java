package com.damien.example;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import com.damien.example.proxy.IProxy;
import net.minecraftforge.fml.common.SidedProxy;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Mod(modid=Ref.MODID, name=Ref.NAME, version=Ref.VERSION)
public class Example
{
    @Mod.Instance
    public static Example instance;
    @SidedProxy(clientSide=Ref.CLIENT_PROXY, serverSide=Ref.SERVER_PROXY)
    public static IProxy proxy;

    public static final Logger LOGGER = Logger.getLogger(Ref.MODID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        LOGGER.info("Starting Pre-Initialization...");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        LOGGER.info("Starting Initialization...");
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LOGGER.info("Starting Post-Initialization...");
        proxy.postInit(event);
    }
}
