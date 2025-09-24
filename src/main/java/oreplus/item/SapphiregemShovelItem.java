package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SapphiregemShovelItem extends ShovelItem {
	public SapphiregemShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1890;
			}

			public float getSpeed() {
				return 8.7f;
			}

			public float getAttackDamageBonus() {
				return 1.45f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.SAPPHIRE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}