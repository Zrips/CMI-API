package com.Zrips.CMI.Modules.FlightCharge;

import com.Zrips.CMI.CMI;

public class FlightCharge {

    private double charge = 0;
    private double lastChange = 0;
    private boolean enabled = false;
    private boolean autoRecharge = false;
    private boolean moneyRecharge = false;
    private boolean expRecharge = false;

    public FlightCharge() {
    }

    public Double getCharge() {
        return charge;
    }

    public Double getSafeCharge() {
        return charge;
    }

    public void setCharge(Double charge) {

    }

    public void addCharge(Double charge) {

    }

    public void takeCharge(Double charge) {

    }

    public Integer getMax() {
        return CMI.getInstance().getFlightChargeManager().getMaxChargeLevel();
    }

    public Double getLastChange() {
        return lastChange;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean isAutoRecharge() {
        return autoRecharge;
    }

    public void setAutoRecharge(Boolean autoRecharge) {
        this.autoRecharge = autoRecharge == null ? false : autoRecharge;
    }

    public void setAutoMoneyRecharge() {
        moneyRecharge = true;
    }

    public void setAutoExpRecharge() {
        expRecharge = true;
    }

    public boolean isMoneyAutoRecharge() {
        return moneyRecharge;
    }

    public boolean isExpAutoRecharge() {
        return expRecharge;
    }
}
