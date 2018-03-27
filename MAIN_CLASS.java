package mcneb10stuff.mod;

import mcneb10stuff.mod.creativetabs.TabBOE;
import mcneb10stuff.mod.init.MW1FBlocks;
import mcneb10stuff.mod.init.MW1FItems;
import mcneb10stuff.mod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(name = MAIN_CLASS.NAME, modid = MAIN_CLASS.MODID, version = MAIN_CLASS.VERSION, dependencies = "required-after:m10sc" + "required-before:rds")
public class MAIN_CLASS {
	
	@SidedProxy(clientSide = "mcneb10stuff.mod.proxy.ClientProxy", serverSide = "mcneb10stuff.mod.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	public static final CreativeTabs TAB = new TabBOE();
	    
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)

	    {
	    	MW1FBlocks.init();
	    	MW1FItems.init();
	    	MW1FBlocks.register();
	    	MW1FItems.register();
	    	
	    	proxy.registerRenders();
	    	proxy.registerTileEnties();
	    }
	    
	    @EventHandler
	    public void init(FMLInitializationEvent event) {
	    
	    	
	    }
	    
	    @EventHandler
	    public void init(FMLPostInitializationEvent event)  {
	    }
	    
	 public static final String NAME = "Mod With 1 file (Not True)";
	 public static final String MODID = "boe"; 
	 public static final String VERSION = "1.0";
	 public static final String CLIENT_PROXY = "mcneb10stuff.mod.proxy.ClientProxy";
	 public static final String SERVER_PROXY = "mcneb10stuff.mod.proxy.CommonProxy";

	 
}
		
	


	

