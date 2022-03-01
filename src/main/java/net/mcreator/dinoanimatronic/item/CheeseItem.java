
package net.mcreator.dinoanimatronic.item;

@DinoanimatronicModElements.ModElement.Tag
public class CheeseItem extends DinoanimatronicModElements.ModElement {

	@ObjectHolder("dinoanimatronic:cheese")
	public static final Item block = null;

	public CheeseItem(DinoanimatronicModElements instance) {
		super(instance, 17);
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
			setRegistryName("cheese");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Cheses"));
		}

	}

}