package com.Zrips.CMI.Modules.Kits;

public class Clickery {

    private long time = 0L;
    private int times = 0;
    private int speed = 1;

    public Clickery() {
	this.time = System.currentTimeMillis();
    }

    private void addClick() { 
    }

    public int getSpeed() {
	addClick();
	return speed;
    }
}
