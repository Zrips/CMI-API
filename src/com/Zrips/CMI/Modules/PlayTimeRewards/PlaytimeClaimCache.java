package com.Zrips.CMI.Modules.PlayTimeRewards;

public class PlaytimeClaimCache {

    private long lastUpdate = 0L;
    private int count = 0;

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
