package com.Zrips.CMI.Modules.Afk;

import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;

public class AfkInfo {

    private Long afkFrom = null;
    private int kicksPerformed = 0;
    private AfkType type;
    private String reason;
    private Long playtimeAtAfkStart;
    
    private int kickOutIn = 0;

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
	return type == null ? AfkType.auto : type;
    }

    public void setType(AfkType type) {
	this.type = type;
    }

    public String getReason() {
	return reason;
    }

    public void setReason(String reason) {
	this.reason = reason;
    }

    public Long getPlaytimeAtAfkStart() {
	return playtimeAtAfkStart == null ? 0L : playtimeAtAfkStart;
    }

    public void setPlaytimeAtAfkStart(Long playtimeAtAfkStart) {
	this.playtimeAtAfkStart = playtimeAtAfkStart;
    }

    public int getKickOutInSec() {
	return kickOutIn;
    }

    public void setKickOutInSec(int kickOutIn) {
	this.kickOutIn = kickOutIn;
    }

}
