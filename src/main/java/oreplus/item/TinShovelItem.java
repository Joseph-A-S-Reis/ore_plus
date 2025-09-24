package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class TinShovelItem extends ShovelItem {
	public TinShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 316;
			}

			public float getSpeed() {
				return 6.1f;
			}

			public float getAttackDamageBonus() {
				return 0.3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 6;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.TIN.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}