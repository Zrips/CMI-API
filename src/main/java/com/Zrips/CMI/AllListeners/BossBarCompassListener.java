package com.Zrips.CMI.AllListeners;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Config;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.BossBar.BossBarInfo;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.utils.SpawnUtil;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class BossBarCompassListener implements Listener {
    private CMI plugin;

    public BossBarCompassListener(CMI plugin) {
	this.plugin = plugin;
    }

    ConcurrentHashMap<UUID, Long> compassCheck = new ConcurrentHashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(final PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(final PlayerItemHeldEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerMoveEvent(final PlayerMoveEvent event) {

    }

}
