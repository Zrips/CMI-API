package com.Zrips.CMI.Modules.PlayTimeRewards;

public class PTRRepeat extends PlayTimeReward {
    private boolean stackRewards;

    public PTRRepeat(String name) {
        super(name);
    }

    public Long getPayEvery() {
        return null;
    }

    public void setPayEvery(Long payEvery) {
    }

    public boolean isStackRewards() {
        return false;
    }

    public void setStackRewards(boolean stackRewards) {
    }
}
