
package net.mcreator.dinoanimatronic.item;

@DinoanimatronicModElements.ModElement.Tag
public class BurgerItem extends DinoanimatronicModElements.ModElement {

	@ObjectHolder("dinoanimatronic:burger")
	public static final Item block = null;

	public BurgerItem(DinoanimatronicModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("burger");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
