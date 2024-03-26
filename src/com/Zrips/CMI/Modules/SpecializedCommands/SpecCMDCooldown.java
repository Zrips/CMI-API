package com.Zrips.CMI.Modules.SpecializedCommands;

public class SpecCMDCooldown {
    private double cooldown = 0L;
    private String cmd;

    @Deprecated
    public long getCooldown() {
        return (long) cooldown;
    }

    public double getCD() {
        return cooldown;
    }

    @Deprecated
    public SpecCMDCooldown setCooldown(long seconds) {
        this.cooldown = seconds;
        return this;
    }

    public SpecCMDCooldown setCooldown(double seconds) {
        this.cooldown = seconds;
        return this;
    }

    public String getCmd() {
        return cmd;
    }

    public String getBaseCmd() {
        return cmd.contains(" ") ? cmd.split(" ")[0] : cmd;
    }

    public SpecCMDCooldown setCmd(String cmd) {
        if (cmd.startsWith("/"))
            cmd = cmd.substring(1);
        this.cmd = cmd;
        return this;
    }

    public long untilNextUse(Long usedOn) {
        return (long) ((usedOn + (getCD() * 1000L)) - System.currentTimeMillis());
    }

}
