package com.Zrips.CMI.Modules.DynMap;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.Logs.CMIDebug;
import com.Zrips.CMI.events.CMIPlayerUnVanishEvent;
import com.Zrips.CMI.events.CMIPlayerVanishEvent;

public class DynMapListener implements Listener {
    private CMI plugin;

    public DynMapListener(CMI plugin) {
	this.plugin = plugin;
    }
}
