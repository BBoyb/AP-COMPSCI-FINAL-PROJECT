package tealsmc.mods.entities;

import org.tealsk12.tealsmodloader.builtin.entity.Robot;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class VirusRobot extends Robot{
	public static final long lifetime = 20000;
	public long expirationTime;
	public VirusRobot(World w){
		super(w);
		tasks.addTask(1, new EntityAIWander(this, SPEED_FAST));//wandering task
		tasks.addTask(2, new EntityAIInfect(this));//infection task
		expirationTime = lifetime + System.currentTimeMillis();//sets the lifetime of mob
	}
	public void onUpdate(){
		super.onUpdate();//if mob has lived too long, kill it
		if(System.currentTimeMillis() > expirationTime){
			this.damageEntity(new DamageSource("Died from old age"), getHealth());
		}
	}
}
