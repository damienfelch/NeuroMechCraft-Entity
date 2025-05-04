package com.damien.example.entity.models;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCybug extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer legs;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer middle_left_leg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer middle_right_leg;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer wings;
	private final ModelRenderer front_left_wing;
	private final ModelRenderer front_right_wing;
	private final ModelRenderer back_right_wing;
	private final ModelRenderer back_left_wing;

	public ModelCybug() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 16.0F, 0.0F);


		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -6.0F, -2.0F);
		bone.addChild(body);
		body.rotateAngleX = -0.1309F;
		body.cubeList.add(new ModelBox(body, 40, 46, -8.0F, -8.0F, -14.0F, 14, 12, 4, 0.01F, false));
		body.cubeList.add(new ModelBox(body, 44, 24, -8.0F, 2.0F, -12.0F, 14, 4, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 20, -7.0F, -2.0F, -6.0F, 12, 8, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 64, -6.0F, 2.0F, 4.0F, 10, 4, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -8.0F, -10.0F, -12.0F, 14, 12, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 46, -7.0F, -8.0F, -4.0F, 12, 10, 8, 0.01F, false));
		body.cubeList.add(new ModelBox(body, 40, 62, -6.0F, -4.0F, 4.0F, 10, 6, 8, 0.0F, false));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(legs);


		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(6.0F, -7.0F, -11.0F);
		legs.addChild(front_left_leg);
		front_left_leg.cubeList.add(new ModelBox(front_left_leg, 58, 82, 0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));
		front_left_leg.cubeList.add(new ModelBox(front_left_leg, 52, 36, 6.0F, 6.0F, 0.0F, 8, 3, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(14.0F, 11.0F, 1.0F);
		front_left_leg.addChild(cube_r1);
		cube_r1.rotateAngleZ = 1.4835F;
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 82, -2.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.9696F, 2.6527F, 1.0F);
		front_left_leg.addChild(cube_r2);
		cube_r2.rotateAngleZ = 1.3963F;
		cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 60, -2.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(-8.0F, -6.0F, -10.0F);
		legs.addChild(front_right_leg);
		front_right_leg.cubeList.add(new ModelBox(front_right_leg, 22, 86, -4.0F, -1.0F, -1.0F, 4, 3, 3, 0.0F, false));
		front_right_leg.cubeList.add(new ModelBox(front_right_leg, 74, 36, -14.0F, 5.0F, -1.0F, 8, 3, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-14.0F, 10.0F, 0.0F);
		front_right_leg.addChild(cube_r3);
		cube_r3.rotateAngleZ = -1.4835F;
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 86, -4.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.9696F, 1.6527F, 0.0F);
		front_right_leg.addChild(cube_r4);
		cube_r4.rotateAngleZ = -1.3963F;
		cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 76, -6.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		middle_left_leg = new ModelRenderer(this);
		middle_left_leg.setRotationPoint(5.0F, -6.0F, -5.0F);
		legs.addChild(middle_left_leg);
		middle_left_leg.cubeList.add(new ModelBox(middle_left_leg, 72, 86, 0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(14.0F, 11.0F, 1.0F);
		middle_left_leg.addChild(cube_r5);
		cube_r5.rotateAngleZ = 1.5272F;

		cube_r5.cubeList.add(new ModelBox(cube_r5, 86, 86, -3.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(8.0F, 6.0F, 1.0F);
		middle_left_leg.addChild(cube_r6);
		cube_r6.rotateAngleZ = -0.1745F;

		cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 76, -2.0F, 0.0F, -1.0F, 8, 3, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(4.9696F, 2.6527F, 1.0F);
		middle_left_leg.addChild(cube_r7);
		cube_r7.rotateAngleZ = 1.3963F;
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 76, -2.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		middle_right_leg = new ModelRenderer(this);
		middle_right_leg.setRotationPoint(-8.0F, -6.0F, -5.0F);
		legs.addChild(middle_right_leg);
		middle_right_leg.cubeList.add(new ModelBox(middle_right_leg, 0, 88, -3.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-13.0F, 12.0F, 1.0F);
		middle_right_leg.addChild(cube_r8);
		cube_r8.rotateAngleZ = -1.5275F;
		cube_r8.cubeList.add(new ModelBox(cube_r8, 88, 24, -2.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-7.0F, 6.0F, 1.0F);
		middle_right_leg.addChild(cube_r9);
		cube_r9.rotateAngleZ = 0.1745F;
		cube_r9.cubeList.add(new ModelBox(cube_r9, 76, 42, -6.0F, 0.0F, -1.0F, 8, 3, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.9696F, 2.6527F, 1.0F);
		middle_right_leg.addChild(cube_r10);
		cube_r10.rotateAngleZ = -1.3963F;
		cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 66, -6.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(-6.0F, -5.0F, 2.0F);
		legs.addChild(back_left_leg);
		back_left_leg.cubeList.add(new ModelBox(back_left_leg, 88, 28, 10.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(24.0F, 10.0F, 1.0F);
		back_left_leg.addChild(cube_r11);
		cube_r11.rotateAngleZ = 1.5272F;
		cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 88, -3.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(18.0F, 6.0F, 1.0F);
		back_left_leg.addChild(cube_r12);
		cube_r12.rotateAngleZ = -0.2618F;
		cube_r12.cubeList.add(new ModelBox(cube_r12, 76, 48, -2.0F, 0.0F, -1.0F, 8, 3, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(14.9696F, 2.6527F, 1.0F);
		back_left_leg.addChild(cube_r13);
		cube_r13.rotateAngleZ = 1.3963F;
		cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 76, -2.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(5.0F, -5.0F, 2.0F);
		legs.addChild(back_right_leg);
		back_right_leg.cubeList.add(new ModelBox(back_right_leg, 88, 76, -15.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-25.0F, 11.0F, 1.0F);
		back_right_leg.addChild(cube_r14);
		cube_r14.rotateAngleZ = -1.5275F;
		cube_r14.cubeList.add(new ModelBox(cube_r14, 88, 82, -2.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-19.0F, 6.0F, 1.0F);
		back_right_leg.addChild(cube_r15);
		cube_r15.rotateAngleZ = 0.2618F;
		cube_r15.cubeList.add(new ModelBox(cube_r15, 76, 54, -6.0F, 0.0F, -1.0F, 8, 3, 3, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-15.9696F, 2.6527F, 1.0F);
		back_right_leg.addChild(cube_r16);
		cube_r16.rotateAngleZ = -1.3963F;
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 82, -6.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(wings);


		front_left_wing = new ModelRenderer(this);
		front_left_wing.setRotationPoint(6.0F, -18.0F, -7.0F);
		wings.addChild(front_left_wing);
		front_left_wing.rotateAngleX = -0.1265F;
		front_left_wing.rotateAngleY = -0.0338F;
		front_left_wing.rotateAngleZ = -0.2597F;
		front_left_wing.cubeList.add(new ModelBox(front_left_wing, 52, 42, -4.0F, -1.0F, 0.0F, 7, 2, 2, 0.0F, false));
		front_left_wing.cubeList.add(new ModelBox(front_left_wing, 0, 38, 3.0F, -0.8695F, -2.0086F, 20, 2, 6, 0.0F, false));

		front_right_wing = new ModelRenderer(this);
		front_right_wing.setRotationPoint(-6.0F, -18.0F, -7.0F);
		wings.addChild(front_right_wing);
		front_right_wing.rotateAngleX = -0.1265F;
		front_right_wing.rotateAngleY = 0.0338F;
		front_right_wing.rotateAngleZ = 0.2597F;
		front_right_wing.cubeList.add(new ModelBox(front_right_wing, 76, 72, -3.0F, -1.0F, 0.0F, 7, 2, 2, 0.0F, false));
		front_right_wing.cubeList.add(new ModelBox(front_right_wing, 44, 0, -23.0F, -0.8695F, -2.0086F, 20, 2, 6, 0.0F, false));

		back_right_wing = new ModelRenderer(this);
		back_right_wing.setRotationPoint(-6.0F, -15.0F, 1.0F);
		wings.addChild(back_right_wing);
		back_right_wing.rotateAngleX = -0.1265F;
		back_right_wing.rotateAngleY = -0.0338F;
		back_right_wing.rotateAngleZ = -0.2597F;
		back_right_wing.cubeList.add(new ModelBox(back_right_wing, 22, 82, -3.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F, false));
		back_right_wing.cubeList.add(new ModelBox(back_right_wing, 44, 8, -23.0F, 0.1305F, -2.0086F, 20, 2, 6, 0.0F, false));

		back_left_wing = new ModelRenderer(this);
		back_left_wing.setRotationPoint(6.0F, -15.0F, 1.0F);
		wings.addChild(back_left_wing);
		back_left_wing.rotateAngleX = -0.1265F;
		back_left_wing.rotateAngleY = 0.0338F;
		back_left_wing.rotateAngleZ = 0.2597F;
		back_left_wing.cubeList.add(new ModelBox(back_left_wing, 40, 82, -4.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F, false));
		back_left_wing.cubeList.add(new ModelBox(back_left_wing, 44, 16, 3.0F, 0.1305F, -2.0086F, 20, 2, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		bone.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks,
								  float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
		float speed = 0.6f;
		float yDegree = 0.4f;
		float zDegree = 0.2f;

		// --- LEG PHASES ---
		float phaseFL = 0.0f;
		float phaseML = (float)Math.PI / 3;
		float phaseBL = (float)Math.PI * 2 / 3;
		float phaseFR = (float)Math.PI;
		float phaseMR = (float)Math.PI * 4 / 3;
		float phaseBR = (float)Math.PI * 5 / 3;

		// --- LEG ANIMATIONS ---
		front_left_leg.rotateAngleY   = MathHelper.cos(limbSwing * speed + phaseFL) * yDegree * limbSwingAmount;
		middle_left_leg.rotateAngleY  = MathHelper.cos(limbSwing * speed + phaseML) * yDegree * limbSwingAmount;
		back_left_leg.rotateAngleY    = MathHelper.cos(limbSwing * speed + phaseBL) * yDegree * limbSwingAmount;
		front_right_leg.rotateAngleY  = MathHelper.cos(limbSwing * speed + phaseFR) * yDegree * limbSwingAmount;
		middle_right_leg.rotateAngleY = MathHelper.cos(limbSwing * speed + phaseMR) * yDegree * limbSwingAmount;
		back_right_leg.rotateAngleY   = MathHelper.cos(limbSwing * speed + phaseBR) * yDegree * limbSwingAmount;

		front_left_leg.rotateAngleZ   = MathHelper.sin(limbSwing * speed + phaseFL) * zDegree * limbSwingAmount;
		middle_left_leg.rotateAngleZ  = MathHelper.sin(limbSwing * speed + phaseML) * zDegree * limbSwingAmount;
		back_left_leg.rotateAngleZ    = MathHelper.sin(limbSwing * speed + phaseBL) * zDegree * limbSwingAmount;
		front_right_leg.rotateAngleZ  = -MathHelper.sin(limbSwing * speed + phaseFR) * zDegree * limbSwingAmount;
		middle_right_leg.rotateAngleZ = -MathHelper.sin(limbSwing * speed + phaseMR) * zDegree * limbSwingAmount;
		back_right_leg.rotateAngleZ   = -MathHelper.sin(limbSwing * speed + phaseBR) * zDegree * limbSwingAmount;

		// --- BODY BOBBING + TILT ---
		bone.rotationPointY = 16.0F + MathHelper.sin(limbSwing * speed) * 1.0F * limbSwingAmount;
		body.rotateAngleX = -0.1309F + MathHelper.sin(limbSwing * speed * 2) * 0.05F * limbSwingAmount;

		// --- SPORADIC WING FLAPPING ---
		int flapCycle = 60; // Try to flap once every ~3 seconds (20 ticks/sec)
		int flapDuration = 10; // Lasts for 10 ticks
		int tick = entity.ticksExisted % flapCycle;

		if (tick < flapDuration) {
			float wingFlap = MathHelper.sin(ageInTicks * 1.5F) * 0.1F;  // small and quick
			front_left_wing.rotateAngleZ = wingFlap;
			back_left_wing.rotateAngleZ = wingFlap * 0.6F;
			front_right_wing.rotateAngleZ = -wingFlap;
			back_right_wing.rotateAngleZ = -wingFlap * 0.6F;
		} else {
			front_left_wing.rotateAngleZ = 0.0F;
			back_left_wing.rotateAngleZ = 0.0F;
			front_right_wing.rotateAngleZ = 0.0F;
			back_right_wing.rotateAngleZ = 0.0F;
		}

	}
}