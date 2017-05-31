package tealsmc.mods.blocks;

import org.tealsk12.tealsmodloader.Common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class CheckeredBlock extends Block {
	
	private IIcon[] textures = new IIcon[2];
	
	public CheckeredBlock(){
		super(Material.rock);//make the block out of rock
		setCreativeTab(CreativeTabs.tabBlock);//put it in the creative tab
	}
	public void registerBlockIcons(IIconRegister iconRegister){//register the textures 
		textures[0] = iconRegister.registerIcon(Common.MOD_ID + ":black");
		textures[1] = iconRegister.registerIcon(Common.MOD_ID + ":white");
	}
	public IIcon getIcon(int side, int meta){
		return textures[1];//set texture to a side
	}
	public IIcon getIcon(IBlockAccess worldAccess, int x, int y, int z, int meta){
		if(x % 2 == 0){//find the coordinates of the block and decided the texture based on where it is to make a checkerboard patterm
			if(z % 2 == 0){
				if(y % 2 == 0){
					return textures[0];
				}else{
					return textures[1];
				}
			}else{
				if(y % 2 == 0){
					return textures[1];
				}else{
					return textures[0];
				}
			}
		}else{
			if(z % 2 == 0){
				if(y % 2 == 0){
					return textures[1];
				}else{
					return textures[0];
				}
			}else{
				if(y % 2 == 0){
					return textures[0];
				}else{
					return textures[1];
				}
			}
		}
	}
	
}
