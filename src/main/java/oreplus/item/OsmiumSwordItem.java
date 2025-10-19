package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class OsmiumSwordItem extends SwordItem {
	public OsmiumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1504;
			}

			public float getSpeed() {
				return 7.9f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.OSMIUM_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}