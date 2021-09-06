package com.Zrips.CMI.Modules.PlayTime;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class PlayTimeListener implements Listener {
    private CMI plugin;

    public PlayTimeListener(CMI plugin) {
	this.plugin = plugin;
    }

}
