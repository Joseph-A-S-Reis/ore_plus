package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AlexandriteSwordItem extends SwordItem {
	public AlexandriteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1890;
			}

			public float getSpeed() {
				return 8.7f;
			}

			public float getAttackDamageBonus() {
				return 3.7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.ALEXANDRITE.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}