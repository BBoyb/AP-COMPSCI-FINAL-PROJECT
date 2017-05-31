package tealsmc.mods.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class TreeCubeBlock extends Block{
	private int bH;
	private int sL;
	public TreeCubeBlock(Material material, int baseHeight, int size){
		super(material);//initilization
		setCreativeTab(CreativeTabs.tabBlock);//make it in a creative tab
		bH = baseHeight;//height
		sL = size;//size
	}
	public void onBlockAdded(World world, int locX, int locY, int locZ){//creation of the tree (algorithm to make the leaves)
		for(int i = 0 - (sL/2); i <= (sL / 2); i++){
			for(int j = 0 - (sL/2); j <= (sL / 2); j++){
				for(int k = 0- (sL/2); k <= (sL/2); k++){
					 world.setBlock(locX + i, locY + bH + j, locZ + k, Blocks.leaves);
				}
			}
		}
		for(int l = 0; l < bH; l++){
			world.setBlock(locX, locY + l, locZ, Blocks.log);
		}
	}
	
}
