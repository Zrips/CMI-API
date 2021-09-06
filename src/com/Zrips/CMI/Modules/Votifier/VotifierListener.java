package com.Zrips.CMI.Modules.Votifier;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class VotifierListener implements Listener {
    private CMI plugin;

    public VotifierListener(CMI plugin) {
	this.plugin = plugin;
    }

}
