package com.purplik.reforgedarmory.client.renderer.armor.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;

public class ArmorModel<T extends LivingEntity> extends HumanoidModel<T> {

    public EquipmentSlot slot;
    ModelPart root;
    ModelPart modelHead;
    ModelPart modelBody;
    ModelPart modelLeft_arm;
    ModelPart modelRight_arm;
    ModelPart modelBelt;
    ModelPart modelLeft_leg;
    ModelPart modelRight_leg;
    ModelPart modelLeft_foot;
    ModelPart modelRight_foot;

    public ArmorModel(ModelPart root) {
        super(root);
        this.root = root;
        this.modelBelt = root.getChild("Belt");
        this.modelBody = root.getChild("Body");
        this.modelRight_foot = root.getChild("RightBoot");
        this.modelLeft_foot = root.getChild("LeftBoot");
        this.modelLeft_arm = root.getChild("LeftArm");
        this.modelRight_arm = root.getChild("RightArm");
        this.modelRight_leg = root.getChild("LeftLeg");
        this.modelLeft_leg = root.getChild("RightLeg");
        this.modelHead = root.getChild("Head");
    }

    public static PartDefinition createHumanoidAlias(MeshDefinition mesh) {
        PartDefinition root = mesh.getRoot();
        root.addOrReplaceChild("Body", new CubeListBuilder(), PartPose.ZERO);
        root.addOrReplaceChild("Belt", new CubeListBuilder(), PartPose.ZERO);
        root.addOrReplaceChild("Head", new CubeListBuilder(), PartPose.ZERO);
        root.addOrReplaceChild("LeftLeg", new CubeListBuilder(), PartPose.ZERO);
        root.addOrReplaceChild("LeftBoot", new CubeListBuilder(), PartPose.ZERO);
        root.addOrReplaceChild("RightLeg", new CubeListBuilder(), PartPose.ZERO);
        root.addOrReplaceChild("RightBoot", new CubeListBuilder(), PartPose.ZERO);
        root.addOrReplaceChild("LeftArm", new CubeListBuilder(), PartPose.ZERO);
        root.addOrReplaceChild("RightArm", new CubeListBuilder(), PartPose.ZERO);
        return root;
    }
}
