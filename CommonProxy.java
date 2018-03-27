package mcneb10stuff.mod.proxy;

import mcneb10stuff.mod.MAIN_CLASS;
import mcneb10stuff.mod.tileentity.TileEntityTV;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void registerRenders() {
		
	}
	
	public void registerTileEnties() {
		GameRegistry.registerTileEntity(TileEntityTV.class, MAIN_CLASS.MODID + ":tv");
	}


	public void registerModelBakeryVariants() {
		
		
	}
	
}
