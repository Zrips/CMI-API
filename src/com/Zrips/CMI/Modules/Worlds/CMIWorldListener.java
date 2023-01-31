package com.Zrips.CMI.Modules.Worlds;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldLoadEvent;

import com.Zrips.CMI.CMI;

public class CMIWorldListener implements Listener {
    private CMI plugin;

    public CMIWorldListener(CMI plugin) {
        this.plugin = plugin;
    }

    static ConcurrentHashMap<String, Set<UpdateOnWorldLoad>> locations = new ConcurrentHashMap<String, Set<UpdateOnWorldLoad>>();

    public static void delayRecheck(String world, UpdateOnWorldLoad upd) {

    }

    @EventHandler
    public void onWorldLoad(WorldLoadEvent event) {

    }

}
