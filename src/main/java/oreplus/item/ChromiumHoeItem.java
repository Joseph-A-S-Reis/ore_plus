package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class ChromiumHoeItem extends HoeItem {
	public ChromiumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 712;
			}

			public float getSpeed() {
				return 6.7f;
			}

			public float getAttackDamageBonus() {
				return 0.4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.CHROMIUM_INGOT.get()));
			}
		}, 0, -1f, new Item.Properties());
	}
}