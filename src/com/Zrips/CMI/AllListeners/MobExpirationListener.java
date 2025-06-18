package com.Zrips.CMI.AllListeners;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class MobExpirationListener implements Listener {
    private CMI plugin;
    static ConcurrentHashMap<UUID, CMITask> mobTaskers;

    public MobExpirationListener(CMI plugin) {
    }

    public static void addMob(Entity ent, double seconds) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void EntityDeathEvent(EntityDeathEvent event) {
    }
}
