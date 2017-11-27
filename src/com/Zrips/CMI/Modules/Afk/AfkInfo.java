package com.Zrips.CMI.Modules.Afk;

import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;

public class AfkInfo {

    private Long afkFrom = null;
    private int kicksPerformed = 0;
    private AfkType type = AfkType.auto;

    public AfkInfo() {
    }

    public Long getAfkFrom() {
	return afkFrom;
    }

    public void setAfkFrom(Long afkFrom) {
	this.afkFrom = afkFrom;
    }

    public int getKicksPerformed() {
	return kicksPerformed;
    }

    public void setKicksPerformed(int kicksPerformed) {
	this.kicksPerformed = kicksPerformed;
    }

    public void addKicksPerformed() {
	this.kicksPerformed++;
    }

    public AfkType getType() {
	return type;
    }

    public void setType(AfkType type) {
	this.type = type;
    }

}
