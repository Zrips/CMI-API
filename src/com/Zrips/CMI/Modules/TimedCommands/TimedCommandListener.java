package com.Zrips.CMI.Modules.TimedCommands;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.tp.Teleportations.TeleportType;

import net.Zrips.CMILib.Logs.CMIDebug;

public class TimedCommandListener implements Listener {
    private CMI plugin;

    public TimedCommandListener(CMI plugin) {
	this.plugin = plugin;
    }

}
