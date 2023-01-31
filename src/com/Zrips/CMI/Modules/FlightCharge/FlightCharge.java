package com.Zrips.CMI.Modules.FlightCharge;

import com.Zrips.CMI.CMI;

public class FlightCharge {

    private Double charge = null;
    private Double lastChange = null;
    private boolean enabled = false;
    private Boolean autoRecharge = null;
    private Boolean moneyRecharge = null;

    public FlightCharge() {
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
        return autoRecharge == null ? false : autoRecharge;
    }

    public void setAutoRecharge(Boolean autoRecharge) {
        this.autoRecharge = autoRecharge;
    }

    public void setAutoMoneyRecharge() {
        moneyRecharge = true;
    }

    public void setAutoExpRecharge() {
        moneyRecharge = false;
    }

    public boolean isMoneyAutoRecharge() {
        return moneyRecharge == null || moneyRecharge;
    }

    public boolean isExpAutoRecharge() {
        return moneyRecharge != null && !moneyRecharge;
    }
}
