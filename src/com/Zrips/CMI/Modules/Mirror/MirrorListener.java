package com.Zrips.CMI.Modules.Mirror;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.Zrips.CMI.CMI;

public class MirrorListener implements Listener {
    private CMI plugin;

    public MirrorListener(CMI plugin) {
	this.plugin = plugin;
    }

}
