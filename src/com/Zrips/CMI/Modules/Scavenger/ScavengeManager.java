package com.Zrips.CMI.Modules.Scavenger;

import java.util.Set;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.GUI.CMIGuiButton;
import net.Zrips.CMILib.GUI.GUIManager.GUIClickType;
import net.Zrips.CMILib.Items.CMIMaterial;

public class ScavengeManager {
    private CMI plugin;
    public static double baseBreakPercentage;
    public static double eachBreakPercentage;
    public static double eachBreakPercentageLevel;
    public static double baseEnchantFailPercentage;
    public static double levelEnchantFailPercentage;
    public static double levelEnchantFailMaxChance;
    public static double LowerLevelChanceBase;
    public static double LowerLevelForEachLevel;
    public static double LowerLevelMaxChance;
    public static double itemBreakMaxBreakChance;
    public static double EnchantBaseCost;
    public static double EnchantBaseCostExtra;
    public static double IngredientReturnBase;
    public static boolean ItemMaterialDurabilityCheck;
    public static boolean InvertBlackList;
    public static boolean AllowItemPickups;
    public static boolean ResetRepairCost;
    public static boolean WithoutIngredients;
    public static double ItemBreakDurabilityChange;
    public static Set<CMIMaterial> blackList;
    private static final int slotOfItem = 0;

    public ScavengeManager(CMI cmi) {
    }

    public void loadConfig() {
    }

    public void openExtractor(Player player) {
    }

    private void processClick(CMIGuiButton button) {
    }

    private void processClick(CMIGuiButton button, GUIClickType type) {
    }

    private void updateExtractor(CMIGui gui) {
    }

    private void updateExtractor(CMIGui gui, GUIClickType type) {
    }

    private double format(double number) {
        return 0.0;
    }

    private boolean isFailed(double failChance) {
        return false;
    }
}
