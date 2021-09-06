package com.Zrips.CMI.Modules.Portals;

import org.bukkit.util.Vector;

public class CMIVector2D {
    private double x;
    private double y;

    public CMIVector2D(Vector v) {
	this.x = v.getX();
	this.y = v.getY();
    }

    public CMIVector2D(double x, double y) {
	this.x = x;
	this.y = y;
    }

    public CMIVector2D plus(CMIVector2D v) {
	return new CMIVector2D(x + v.x, y + v.y);
    }

    public CMIVector2D minus(CMIVector2D v) {
	return new CMIVector2D(x - v.x, y - v.y);
    }

    public CMIVector2D minus(Vector v) {
	return new CMIVector2D(x - v.getX(), y - v.getY());
    }

    public CMIVector2D times(double s) {
	return new CMIVector2D(s * x, s * y);
    }

    public double dot(CMIVector2D v) {
	return x * v.x + y * v.y;
    }

    @Override
    public String toString() {
	return String.format("(%f, %f)", x, y);
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
}
