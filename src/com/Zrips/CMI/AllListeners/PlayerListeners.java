package com.Zrips.CMI.AllListeners;

import java.awt.Color;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.world.PortalCreateEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPlayerUnVanishEvent;
import com.Zrips.CMI.events.CMIPortalCreateEvent;

public class PlayerListeners implements Listener {
    private CMI plugin;

    public PlayerListeners(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(ignoreCancelled = true)
    public void onUnVanish(CMIPlayerUnVanishEvent e) {

    }

    private static boolean isMonster(Entity ent) {
	return (ent instanceof Monster);
    }

    private static boolean isAnimal(Entity ent) {
	return (ent instanceof Animals);
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onRespawn(PlayerRespawnEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerBedEnterEvent(PlayerBedEnterEvent event) {
    }

    HashMap<UUID, Long> informMap = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerBedLeaveEvent(PlayerBedLeaveEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerDeathEvent(PlayerDeathEvent event) {
	
    }

    class HungerCache {
	private int hunger = 20;
	private float saturation = 5F;

	public HungerCache(int hunger, float saturation) {
	    this.hunger = hunger;
	    this.saturation = saturation;
	}

	public int getHunger() {
	    return hunger;
	}

	public void setHunger(int hunger) {
	    this.hunger = hunger;
	}

	public float getSaturation() {
	    return saturation;
	}

	public void setSaturation(float saturation) {
	    this.saturation = saturation;
	}
    }

    HashMap<UUID, HungerCache> hungerMap = new HashMap<UUID, HungerCache>();

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerDeathEventHunger(PlayerDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerRespawnEventHunger(PlayerRespawnEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onFishingRodUse(PlayerFishEvent event) {
	
    }


    @EventHandler(priority = EventPriority.NORMAL)
    public void VehicleEnterEvent(VehicleEnterEvent event) {
	
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
	
    }

    @EventHandler
    public void onInteractHead(PlayerInteractEvent event) {
	
    }

    @EventHandler
    public void onInteractBeeHive(PlayerInteractEvent event) {
	
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

    @EventHandler(priority = EventPriority.LOWEST)
    public void onTeleportWithEntity(final PlayerTeleportEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerLoginLimit(PlayerLoginEvent event) {
	
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerLogin(PlayerLoginEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerFirstJoin(PlayerJoinEvent event) {
	
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoinInSpawn(PlayerJoinEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerQuitEvent(final PlayerQuitEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOW)
    public void PlayerQuitEventPermissioCache(final PlayerQuitEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoinSafe(PlayerJoinEvent event) {
	
    }

    @EventHandler
    public void onSignChangeEvent(SignChangeEvent event) {
	
    }

    @EventHandler
    public void onSignInteractShift(PlayerInteractEvent event) {
	
    }

    public static HashMap<UUID, String[]> scMap = new HashMap<UUID, String[]>();

    @EventHandler
    public void onSignInteract(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onChatIgnore(AsyncPlayerChatEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onChat(AsyncPlayerChatEvent event) {

    }

    @EventHandler
    public void FoodLevelChangeEvent(FoodLevelChangeEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CreatureSpawnEvent(org.bukkit.event.entity.CreatureSpawnEvent event) {
	
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onSignChangeEventElevator(final SignChangeEvent event) {
	
    }

    HashMap<UUID, Long> elevatorUsage = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerInteractEvent(final PlayerInteractEvent event) {

    }

    private Color getColor(Block block) {
	
	return null;
    }

    private Location findTeleportLocation(Player player, Location loc, boolean up) {
	
	return null;
    }

    @SuppressWarnings({ "incomplete-switch", "deprecation" })
    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerInteractMinecart(PlayerInteractAtEntityEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPotionSplashEvent(PotionSplashEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onEntityDamage(EntityDamageEvent event) {
	
    }

    // Donation command fix
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerDropItemEvent(PlayerDropItemEvent event) {
	
    }

}
