package com.Zrips.CMI.Modules.Animations;

import java.util.HashMap;

import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;
import com.Zrips.CMI.Modules.Animations.AnimationManager.LeatherAnimationType;

public class LeatherAnimation {
    private HashMap<Integer, LeatherAnimationType> map;
    private Float colorValue;
    private Float saturationValue;
    private boolean ascending;
    private boolean Sascending;

    public LeatherAnimation() {
    }

    public HashMap<Integer, LeatherAnimationType> getMap() {
        return null;
    }

    public void setMap(HashMap<Integer, LeatherAnimationType> map) {
    }

    public void setAnimation(CMIInventorySlot slot, LeatherAnimationType type) {
    }

    public LeatherAnimationType getAnimation(CMIInventorySlot slot) {
        return null;
    }

    public Float getColorValue() {
        return null;
    }

    public void setColorValue(Float colorValue) {
    }

    public boolean isAscending() {
        return false;
    }

    public void setAscending(boolean ascending) {
    }

    public Float getSaturationValue() {
        return null;
    }

    public void setSaturationValue(Float saturationValue) {
    }

    public boolean isSascending() {
        return false;
    }

    public void setSascending(boolean sascending) {
    }
}
