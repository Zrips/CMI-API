package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class CMICollision {

    private Vector min;
    private Vector max;

    public CMICollision(CMIHitBox box) {
        this(box.getMin(), box.getMax());
    }

    public CMICollision(Vector min, Vector max) {
        this(min.getX(), min.getY(), min.getZ(), max.getX(), max.getY(), max.getZ());
    }

    public CMICollision(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.min = new Vector(Math.min(x1, x2), Math.min(y1, y2), Math.min(z1, z2));
        this.max = new Vector(Math.max(x1, x2), Math.max(y1, y2), Math.max(z1, z2));
    }

    public Vector getMin() {
        return min;
    }

    public Vector getMax() {
        return max;
    }

    public double min(int i) {
        return 0;
    }

    public double max(int i) {
        return 0;

    }

    public boolean collides(CMIRay ray, double tmin, double tmax) {
        return true;
    }

    public double collidesNearest(CMIRay ray, double tmin, double tmax) {
        return 0;
    }

    public boolean contains(Location location) {
        return true;
    }

}
