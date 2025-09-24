package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TinItem extends Item {
	public TinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}