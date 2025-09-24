package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class NickelAxeItem extends AxeItem {
	public NickelAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 976;
			}

			public float getSpeed() {
				return 7.1f;
			}

			public float getAttackDamageBonus() {
				return 7.6f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.NICKEL_INGOT.get()));
			}
		}, 1, -3.1f, new Item.Properties());
	}
}