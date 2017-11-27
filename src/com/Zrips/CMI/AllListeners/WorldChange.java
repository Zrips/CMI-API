package com.Zrips.CMI.AllListeners;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import com.Zrips.CMI.CMI;

public class WorldChange implements Listener {
    private CMI plugin;

    public WorldChange(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler
    public void onWorldChangeGameMode(PlayerChangedWorldEvent event) {

    }

    @EventHandler
    public void onWorldChangeGameMode(PlayerLoginEvent event) {

    }

    @EventHandler
    public void onWorldChangeFly(PlayerChangedWorldEvent event) {

    }

    @EventHandler
    public void onWorldChangeFly(PlayerLoginEvent event) {

    }

    @EventHandler
    public void onWorldChangeGod(PlayerChangedWorldEvent event) {

    }

}
