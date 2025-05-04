package com.damien.example.proxy;

import net.minecraftforge.fml.common.event.*;
import com.damien.example.util.RegisterUtil;

public class CommonProxy implements IProxy{
    public void preInit(FMLPreInitializationEvent event) {
        RegisterUtil.RegisterAll(event);
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    public void serverStarting(FMLServerStartingEvent event) {

    }

    public void serverStopping(FMLServerStoppingEvent event) {

    }
}
