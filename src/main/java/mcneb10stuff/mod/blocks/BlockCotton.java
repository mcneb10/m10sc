package mcneb10stuff.mod.blocks;

import mcneb10stuff.mod.MAIN_CLASS;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.util.ResourceLocation;

public class BlockCotton extends BlockCrops {
	public BlockCotton(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(MAIN_CLASS.MODID, unlocalizedName));
	}
}
