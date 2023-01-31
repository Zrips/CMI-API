package com.Zrips.CMI.Modules.Elytra;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Speed;
import com.Zrips.CMI.events.CMIArmorChangeEvent;

public class ElytraBoostListener implements Listener {

    private CMI plugin;

    private Effect eff = null;

    HashMap<UUID, Speed> speedMap = new HashMap<UUID, Speed>();

    public ElytraBoostListener(CMI plugin) {
        this.plugin = plugin;
        for (Effect one : Effect.values()) {
            if (one.name().equalsIgnoreCase("ENDERDRAGON_SHOOT"))
                eff = one;
        }
    }

    @EventHandler
    public void onPlayerSpeed(PlayerMoveEvent event) {

    }

    @EventHandler
    public void onInventoryClick(CMIArmorChangeEvent event) {

    }

    public static double xPosYaw(double time, double radius, double yaw) {
        return Math.sin(time) * radius * Math.cos(Math.PI / 180 * yaw);
    }

    public static double yPosYaw(double time, double radius) {
        return Math.cos(time) * radius;
    }

    public static double zPosYaw(double time, double radius, double yaw) {
        return Math.sin(time) * radius * Math.sin(Math.PI / 180 * yaw);
    }

    public double zPosPitch2(double time, double radius, double pitch) {
        return Math.sin(time) * radius * Math.sin(Math.PI / 180 * pitch);
    }

    public void spawnCircle(final Player player) {
        spawnCircle(player.getLocation());
    }

    public static void spawnCircle(Location loc) {

    }

    @EventHandler
    public void EntityToggleGlideEvent(EntityToggleGlideEvent event) {

    }

    @EventHandler
    public void onElytraFlight(PlayerInteractEvent event) {

    }

    private static void setVel(Player player, double multy) {
        player.setVelocity(player.getVelocity().add(player.getLocation().getDirection().multiply(multy)));
    }

    private static void showParticle(Player player, Particle particle) {
        player.getWorld().spawnParticle(particle, player.getLocation(), 1, 0, 0, 0, 0);
    }
}