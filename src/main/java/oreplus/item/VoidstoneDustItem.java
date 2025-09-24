package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VoidstoneDustItem extends Item {
	public VoidstoneDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}