package oreplus.procedures;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class VoidstoneOreMiningConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OrePlusModItems.CELESTIUM_PICKAXE.get()) {
			return true;
		}
		return false;
	}
}