package tealsmc.mods.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;


public class RockSifter extends Item {

    public RockSifter() {
    	setMaxStackSize(1);//most can be held is 1
    	setCreativeTab(CreativeTabs.tabTools);//in tab tools
    	
    }
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
    	int count = 0;//when item is right clicked on, turn any cobble into sand. Makes player inventory into an array and manipulates it accordingly
    	ItemStack[] inventory = player.inventory.mainInventory;
    	for(int i = 0; i < inventory.length; i++){
    		if(inventory[i] != null){
    			String itemName = inventory[i].getItem().getUnlocalizedName();
    			if (itemName.equals(Blocks.sand.getUnlocalizedName())) {
    				for(int j = 1; j <= inventory[i].stackSize; j++){
    					if(Math.random() <= 0.1){
    						count++;
    					}
    				}//adds chance of giving player a golden nugget when sifting
    				inventory[i] = new ItemStack(Items.gold_nugget, count);
    				count = 0;
    			}
        	}
    	}
    	return stack;
    }
}
