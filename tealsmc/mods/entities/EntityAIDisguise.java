package tealsmc.mods.entities;

import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIDisguise extends EntityAIBase{
	private ChameleonBot robot;
	public EntityAIDisguise(ChameleonBot bot){//gets the desired bot
		robot = bot;
	}
	public void startExecuting(){
		//?
	}
	public boolean shouldExecute(){ 
		return true;//?
	}
	public void resetTask(){
		//?
	}
	public boolean continueExecuting(){
		return true;//?
	}
}
