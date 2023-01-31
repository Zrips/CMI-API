package com.Zrips.CMI.Containers;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.Repairable;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.Items.CMIMaterial;
import com.Zrips.CMI.Modules.Scavenger.ScavengeManager;
import com.Zrips.CMI.Modules.Worth.WorthEnchantment;
import com.Zrips.CMI.Modules.Worth.WorthItem;

public class CMIItemRepair {

    private static boolean repairCostsMoney = false;

    private static double baseCost = 0D;
    private static boolean checkDurability = true;
    private static double worthPercentage = 10D;
    private static double enchantWorthPercentage = 10D;

    public static double getBaseCost() {
        return baseCost;
    }

    public static void setBaseCost(double c) {
        CMIItemRepair.baseCost = c;
    }

    public static boolean isCheckDurability() {
        return checkDurability;
    }

    public static void setCheckDurability(boolean checkDurability) {
        CMIItemRepair.checkDurability = checkDurability;
    }

    public static double getWorthPercentage() {
        return worthPercentage;
    }

    public static void setWorthPercentage(double worthPercentage) {
        CMIItemRepair.worthPercentage = worthPercentage > 100 ? 100 : worthPercentage < 0 ? 0 : worthPercentage;
    }

    public static double getEnchantWorthPercentage() {
        return enchantWorthPercentage;
    }

    public static void setEnchantWorthPercentage(double enchantWorthPercentage) {
        CMIItemRepair.enchantWorthPercentage = enchantWorthPercentage > 100 ? 100 : enchantWorthPercentage < 0 ? 0 : enchantWorthPercentage;
    }

    public static boolean isRepairCostsMoney() {
        return repairCostsMoney;
    }

    public static void setRepairCostsMoney(boolean repairCostsMoney) {
        CMIItemRepair.repairCostsMoney = repairCostsMoney;
    }

    public static double getRepairCost(List<ItemStack> items) {
        double repairCost = 0D;
        for (ItemStack one : items) {
            repairCost += getRepairCost(one);
        }
        return format(repairCost);
    }

    public static double getRepairCost(ItemStack item) {

        return 0D;
    }

    private static double format(double number) {
        return (int) (number * 100) / 100D;
    }
}
