package tealsmc.mods.blocks;

import org.tealsk12.tealsmodloader.module.Module;

import net.minecraft.block.material.Material;

/**
 * All TEALS mod blocks are registered here in order to be displayed in game.
 * All of the custom blocks you will create in the future should be registered
 * here.
 */
public class BlocksModule extends Module {
//registers blocks so that they can be used in game
    public static final AmethystOre amethystOre = new AmethystOre();
    public static final BatteryBlock batteryBlock = new BatteryBlock();
    public static final CheckeredBlock checkeredBlock = new CheckeredBlock();
    public static final CrystalGrowingBlock crystalGrowingBlock = new CrystalGrowingBlock(Material.glass);
    public static final InfectedBlock infectedBlock = new InfectedBlock(Material.glass);
    public static final TreeCubeBlock treeCubeBlock = new TreeCubeBlock(Material.wood, 10, 5);
    public void onLoad() {
        parentMod.blockRegistry.newInstance("amethyst_ore", amethystOre, "Amethyst Ore");
        parentMod.blockRegistry.newInstance("a", batteryBlock, "Battery Block");
        parentMod.blockRegistry.newInstance("b", checkeredBlock, "Checkered Block");
        parentMod.blockRegistry.newInstance("crystal_growing_block", crystalGrowingBlock, "Crystal Growing Block");
        parentMod.blockRegistry.newInstance("infected_block", infectedBlock, "Infected Block");
        parentMod.blockRegistry.newInstance("tree_cube_block", treeCubeBlock, "Tree Cube Block");
    }
}
