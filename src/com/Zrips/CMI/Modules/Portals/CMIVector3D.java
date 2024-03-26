package com.Zrips.CMI.Modules.Portals;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.util.Vector;

public class CMIVector3D {
    private double x;
    private double y;
    private double z;

    public CMIVector3D(Vector v) {
        this.x = v.getX();
        this.y = v.getY();
        this.z = v.getZ();
    }

    public CMIVector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public CMIVector3D plus(CMIVector3D v) {
        return new CMIVector3D(x + v.x, y + v.y, z + v.z);
    }

    public CMIVector3D minus(CMIVector3D v) {
        return new CMIVector3D(x - v.x, y - v.y, z - v.z);
    }

    public CMIVector3D minus(Vector v) {
        return new CMIVector3D(x - v.getX(), y - v.getY(), z - v.getZ());
    }

    public CMIVector3D times(double s) {
        return new CMIVector3D(s * x, s * y, s * z);
    }

    public double dot(CMIVector3D v) {
        return x * v.x + y * v.y + z * v.z;
    }

    public CMIVector3D cross(CMIVector3D other) {
        double resultX = y * other.z - z * other.y;
        double resultY = z * other.x - x * other.z;
        double resultZ = x * other.y - y * other.x;

        return new CMIVector3D(resultX, resultY, resultZ);
    }

    public CMIVector3D multiply(double scalar) {
        return new CMIVector3D(x * scalar, y * scalar, z * scalar);
    }

    public CMIVector3D normalize() {
        double length = Math.sqrt(x * x + y * y + z * z);
        return new CMIVector3D(x / length, y / length, z / length);
    }

    public CMIVector3D add(CMIVector3D other) {
        return new CMIVector3D(x + other.x, y + other.y, z + other.z);
    }

    public CMIVector3D scale(double scaleFactor) {
        return new CMIVector3D(x * scaleFactor, y * scaleFactor, z * scaleFactor);
    }

    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", x, y, z);
    }

    public double getX() {
        return x;
    }

    public CMIVector3D setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public CMIVector3D setY(double y) {
        this.y = y;
        return this;
    }

    public double getZ() {
        return z;
    }

    public CMIVector3D setZ(double z) {
        this.z = z;
        return this;
    }

    public Location toLocation(World world) {
        return new Location(world, this.getX(), this.getY(), this.getZ());
    }
}
