package com.Zrips.CMI.AllListeners;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;

import com.Zrips.CMI.CMI;

public class PlayerListeners implements Listener {
    private CMI plugin;
    HashMap<UUID, HungerCache> hungerMap;
    public static HashMap<UUID, String[]> scMap;

    public PlayerListeners(CMI plugin) {
    }

    private static boolean isMonster(Entity ent) {
        return false;
    }

    private static boolean isAnimal(Entity ent) {
        return false;
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerPickupItemEvent(PlayerPickupItemEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onRespawn(PlayerRespawnEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onRespawnSetLocation(PlayerRespawnEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerDeathEvent(PlayerDeathEvent event) {
    }

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
    public void onTeleport(PlayerTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerLoginLimit(PlayerLoginEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerLoginFakeUser(PlayerLoginEvent event) {
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
    public void PlayerQuitEvent(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void PlayerQuitEventPermissioCache(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoinSafe(PlayerJoinEvent event) {
    }

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

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPotionSplashEvent(PotionSplashEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onEntityDamage(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerDropItemEvent(PlayerDropItemEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerDropItemEvent(PlayerToggleSprintEvent event) {
    }

    class HungerCache {
        private int hunger;
        private float saturation;

        public HungerCache(int hunger, float saturation) {
        }

        public int getHunger() {
            return 0;
        }

        public void setHunger(int hunger) {
        }

        public float getSaturation() {
            return 0.0f;
        }

        public void setSaturation(float saturation) {
        }
    }
}
