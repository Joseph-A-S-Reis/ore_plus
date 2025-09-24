package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ZincItem extends Item {
	public ZincItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}