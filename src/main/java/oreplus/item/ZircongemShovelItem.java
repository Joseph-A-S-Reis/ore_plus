package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ZircongemShovelItem extends ShovelItem {
	public ZircongemShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1655;
			}

			public float getSpeed() {
				return 8.2f;
			}

			public float getAttackDamageBonus() {
				return 0.95f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.ZIRCON_GEM.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}