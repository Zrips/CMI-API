package com.Zrips.CMI.Modules.DiscordSRV;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class DiscordSRVManager {

    private CMI plugin;
    private DiscordSRVListener discordsrvListener = new DiscordSRVListener();
    private String channelName = null;

    public DiscordSRVManager(CMI plugin) {
	
    }

    public boolean enabled() {
	return false;
    }

    public void sendDiscordMessage(Player player, String message) {
	
    }
}
