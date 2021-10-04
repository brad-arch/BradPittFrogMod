// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfrog_model extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer FLLeg;
	private final ModelRenderer FRLeg;
	private final ModelRenderer BLLeg;
	private final ModelRenderer BLFoot;
	private final ModelRenderer BRLeg;
	private final ModelRenderer BRFoot;

	public Modelfrog_model() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 19.0F, 4.0F);
		setRotationAngle(Body, -0.1745F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -9.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		FLLeg = new ModelRenderer(this);
		FLLeg.setRotationPoint(3.0F, 2.0F, -9.0F);
		Body.addChild(FLLeg);
		setRotationAngle(FLLeg, 0.0873F, 0.0F, 0.0F);
		FLLeg.setTextureOffset(22, 15).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		FRLeg = new ModelRenderer(this);
		FRLeg.setRotationPoint(-3.0F, 2.0F, -9.0F);
		Body.addChild(FRLeg);
		setRotationAngle(FRLeg, 0.0873F, 0.0F, 0.0F);
		FRLeg.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		BLLeg = new ModelRenderer(this);
		BLLeg.setRotationPoint(3.0F, 1.0F, -2.0F);
		Body.addChild(BLLeg);
		setRotationAngle(BLLeg, 0.0873F, 0.0F, 0.0F);
		BLLeg.setTextureOffset(0, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		BLFoot = new ModelRenderer(this);
		BLFoot.setRotationPoint(0.0F, 3.0F, 4.0F);
		BLLeg.addChild(BLFoot);
		setRotationAngle(BLFoot, 0.0873F, 0.0F, 0.0F);
		BLFoot.setTextureOffset(11, 16).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);

		BRLeg = new ModelRenderer(this);
		BRLeg.setRotationPoint(-3.0F, 1.0F, -2.0F);
		Body.addChild(BRLeg);
		setRotationAngle(BRLeg, 0.0873F, 0.0F, 0.0F);
		BRLeg.setTextureOffset(22, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		BRFoot = new ModelRenderer(this);
		BRFoot.setRotationPoint(0.0F, 3.0F, 4.0F);
		BRLeg.addChild(BRFoot);
		setRotationAngle(BRFoot, 0.0873F, 0.0F, 0.0F);
		BRFoot.setTextureOffset(0, 15).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}