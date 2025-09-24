package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NickelSwordItem extends SwordItem {
	public NickelSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 976;
			}

			public float getSpeed() {
				return 7.1f;
			}

			public float getAttackDamageBonus() {
				return 2.6f;
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
		}, 3, -2.4f, new Item.Properties());
	}
}