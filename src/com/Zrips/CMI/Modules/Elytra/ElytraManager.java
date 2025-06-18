package com.Zrips.CMI.Modules.Elytra;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIMaterial;

public class ElytraManager {
    private boolean BoostUseItems;
    private double BoostMultyplier;
    private double BoostSuperMultyplier;
    private CMIMaterial BoostItem;
    private CMIMaterial BoostItemConsume;
    private CMIMaterial LaunchItem;
    private int BoostAmount;
    private int BoostSuperAmount;
    private int BoostSpeedLimit;
    private boolean BoostSpeedLimitStop;
    private boolean BoostRequiresItem;
    private boolean BoostShowParticles;
    private boolean PreventSelfDamage;
    private boolean PreventRocketUsage;
    private boolean BoostSpeedDecimals;
    private double LaunchTime;
    private boolean disableRiptide;
    private CMI plugin;

    public ElytraManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public boolean isBoostUseItems() {
        return false;
    }

    public double getBoostMultyplier() {
        return 0.0;
    }

    public double getBoostSuperMultyplier() {
        return 0.0;
    }

    public CMIMaterial getBoostItem() {
        return null;
    }

    public CMIMaterial getBoostItemConsume() {
        return null;
    }

    public CMIMaterial getLaunchItem() {
        return null;
    }

    public int getBoostAmount() {
        return 0;
    }

    public int getBoostSuperAmount() {
        return 0;
    }

    public int getBoostSpeedLimit() {
        return 0;
    }

    public boolean isBoostSpeedLimitStop() {
        return false;
    }

    public boolean isBoostRequiresItem() {
        return false;
    }

    public boolean isBoostShowParticles() {
        return false;
    }

    public boolean isPreventSelfDamage() {
        return false;
    }

    public boolean isPreventRocketUsage() {
        return false;
    }

    public boolean isBoostSpeedDecimals() {
        return false;
    }

    public double getLaunchTime() {
        return 0.0;
    }

    public boolean isDisableRiptide() {
        return false;
    }
}
