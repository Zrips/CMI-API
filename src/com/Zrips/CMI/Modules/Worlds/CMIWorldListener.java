package com.Zrips.CMI.Modules.Worlds;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class CMIWorldListener implements Listener {
    private CMI plugin;

    public CMIWorldListener(CMI plugin) {
	this.plugin = plugin;
    }

    static ConcurrentHashMap<String, Set<UpdateOnWorldLoad>> locations = new ConcurrentHashMap<String, Set<UpdateOnWorldLoad>>();

    public static void delayRecheck(String world, UpdateOnWorldLoad upd) {
    }

}
