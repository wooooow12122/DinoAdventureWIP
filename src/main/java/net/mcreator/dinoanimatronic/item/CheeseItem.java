
package net.mcreator.dinoanimatronic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.dinoanimatronic.itemgroup.DinoAnimatronicsItemGroup;
import net.mcreator.dinoanimatronic.DinoanimatronicModElements;

import java.util.List;

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
			super(new Item.Properties().group(DinoAnimatronicsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(1f)

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
			list.add(new StringTextComponent("Cheese"));
		}
	}
}
