package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class LanthaniumPickaxeItem extends PickaxeItem {
	public LanthaniumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 646;
			}

			public float getSpeed() {
				return 6.6f;
			}

			public float getAttackDamageBonus() {
				return 2.3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.LANTHANIUM_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}