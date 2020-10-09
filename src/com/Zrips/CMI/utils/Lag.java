package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.List;

public class Lag implements Runnable {
    private List<Long> TicksList = new ArrayList<Long>();

    public int getTicks() {
	return TicksList.size();
    }

    public double getTPS() {
	return getTPS(3);
    }

    public double getTPS(int seconds) {
	return 20D;
    }

    public List<Long> getLastTimes(int range) {
	return null;
    }

    @Override
    public void run() {
    }
}
