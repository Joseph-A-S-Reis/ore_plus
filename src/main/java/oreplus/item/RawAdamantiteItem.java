package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawAdamantiteItem extends Item {
	public RawAdamantiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}