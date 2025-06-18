package com.Zrips.CMI.Modules.Repair;

import java.util.List;

import com.Zrips.CMI.CMI;

public class RepairManager {
    private boolean repairCostsMoney;
    private double baseCost;
    private boolean checkDurability;
    private double worthPercentage;
    private double enchantWorthPercentage;
    private boolean RSProtectNormalRepair;
    private boolean RSProtectCommandRepair;
    private boolean RSBypassWithPerm;
    private boolean RSAddLore;
    private boolean RSCancelEvent;
    private boolean RSInformWithMessage;
    private int RSDurability;
    private boolean RepairConfirmation;
    private List<Integer> BlockedCustomDataID;
    private CMI plugin;

    public RepairManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public double getBaseRepairCost() {
        return 0.0;
    }

    public boolean isCheckDurability() {
        return false;
    }

    public double getWorthPercentage() {
        return 0.0;
    }

    public double getEnchantWorthPercentage() {
        return 0.0;
    }

    public boolean isRepairCostsMoney() {
        return false;
    }

    public boolean isRSProtectNormalRepair() {
        return false;
    }

    public boolean isRSProtectCommandRepair() {
        return false;
    }

    public boolean isRSBypassWithPerm() {
        return false;
    }

    public boolean isRSAddLore() {
        return false;
    }

    public boolean isRSCancelEvent() {
        return false;
    }

    public boolean isRSInformWithMessage() {
        return false;
    }

    public int getRSDurability() {
        return 0;
    }

    public boolean isRepairConfirmation() {
        return false;
    }

    public List<Integer> getBlockedCustomDataID() {
        return null;
    }
}
