package com.damien.example.renderers;

import com.damien.example.entity.monster.EntityCybug;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntityCybugRF implements IRenderFactory<EntityCybug> {
    @Override
    public RenderCybug createRenderFor(RenderManager manager){
        return new RenderCybug(manager);
    }
}
