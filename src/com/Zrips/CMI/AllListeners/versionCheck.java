package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class versionCheck implements Listener {
    private CMI plugin;

    public versionCheck(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onJoin(PlayerJoinEvent event) {
	if (plugin.getConfigManager().isShowNewVersion() && CMIPerm.versioncheck.hasPermission(event.getPlayer()))
	    plugin.getVersionCheckManager().VersionCheck(event.getPlayer());
    }
}
