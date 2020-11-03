package com.Zrips.CMI.Modules.PlayTimeRewards;

public class PTROneTime extends PlayTimeReward {

    public PTROneTime(String name) {
	super(name);
    }

    public Long getPayFor() {
	return super.getRange();
    }

    public void setPayFor(Long payFor) {
	setRange(payFor * 1000);
    }

}
