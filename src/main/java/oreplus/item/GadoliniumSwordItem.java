package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GadoliniumSwordItem extends SwordItem {
	public GadoliniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 778;
			}

			public float getSpeed() {
				return 6.8f;
			}

			public float getAttackDamageBonus() {
				return 2.4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.GADOLINIUMINGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}