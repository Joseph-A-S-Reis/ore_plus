package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class OsmiumPickaxeItem extends PickaxeItem {
	public OsmiumPickaxeItem() {
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
		}, 1, -2.8f, new Item.Properties());
	}
}