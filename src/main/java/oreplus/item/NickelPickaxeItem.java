package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NickelPickaxeItem extends PickaxeItem {
	public NickelPickaxeItem() {
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
		}, 1, -2.8f, new Item.Properties());
	}
}