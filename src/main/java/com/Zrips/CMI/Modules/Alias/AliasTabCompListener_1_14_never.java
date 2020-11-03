package com.Zrips.CMI.Modules.Alias;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.event.server.TabCompleteEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Containers.CommandAliasType;

public class AliasTabCompListener_1_14_never implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerCommandSendEvent(PlayerCommandSendEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerChatTabCompleteEvent(TabCompleteEvent event) {
    }
}
