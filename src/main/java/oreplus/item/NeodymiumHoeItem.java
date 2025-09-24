package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class NeodymiumHoeItem extends HoeItem {
	public NeodymiumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 844;
			}

			public float getSpeed() {
				return 6.9f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
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
		}, 0, -1f, new Item.Properties());
	}
}