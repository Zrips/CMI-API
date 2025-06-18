package com.Zrips.CMI.Modules.ArmorEffects;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIArmorChangeEvent;

import net.Zrips.CMILib.Items.ArmorTypes;

public class ArmorEffectListener implements Listener {
    private CMI plugin;

    public ArmorEffectListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onBlockInteract(CMIArmorChangeEvent event) {
    }

    private static ItemStack[] getArmorContents(Player player) {
        return null;
    }

    private void modifyOldEffect(Player player, ItemStack oldArmor) {
    }

    private void applyNewEffect(Player player, ArmorTypes armorType) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerLoginNameCheck(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerQuit(PlayerQuitEvent event) {
    }
}
