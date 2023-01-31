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
        return 0;
    }

    public List<Long> getLastTimes(int range) {

        return null;
    }

    @Override
    public void run() {
        TicksList.add(System.currentTimeMillis());
        if (TicksList.size() > 1800)
            TicksList.remove(0);
    }

    public static double getProcessCpuLoad() throws Exception {

        return 0.0;
    }
}
