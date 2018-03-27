package mcneb10stuff.mod.init;

import mcneb10api.m10sc.utils.Utils;
import mcneb10stuff.mod.MAIN_CLASS;
import mcneb10stuff.mod.handlers.EnumHandler;
import mcneb10stuff.mod.items.ItemClassIngot;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class MW1FItems {

	public static Item cotton;
	public static Item class_ingot;
	
	public static void init() {
		cotton = new ItemSeeds(MW1FBlocks.cotton, Blocks.FARMLAND).setUnlocalizedName("cotton").setRegistryName(new ResourceLocation(MAIN_CLASS.MODID, "cotton"));
		class_ingot = new ItemClassIngot("interface_ingot");
	}
	
	public static void register() {
		registerItem(cotton);
		registerItem(class_ingot);
	}
	
	public static void registerItem(Item item) {
		item.setCreativeTab(MAIN_CLASS.TAB);
		GameRegistry.register(item);
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(MAIN_CLASS.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
	
	public static void registerRenders() {
		registerRender(cotton);
		for(int i = 0; i < EnumHandler.ClassTypes.values().length; i++) {
			registerRender(class_ingot, i, "file_" + EnumHandler.ClassTypes.values()[i].getName());
		}
	}
		
		public static void registerRender(Item item, int meta, String fileName) {
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(MAIN_CLASS.MODID, fileName), "inventory"));
		}
		
	}
	
