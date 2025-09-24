package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AdamantiteHoeItem extends PickaxeItem {
	public AdamantiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1372;
			}

			public float getSpeed() {
				return 7.7f;
			}

			public float getAttackDamageBonus() {
				return -0.1f;
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
		}, 1, -1f, new Item.Properties());
	}
}