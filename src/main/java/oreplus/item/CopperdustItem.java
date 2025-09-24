package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CopperdustItem extends Item {
	public CopperdustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}