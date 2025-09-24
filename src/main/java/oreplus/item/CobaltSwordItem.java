package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CobaltSwordItem extends SwordItem {
	public CobaltSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1306;
			}

			public float getSpeed() {
				return 7.6f;
			}

			public float getAttackDamageBonus() {
				return 2.8f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 9;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.COBALT_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}