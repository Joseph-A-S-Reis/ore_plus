package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KyaniteItem extends Item {
	public KyaniteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}