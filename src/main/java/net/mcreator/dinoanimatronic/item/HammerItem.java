
package net.mcreator.dinoanimatronic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.dinoanimatronic.DinoanimatronicModElements;

@DinoanimatronicModElements.ModElement.Tag
public class HammerItem extends DinoanimatronicModElements.ModElement {
	@ObjectHolder("dinoanimatronic:hammer")
	public static final Item block = null;

	public HammerItem(DinoanimatronicModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("hammer"));
	}
}
