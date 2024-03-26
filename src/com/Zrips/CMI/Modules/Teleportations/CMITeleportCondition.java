package com.Zrips.CMI.Modules.Teleportations;

public enum CMITeleportCondition {
    Good, BadFloor, Void, Suffocation, Fall, Unknown, Plugin, UnsafeTeleportation, NoPermission, MissingWorld;

    public static String getBadLocations() {
        String all = "";
        for (CMITeleportCondition one : CMITeleportCondition.values()) {
            if (one.equals(CMITeleportCondition.Good))
                continue;
            if (!all.isEmpty())
                all += "/";
            all += one.name();
        }
        return all;
    }
}
