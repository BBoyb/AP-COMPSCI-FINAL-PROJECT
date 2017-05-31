package tealsmc.mods.items;

import org.tealsk12.tealsmodloader.Common;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tealsmc.mods.blocks.BlocksModule;

public class CrystalGrowingItem extends Item{
	public CrystalGrowingItem(){
		setCreativeTab(CreativeTabs.tabTools);//in tab tools
	}
	//tests to see if area above the "Crystal Growing Block" is air. If it is, make a golden pillar and turn the block to coal
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz){
		if(BlocksModule.crystalGrowingBlock.getUnlocalizedName().equals(world.getBlock(x, y, z).getUnlocalizedName())/*block player clicked on is "Crystal growing block"*/){
			if((Blocks.air.getUnlocalizedName()).equals(world.getBlock(x, y + 1, z).getUnlocalizedName())){
				world.setBlock(x, y, z, Blocks.coal_block);
				for(int i = 1; i < 11; i++){
					world.setBlock(x, y+i, z, Blocks.gold_block);
				}
			}//replace block player clicked on with coal and block above it with a gold block
		}		
		return true;
	}
}
