package com.Zrips.CMI.Modules.PlayTimeRewards;

public class PTRRepeat extends PlayTimeReward {

    private boolean stackRewards = true;

    public PTRRepeat(String name) {
	super(name);
    }

    public Long getPayEvery() {
	return getRange();
    }

    public void setPayEvery(Long payEvery) {
	setRange(payEvery * 1000);
    }

    public boolean isStackRewards() {
	return stackRewards;
    }

    public void setStackRewards(boolean stackRewards) {
	this.stackRewards = stackRewards;
    }

}
