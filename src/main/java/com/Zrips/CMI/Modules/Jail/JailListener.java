package com.Zrips.CMI.Modules.Jail;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.BossBar.BossBarInfo;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.events.CMIAfkEnterEvent;
import com.Zrips.CMI.events.CMIAfkLeaveEvent;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class JailListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdate;

    public JailListener(CMI plugin) {
	this.plugin = plugin;
	lastUpdate = new HashMap<UUID, Long>();
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerQuitEvent(PlayerQuitEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerJoinEvent(PlayerJoinEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onPlayerInteract(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onPlayerInteract(PlayerDropItemEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onHit(EntityDamageByEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onPlayerDamage(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerMove(PlayerCommandPreprocessEvent event) {
    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerPickupItemEvent(PlayerPickupItemEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void AsyncPlayerChatEvent(AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIAfkEnterEvent(CMIAfkEnterEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIAfkEnterEvent(CMIAfkLeaveEvent event) {
    }
}
