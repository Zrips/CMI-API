package com.Zrips.CMI.Containers;

import com.Zrips.CMI.Modules.Kits.Kit;

public class CMIKitUsage {

    Kit kit;
    private Long lastUsage;
    private int usedTimes = 0;

    public CMIKitUsage(Kit kit) {
	this(kit, System.currentTimeMillis(), 0);
    }

    public CMIKitUsage(Kit kit, Long lastUsage) {
	this(kit, lastUsage, 0);
    }

    public CMIKitUsage(Kit kit, Long lastUsage, int usedTimes) {
	this.kit = kit;
	this.lastUsage = lastUsage;
	this.usedTimes = usedTimes;
    }

    public Long getLastUsage() {
	return lastUsage;
    }

    public void setLastUsage(Long lastUsage) {
	this.lastUsage = lastUsage;
    }

    public void addUsedTimes() {
	usedTimes++;
    }

    public int getUsedTimes() {
	return usedTimes;
    }

    public void setUsedTimes(int usedTimes) {
	this.usedTimes = usedTimes;
    }

}
