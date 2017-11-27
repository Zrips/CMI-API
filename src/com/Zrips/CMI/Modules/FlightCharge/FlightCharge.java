package com.Zrips.CMI.Modules.FlightCharge;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class FlightCharge {

    private Integer max = 1000;
    private Double charge = null;
    private CMIUser user;
    private Double lastChange = null;

    public FlightCharge(CMIUser user) {
	this.user = user;
	max = CMI.getInstance().getFlightChargeManager().getMaxChargeLevel();
    }

    public Double getCharge() {
	return charge;
    }

    public Double getSafeCharge() {
	return charge == null ? 0D : charge;
    }

    public void setCharge(Double charge) {
    }

    public void addCharge(Double charge) {
    }

    public void takeCharge(Double charge) {
    }

    public Integer getMax() {
	return max;
    }

    public void setMax(Integer max) {
	this.max = max;
    }

    public Double getLastChange() {
	return lastChange;
    }
}
