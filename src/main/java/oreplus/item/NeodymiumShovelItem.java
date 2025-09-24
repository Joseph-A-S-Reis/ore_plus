package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NeodymiumShovelItem extends ShovelItem {
	public NeodymiumShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 844;
			}

			public float getSpeed() {
				return 6.9f;
			}

			public float getAttackDamageBonus() {
				return 0.7f;
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
		}, 1, -3f, new Item.Properties());
	}
}