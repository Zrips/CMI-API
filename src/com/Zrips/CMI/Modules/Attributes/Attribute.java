package com.Zrips.CMI.Modules.Attributes;

public class Attribute {

    private AttributeType type;
    private AttSlot slot;
    private double mod;

    public Attribute(AttributeType type, AttSlot slot, double mod) {
	this.type = type;
	this.slot = slot;
	this.mod = mod;
    }

    public AttributeType getType() {
	return type;
    }

    public void setType(AttributeType type) {
	this.type = type;
    }

    public AttSlot getSlot() {
	return slot;
    }

    public void setSlot(AttSlot slot) {
	this.slot = slot;
    }

    public double getMod() {
	return mod;
    }

    public void setMod(double mod) {
	this.mod = mod;
    }

}
