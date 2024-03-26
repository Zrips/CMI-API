package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.inventory.ItemStack;

public class CMIItemRepair {

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
