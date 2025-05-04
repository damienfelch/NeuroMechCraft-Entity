package com.damien.example.renderers;

import com.damien.example.entity.models.ModelCybug;
import com.damien.example.entity.monster.EntityCybug;
import com.damien.example.entity.monster.EntityCybug;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCybug extends RenderLiving<EntityCybug> {
    protected ResourceLocation cybugTexture;

    public RenderCybug(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelCybug(), 1F);
        setEntityTexture();
    }

    protected void setEntityTexture()
    {
        cybugTexture = new ResourceLocation("example:textures/entity/cybug.png");
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called
     * unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(EntityCybug par1Entity)
    {
        return cybugTexture;
    }
}
