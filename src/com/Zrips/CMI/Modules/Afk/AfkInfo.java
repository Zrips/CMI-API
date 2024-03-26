package com.Zrips.CMI.Modules.Afk;

import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;

import net.Zrips.CMILib.Container.CMIVectorInt3D;

public class AfkInfo {

    private long afkFrom = 0;
    private int kicksPerformed = 0;
    private AfkType type;
    private String reason;
    private long playtimeAtAfkStart = 0;

    private CMIVectorInt3D afkAt = null;

    private int kickOutIn = 0;

    public AfkInfo() {
    }

    public long getAfkFrom() {
        return afkFrom;
    }

    public void setAfkFrom(Long afkFrom) {
        this.afkFrom = afkFrom == null ? 0 : afkFrom;
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

    public long getPlaytimeAtAfkStart() {
        return playtimeAtAfkStart;
    }

    public void setPlaytimeAtAfkStart(Long playtimeAtAfkStart) {
        this.playtimeAtAfkStart = playtimeAtAfkStart == null ? 0 : playtimeAtAfkStart;
    }

    public int getKickOutInSec() {
        return kickOutIn;
    }

    public void setKickOutInSec(int kickOutIn) {
        this.kickOutIn = kickOutIn;
    }

    public CMIVectorInt3D getAfkAt() {
        return afkAt;
    }

    public void setAfkAt(CMIVectorInt3D afkAt) {
        this.afkAt = afkAt;
    }

}
