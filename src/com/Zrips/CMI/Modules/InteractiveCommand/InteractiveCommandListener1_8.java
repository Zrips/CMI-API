package com.Zrips.CMI.Modules.InteractiveCommand;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIInteractType;

public class InteractiveCommandListener1_8 implements Listener {
    private CMI plugin;

    public InteractiveCommandListener1_8(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event) {
    }

    private boolean processInteraction(Entity clickedEnity, Player playerWhoClicked, CMIInteractType type) {
        return false;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
    }
}
