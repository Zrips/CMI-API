package com.Zrips.CMI.Modules.BungeeCord;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.messaging.PluginMessageListener;

import com.Zrips.CMI.CMI;

public class BungeeCordListener implements PluginMessageListener, Listener {
    public final static String incomingChannel = null;
    public final static String outgoingChannel = null;
    CMI plugin;
    HashMap<UUID, BungeeTeleport> tpMap;
    HashMap<String, Long> m;
    Long lastMessageTime;
    Long lastStaffMessageTime;
    Long lastPrivateMessageTime;
    String lastMessage;
    String lastStaffMessage;
    String lastPrivateMessage;

    public BungeeCordListener(CMI plugin) {
    }

    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] bytes) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
    }

    private void checkTeleportRecords(Player player) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
    }

    class BungeeTeleport {
        private Location loc;
        private String from;
        private long time;

        public BungeeTeleport() {
        }

        public Location getLoc() {
            return null;
        }

        public BungeeTeleport setLoc(Location loc) {
            return null;
        }

        public long getTime() {
            return 0;
        }

        public String getFrom() {
            return null;
        }

        public BungeeTeleport setFrom(String from) {
            return null;
        }
    }
}
