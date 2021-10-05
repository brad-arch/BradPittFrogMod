
package net.mcreator.angrybirddimention.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.angrybirddimention.block.FrogBlock;
import net.mcreator.angrybirddimention.AngryBirdDimentionModElements;

@AngryBirdDimentionModElements.ModElement.Tag
public class FrogArmourItem extends AngryBirdDimentionModElements.ModElement {
	@ObjectHolder("angry_bird_dimention:frog_armour_helmet")
	public static final Item helmet = null;
	@ObjectHolder("angry_bird_dimention:frog_armour_chestplate")
	public static final Item body = null;
	@ObjectHolder("angry_bird_dimention:frog_armour_leggings")
	public static final Item legs = null;
	@ObjectHolder("angry_bird_dimention:frog_armour_boots")
	public static final Item boots = null;
	public FrogArmourItem(AngryBirdDimentionModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 999;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{999, 999, 999, 999}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 80;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.basalt_deltas.loop"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(FrogDimensionItem.block), new ItemStack(FrogBlock.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "frog_armour";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "angry_bird_dimention:textures/models/armor/frogarmour_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("frog_armour_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "angry_bird_dimention:textures/models/armor/frogarmour_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("frog_armour_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "angry_bird_dimention:textures/models/armor/frogarmour_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("frog_armour_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "angry_bird_dimention:textures/models/armor/frogarmour_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("frog_armour_boots"));
	}
}
