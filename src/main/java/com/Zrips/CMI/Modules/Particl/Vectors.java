package com.Zrips.CMI.Modules.Particl;

import org.bukkit.util.Vector;

public class Vectors {
    Vector p1 = null;
    Vector p2 = null;

    public Vectors() {
    }

    public void setp1(Vector state) {
	this.p1 = state;
    }

    public Vector getp1() {
	return this.p1;
    }

    public void setp2(Vector state) {
	this.p2 = state;
    }

    public Vector getp2() {
	return this.p2;
    }
}
