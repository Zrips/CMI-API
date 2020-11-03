package com.Zrips.CMI.Modules.SpawnerCharge;

public class SCharges {

    private String name;
    private int startingCharges = 1;
    private int maxCharges = 1;
    private int cooldown = 3600;
    private int bonus = 0;

    public SCharges() {
    }

    public SCharges(String name, int startingCharges, int maxCharges, int cooldown) {
	this.name = name;
	this.startingCharges = startingCharges;
	this.maxCharges = maxCharges;
	this.cooldown = cooldown;
    }

    public int getMaxCharges() {
	return maxCharges;
    }

    public void setMaxCharges(int maxCharges) {
	this.maxCharges = maxCharges;
    }

    public int getCooldown() {
	return cooldown;
    }

    public void setCooldown(int cooldown) {
	this.cooldown = cooldown;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getStartingCharges() {
	return startingCharges;
    }

    public void setStartingCharges(int startingCharges) {
	this.startingCharges = startingCharges;
    }

    public int getBonus() {
	return bonus;
    }

    public void setBonus(int bonus) {
	this.bonus = bonus;
    }

}
