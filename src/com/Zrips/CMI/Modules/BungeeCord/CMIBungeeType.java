package com.Zrips.CMI.Modules.BungeeCord;

public enum CMIBungeeType {
    BungeeCord, Velocity, Unknown;

    static CMIBungeeType getByName(String networkType) {
        for (CMIBungeeType one : CMIBungeeType.values()) {
            if (one.toString().equalsIgnoreCase(networkType))
                return one;
        }
        return null;
    }
}
