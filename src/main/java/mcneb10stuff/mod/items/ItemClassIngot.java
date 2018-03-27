package mcneb10stuff.mod.items;

import java.util.List;

import cjminecraft.core.energy.compat.forge.CustomForgeEnergyStorage;
import mcneb10stuff.mod.MAIN_CLASS;
import mcneb10stuff.mod.handlers.EnumHandler.ClassTypes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemClassIngot extends Item {

	public ItemClassIngot(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(MAIN_CLASS.MODID, unlocalizedName));
		this.setHasSubtypes(true);
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < ClassTypes.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; 1 < ClassTypes.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return this.getUnlocalizedName() + "." + ClassTypes.values()[i].getName();
			}
			else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + ClassTypes.CLASS.getName();
	}
	
}
