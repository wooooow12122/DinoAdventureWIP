
package net.mcreator.dinoanimatronic.item;

import net.minecraft.entity.ai.attributes.Attributes;

@DinoanimatronicModElements.ModElement.Tag
public class SpearItem extends DinoanimatronicModElements.ModElement {

	@ObjectHolder("dinoanimatronic:spear")
	public static final Item block = null;

	public SpearItem(DinoanimatronicModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("spear"));
	}

}
