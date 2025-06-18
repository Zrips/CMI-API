package com.Zrips.CMI.utils;

import java.util.List;

public class Lag implements Runnable {
    private List<Long> TicksList;

    public int getTicks() {
        return 0;
    }

    public double getTPS() {
        return 0.0;
    }

    public double getTPS(int seconds) {
        return 0.0;
    }

    public List<Long> getLastTimes(int range) {
        return null;
    }

    @Override
    public void run() {
    }

    public static double getProcessCpuLoad() throws Exception {
        return 0.0;
    }
}
