
package net.mcreator.angrybirddimention.item;

@AngryBirdDimentionModElements.ModElement.Tag
public class FrogPickaxeItem extends AngryBirdDimentionModElements.ModElement {

	@ObjectHolder("angry_bird_dimention:frog_pickaxe")
	public static final Item block = null;

	public FrogPickaxeItem(AngryBirdDimentionModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 100000f;
			}

			public float getAttackDamage() {
				return 2.8999999999999995f;
			}

			public int getHarvestLevel() {
				return 30;
			}

			public int getEnchantability() {
				return 100000;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BetterBetterFrogBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {

			@Override
			public boolean hasContainerItem() {
				return true;
			}

			@Override
			public ItemStack getContainerItem(ItemStack itemstack) {
				return new ItemStack(this);
			}

			@Override
			public boolean isRepairable(ItemStack itemstack) {
				return false;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Very Ribbet Like"));
			}

		}.setRegistryName("frog_pickaxe"));
	}

}
