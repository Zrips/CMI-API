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
    public final static String incomingChannel = "cmib:fromproxy";
    public final static String outgoingChannel = "cmib:fromserver";
    CMI plugin;

    HashMap<UUID, bungeePortal> tpMap = new HashMap<UUID, bungeePortal>();
    HashMap<String, Long> m = new HashMap<String, Long>();

    Long lastMessageTime = 0L;
    Long lastStaffMessageTime = 0L;
    Long lastPrivateMessageTime = 0L;
    String lastMessage = "";
    String lastStaffMessage = "";
    String lastPrivateMessage = "";

    class bungeePortal {
        private Location loc;
//        private List<String> cmds = new ArrayList<String>();
        private long time = 0L;

        public bungeePortal() {
            time = System.currentTimeMillis();
        }

        public Location getLoc() {
            return loc;
        }

        public bungeePortal setLoc(Location loc) {
            this.loc = loc;
            return this;
        }

        public long getTime() {
            return time;
        }
    }

    public BungeeCordListener(CMI plugin) {

    }

    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] bytes) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoinEvent(PlayerJoinEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerQuitEvent(PlayerQuitEvent event) {

    }
}
