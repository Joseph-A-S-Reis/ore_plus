package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class TanzaniteAxeItem extends AxeItem {
	public TanzaniteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1984;
			}

			public float getSpeed() {
				return 8.9f;
			}

			public float getAttackDamageBonus() {
				return 7.9f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.TANZANITE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}