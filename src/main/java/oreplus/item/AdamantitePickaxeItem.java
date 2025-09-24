package oreplus.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

public class AdamantitePickaxeItem extends PickaxeItem {
	public AdamantitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1372;
			}

			public float getSpeed() {
				return 7.7f;
			}

			public float getAttackDamageBonus() {
				return 2.9f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 9;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2.8f, new Item.Properties());
	}
}