package com.Zrips.CMI.AllListeners;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class NoTargetListener implements Listener {

    private CMI plugin;

    public static Set<UUID> noTargetPlayers = new HashSet<UUID>();

    public NoTargetListener(CMI plugin) {
	this.plugin = plugin;
    }

    public static boolean isInNoTargetPlayers(UUID uuid) {
	if (noTargetPlayers.isEmpty())
	    return false;
	return noTargetPlayers.contains(uuid);
    }

    public static void toggleOn(CMIUser user) {
    }

    public static void toggleOff(CMIUser user) {
	removeNoTargetPlayers(user.getUniqueId());
    }

    public static void addNoTargetPlayers(UUID uuid) {
	noTargetPlayers.add(uuid);
    }

    public static void removeNoTargetPlayers(UUID uuid) {
	noTargetPlayers.remove(uuid);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void EntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event) {
    }
}