package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AethelgardPickaxeItem extends PickaxeItem {
	public AethelgardPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2302;
			}

			public float getSpeed() {
				return 9.4f;
			}

			public float getAttackDamageBonus() {
				return 4.3f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.AETHELGARD_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties().fireResistant());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}