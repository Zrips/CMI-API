package com.Zrips.CMI.Containers;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class CMIRay {

    private Vector origin, direction;

    public CMIRay(Vector origin, Vector direction) {
	this.origin = origin;
	this.direction = direction;
    }

    public CMIRay(Player player) {
    }

    public Vector getOrigin() {
	return origin;
    }

    public Vector getDirection() {
	return direction;
    }

    public double origin(int i) {
	return 0;

    }

    public double direction(int i) {
	return 0;

    }

    public Vector getPoint(double distance) {
	return null;
    }
}
