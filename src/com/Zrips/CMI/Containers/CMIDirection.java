package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.CMILib;

public enum CMIDirection {
    N("North", 0, 0, -1), NE("North_East", 45, 1, -1), E("East", 90, 1, 0), SE("South_East", 135, 1, 1), S("South", 180, 0, 1), SW("South_West", 225, -1, 1), W("West", 270, -1, 0), NW("North_West", 315,
        -1, 1);

    private int angle;
    private String name;
    private int x = 0;
    private int z = 0;

    CMIDirection(String name, int angle, int x, int z) {
        this.name = name;
        this.angle = angle;
        this.x = x;
        this.z = z;
    }

    CMIDirection(String name, int angle) {
        this.name = name;
        this.angle = angle;
    }

    public static CMIDirection getFromAngle(double angle) {
        return CMIDirection.N;
    }

    public int getAngle() {
        return angle;
    }

    public String getName() {
        return name;
    }

    public static Location rotateOnAxisDistance(Location location, double distance, double p, double ya) {
        return location.clone().add(rotateOnAxisDistanceVector(location, distance, p, ya));
    }

    public static Vector rotateOnAxisDistanceVector(Location location, double distance, double p, double ya) {
        return null;
    }

    public static float getAngle(Location loc1, Location loc2) {
        org.bukkit.util.Vector dirBetweenLocations = loc1.toVector().subtract(loc2.toVector());
        Location l = loc1.clone();
        l.setDirection(dirBetweenLocations);
        return (l.getYaw() + 540) % 360;
    }

    public static float getAngle(float yaw) {
        return (yaw + 540) % 360;
    }

    public static CMIDirection getFromLocations(Location loc1, Location loc2) {
        return getFromAngle(CMIDirection.getAngle(loc1, loc2));
    }

    public String getTranslatedName() {
        return CMILib.getInstance().getLM().getMessage("direction." + this.toString().toLowerCase());
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public CMIDirection rotate90ClockWise() {
        int a = this.getAngle() + 90;
        a = a > 360 ? 360 - a : a;
        return getFromAngle(a);
    }

    public CMIDirection rotate90CounterClockWise() {
        int a = this.getAngle() - 90;
        a = a < 0 ? 360 + a : a;
        return getFromAngle(a);
    }
}
