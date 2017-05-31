package tealsmc.mods.blocks;

import org.tealsk12.tealsmodloader.Common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BatteryBlock extends Block {
	private IIcon[] textures = new IIcon[3];
	
	public BatteryBlock(){
		super (Material.rock);  //creates material in rock form
        setCreativeTab(CreativeTabs.tabBlock);//creative tab blocks
	}
	public void registerBlockIcons(IIconRegister iconRegister){//registering textures
		textures[0] = iconRegister.registerIcon(Common.MOD_ID + ":battery_top");
		textures[1] = iconRegister.registerIcon(Common.MOD_ID + ":battery_bottom");
		textures[2] = iconRegister.registerIcon(Common.MOD_ID + ":battery_side");
	}
	public IIcon getIcon(int side, int meta){
		if(side == 0){//registers the correct texture depending on the side
			return textures[1];
		}else if(side == 1){
			return textures[0];
		}else{
			return textures[2];
		}
	}
}
