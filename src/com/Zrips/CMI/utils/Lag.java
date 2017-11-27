package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.List;

public class Lag
    implements Runnable {
    private List<Long> TicksList = new ArrayList<Long>();

    public int getTicks() {
	return TicksList.size();
    }

    public double getTPS() {
	return getTPS(100);
    }

    public double getTPS(int ticks) {
	if (TicksList.isEmpty())
	    return 20D;
	if (TicksList.size() < ticks)
	    ticks = TicksList.size() - 1;
	Long target = TicksList.size() > ticks ? TicksList.get(TicksList.size() - ticks - 1) : TicksList.get(0);
	long elapsed = System.currentTimeMillis() - target;
	double tps = ticks / (elapsed / 1000D);
	return tps > 20D ? 20D : tps;
    }

    public void run() {
    }
}
