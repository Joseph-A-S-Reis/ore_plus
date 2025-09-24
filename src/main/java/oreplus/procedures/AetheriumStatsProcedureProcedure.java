package oreplus.procedures;

import oreplus.init.OrePlusModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class AetheriumStatsProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OrePlusModItems.AETHERIUM_TOOL.get()) {
			itemstack.enchant(Enchantments.BLOCK_FORTUNE, 5);
			itemstack.enchant(Enchantments.MOB_LOOTING, 5);
		}
	}
}