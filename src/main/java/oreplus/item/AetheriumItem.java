package oreplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AetheriumItem extends Item {
	public AetheriumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}