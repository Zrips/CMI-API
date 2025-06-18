package com.Zrips.CMI.Modules.Holograms.Animations;

public class CMIHologramValueChanger {
    private double target;
    private double current;
    private double changeSpeed;
    private int direction;

    public CMIHologramValueChanger() {
    }

    public CMIHologramValueChanger(double start, double stop) {
    }

    public CMIHologramValueChanger(double start, double stop, double changeBy) {
    }

    public static double increment(double start, double end, int updatesPerSecond, double timeFrame) {
        return 0.0;
    }

    public CMIHologramValueChanger increment(double timeFrame) {
        return null;
    }

    public CMIHologramValueChanger increment(double timeFrame, int fps) {
        return null;
    }

    public double getTarget() {
        return 0.0;
    }

    public void setTarget(double target) {
    }

    public double getCurrent() {
        return 0.0;
    }

    public void setCurrent(double current) {
    }

    public double getChangeSpeed() {
        return 0.0;
    }

    public void setChangeSpeed(double changeSpeed) {
    }

    public double updateValue() {
        return 0.0;
    }

    public boolean finished() {
        return false;
    }
}
