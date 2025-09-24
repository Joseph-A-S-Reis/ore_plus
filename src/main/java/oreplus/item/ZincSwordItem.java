package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ZincSwordItem extends SwordItem {
	public ZincSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 382;
			}

			public float getSpeed() {
				return 6.2f;
			}

			public float getAttackDamageBonus() {
				return 2.1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 6;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.ZINC.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}