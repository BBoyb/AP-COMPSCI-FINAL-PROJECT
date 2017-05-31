package tealsmc.mods.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import tealsmc.mods.blocks.BlocksModule;

public class InfectedBlock extends Block{
	public InfectedBlock(Material mat){
		super(mat);//initilization
		setCreativeTab(CreativeTabs.tabBlock);//creative tab
		setStepSound(Block.soundTypeCloth);//when stepped on sounds like cloth
	}
	public void randomDisplayTick(World world, int x, int y, int z, Random random){
		double decx = Math.random();//decision for x, y, and z
		double decy = Math.random();
		double decz = Math.random();
		
		if(decx < .3){//x
			x += 1;
		}else if(decx < .6){
			x -= 1;
		}
		if(decy < .3){//y
			y += 1;
		}else if(decy < .6){
			y -= 1;
		}
		if(decz < .3){//z
			z += 1;
		}else if(decz < .6){
			z -= 1;
		}//the the block isn't air, make the designated block a infection block
		if(!((Blocks.air.getUnlocalizedName()).equals(world.getBlock(x, y, z).getUnlocalizedName()))){
			world.setBlock(x, y, z, BlocksModule.infectedBlock);
		}
	}
}
