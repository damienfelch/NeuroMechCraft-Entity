package com.damien.example.proxy;

import net.minecraftforge.fml.common.event.*;

public interface IProxy {
    public void preInit(FMLPreInitializationEvent event);
    public void init(FMLInitializationEvent event);
    public void postInit(FMLPostInitializationEvent event);
    public void serverStarting(FMLServerStartingEvent event);
    public void serverStopping(FMLServerStoppingEvent event);
}
