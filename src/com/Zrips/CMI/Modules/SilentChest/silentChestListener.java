package com.Zrips.CMI.Modules.SilentChest;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.SilentChest;

public class silentChestListener implements Listener {
    private static HashMap<UUID, SilentChest> silentChest;
    public static HashMap<UUID, Boolean> toggledSilentChest;
    private CMI plugin;
    private static HashMap<UUID, Long> sleep;

    public silentChestListener(CMI plugin) {
    }

    public static void clearCache(UUID uuid) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void animation(PlayerAnimationEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreakEvent(BlockBreakEvent event) {
    }

    @SuppressWarnings("unchecked")
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerInteract(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onSilentInventoryClose(InventoryCloseEvent event) {
    }

    private static Location getLocation(InventoryHolder ih) {
        return null;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onSilentInventoryClickWatcher(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onSilentInventoryClickWatcher(InventoryDragEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onSilentInventoryClick(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onSilentInventoryClick(InventoryDragEvent event) {
    }

    private static SilentChest getSilentChestByInventory(Inventory inv) {
        return null;
    }

    private static boolean validBlock(Block block) {
        return false;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onInventoryMoveItemEvent(InventoryMoveItemEvent event) {
    }

    private static void updateMovedItem(Location loc, SilentChest info, Inventory sourceInv, boolean delay) {
    }
}
