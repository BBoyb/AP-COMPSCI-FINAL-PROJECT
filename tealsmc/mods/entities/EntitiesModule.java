package tealsmc.mods.entities;

import org.tealsk12.tealsmodloader.module.Module;

public class EntitiesModule extends Module {

    public void onLoad() {//Registration of custom entites so that they could be added in game
        // Register custom TealsMC Mod Entities.
    	parentMod.entityRegistry.newInstance("leafbot", LeafBot.class, "blue_robot");
    	parentMod.entityRegistry.newInstance("virusbot", VirusRobot.class, "red_robot");
    	parentMod.entityRegistry.newInstance("chameleon", ChameleonBot.class, "rainbow_robot");
    }
}
