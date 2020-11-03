package com.Zrips.CMI.Modules.Afk;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIAfkEnterEvent;
import com.Zrips.CMI.events.CMIAfkKickEvent;
import com.Zrips.CMI.events.CMIAfkLeaveEvent;

public class AfkListener implements Listener {
    private CMI plugin;

    public AfkListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CreatureSpawnEvent(org.bukkit.event.entity.CreatureSpawnEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerAliasCommand(PlayerCommandPreprocessEvent event) {

    }

    HashMap<UUID, checkInfo> pitchChange = new HashMap<UUID, checkInfo>();

    private class checkInfo {
	private Long time = 0L;
	Location loc;

	checkInfo(Location loc) {
	    this.loc = loc;
	    updateTime();
	}

	public void updateTime() {
	    time = System.currentTimeMillis();
	}

	public void updateLocation(Location loc) {
	    this.loc = loc.clone();
	}

	public boolean isSameDirection(Location loc) {
	    return this.loc.getPitch() == loc.getPitch() && this.loc.getYaw() == loc.getYaw();
	}

	public boolean isOnlyPitchChange(Location loc) {
	    return this.loc.getX() == loc.getX() && this.loc.getY() == loc.getY() && this.loc.getZ() == loc.getZ();
	}

	public boolean timeToCheck() {
	    return time + 1000 < System.currentTimeMillis();
	}

	public Long getTime() {
	    return time;
	}
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerTeleportEvent(PlayerTeleportEvent event) {

    }

    HashMap<UUID, Long> antiPush = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {

    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerPickupItemEvent(PlayerPickupItemEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onFishingRodUse(PlayerFishEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerItemHeldEvent(PlayerItemHeldEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerInteractEntityEvent(PlayerInteractAtEntityEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerInteractEvent(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void InventoryClickEvent(InventoryClickEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerToggleSneakEvent(PlayerToggleSneakEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void EntityDamageEvent(EntityDamageEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onAsyncPlayerChatEvent(final AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CMIAfkEnterEvent(CMIAfkEnterEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CMIAfkKickEvent(CMIAfkKickEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CMIAfkLeaveEvent(CMIAfkLeaveEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerLoginEvent(PlayerLoginEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerQuitEvent(PlayerQuitEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void EntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onItemDrop(PlayerDropItemEvent event) {

    }
}
