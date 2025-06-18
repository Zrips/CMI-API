package com.Zrips.CMI.Containers;

import org.bukkit.event.EventPriority;

public enum CMIEventPriority {
    LOWEST, LOW, NORMAL, HIGH, HIGHEST, MONITOR;

    private EventPriority priority;

    CMIEventPriority() {
    }

    public static CMIEventPriority getPriority(String name) {
        return null;
    }

    public EventPriority getPriority() {
        return null;
    }

    public static String listPriorities() {
        return null;
    }

    public static String listGeneralPriorities() {
        return null;
    }

    public static String[] generateComments(String prefix, CMIEventPriority defaultPriority, boolean simplified) {
        return null;
    }
}
