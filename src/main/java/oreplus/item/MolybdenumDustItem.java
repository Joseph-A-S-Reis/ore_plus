package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MolybdenumDustItem extends Item {
	public MolybdenumDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}