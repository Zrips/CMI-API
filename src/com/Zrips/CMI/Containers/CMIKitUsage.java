package com.Zrips.CMI.Containers;

import com.Zrips.CMI.Modules.Kits.Kit;

public class CMIKitUsage {
    private String kitName;
    private long lastUsage;
    private int usedTimes;

    public CMIKitUsage(Kit kit) {
    }

    public CMIKitUsage(String kitConfigName, Long lastUsage) {
    }

    public CMIKitUsage(Kit kit, Long lastUsage) {
    }

    public CMIKitUsage(Kit kit, Long lastUsage, int usedTimes) {
    }

    public CMIKitUsage(String kitConfigName, Long lastUsage, int usedTimes) {
    }

    public Long getLastUsage() {
        return null;
    }

    public void setLastUsage(Long lastUsage) {
    }

    public void addUsedTimes() {
    }

    public int getUsedTimes() {
        return 0;
    }

    public void setUsedTimes(int usedTimes) {
    }

    public String getKitName() {
        return null;
    }

    public Kit getKit() {
        return null;
    }
}
