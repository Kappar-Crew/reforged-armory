package com.purplik.reforgedarmory.client.renderer.armor.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class BanditArmorModel extends ArmorModel{
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("armormod", "banditarmor"), "main");

    public BanditArmorModel(ModelPart part) {
        super(part);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = HumanoidModel.createMesh(new CubeDeformation(0.0F), 0.0F);
        PartDefinition root = createHumanoidAlias(mesh);
        PartDefinition head = root.getChild("Head");
        //head.addOrReplaceChild("bb_main", CubeListBuilder.m_171558_().m_171514_(0, 54).m_171488_(-4.5F, -32.5F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).m_171514_(0, 54).m_171488_(-4.5F, -31.5F, -4.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 43).m_171488_(-4.5F, -31.5F, -2.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(0, 39).m_171488_(-3.5F, -31.5F, -4.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(18, 43).m_171488_(3.5F, -31.5F, -2.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(27, 55).m_171488_(3.5F, -31.5F, -4.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(18, 38).m_171488_(-3.5F, -31.5F, 3.5F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 35).m_171488_(-3.0F, -33.0F, -4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 35).m_171488_(-4.0F, -33.0F, -5.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 34).m_171488_(-5.0F, -32.0F, -5.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 39).m_171488_(-5.0F, -31.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 39).m_171488_(4.0F, -31.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 45).m_171488_(4.0F, -30.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 45).m_171488_(-5.0F, -30.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 51).m_171488_(-5.0F, -30.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 51).m_171488_(4.0F, -30.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(54, 38).m_171488_(-5.0F, -30.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(49, 38).m_171488_(4.0F, -30.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(54, 45).m_171488_(-5.0F, -30.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 45).m_171488_(4.0F, -30.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 25).m_171488_(4.0F, -30.0F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(48, 17).m_171488_(-5.0F, -30.0F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(44, 12).m_171488_(-4.0F, -30.0F, 4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
        return LayerDefinition.create(mesh, 64, 64);
    }

    /*public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.f_104203_ = x;
        modelRenderer.f_104204_ = y;
        modelRenderer.f_104205_ = z;
    }*/

}
