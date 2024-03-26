package com.Zrips.CMI.Modules.Repair;

import java.util.ArrayList;
import java.util.List;

import com.Zrips.CMI.CMI;

public class RepairManager {
    private boolean repairCostsMoney = false;
    private double baseCost = 0D;
    private boolean checkDurability = true;
    private double worthPercentage = 10D;
    private double enchantWorthPercentage = 10D;

    private boolean RSProtectNormalRepair = false;
    private boolean RSProtectCommandRepair = false;
    private boolean RSBypassWithPerm = true;
    private boolean RSAddLore = true;
    private boolean RSCancelEvent = true;
    private boolean RSInformWithMessage = true;
    private int RSDurability = 1;

    private boolean RepairConfirmation = true;
    private List<Integer> BlockedCustomDataID = new ArrayList<Integer>();
    private CMI plugin;

    public RepairManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {

    }

    public double getBaseRepairCost() {
        return baseCost;
    }

    public boolean isCheckDurability() {
        return checkDurability;
    }

    public double getWorthPercentage() {
        return worthPercentage;
    }

    public double getEnchantWorthPercentage() {
        return enchantWorthPercentage;
    }

    public boolean isRepairCostsMoney() {
        return repairCostsMoney;
    }

    public boolean isRSProtectNormalRepair() {
        return RSProtectNormalRepair;
    }

    public boolean isRSProtectCommandRepair() {
        return RSProtectCommandRepair;
    }

    public boolean isRSBypassWithPerm() {
        return RSBypassWithPerm;
    }

    public boolean isRSAddLore() {
        return RSAddLore;
    }

    public boolean isRSCancelEvent() {
        return RSCancelEvent;
    }

    public boolean isRSInformWithMessage() {
        return RSInformWithMessage;
    }

    public int getRSDurability() {
        return RSDurability;
    }

    public boolean isRepairConfirmation() {
        return RepairConfirmation;
    }

    public List<Integer> getBlockedCustomDataID() {
        return BlockedCustomDataID;
    }

}
