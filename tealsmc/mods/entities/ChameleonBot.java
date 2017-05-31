package tealsmc.mods.entities;

import org.tealsk12.tealsmodloader.builtin.entity.Robot;

import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.world.World;

public class ChameleonBot extends Robot{
	public ChameleonBot(World w){
		super(w);//Designates world to entity
		tasks.addTask(1,(new EntityAIWander(this, SPEED_SLOW)));//allows the entity to wander at slow speed
		tasks.addTask(2,(new EntityAIDisguise(this)));//Allows entity to disguise itself
	}
}