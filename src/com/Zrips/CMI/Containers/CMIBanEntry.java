package com.Zrips.CMI.Containers;

import org.bukkit.BanEntry;

import com.Zrips.CMI.Locale.CMILC;

import net.Zrips.CMILib.Locale.LC;
import net.Zrips.CMILib.Time.CMITimeManager;

public class CMIBanEntry {

    long createdOn = 0;
    long banUntil = 0;
    String reason = null;
    CMIUser bannedBy = null;
    CMIUser banned = null;

    public CMIBanEntry(CMIUser baned) {
	this.banned = baned;
	createdOn = System.currentTimeMillis();
    }

    public Long getCreated() {
	return createdOn;
    }

    public Long getExpiration() {
	return banUntil;
    }

    public String getReason() {
	return reason;
    }

    public String getSource() {
	if (bannedBy == null)
	    return LC.info_Console.getLocale();
	return bannedBy.getName();
    }

    public CMIUser getSourceUser() {
	return bannedBy;
    }

    public String getTarget() {
	return banned.getName();
    }

    public CMIUser getTargetUser() {
	return banned;
    }

    public void setCreated(Long date) {
	createdOn = date == null ? 0 : date;
    }

    public void setExpiration(Long date) {
	if (date != null)
	    banUntil = date;
	else
	    banUntil = -1L;
    }

    public void setReason(String reason) {
	this.reason = reason;
    }

    public void setSource(CMIUser user) {
	bannedBy = user;
    }

    public boolean isPermanent() {
	if (banUntil >= 0)
	    return false;
	return banUntil == -1L;
    }

    public Long getLeftTime() {
	if (banUntil <= 0)
	    return 0L;
	if (banUntil < System.currentTimeMillis())
	    return 0L;
	return banUntil - System.currentTimeMillis();
    }

    public static String getBanMessage(BanEntry banEntry) {
        return null;
    }

    public static String getIpBanMessage(BanEntry banEntry) {
        return null;
    }
}
