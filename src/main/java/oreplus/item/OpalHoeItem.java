package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class OpalHoeItem extends HoeItem {
	public OpalHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1937;
			}

			public float getSpeed() {
				return 8.8f;
			}

			public float getAttackDamageBonus() {
				return 0.8f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.OPAL.get()));
			}
		}, 0, -1f, new Item.Properties());
	}
}