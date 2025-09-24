package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class OrichalcumShovelItem extends ShovelItem {
	public OrichalcumShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1438;
			}

			public float getSpeed() {
				return 7.8f;
			}

			public float getAttackDamageBonus() {
				return 1.15f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.ORICHALCUM.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}