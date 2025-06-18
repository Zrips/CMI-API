package com.Zrips.CMI.Containers;

import java.util.List;

public class CMICompass {
    private static boolean compassBossBar;
    private static boolean compassRequireCompass;
    private static boolean recoveryRequireCompass;
    private static boolean recoveryAsRegularCompass;
    private static int compassUpdateInterval;
    private static String compassShape;
    private static String compassColor;
    private static String compassHomeIcon;
    private static String compassSpawnIcon;
    private static String compassDeathIcon;
    private static String compassTargetIcon;
    private static List<String> compassColors;
    private static boolean compassShowHome;
    private static boolean compassShowSpawn;
    private static boolean compassShowDeath;
    private static boolean compassShowCompass;

    public static void loadConfig() {
    }

    public static boolean isBossBarCompassEnabled() {
        return false;
    }

    public static boolean isCompassRequireCompass() {
        return false;
    }

    public static int getCompassUpdateInterval() {
        return 0;
    }

    public static String getCompassShape() {
        return null;
    }

    public static String getCompassColor() {
        return null;
    }

    public static String getCompassHomeIcon() {
        return null;
    }

    public static String getCompassSpawnIcon() {
        return null;
    }

    public static String getCompassDeathIcon() {
        return null;
    }

    public static String getCompassTargetIcon() {
        return null;
    }

    public static boolean isRecoveryRequireCompass() {
        return false;
    }

    public static boolean isRecoveryAsRegularCompass() {
        return false;
    }

    public static boolean isCompassShowHome() {
        return false;
    }

    public static boolean isCompassShowSpawn() {
        return false;
    }

    public static boolean isCompassShowDeath() {
        return false;
    }

    public static boolean isCompassShowCompass() {
        return false;
    }

    public static List<String> getCompassColors() {
        return null;
    }
}
