package com.Zrips.CMI.Modules.Afk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.events.CMIAfkEnterEvent;
import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;
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

    static HashMap<UUID, checkInfo> pitchChange = new HashMap<UUID, checkInfo>();

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerTeleportEvent(PlayerTeleportEvent event) {

    }

    HashMap<UUID, Long> antiPush = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {

    }

    public static boolean isSameDirection(CMIUser user) {

        return true;
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
    public void PlayerInteractEvent(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void InventoryClickEvent(InventoryClickEvent event) {
        if (!plugin.getAfkManager().isDisableOnInventoryClick())
            return;
        CMIUser user = plugin.getPlayerManager().getUser((Player) event.getWhoClicked());
        if (user == null)
            return;
        user.setAfk(false, AfkType.auto);
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

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onBlockBreakEvent(BlockBreakEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerRespawnEvent(PlayerRespawnEvent event) {

    }
}
