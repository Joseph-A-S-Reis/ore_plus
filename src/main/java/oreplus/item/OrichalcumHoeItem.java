package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class OrichalcumHoeItem extends HoeItem {
	public OrichalcumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1438;
			}

			public float getSpeed() {
				return 7.8f;
			}

			public float getAttackDamageBonus() {
				return 0.9f;
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
		}, 0, -1f, new Item.Properties());
	}
}