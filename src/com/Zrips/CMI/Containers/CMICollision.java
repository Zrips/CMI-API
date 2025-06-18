package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class CMICollision {
    private Vector min;
    private Vector max;

    public CMICollision(CMIHitBox box) {
    }

    public CMICollision(Vector min, Vector max) {
    }

    public CMICollision(double x1, double y1, double z1, double x2, double y2, double z2) {
    }

    public Vector getMin() {
        return null;
    }

    public Vector getMax() {
        return null;
    }

    public double min(int i) {
        return 0.0;
    }

    public double max(int i) {
        return 0.0;
    }

    public boolean collides(CMIRay ray, double tmin, double tmax) {
        return false;
    }

    public double collidesNearest(CMIRay ray, double tmin, double tmax) {
        return 0.0;
    }

    public boolean contains(Location location) {
        return false;
    }
}
