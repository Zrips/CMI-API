package com.Zrips.CMI.Modules.CmdCooldown;

import java.util.HashMap;

public class CmdCooldown {
    HashMap<String, CMICooldown> list = new HashMap<String, CMICooldown>();

    public void addCooldown(String cmd, Long time, Long timePeriod) {
	addCooldown(cmd, time, (int)(timePeriod / 1000));
    }

    public void addCooldown(String cmd, int cooldownSeconds) {
	addCooldown(cmd, System.currentTimeMillis(), cooldownSeconds);
    }

    public void addCooldown(String cmd, Long startedAt, int cooldownSeconds) {
	list.put(cmd.toLowerCase(), new CMICooldown(startedAt, cooldownSeconds));
    }

    public void removeCooldown(String cmd) {
	list.remove(cmd.toLowerCase());
    }

    public HashMap<String, CMICooldown> getList() {
	return this.list;
    }

    public void clear() {
	this.list.clear();
    }

    public class CMICooldown {
	private Long initialized = 0L;
	private int cooldownSeconds = 0;

	public CMICooldown(Long time, int cooldownSeconds) {
	    initialized = time;
	    this.cooldownSeconds = cooldownSeconds < 0 ? 0 : cooldownSeconds;
	}

	public Long getInitialized() {
	    return initialized;
	}

	public Long getEndTime() {
	    return initialized + (cooldownSeconds * 1000L);
	}

	public Long getDelta() {
	    long delta = getEndTime() - System.currentTimeMillis();
	    return delta < 0 ? 0 : delta;
	}

	public void setInitialized(Long initialized) {
	    this.initialized = initialized;
	}

	public int getTimePeriod() {
	    return cooldownSeconds;
	}

	public void setTimePeriod(int cooldownSeconds) {
	    this.cooldownSeconds = cooldownSeconds;
	}

    }
}
