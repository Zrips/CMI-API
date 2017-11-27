package com.Zrips.CMI.Modules.CmdCooldown;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.CmdWarmUp.CmdWarmUp;

public class CooldownManager {
    private HashMap<String, CmdWarmUp> cooldowns = new HashMap<String, CmdWarmUp>();

    CMI plugin;

    public CooldownManager(CMI plugin) {
	this.plugin = plugin;
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

    public boolean canUseCmd(CommandSender sender, String cmd) {
	return true;
    }

    public boolean inCD(String cmd, Long t) {
	return false;
    }

}
