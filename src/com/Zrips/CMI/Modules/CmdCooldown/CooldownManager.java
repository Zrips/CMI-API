package com.Zrips.CMI.Modules.CmdCooldown;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown.CMICooldown;
import com.Zrips.CMI.Modules.CmdWarmUp.CmdWarmUp;

import com.Zrips.CMI.Modules.Permissions.PermissionInfo;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.commands.CommandsHandler;

public class CooldownManager {
    private HashMap<String, CmdWarmUp> cooldowns = new HashMap<String, CmdWarmUp>();

    CMI plugin;

    public CooldownManager(CMI plugin) {
	this.plugin = plugin;
    }

    public int getCooldownCount() {
	return cooldowns.size();
    }

    public void addCD(String cmd, Long time) {
	cooldowns.put(cmd.toLowerCase(), new CmdWarmUp(cmd, time, false));
    }

    private CmdWarmUp getTime(String cmd) {
	return null;
    }

    private static Long getUsedTime(String cmd, CmdCooldown userCooldowns) {
	return null;
    }

    private static String getCommandMatch(String cmd, CmdCooldown userCooldowns) {
	return null;
    }

    public boolean removeCooldown(CommandSender sender, String cmd) {
	return true;
    }

    public boolean isCmdInCooldown(CommandSender sender, String cmd) {

	return false;
    }

    public boolean canUseCmd(CommandSender sender, String cmd) {

	return true;
    }

    public boolean inCD(String cmd, Long t) {
	return false;
    }

    HashMap<UUID, CmdCooldown> playerCustomCooldowns = new HashMap<UUID, CmdCooldown>();

    public boolean canUseSpecCommand(Player player, commandCooldown cooldown, boolean inform) {

	return true;
    }

    public HashMap<String, CmdWarmUp> getCooldowns() {
	return cooldowns;
    }

    public class commandCooldown {
	private Long cd = 0L;
	private String cmd;

	public Long getCd() {
	    return cd;
	}

	public commandCooldown setCd(Long cd) {
	    this.cd = cd;
	    return this;
	}

	public String getCmd() {
	    return cmd;
	}

	public String getBaseCmd() {
	    return cmd.contains(" ") ? cmd.split(" ")[0] : cmd;
	}

	public commandCooldown setCmd(String cmd) {
	    return null;
	}

	public long untilNextUse(Long usedOn) {
	    return (usedOn + (getCd() * 1000)) - System.currentTimeMillis();
	}

    }

}
