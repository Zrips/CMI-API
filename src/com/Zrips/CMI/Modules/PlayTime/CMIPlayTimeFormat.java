package com.Zrips.CMI.Modules.PlayTime;

public class CMIPlayTimeFormat {
    enum showType {
        full, partial, normal;
    }

    static showType forceShowDays = showType.normal;
    static showType forceShowHours = showType.normal;
    static showType forceShowMinutes = showType.normal;
    static showType forceShowSeconds = showType.normal;

    static String daysFormat = "";
    static String hoursFormat = "";
    static String minutesFormat = "";
    static String secondsFormat = "";

    public static void update() {

    }

    public static String formatPlaytimePlaceholder(long ticks) {

        return null;
    }

}
