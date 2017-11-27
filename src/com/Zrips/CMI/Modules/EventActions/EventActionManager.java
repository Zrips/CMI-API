package com.Zrips.CMI.Modules.EventActions;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Containers.Snd;

public class EventActionManager {

    private CMI plugin;

    private HashMap<eventAction, List<String>> map = new HashMap<eventAction, List<String>>();

    public EventActionManager(CMI plugin) {
	this.plugin = plugin;
    }

    public enum eventAction {
	firstJoinServer, joinServer, quitServer, playerDeath, playerRespawn, playerTeleport, bedLeave, bedEnter, playerWorldChange, playerGameModeChange, playerKick, playerLevelChange, voidFall,
	elytraStartGlide, elytraEndGlide
    }

    public void performCommands(eventAction action, Player player) {

    }

    public void load() {
	
    }
}
