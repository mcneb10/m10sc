package mcneb10stuff.mod.blocks;

import java.util.List;

import mcneb10stuff.mod.MAIN_CLASS;
import mcneb10stuff.mod.blocks.item.IMetaBlockName;
import mcneb10stuff.mod.handlers.EnumHandler.TVTypes;
import mcneb10stuff.mod.init.MW1FBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager.CullFace;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockTV extends Block implements IMetaBlockName {
	
	public static final PropertyEnum TYPE = PropertyEnum.create("type", TVTypes.class);
	public static final PropertyBool ACTIVATED = PropertyBool.create("activated");

	public BlockTV(String unlocalizedName) {
		super(Material.WOOD);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(MAIN_CLASS.MODID, unlocalizedName));
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, TVTypes.OLD).withProperty(ACTIVATED, Boolean.valueOf(false)));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {TYPE,ACTIVATED}); 
		}
	
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
		if(worldIn.isBlockPowered(pos)) {
			worldIn.setBlockState(pos, state.withProperty(ACTIVATED, Boolean.valueOf(true)), 2);
		}
		else {
			worldIn.setBlockState(pos, state.withProperty(ACTIVATED, Boolean.valueOf(false)), 2);
		}
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		TVTypes type = (TVTypes) state.getValue(TYPE);
		int meta = type.getID();
		return meta;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(TYPE, TVTypes.values()[meta]);
	}
	
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for(int i = 0; i < TVTypes.values().length; i++) {
			list.add(new ItemStack(itemIn, 1 ,i));
		}
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		return TVTypes.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	


	
	
}


