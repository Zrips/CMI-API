package com.Zrips.CMI.Modules.ActionBar;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class ActionBarManager {

    public ActionBarManager(CMI plugin) {	
    }

    public void send(CommandSender receivingPacket, String msg) {
    }

    public void send(CMIUser user, String msg) {
    }

    HashMap<UUID, repeatingActionBar> actionbarMap = new HashMap<UUID, repeatingActionBar>();

    public void send(Player receivingPacket, String msg) {
	send(receivingPacket, msg, 0);
    }

    @SuppressWarnings("deprecation")
    public void send(Player receivingPacket, String msg, int keepFor) {	
    }
}
