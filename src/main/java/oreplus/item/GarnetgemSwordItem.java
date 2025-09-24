package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GarnetgemSwordItem extends SwordItem {
	public GarnetgemSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1702;
			}

			public float getSpeed() {
				return 8.3f;
			}

			public float getAttackDamageBonus() {
				return 3.3f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.GARNET.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}