package com.Zrips.CMI.Containers;

import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class DamageControl {

    private String node;
    private DamageCause cause;
    private double mult;

    public DamageControl(String node, DamageCause cause, double mult) {
	this.node = node;
	this.cause = cause;
	this.mult = mult;
    }

    public String getNode() {
	return node;
    }

    public void setNode(String node) {
	this.node = node;
    }

    public DamageCause getCause() {
	return cause;
    }

    public void setCause(DamageCause cause) {
	this.cause = cause;
    }

    public double getMult() {
	return mult;
    }

    public void setMult(double mult) {
	this.mult = mult;
    }
}
