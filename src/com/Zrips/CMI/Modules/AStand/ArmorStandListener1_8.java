package com.Zrips.CMI.Modules.AStand;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import com.Zrips.CMI.CMI;

public class ArmorStandListener1_8 implements Listener {
    private CMI plugin;

    public ArmorStandListener1_8(CMI plugin) {
    }

    public static boolean checkInteract(Player player, Entity ent) {
        return false;
    }

    public static boolean checkManipulation(Player player, Entity ent) {
        return false;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void editorCheck(PlayerInteractAtEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void vanillaBugFix(PlayerInteractAtEntityEvent event) {
    }
}
