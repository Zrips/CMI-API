package com.Zrips.CMI.Modules.Elytra;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class ElytraLaunchListener implements Listener {

    private CMI plugin;

    public ElytraLaunchListener(CMI plugin) {
	this.plugin = plugin;
    }

    private class CMILaunch {
	private Long started;
	private Long lastCharge;

	public Long getStarted() {
	    return started;
	}

	public Long getLastCharge() {
	    return lastCharge;
	}

	public void setLastCharge() {
	    if (started == null)
		started = System.currentTimeMillis();
	    if (this.lastCharge != null && this.lastCharge + 333 < System.currentTimeMillis()) {
		started = System.currentTimeMillis();
	    } else
		this.lastCharge = System.currentTimeMillis();
	}

	public boolean isFullyCharged() {
	    if (started == null || lastCharge == null)
		return false;
	    return started + (plugin.getConfigManager().ElytraLaunchTime * 1000) < System.currentTimeMillis();
	}
    }

    HashMap<UUID, CMILaunch> map = new HashMap<UUID, CMILaunch>();


}