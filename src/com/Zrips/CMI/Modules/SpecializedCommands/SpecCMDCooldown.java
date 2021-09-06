package com.Zrips.CMI.Modules.SpecializedCommands;

public class SpecCMDCooldown {
    private long cooldown = 0L;
    private String cmd;

    public long getCooldown() {
	return cooldown;
    }

    public SpecCMDCooldown setCooldown(long seconds) {
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
	return (usedOn + (getCooldown() * 1000L)) - System.currentTimeMillis();
    }

}
