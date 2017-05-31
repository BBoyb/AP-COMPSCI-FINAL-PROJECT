package tealsmc.mods.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;


public class EntityAIInfect extends EntityAIBase{
	private VirusRobot virusbot;
	private EntityLivingBase target;
	public EntityAIInfect(VirusRobot vr){
		virusbot = vr;//stores entity ID
	}
	public boolean shouldExecute(){//ticker to test if it should keep trying to attack / convert
		if(virusbot.getAttackTarget() == null){
			return false;
		}
		return true;
	}
	public void startExecuting(){//get attacking target
		target = virusbot.getAttackTarget();
	}
	public boolean continueExecuting(){//checks if target is real or dead
		if(target.isDead || virusbot.getAttackTarget() == null){
			return false;
		}
		return true;
	}
	public void updateTask(){//finds target, sets speed fast, and then coverts the target to the same type as it
		if(continueExecuting()){
			virusbot.getNavigator().tryMoveToEntityLiving(target, virusbot.SPEED_FAST);
			if(virusbot.getDistanceToEntity(target) <= 2){
				VirusRobot newbot = new VirusRobot(target.worldObj);
				newbot.setLocationAndAngles(target.posX, target.posY + 1, target.posZ, 0, 0);//sets spawn location
				target.worldObj.spawnEntityInWorld(newbot);//spawns
				target.setDead();
				virusbot.expirationTime = (virusbot.expirationTime + 5000);//KILLING SPREE (stays alive longer if it kills an object)
			}
		}
	}
}
