package com.Zrips.CMI.Modules.Sheduler;

import java.util.HashMap;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class SchedulerManager {
    private HashMap<String, Schedule> map;
    private CMI plugin;
    private CMITask autoTimerBukkitId;
    public static final String randomPlayerLabel = null;
    private String fileName;
    private Runnable autoTimer;

    public SchedulerManager(CMI plugin) {
    }

    public Schedule getSchedule(String name) {
        return null;
    }

    public Schedule getSchedule(String name, boolean includeDisabled) {
        return null;
    }

    public void stop() {
    }

    @SuppressWarnings("unchecked")
    public void load() {
    }

    private void runTimer() {
    }

    private static Long nextIn() {
        return null;
    }

    public int getActualWeekDay(int day) {
        return 0;
    }

    private void checkSchedulers() {
    }

    public HashMap<String, Schedule> getMap() {
        return null;
    }
}
