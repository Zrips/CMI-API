package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class InteractiveCommandListener implements Listener {

    private CMI plugin;

    public InteractiveCommandListener(CMI plugin) {
        this.plugin = plugin;
    }

//    Pattern patern = Pattern.compile("(^| )\\$\\d(-)?($| )");

    private static int MAX_ENTRIES = 50;
    public static LinkedHashMap<UUID, Long> limit = new LinkedHashMap<UUID, Long>(MAX_ENTRIES + 1, .75F, false) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<UUID, Long> eldest) {
            return size() > MAX_ENTRIES;
        }
    };

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerInteractEvent(final PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void blockBreak(BlockBreakEvent event) {

    }

    @EventHandler
    public void onSignChangeEvent(SignChangeEvent event) {

    }
}
