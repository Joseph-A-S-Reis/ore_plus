package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class NickelHoeItem extends HoeItem {
	public NickelHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 976;
			}

			public float getSpeed() {
				return 7.1f;
			}

			public float getAttackDamageBonus() {
				return 0.6f;
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
		}, 0, -1f, new Item.Properties());
	}
}