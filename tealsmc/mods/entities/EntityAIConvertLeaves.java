package tealsmc.mods.entities;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.Blocks;

import org.tealsk12.tealsmodloader.builtin.entity.Robot;

public class EntityAIConvertLeaves extends EntityAIBase{
	private Robot a;//stores robot id
	
	public EntityAIConvertLeaves(Robot in){
		a = in;//sets robot id
	}
	public boolean shouldExecute(){// 1 / 20 chance of action executing
		double r = Math.random();
		double rr = Math.random();
		if(r < .5 && rr < .1){
			return true;
		}
		return false;
	}
	public void startExecuting(){//Creation of random numbers and locations for XYZ coords
		double x = Math.random();
		double y = Math.random();
		double z = Math.random();
		int xx = 0;
		int yy = 0;
		int zz = 0;
		if(x >= .7){
			xx += 2;
		}else if(x >= .3){
			xx--;
		}if(y >= .7){
			yy += 2;
		}else if(y >= .3){
			yy--;
		}if(z >= .7){
			zz += 2;
		}else if(z >= .3){
			zz--;
		}
		//checks to see if block to replace isn't air or a leaf, if not, it replaces it with a leaf
		String block = a.worldObj.getBlock((int)a.posX + xx, (int)a.posY + yy, (int)a.posZ + zz).getUnlocalizedName();
		if(!(block.equals(Blocks.air.getUnlocalizedName()) || block.equals(Blocks.leaves.getUnlocalizedName()))){
			a.worldObj.setBlock((int) a.posX + xx,(int) a.posY + yy, (int)a.posZ + zz, Blocks.leaves);
			System.out.println(block);
		}
	}
	public boolean continueExecuting(){
		return false;
	}
}
