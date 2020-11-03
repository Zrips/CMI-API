package com.Zrips.CMI.Modules.Animations;

import java.util.HashMap;

import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;
import com.Zrips.CMI.Modules.Animations.AnimationManager.LeatherAnimationType;

public class LeatherAnimation {

    private HashMap<Integer, LeatherAnimationType> map = new HashMap<Integer, LeatherAnimationType>();

    private Float colorValue = null;
    private Float saturationValue = null;
    private boolean ascending = true;
    private boolean Sascending = true;

    public LeatherAnimation() {

    }

    public HashMap<Integer, LeatherAnimationType> getMap() {
	return map;
    }

    public void setMap(HashMap<Integer, LeatherAnimationType> map) {
	this.map = map;
    }

    public void setAnimation(CMIInventorySlot slot, LeatherAnimationType type) {
	this.map.put(slot.getSlot(), type);
    }

    public LeatherAnimationType getAnimation(CMIInventorySlot slot) {
	return map.get(slot.getSlot());
    }

    public Float getColorValue() {
	return colorValue;
    }

    public void setColorValue(Float colorValue) {
	this.colorValue = colorValue;
    }

    public boolean isAscending() {
	return ascending;
    }

    public void setAscending(boolean ascending) {
	this.ascending = ascending;
    }

    public Float getSaturationValue() {
	return saturationValue;
    }

    public void setSaturationValue(Float saturationValue) {
	this.saturationValue = saturationValue;
    }

    public boolean isSascending() {
	return Sascending;
    }

    public void setSascending(boolean sascending) {
	Sascending = sascending;
    }
}
