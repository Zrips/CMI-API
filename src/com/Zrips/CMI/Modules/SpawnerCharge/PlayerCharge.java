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

    }

    private void updateSpawnerCharge() {
    }

    public void reset() {
        reset(true);
    }

    public void reset(boolean update) {

    }

    public int getCharges() {
        updateSpawnerCharge();
        updateChargeTimer();
        return charges;
    }

    public int getChargesClean() {
        return charges;
    }

    public boolean haveLeftCharge() {
        if (!CMI.getInstance().getConfigManager().ChargesUse)
            return true;
        updateSpawnerCharge();
        return charges > 0;
    }

    public boolean have() {
        updateSpawnerCharge();
        return SCharge != null;
    }

    public int getBonus() {
        if (this.SCharge == null)
            return 0;
        if (this.SCharge.getBonus() <= 0)
            return 0;
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
        updateSpawnerCharge();
        if (SCharge == null)
            return 0;
        return SCharge.getMaxCharges();
    }

    public long getLastGive() {
        return lastGive;
    }

    public void setLastGive(long lastGive) {
        this.lastGive = lastGive;
    }

    public int getCooldown() {
        updateSpawnerCharge();
        if (SCharge == null)
            return -1;
        return SCharge.getCooldown();
    }
}
