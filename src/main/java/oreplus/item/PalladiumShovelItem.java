package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PalladiumShovelItem extends ShovelItem {
	public PalladiumShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 514;
			}

			public float getSpeed() {
				return 6.4f;
			}

			public float getAttackDamageBonus() {
				return 0.45f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.PALLADIUM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}