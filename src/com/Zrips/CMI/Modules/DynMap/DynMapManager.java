package com.Zrips.CMI.Modules.DynMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class DynMapManager {

    private CMI plugin;

    public DynMapManager(CMI plugin) {
	
    }

    public boolean enabled() {
	return false;
    }

    public void processPlayer(Player player) {
	processPlayer(plugin.getPlayerManager().getUser(player));
    }

    public void processPlayer(CMIUser user) {
    }

    public void sentMessage(Player player, String message) {
	
    }
}
