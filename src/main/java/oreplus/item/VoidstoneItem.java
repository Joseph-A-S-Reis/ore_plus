package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VoidstoneItem extends Item {
	public VoidstoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}