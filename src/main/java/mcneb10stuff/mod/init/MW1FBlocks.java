package mcneb10stuff.mod.init;

import cjminecraft.core.energy.compat.forge.CustomForgeEnergyStorage;
import mcneb10stuff.mod.MAIN_CLASS;
import mcneb10stuff.mod.blocks.BlockCotton;
import mcneb10stuff.mod.blocks.BlockTV;
import mcneb10stuff.mod.blocks.item.ItemTV;
import mcneb10stuff.mod.handlers.EnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MW1FBlocks {

	public static Block cotton;
	public static Block tv;
	
	public static void init() {
		cotton = new BlockCotton("cotton");
		tv = new BlockTV("tv");
	}
	
	public static void register() {
		GameRegistry.register(cotton);
		registerBlock(tv, new ItemTV(tv));
	}
	
	public static void registerBlock(Block block) {
		block.setCreativeTab(MAIN_CLASS.TAB);
		GameRegistry.register(block);
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock) {
		GameRegistry.register(block);
		GameRegistry.register(itemblock.setRegistryName(block.getRegistryName()));
	}
	
	public static void registerRenders() {
		for(int i = 0; i < EnumHandler.TVTypes.values().length; i++) {
			registerRender(tv, i, "tv_" +EnumHandler.TVTypes.values()[i].getName());
		}
	}
	
	public static void registerRender(Block block) {
		 ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(MAIN_CLASS.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
	
	public static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta,
				new ModelResourceLocation(new ResourceLocation(MAIN_CLASS.MODID, fileName), "inventory"));
}
	
	

}
