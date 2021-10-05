
package net.mcreator.angrybirddimention.item;

@AngryBirdDimentionModElements.ModElement.Tag
public class FrogRibbetItem extends AngryBirdDimentionModElements.ModElement {

	@ObjectHolder("angry_bird_dimention:frog_ribbet")
	public static final Item block = null;

	public FrogRibbetItem(AngryBirdDimentionModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, AngryBirdDimentionModElements.sounds.get(new ResourceLocation("angry_bird_dimention:jazz_frog")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("frog_ribbet");
		}

	}

}
