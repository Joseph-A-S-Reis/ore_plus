package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BronzePickaxeItem extends PickaxeItem {
	public BronzePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1636;
			}

			public float getSpeed() {
				return 8.1f;
			}

			public float getAttackDamageBonus() {
				return 3.1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.BRONZE.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}