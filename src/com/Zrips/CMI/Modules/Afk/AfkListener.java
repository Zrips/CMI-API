package com.Zrips.CMI.Modules.Afk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.events.CMIAfkEnterEvent;
import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;
import com.Zrips.CMI.events.CMIAfkKickEvent;
import com.Zrips.CMI.events.CMIAfkLeaveEvent;

public class AfkListener implements Listener {
    private CMI plugin;

    public AfkListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
	final Player player = event.getPlayer();
	if (player == null)
	    return;
	if (player.hasMetadata("NPC"))
	    return;
	final boolean afk = plugin.getPlayerManager().getUser(player).isAfk();
	if (plugin.getAfkManager().isDisableOnCommand()) {
	    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
		@Override
		public void run() {
		    CMIUser user = plugin.getPlayerManager().getUser(player);
		    if (afk && user.isAfk())
			user.setAfk(false, AfkType.auto);
		    plugin.getAfkManager().updateUser(user);
		}
	    }, 1);

	}
    }

    private class previousLoc {
	List<Location> locs = new ArrayList<Location>();
	private int jumpCount = 0;

	public Location addLoc(Location loc) {
	    locs.add(loc);
	    if (locs.size() > 2)
		return locs.remove(0);
	    return null;
	}

	public int getJumpCount() {
	    return jumpCount;
	}

	public void setJumpCount(int jumpCount) {
	    this.jumpCount = jumpCount;
	}

	public void addJumpCount() {
	    this.jumpCount++;
	}
    }

    HashMap<UUID, previousLoc> antiJump = new HashMap<UUID, previousLoc>();

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {
	Player player = event.getPlayer();
	if (player == null)
	    return;
	Location locfrom = event.getFrom();
	Location locto = event.getTo();
	if (locfrom.getBlockX() == locto.getBlockX() && locfrom.getBlockY() == locto.getBlockY() && locfrom.getBlockZ() == locto.getBlockZ())
	    return;
	if (player.hasMetadata("NPC"))
	    return;

	if (plugin.getAfkManager().isPreventJumping())
	    if (locfrom.getBlockY() != locto.getBlockY()) {
		previousLoc prev = antiJump.get(player.getUniqueId());
		if (prev == null)
		    prev = new previousLoc();
		Location prevLoc = prev.addLoc(locto);
		if (prevLoc != null) {
		    if (prevLoc.getBlockY() == locto.getBlockY()) {
			prev.addJumpCount();
		    } else {
			prev.setJumpCount(0);
		    }
		    if (prevLoc.getBlockX() != locto.getBlockX() || prevLoc.getBlockZ() != locto.getBlockZ())
			prev.setJumpCount(0);
		    if (prev.getJumpCount() > 10) {
			return;
		    }
		}

		antiJump.put(player.getUniqueId(), prev);
	    }

	CMIUser user = plugin.getPlayerManager().getUser(event.getPlayer());
	if (plugin.getAfkManager().isDisableOnMove()) {
	    user.setAfk(false, AfkType.auto);
	}
	plugin.getAfkManager().updateUser(user);
    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerPickupItemEvent(PlayerPickupItemEvent event) {

	if (!plugin.getAfkManager().isDisableItemPickup())
	    return;
	CMIUser user = plugin.getPlayerManager().getUser(event.getPlayer());
	if (user == null)
	    return;
	if (user.isAfk()) {
	    event.setCancelled(true);
	    event.getItem().setPickupDelay(20);
	}
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onInteract(PlayerInteractEvent event) {
	if (!plugin.getAfkManager().isDisableOnInteract())
	    return;
	CMIUser user = plugin.getPlayerManager().getUser(event.getPlayer());
	if (user == null)
	    return;
	user.setAfk(false, AfkType.auto);
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onInteract(PlayerAnimationEvent event) {
	if (!plugin.getAfkManager().isDisableOnInteract())
	    return;
	CMIUser user = plugin.getPlayerManager().getUser(event.getPlayer());
	if (user == null)
	    return;
	user.setAfk(false, AfkType.auto);
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onInteract(InventoryClickEvent event) {
	if (!plugin.getAfkManager().isDisableOnInventoryClick())
	    return;
	CMIUser user = plugin.getPlayerManager().getUser((Player) event.getWhoClicked());
	if (user == null)
	    return;
	user.setAfk(false, AfkType.auto);
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onInteract(PlayerToggleSneakEvent event) {
	if (!plugin.getAfkManager().isDisableOnMove())
	    return;
	CMIUser user = plugin.getPlayerManager().getUser(event.getPlayer());
	if (user == null)
	    return;
	user.setAfk(false, AfkType.auto);
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onInteract(EntityDamageEvent event) {
	if (!plugin.getAfkManager().isPreventDamage())
	    return;

	if (!(event.getEntity() instanceof Player))
	    return;

	CMIUser user = plugin.getPlayerManager().getUser((Player) event.getEntity());
	if (user == null)
	    return;

	if (user.isAfk())
	    event.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
	if (!plugin.getAfkManager().isDisableOnPublicChat())
	    return;
	CMIUser user = plugin.getPlayerManager().getUser(event.getPlayer());
	if (user == null)
	    return;
	user.setAfk(false, AfkType.auto);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(CMIAfkLeaveEvent event) {
	Player player = event.getPlayer();
	if (player == null)
	    return;
	Snd snd = new Snd().setSender(player).setTarget(player);
	plugin.broadcastMessage(plugin.getMsg(LC.afk_left, snd));
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerMove(CMIAfkEnterEvent event) {
	Player player = event.getPlayer();
	if (player == null)
	    return;
	if (!player.hasPermission("cmi.command.afk.auto"))
	    event.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerMove(CMIAfkKickEvent event) {
	Player player = event.getPlayer();
	if (player == null)
	    return;
	if (!player.hasPermission("cmi.command.afk.auto"))
	    event.setCancelled(true);
	if (player.hasPermission("cmi.command.afk.kickbypass"))
	    event.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerLoginEvent event) {
	Player player = event.getPlayer();
	if (player == null)
	    return;
	CMIUser user = plugin.getPlayerManager().getUser(event.getPlayer());
	plugin.getAfkManager().updateUser(user);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerQuitEvent event) {
	Player player = event.getPlayer();
	if (player == null)
	    return;
	CMIUser user = plugin.getPlayerManager().getUser(event.getPlayer());
	user.setAfk(false, AfkType.auto);
	plugin.getAfkManager().removeUser(user);
	antiJump.remove(player.getUniqueId());
    }
}
