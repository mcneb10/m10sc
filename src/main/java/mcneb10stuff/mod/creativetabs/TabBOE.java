package mcneb10stuff.mod.creativetabs;

import mcneb10stuff.mod.init.MW1FItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabBOE extends CreativeTabs{

	public TabBOE() {
		super("boe");
	}

	@Override
	public Item getTabIconItem() {
		return MW1FItems.class_ingot;
	}
	
}
