package com.Zrips.CMI.Modules.NickName;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import com.Zrips.CMI.CMI;

public class NickNameListener implements Listener {
    private CMI plugin;

    public NickNameListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerLoginEvent(PlayerLoginEvent event) {
    }

    @Deprecated
    public static String processGradientChat(Player player, String message) {
        return null;
    }
}
