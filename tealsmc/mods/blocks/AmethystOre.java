package tealsmc.mods.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AmethystOre extends BlockFalling {

    public AmethystOre() {
        super (Material.rock);   //creates block in rock form
        setCreativeTab(CreativeTabs.tabBlock);//in tab block
    }
    
}
