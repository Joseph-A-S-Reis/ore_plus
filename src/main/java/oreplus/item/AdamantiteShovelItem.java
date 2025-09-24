package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AdamantiteShovelItem extends ShovelItem {
	public AdamantiteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1372;
			}

			public float getSpeed() {
				return 7.7f;
			}

			public float getAttackDamageBonus() {
				return 1.1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 9;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.ADAMANTITE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}