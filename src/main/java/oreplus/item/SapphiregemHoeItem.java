package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class SapphiregemHoeItem extends HoeItem {
	public SapphiregemHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1890;
			}

			public float getSpeed() {
				return 8.7f;
			}

			public float getAttackDamageBonus() {
				return 0.7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.SAPPHIRE.get()));
			}
		}, 0, 0f, new Item.Properties());
	}
}