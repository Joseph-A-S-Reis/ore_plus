package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class KyaniteShovelItem extends ShovelItem {
	public KyaniteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1749;
			}

			public float getSpeed() {
				return 8.4f;
			}

			public float getAttackDamageBonus() {
				return 1.15f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.KYANITE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}