package tealsmc.mods.entities;

import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.world.World;
import org.tealsk12.tealsmodloader.builtin.entity.Robot;

public class LeafBot extends Robot {

    public LeafBot (World world) {
        super(world);//initialization
        tasks.addTask(1, new EntityAIWander(this, SPEED_NORMAL));//wander
        tasks.addTask(2, new EntityAIConvertLeaves(this));//convert things to leaves
    }
}
