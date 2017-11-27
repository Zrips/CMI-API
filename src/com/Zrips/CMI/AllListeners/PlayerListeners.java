package com.Zrips.CMI.AllListeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.world.PortalCreateEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPortalCreateEvent;

public class PlayerListeners implements Listener {
    private CMI plugin;

    public PlayerListeners(CMI plugin) {
	this.plugin = plugin;
    }

//    @EventHandler(priority = EventPriority.NORMAL)
//    public void statIncrement(PlayerStatisticIncrementEvent event) {
//	if (event.isCancelled())
//	    return;
//
//	plugin.d(event.getPlayer().getName() + " Stat increment: " + event.getStatistic().name());
//
//    }

    private static boolean isMonster(Entity ent) {
	return (ent instanceof Monster);
    }

    private static boolean isAnimal(Entity ent) {
	return (ent instanceof Animals);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void VehicleEnterEvent(PlayerDeathEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void VehicleEnterEvent(VehicleEnterEvent event) {
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void animation(PlayerAnimationEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void hatPlacement(InventoryClickEvent event) {
	
    }


    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerEditBookEvent(PlayerEditBookEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOW)
    public void EntityDeathEvent(EntityDeathEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onCommand(ServerCommandEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void EntityPortalEnterEvent(EntityPortalEnterEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOW)
    public void EntityDamageEvent(EntityDamageEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOW)
    public void PortalCreateEvent(PortalCreateEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOW)
    public void CMIPortalCreateEvent(CMIPortalCreateEvent event) {
	
    }

    private CMIPortalCreateEvent proccessEvent(PortalCreateEvent e) {
	return null;
    }

    private static Block getMiddleBlock(ArrayList<Block> blocks) {
	return null;
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onTeleport(PlayerTeleportEvent event) {
	
    }

    class vehicleLast {
	private UUID uuid;
	private Entity vehicle;
	private int tick;

	public vehicleLast(UUID uuid, Entity vehicle, int tick) {
	    this.uuid = uuid;
	    this.vehicle = vehicle;
	    this.tick = tick;
	}

	public UUID getUuid() {
	    return uuid;
	}

	public Entity getVehicle() {
	    return vehicle;
	}

	public int getTick() {
	    return tick;
	}

    }

    HashMap<UUID, vehicleLast> mapVehicle = new HashMap<UUID, vehicleLast>();

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onTeleportWithEntity(final VehicleExitEvent event) {
	
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onTeleportWithEntity(final PlayerTeleportEvent event) {
	
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerLogin(PlayerLoginEvent event) {
	
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoinMotd(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerFirstJoin(PlayerJoinEvent event) {
	
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoinAlert(PlayerJoinEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoinMail(PlayerJoinEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoinSafe(PlayerJoinEvent event) {
	
    }

    @EventHandler
    public void onSignChangeEvent(SignChangeEvent event) {

    }

    @EventHandler
    public void onSignInteractShift(PlayerInteractEvent event) {
	
    }

    @EventHandler
    public void onSignInteract(PlayerInteractEvent event) {

    }

    @EventHandler
    public void onChatIgnore(AsyncPlayerChatEvent event) {
	
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onDamage(EntityDamageEvent event) {
	
    }

    @EventHandler
    public void FoodLevelChangeEvent(FoodLevelChangeEvent event) {
	
    }

}
