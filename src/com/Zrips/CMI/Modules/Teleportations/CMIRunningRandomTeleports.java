package com.Zrips.CMI.Modules.Teleportations;

public class CMIRunningRandomTeleports {
    private long time = 0L;

    public CMIRunningRandomTeleports() {
        time = System.currentTimeMillis() + (30 * 1000L);
    }

    public long getEndTime() {
        return time;
    }

    public CMIRunningRandomTeleports setTime(long time) {
        this.time = time;
        return this;
    }
}
