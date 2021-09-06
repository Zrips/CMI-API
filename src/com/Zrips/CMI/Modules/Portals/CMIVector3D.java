package com.Zrips.CMI.Modules.Portals;

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
	return new CMIVector3D(x - v.getX(), y - v.getY(), z - v.getBlockZ());
    }

    public CMIVector3D times(double s) {
	return new CMIVector3D(s * x, s * y, s * z);
    }

    public double dot(CMIVector3D v) {
	return x * v.x + y * v.y + z * v.z;
    }

    @Override
    public String toString() {
	return String.format("(%f, %f, %f)", x, y, z);
    }

    public double getX() {
	return x;
    }

    public void setX(double x) {
	this.x = x;
    }

    public double getY() {
	return y;
    }

    public void setY(double y) {
	this.y = y;
    }

    public double getZ() {
	return z;
    }

    public void setZ(double z) {
	this.z = z;
    }
}
