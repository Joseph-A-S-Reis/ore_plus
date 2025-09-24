package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmeralddustItem extends Item {
	public EmeralddustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}