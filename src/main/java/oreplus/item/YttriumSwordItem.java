package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class YttriumSwordItem extends SwordItem {
	public YttriumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 712;
			}

			public float getSpeed() {
				return 6.7f;
			}

			public float getAttackDamageBonus() {
				return 2.4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.YTTRIUM_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}