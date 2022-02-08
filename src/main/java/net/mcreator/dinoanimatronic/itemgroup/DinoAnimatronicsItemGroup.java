
package net.mcreator.dinoanimatronic.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.dinoanimatronic.DinoanimatronicModElements;

@DinoanimatronicModElements.ModElement.Tag
public class DinoAnimatronicsItemGroup extends DinoanimatronicModElements.ModElement {
	public DinoAnimatronicsItemGroup(DinoanimatronicModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdino_animatronics") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
