package oreplus.item;

import oreplus.init.OrePlusModItems;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class PyraliteAxeItem extends AxeItem {
	public PyraliteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2776;
			}

			public float getSpeed() {
				return 10.1f;
			}

			public float getAttackDamageBonus() {
				return 8.7f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePlusModItems.PYRALITE_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}