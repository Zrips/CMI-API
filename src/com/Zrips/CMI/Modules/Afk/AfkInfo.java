package com.Zrips.CMI.Modules.Afk;

import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;

import net.Zrips.CMILib.Container.CMIVectorInt3D;

public class AfkInfo {
    private long afkFrom;
    private int kicksPerformed;
    private AfkType type;
    private String reason;
    private long playtimeAtAfkStart;
    private CMIVectorInt3D afkAt;
    private int kickOutIn;

    public AfkInfo() {
    }

    public long getAfkFrom() {
        return 0;
    }

    public void setAfkFrom(Long afkFrom) {
    }

    public int getKicksPerformed() {
        return 0;
    }

    public void setKicksPerformed(int kicksPerformed) {
    }

    public void addKicksPerformed() {
    }

    public AfkType getType() {
        return null;
    }

    public void setType(AfkType type) {
    }

    public String getReason() {
        return null;
    }

    public void setReason(String reason) {
    }

    public long getPlaytimeAtAfkStart() {
        return 0;
    }

    public void setPlaytimeAtAfkStart(Long playtimeAtAfkStart) {
    }

    public int getKickOutInSec() {
        return 0;
    }

    public void setKickOutInSec(int kickOutIn) {
    }

    public CMIVectorInt3D getAfkAt() {
        return null;
    }

    public void setAfkAt(CMIVectorInt3D afkAt) {
    }
}
