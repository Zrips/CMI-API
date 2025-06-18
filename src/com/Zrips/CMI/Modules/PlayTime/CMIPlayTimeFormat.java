package com.Zrips.CMI.Modules.PlayTime;

public class CMIPlayTimeFormat {
    static showType forceShowDays;
    static showType forceShowHours;
    static showType forceShowMinutes;
    static showType forceShowSeconds;
    static String daysFormat;
    static String hoursFormat;
    static String minutesFormat;
    static String secondsFormat;

    public static void update() {
    }

    public static String formatPlaytimePlaceholder(long ticks) {
        return null;
    }

    enum showType {
        full, partial, normal;
    }
}
