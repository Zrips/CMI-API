package com.Zrips.CMI.Modules.ConsoleFilter;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.logging.log4j.core.LogEvent;
import org.bukkit.plugin.Plugin;

import com.Zrips.CMI.CMI;

public class ConsoleFilterManager {
    private CMI plugin;
    private final List<CMIConsoleRecord> cache = null;
    private final int maxCapacity = 0;
    private boolean failed;
    static String regex;
    static Pattern pattern;

    public ConsoleFilterManager(CMI plugin) {
    }

    public synchronized void add(CMIConsoleRecord element) {
    }

    public synchronized CMIConsoleRecord get(int index) {
        return null;
    }

    public synchronized int size() {
        return 0;
    }

    public synchronized List<CMIConsoleRecord> getCachedMessages() {
        return null;
    }

    public static Plugin getPluginFromLogEvent(LogEvent event) {
        return null;
    }

    private static Plugin getPluginFromThrowableRecursive(Throwable throwable) {
        return null;
    }

    private static Plugin getPluginFromThrowable(Throwable throwable) {
        return null;
    }

    private static boolean isClassFromPlugin(Plugin plugin, String className) {
        return false;
    }

    private static Plugin getPluginFromMessage(String message) {
        return null;
    }

    private void initFilter() {
    }

    private static boolean shouldHideMessage(String message) {
        return false;
    }

    public void load() {
    }
}
