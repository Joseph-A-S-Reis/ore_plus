package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MolybdenumItem extends Item {
	public MolybdenumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}