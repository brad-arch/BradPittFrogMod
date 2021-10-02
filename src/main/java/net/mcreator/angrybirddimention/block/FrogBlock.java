
package net.mcreator.angrybirddimention.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.angrybirddimention.item.FrogDimensionItem;
import net.mcreator.angrybirddimention.AngryBirdDimentionModElements;

import java.util.List;
import java.util.Collections;

@AngryBirdDimentionModElements.ModElement.Tag
public class FrogBlock extends AngryBirdDimentionModElements.ModElement {
	@ObjectHolder("angry_bird_dimention:frog")
	public static final Block block = null;
	public FrogBlock(AngryBirdDimentionModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.GROUND).hardnessAndResistance(5.7f, 10f).setLightLevel(s -> 14)
					.slipperiness(0.7f).jumpFactor(3.9999999999999996f).setNeedsPostProcessing((bs, br, bp) -> true)
					.setEmmisiveRendering((bs, br, bp) -> true));
			setRegistryName("frog");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(FrogDimensionItem.block));
		}
	}
}
