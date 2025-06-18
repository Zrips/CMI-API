package com.Zrips.CMI.Modules.Holograms.Animations;

import java.util.HashMap;

import org.bukkit.Color;

public class CMIHologramAnimation {
    HashMap<CMIHologramAnimationType, CMIHologramValueChanger> changers;

    public double getTarget(CMIHologramAnimationType type) {
        return 0.0;
    }

    public void setTarget(CMIHologramAnimationType type, double targetScale) {
    }

    public double getCurrent(CMIHologramAnimationType type) {
        return 0.0;
    }

    public void setCurrent(CMIHologramAnimationType type, double currentScale) {
    }

    public void update() {
    }

    public CMIHologramValueChanger get(CMIHologramAnimationType type) {
        return null;
    }

    public static Color applyAlpha(Color color, int alpha) {
        return null;
    }

    public boolean finished() {
        return false;
    }
}
