package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class NeodymiumAxeItem extends AxeItem {
	public NeodymiumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 844;
			}

			public float getSpeed() {
				return 6.9f;
			}

			public float getAttackDamageBonus() {
				return 7.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.NEODYMIUM_INGOT.get()));
			}
		}, 1, -3.1f, new Item.Properties());
	}
}