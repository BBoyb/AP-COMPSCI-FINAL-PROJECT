package tealsmc.mods.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CrystalGrowingBlock extends Block {
	public CrystalGrowingBlock(Material mat){
		super(mat);//initilization
		setCreativeTab(CreativeTabs.tabBlock);//creative tab blocks
		setHardness(40);//how hard it is to mine it
	}
}
