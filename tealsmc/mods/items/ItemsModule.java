package tealsmc.mods.items;

import org.tealsk12.tealsmodloader.module.Module;

public class ItemsModule extends Module {
//adds items to game so they can be used and tested
    public static final RockSifter rockSifter = new RockSifter();
    public static final CrystalGrowingItem crystalGrowingItem = new CrystalGrowingItem();
    public void onLoad() {
        parentMod.itemRegistry.newInstance("rock_sifter", rockSifter, "Rock Sifter");
        parentMod.itemRegistry.newInstance("crystal_growing_item", crystalGrowingItem, "Crystal Growing Item");
    }
}
