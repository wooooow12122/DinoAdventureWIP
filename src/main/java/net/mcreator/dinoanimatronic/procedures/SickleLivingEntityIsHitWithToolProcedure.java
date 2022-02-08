package net.mcreator.dinoanimatronic.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.dinoanimatronic.DinoanimatronicMod;

import java.util.Map;

public class SickleLivingEntityIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DinoanimatronicMod.LOGGER.warn("Failed to load dependency entity for procedure SickleLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
