package com.Zrips.CMI.Containers;

import com.Zrips.CMI.Modules.Kits.Kit;

public class CMIKitUsage {

    Kit kit;
    private Long lastUsage;
    private int usedTimes = 0;

    public CMIKitUsage(Kit kit) {
	this(kit, System.currentTimeMillis());
    }

    public CMIKitUsage(Kit kit, Long lastUsage) {
	this.kit = kit;
	this.lastUsage = lastUsage;
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
