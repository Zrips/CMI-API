package com.Zrips.CMI.Modules.Holograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIInteractType;
import com.Zrips.CMI.events.CMIPlayerFakeEntityInteractEvent;

public class HologramListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdateRange;
    protected Map<UUID, Long> stickyLastUpdate;
//    protected Map<UUID, Long> interactCache;

    public HologramListener(CMI plugin) {
        this.plugin = plugin;
        lastUpdateRange = new HashMap<UUID, Long>();
        stickyLastUpdate = new HashMap<UUID, Long>();
//	interactCache = new HashMap<UUID, Long>();
    }

    private List<Location> getLocations(Location location, double radius, int count) {
        return null;
    }

    private static Vector rotateX(Vector v, double a) {
        double Y = Math.cos(a) * v.getY() - Math.sin(a) * v.getZ();
        double Z = Math.sin(a) * v.getY() + Math.cos(a) * v.getZ();
        return v.setY(Y).setZ(Z);
    }

    private static Vector rotateY(Vector v, double a) {
        double X = Math.cos(a) * v.getX() + Math.sin(a) * v.getZ();
        double Z = -Math.sin(a) * v.getX() + Math.cos(a) * v.getZ();
        return v.setX(X).setZ(Z);
    }

    private static double xPosYaw(double time, double radius, double yaw) {
        return Math.sin(time) * radius * Math.cos(Math.PI / 180 * yaw);
    }

    private static double yPosYaw(double time, double radius) {
        return Math.cos(time) * radius;
    }

    public static double zPosYaw(double time, double radius, double yaw) {
        return Math.sin(time) * radius * Math.sin(Math.PI / 180 * yaw);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerMoveEvent event) {
    

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerTeleportEvent event) {
      
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
       
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
      
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onInteract(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onInteract(CMIHologramClickEvent event) {
     
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPlayerFakeEntityInteractEvent(CMIPlayerFakeEntityInteractEvent event) {

    }

    private static void hologramInteraction(CMIHologram holo, CMIInteractType intt, Player player) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerRespawnEvent(PlayerRespawnEvent event) {
      
    }
}
