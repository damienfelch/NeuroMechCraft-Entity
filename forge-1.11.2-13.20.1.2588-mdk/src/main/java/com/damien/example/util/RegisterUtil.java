package com.damien.example.util;

import com.damien.example.Example;
import com.damien.example.Ref;
import com.damien.example.entity.monster.EntityCybug;
import com.damien.example.init.Mobs;
import com.damien.example.renderers.EntityCybugRF;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import java.io.IOException;

public class RegisterUtil {
    public static void RegisterAll(FMLPreInitializationEvent event) {
        RegisterMobs(event, Mobs.cybug);
    }

    private static void RegisterMobs (FMLPreInitializationEvent event, EntityMob...entityMobs)
    {
        Example.LOGGER.info("Registering mobs: ");
        int mobId = 0;
        for (EntityMob entityMob:entityMobs)
        {
            Example.LOGGER.info("\tRegistering " + entityMob.getName().substring(5));
            if (event.getSide() == Side.CLIENT)
            {
                ResourceLocation registryName = new ResourceLocation("example: " + entityMob.getName());
                EntityRegistry.registerModEntity(registryName,
                        entityMob.getClass(),
                        entityMob.getName(),
                        mobId,
                        Ref.MODID,
                        80,
                        3,
                        false,
                        0x0000FF,
                        0x808080);
                Example.LOGGER.info("\t\tRegistered!");
                RenderingRegistry.registerEntityRenderingHandler(EntityCybug.class, new EntityCybugRF());
            }
            mobId++;
        }
    }
}
