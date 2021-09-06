package com.Zrips.CMI.Modules.EventActions;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class EventActionManager {

    private CMI plugin;

    public EventActionManager(CMI plugin) {
	this.plugin = plugin;
    }

    public enum eventAction {
	firstJoinServer,
	joinServer,
	quitServer,
	playerDeath(true),
	playerKillPlayer(true),
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
	pvpend;

	private List<String> commands = new ArrayList<String>();
	private List<String> sourceCommands = new ArrayList<String>();
	private boolean secondary = false;

	eventAction() {
	}

	eventAction(boolean secondary) {
	    this.secondary = secondary;
	}

	public List<String> getCommands() {
	    return this.commands;
	}

	public List<String> getSourceCommands() {
	    return this.sourceCommands;
	}

	public void setCommands(List<String> commands) {
	    this.commands = commands;
	}

	public void setSourceCommands(List<String> commands) {
	    this.sourceCommands = commands;
	}

	public void clear() {
	    commands.clear();
	    sourceCommands.clear();
	}

	public boolean isIncludeSource() {
	    return secondary;
	}
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
