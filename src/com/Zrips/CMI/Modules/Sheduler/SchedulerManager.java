package com.Zrips.CMI.Modules.Sheduler;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.Bukkit;

import com.Zrips.CMI.CMI;

public class SchedulerManager {

    private HashMap<String, Schedule> map = new HashMap<String, Schedule>();

    private CMI plugin;

    private int autoTimerBukkitId = 0;

    public static final String randomPlayerLabel = "[randomPlayer]";

    public SchedulerManager(CMI plugin) {
        this.plugin = plugin;
    }

    public Schedule getSchedule(String name) {
        return getSchedule(name, false);
    }

    public Schedule getSchedule(String name, boolean includeDisabled) {
        Schedule sched = map.get(name.toLowerCase());
        if (sched == null)
            return null;
        if (!sched.isEnabled() && !includeDisabled)
            return null;
        return sched;
    }

    public void stop() {
        if (autoTimerBukkitId != 0) {
            Bukkit.getScheduler().cancelTask(autoTimerBukkitId);
            autoTimerBukkitId = 0;
        }
    }

    @SuppressWarnings("unchecked")
    public void load() {

    }

    private void runTimer() {

    }

    private Runnable autoTimer = new Runnable() {
        @Override
        public void run() {
            try {
                checkSchedulers();
            } catch (Throwable e) {
                e.printStackTrace();
            }
            runTimer();
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
        for (Entry<String, Schedule> one : map.entrySet()) {
            Schedule sched = one.getValue();
            if (!sched.isEnabled())
                continue;
            if (!sched.itsTimeToPerform())
                continue;
            sched.safePerform();
        }
    }

    public HashMap<String, Schedule> getMap() {
        return map;
    }

}
