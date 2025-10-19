package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class BismuthAxeItem extends AxeItem {
	public BismuthAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 580;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 7.3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.BISMUTH_INGOT.get()));
			}
		}, 1, -3.1f, new Item.Properties());
	}
}