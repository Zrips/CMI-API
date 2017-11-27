package com.Zrips.CMI.Modules.SpawnerCharge;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class PlayerCharge {

    private int charges = 0;
    private long lastGive = 0L;
    private SCharges SCharge;
    private CMIUser user;
    private long lastChecked = 0L;

    public PlayerCharge(CMIUser user, boolean update) {
	this.user = user;
	if (update)
	    updateSpawnerCharge();
//	if (this.lastGive == 0L)
//	    this.lastGive = System.currentTimeMillis();
    }

    private void updateSpawnerCharge() {
    }

    public void reset() {
    }

    public int getCharges() {
	return charges;
    }

    public int getChargesClean() {
	return charges;
    }

    public boolean haveLeftCharge() {
	return charges > 0;
    }

    public boolean have() {
	return SCharge != null;
    }

    public int getBonus() {
	return this.SCharge.getBonus();
    }

    public boolean lowerCd() {
	return true;
    }

    public void setCharges(int charges) {
	this.charges = charges;
    }

    private void updateChargeTimer() {
    }

    public String getLeftTime() {
	return null;
    }

    public boolean addCharge() {
	return addCharge(1);
    }

    public boolean addCharge(int amount) {
	return addCharge(amount, false);
    }

    public boolean addCharge(int amount, boolean force) {
	return true;
    }

    public boolean takeCharge() {
	return takeCharge(1);
    }

    public boolean takeCharge(int amount) {
	return takeCharge(amount, false);
    }

    public boolean takeCharge(int amount, boolean force) {
	
	return true;
    }

    public int getMaxCharges() {
	return SCharge.getMaxCharges();
    }

    public long getLastGive() {
	return lastGive;
    }

    public void setLastGive(long lastGive) {
	this.lastGive = lastGive;
    }

    public int getCooldown() {
	return SCharge.getCooldown();
    }
}
