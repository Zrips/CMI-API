package com.Zrips.CMI.Modules.Scavenger;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.CMIGuiButton;

public class ScavengeManager {

    private CMI plugin;

    public ScavengeManager(CMI cmi) {
	this.plugin = cmi;
    }

    public static Double baseBreakPercentage = 0D;
    public static Double eachBreakPercentage = 0D;
    public static Double eachBreakPercentageLevel = 0D;
    public static Double baseEnchantFailPercentage = 0D;
    public static Double levelEnchantFailPercentage = 0D;
    public static Double levelEnchantFailMaxChance = 100D;
    public static Double LowerLevelChanceBase = 100D;
    public static Double LowerLevelForEachLevel = 100D;
    public static Double LowerLevelMaxChance = 100D;
    public static Double itemBreakMaxBreakChance = 100D;
    public static Double EnchantBaseCost = 0D;
    public static Double EnchantBaseCostExtra = 0D;
    public static Double IngredientReturnBase = 0D;
    public static boolean ItemMaterialDurabilityCheck = true;
    public static boolean InvertBlackList = false;
    public static boolean AllowItemPickups = false;
    public static Double ItemBreakDurabilityChange = 0D;

    public static Set<CMIMaterial> blackList = new HashSet<CMIMaterial>();

    public void loadConfig() {

    }

//item black list
    private static final int slotOfItem = 13;

    public void openExtractor(Player player) {

    }

    private void processClick(CMIGuiButton button) {
	updateExtractor(button.getGui());
    }

    private void updateExtractor(CMIGui gui) {
    }

    private double format(double number) {
	return (int) (number * 100) / 100D;
    }

    private boolean isFailed(double failChance) {
	if (failChance >= 100)
	    return true;
	Random random = new Random();
	double c = random.nextDouble() * 100;

	return c < failChance;
    }
}
