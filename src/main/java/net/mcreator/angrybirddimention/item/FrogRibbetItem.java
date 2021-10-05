
package net.mcreator.angrybirddimention.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.angrybirddimention.AngryBirdDimentionModElements;

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
			super(0, AngryBirdDimentionModElements.sounds.get(new ResourceLocation("angry_bird_dimention:shylittlefrogpleasework")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("frog_ribbet");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
