package mcneb10stuff.mod.proxy;

import mcneb10stuff.mod.MAIN_CLASS;
import mcneb10stuff.mod.init.MW1FBlocks;
import mcneb10stuff.mod.init.MW1FItems;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		MW1FItems.registerRenders();
		MW1FBlocks.registerRenders();
	}
	
	@Override
	public void registerModelBakeryVariants() {
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MW1FBlocks.tv), new ResourceLocation(MAIN_CLASS.MODID, "tv_old"), new ResourceLocation(MAIN_CLASS.MODID, "tv_new"));
	}
	
}
