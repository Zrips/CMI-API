package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.List;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIMaterial;

public class SpawnerActionsListener implements Listener {
    private CMI plugin;

    public SpawnerActionsListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreakExplodeTnT(EntityExplodeEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreakExplodeCreeper(EntityExplodeEvent event) {
    }

    private void dropSpawner(int chance, List<Block> blocks) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onBlockPlace(BlockPlaceEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onTrialSpawnerInteract(PlayerInteractEvent event) {
    }

    private void processEvent(PlayerInteractEvent event, CMIMaterial material) {
    }
}
