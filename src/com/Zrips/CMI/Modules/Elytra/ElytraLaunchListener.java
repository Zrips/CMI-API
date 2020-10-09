package com.Zrips.CMI.Modules.Elytra;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

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
	}

	public boolean isFullyCharged() {
		return false;
	}
    }

    HashMap<UUID, CMILaunch> map = new HashMap<UUID, CMILaunch>();

    @EventHandler
    public void onSneakEnd(PlayerToggleSneakEvent event) {
    }

    @EventHandler
    public void onMoveRemove(PlayerMoveEvent event) {
    }

    @EventHandler
    public void onElytraLaunch(PlayerInteractEvent event) {
	
    }
}