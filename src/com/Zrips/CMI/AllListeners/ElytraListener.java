package com.Zrips.CMI.AllListeners;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Speed;
import com.Zrips.CMI.events.CMIArmorChangeEvent;

public class ElytraListener implements Listener {

    private CMI plugin;

    private Effect eff = null;

    HashMap<String, Speed> speedMap = new HashMap<String, Speed>();

    public ElytraListener(CMI plugin) {
    }

    @EventHandler
    public void onPlayerSpeed(PlayerMoveEvent event) {
    }

    @EventHandler
    public void onInventoryClick(CMIArmorChangeEvent event) {	
    }

    public double xPosYaw(double time, double radius, double yaw) {
	return Math.sin(time) * radius * Math.cos(Math.PI / 180 * yaw);
    }

    public double yPosYaw(double time, double radius) {
	return Math.cos(time) * radius;
    }

    public double zPosYaw(double time, double radius, double yaw) {
	return Math.sin(time) * radius * Math.sin(Math.PI / 180 * yaw);
    }
    
    public double zPosPitch2(double time, double radius, double pitch) {
	return Math.sin(time) * radius * Math.sin(Math.PI / 180 * pitch);
    }

    public void spawnCircle(final Player player) {
	spawnCircle(player.getLocation());
    }

    public void spawnCircle(Location loc) {

    }

    private void draw(Location location, double radius, double yaw, double pitch, boolean random) {
    }

    private static Vector rotateX(Vector v, double a) {
	return null;
    }

    private static Vector rotateY(Vector v, double a) {
	return null;
    }
    
    @EventHandler
    public void EntityToggleGlideEvent(EntityToggleGlideEvent event) {
    }

    @EventHandler
    public void onElytraFlight(PlayerInteractEvent event) {
	
    }

    private class CMILaunch {
	private Long started;
	private Long lastCharge;

	public Long getStarted() {
	    return started;
	}

	public Long getLastCharge() {
	    return lastCharge;
	}

	public void setLastCharge() {
	}

	public boolean isFullyCharged() {
		return false;
	}
    }

    HashMap<UUID, CMILaunch> map = new HashMap<UUID, CMILaunch>();

    @EventHandler
    public void onSneakEnd(PlayerToggleSneakEvent event) {
    }

    @EventHandler
    public void onMoveRemove(PlayerMoveEvent event) {
    }

    @EventHandler
    public void onElytraLaunch(PlayerInteractEvent event) {
	
    }

    private static void setVel(Player player, double multy) {
    }

    private static void showParticle(Player player, Particle particle) {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
	
    }

    @EventHandler
    public void playerInteractEvent(PlayerInteractEvent event) {


    }

    @EventHandler
    public void dispenserFireEvent(BlockDispenseEvent event) {
	
    }
}