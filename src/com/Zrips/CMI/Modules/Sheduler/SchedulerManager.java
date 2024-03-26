package com.Zrips.CMI.Modules.Sheduler;

import java.util.Calendar;
import java.util.HashMap;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class SchedulerManager {

    private HashMap<String, Schedule> map = new HashMap<String, Schedule>();

    private CMI plugin;

    private CMITask autoTimerBukkitId = null;

    public static final String randomPlayerLabel = "[randomPlayer]";

    public SchedulerManager(CMI plugin) {
        this.plugin = plugin;
    }

    public Schedule getSchedule(String name) {
        return getSchedule(name, false);
    }

    public Schedule getSchedule(String name, boolean includeDisabled) {
        return null;
    }

    public void stop() {
    }

    private String fileName = "Schedules.yml";

    @SuppressWarnings("unchecked")
    public void load() {

    }

    private void runTimer() {
    }

    private Runnable autoTimer = new Runnable() {
        @Override
        public void run() {
        }
    };

    private static Long nextIn() {

        return null;
    }

    public int getActualWeekDay(int day) {
        switch (day) {
        case Calendar.SUNDAY:
            return 7;
        case Calendar.MONDAY:
            return 1;
        case Calendar.TUESDAY:
            return 2;
        case Calendar.WEDNESDAY:
            return 3;
        case Calendar.THURSDAY:
            return 4;
        case Calendar.FRIDAY:
            return 5;
        case Calendar.SATURDAY:
            return 6;
        default:
            return 1;
        }
    }

    private void checkSchedulers() {
    }

    public HashMap<String, Schedule> getMap() {
        return map;
    }

}
