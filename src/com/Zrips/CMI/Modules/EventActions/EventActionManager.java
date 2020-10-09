package com.Zrips.CMI.Modules.EventActions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.events.CMIEventCommandEvent;

public class EventActionManager {

    private CMI plugin;

    private HashMap<eventAction, List<String>> map = new HashMap<eventAction, List<String>>();

    public EventActionManager(CMI plugin) {
	this.plugin = plugin;
    }

    public enum eventAction {
	firstJoinServer,
	joinServer,
	quitServer,
	playerDeath,
	playerKillPlayer,
	playerRespawn,
	playerTeleport,
	bedLeave,
	bedEnter,
	playerWorldChange,
	playerPreWorldChange,
	playerGameModeChange,
	playerKick,
	playerLevelChange,
	voidFall,
	elytraStartGlide,
	elytraEndGlide,
	pvpstart,
	pvpend
    }

//bossbar still shows after finish

    public void performCommands(eventAction action, Player player) {
	performCommands(action, player, null);
    }

    public void performCommands(eventAction action, Player player, Player source) {

    }

    public void load() {

    }
}
