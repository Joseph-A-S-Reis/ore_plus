/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package oreplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class OrePlusModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == OrePlusModItems.CARBON.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == OrePlusModBlocks.CARBON_BLOCK.get().asItem())
			event.setBurnTime(14400);
	}
}