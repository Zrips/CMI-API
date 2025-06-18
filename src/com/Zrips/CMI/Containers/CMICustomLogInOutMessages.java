package com.Zrips.CMI.Containers;

import java.util.regex.Matcher;

import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;

public class CMICustomLogInOutMessages {
    private static boolean loginNameFilterUse;
    private static boolean logoutNameFilterUse;
    private static boolean loginDisabled;
    private static boolean logoutDisabled;
    private static boolean loginCustomUse;
    private static boolean logoutCustomUse;
    private static boolean logoutServerSwitch;
    private static boolean loginServerSwitch;
    private static boolean firstJoinMessageUse;
    private static int logoutAutoHideFrom;
    private static int loginAutoHideFrom;
    private static ChatFilterRule loginLogoutNameFilter;

    public static void loadConfig() {
    }

    public static int getLogoutAutoHideFrom() {
        return 0;
    }

    public static int getLoginAutoHideFrom() {
        return 0;
    }

    public static boolean isLogoutDisabled() {
        return false;
    }

    public static boolean isLogoutNameFilterUse() {
        return false;
    }

    public static Matcher matchLongLogoutNameFilter(String name) {
        return null;
    }

    public static boolean isLogoutCustomUse() {
        return false;
    }

    public static boolean isLogoutServerSwitch() {
        return false;
    }

    public static boolean isLoginDisabled() {
        return false;
    }

    public static boolean isLoginNameFilterUse() {
        return false;
    }

    public static boolean isLoginCustomUse() {
        return false;
    }

    public static boolean isLoginServerSwitch() {
        return false;
    }

    public static boolean isFirstJoinMessageUse() {
        return false;
    }
}
