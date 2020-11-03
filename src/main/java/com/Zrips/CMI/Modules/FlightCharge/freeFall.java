package com.Zrips.CMI.Modules.FlightCharge;

public class freeFall {

    private Float fallDistance = 0F;
    private Boolean jump = true;

    public Float getFallDistance() {
	return fallDistance;
    }

    public freeFall setFallDistance(Float fallDistance) {
	this.fallDistance = fallDistance;
	return this;
    }

    public Boolean getJump() {
	return jump;
    }

    public freeFall setJump(Boolean jump) {
	this.jump = jump;
	return this;
    }

}
