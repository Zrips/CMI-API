package com.Zrips.CMI.Modules.Vanish;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockReceiveGameEvent;

import com.Zrips.CMI.CMI;

public class VanishListener1_19 implements Listener {
    private CMI plugin;

    public VanishListener1_19(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onBlockReceiveGameEvent(BlockReceiveGameEvent event) {
    }
}
