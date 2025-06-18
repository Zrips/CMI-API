package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public enum CMIDirection {
    N("North", 0, 0, -1), NE("North_East", 45, 1, -1), E("East", 90, 1, 0), SE("South_East", 135, 1, 1), S("South", 180, 0, 1), SW("South_West", 225, -1, 1), W("West", 270, -1, 0), NW("North_West", 315,
        -1, 1);

    private int angle;
    private String name;
    private int x = 0;
    private int z = 0;

    CMIDirection(String name, int angle, int x, int z) {
    }

    CMIDirection(String name, int angle) {
    }

    public static CMIDirection getFromAngle(double angle) {
        return null;
    }

    public int getAngle() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public static Location rotateOnAxisDistance(Location location, double distance, double p, double ya) {
        return null;
    }

    public static Vector rotateOnAxisDistanceVector(Location location, double distance, double p, double ya) {
        return null;
    }

    public static float getAngle(Location loc1, Location loc2) {
        return 0.0f;
    }

    public static float getAngle(float yaw) {
        return 0.0f;
    }

    public static CMIDirection getFromLocations(Location loc1, Location loc2) {
        return null;
    }

    public String getTranslatedName() {
        return null;
    }

    public int getX() {
        return 0;
    }

    public int getZ() {
        return 0;
    }

    public CMIDirection rotate90ClockWise() {
        return null;
    }

    public CMIDirection rotate90CounterClockWise() {
        return null;
    }
}
