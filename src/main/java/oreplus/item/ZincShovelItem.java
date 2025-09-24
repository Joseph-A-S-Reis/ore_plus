package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ZincShovelItem extends ShovelItem {
	public ZincShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 382;
			}

			public float getSpeed() {
				return 6.1f;
			}

			public float getAttackDamageBonus() {
				return 0.35f;
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
		}, 1, -3f, new Item.Properties());
	}
}