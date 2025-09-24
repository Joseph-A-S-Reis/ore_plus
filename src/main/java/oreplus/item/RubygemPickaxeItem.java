package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class RubygemPickaxeItem extends PickaxeItem {
	public RubygemPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1843;
			}

			public float getSpeed() {
				return 8.6f;
			}

			public float getAttackDamageBonus() {
				return 3.6f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.RUBY.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}