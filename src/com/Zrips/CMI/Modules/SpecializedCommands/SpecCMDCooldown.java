package com.Zrips.CMI.Modules.SpecializedCommands;

public class SpecCMDCooldown {
    private double cooldown;
    private String cmd;

    @Deprecated
    public long getCooldown() {
        return 0;
    }

    public double getCD() {
        return 0.0;
    }

    @Deprecated
    public SpecCMDCooldown setCooldown(long seconds) {
        return null;
    }

    public SpecCMDCooldown setCooldown(double seconds) {
        return null;
    }

    public String getCmd() {
        return null;
    }

    public String getBaseCmd() {
        return null;
    }

    public SpecCMDCooldown setCmd(String cmd) {
        return null;
    }

    public long untilNextUse(Long usedOn) {
        return 0;
    }
}
