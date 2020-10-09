package com.Zrips.CMI.Modules.CmdCooldown;

import java.util.HashMap;

public class CmdCooldown {
    HashMap<String, CMICooldown> list = new HashMap<String, CMICooldown>();

//    public void addCooldown2(String cmd, Long time) {
//	addCooldown(cmd, time, 0L);
//    }

    public void addCooldown(String cmd, Long time, Long timePeriod) {
    }

    public void removeCooldown(String cmd) {
    }

    public HashMap<String, CMICooldown> getList() {
	return null;
    }

    public class CMICooldown {
	private Long initialized = 0L;
	private Long timePeriod = 0L;

	public CMICooldown(Long time, Long timePeriod) {
	}

	public Long getInitialized() {
	    return initialized;
	}

	public Long getEndTime() {
	    return initialized + timePeriod;
	}

	public Long getDelta() {
	return null;
	}

	public void setInitialized(Long initialized) {
	    this.initialized = initialized;
	}

	public Long getTimePeriod() {
	    return timePeriod;
	}

	public void setTimePeriod(Long timePeriod) {
	}

    }
}
