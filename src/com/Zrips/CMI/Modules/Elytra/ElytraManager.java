package com.Zrips.CMI.Modules.Elytra;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIMaterial;

public class ElytraManager {

    private boolean BoostUseItems = false;
    private double BoostMultyplier = 0.2D;
    private double BoostSuperMultyplier = 0.6D;

    private CMIMaterial BoostItem = CMIMaterial.FEATHER;
    private CMIMaterial BoostItemConsume = CMIMaterial.STONE;
    private CMIMaterial LaunchItem = CMIMaterial.FEATHER;
    private int BoostAmount = 1;
    private int BoostSuperAmount = 5;
    private int BoostSpeedLimit = 1;
    private boolean BoostSpeedLimitStop = false;
    private boolean BoostRequiresItem = true;
    private boolean BoostShowParticles = true;
    private boolean PreventSelfDamage = true;
    private boolean PreventRocketUsage = true;
    private boolean BoostSpeedDecimals = true;
    private double LaunchTime = 2;
    private boolean disableRiptide = true;

    private CMI plugin;

    public ElytraManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {
       
    }

    public boolean isBoostUseItems() {
        return BoostUseItems;
    }

    public double getBoostMultyplier() {
        return BoostMultyplier;
    }

    public double getBoostSuperMultyplier() {
        return BoostSuperMultyplier;
    }

    public CMIMaterial getBoostItem() {
        return BoostItem;
    }

    public CMIMaterial getBoostItemConsume() {
        return BoostItemConsume;
    }

    public CMIMaterial getLaunchItem() {
        return LaunchItem;
    }

    public int getBoostAmount() {
        return BoostAmount;
    }

    public int getBoostSuperAmount() {
        return BoostSuperAmount;
    }

    public int getBoostSpeedLimit() {
        return BoostSpeedLimit;
    }

    public boolean isBoostSpeedLimitStop() {
        return BoostSpeedLimitStop;
    }

    public boolean isBoostRequiresItem() {
        return BoostRequiresItem;
    }

    public boolean isBoostShowParticles() {
        return BoostShowParticles;
    }

    public boolean isPreventSelfDamage() {
        return PreventSelfDamage;
    }

    public boolean isPreventRocketUsage() {
        return PreventRocketUsage;
    }

    public boolean isBoostSpeedDecimals() {
        return BoostSpeedDecimals;
    }

    public double getLaunchTime() {
        return LaunchTime;
    }

    public boolean isDisableRiptide() {
        return disableRiptide;
    }
}
