package com.Zrips.CMI.Modules.Permissions;

import java.util.HashMap;
import java.util.UUID;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.utils.RawMessage;

public class PermissionsManager {

    private CMI plugin;

    private PermissionInterface perm = null;

    public PermissionsManager(CMI plugin, String label) {
	this.plugin = plugin;
	this.label = label;
	checkPermissions();
    }

    public enum CMIPerm {
	command_commandspy_hide("Hides performed commands from commandspy"),
	actionbar_colors("Allows to use colors in action bar command"),
	bossbar_colors("Allows to use colors in boss bar command"),
	seevanished("Allows to see vanished people"),
	messages_disablelogin("Disables login message"),
	messages_disablequit("Disables logout message"),
	scrollpainting("Allows to modify paintings"),
	command_mute_bypass("Bypass personal public chat mute"),
	command_mutechat_bypass("Bypass public chat mute"),
	command_money_admin("Allows to manipulate player balance"),
	command_money_betweenworldgroups("Allows money transfer between worlds"),
	autorespawn("Allows to respawn automaticaly"),
	elytralaunch("Allows to use elytra launch feature"),
	command_time_edit("Allows to manipulate time"),
	permisiononerror("Allows to see missing permission on error message"),
	command_flightcharge_admin("Allows to edit flight charges for players"),
	command_kick_bypass("Prevent player from being kicked from server"),
	command_ride_$1("Allow to ride entity"),
	command_sit_stairs("Allows to sit on stairs automaticaly"),
	eventcommands_bypass_$1("Allows to bypass event commands"),
	invedit("Allow to edit players inventory"),
	command_inv_preventmodify("Prevent inventory modifications by others");
	private String desc;

	CMIPerm(String desc) {
	    this.desc = desc;
	}

	public String getDesc() {
	    return desc;
	}

	public void setDesc(String desc) {
	    this.desc = desc;
	}

	public String getPermission() {
	    return getPermission("");
	}

	public String getPermission(String... extra) {
	    return null;
	}

	public boolean hasPermission(CommandSender sender) {
	    return hasPermission(sender, false);
	}

	public boolean hasPermission(CommandSender sender, String... extra) {
	    return hasPermission(sender, false, extra);
	}

	public boolean hasPermission(CommandSender sender, boolean inform, String... extra) {
	    boolean has = sender.hasPermission(this.getPermission(extra));
	    return has;
	}

	public boolean hasSetPermission(CommandSender sender) {
	    return CMI.getInstance().getPermissionsManager().isSetPermission(sender, this.getPermission());
	}
    }

    public void checkPermissions() {
	
    }

    public String getMainGroup(Player player) {
	return null;
    }

    public String getPrefix(Player player) {
	return null;
    }

    public String getSufix(Player player) {
	return null;
    }

    private String label = "";

    public boolean isSetPermission(CommandSender sender, String perm) {
	return true;
    }

    public boolean isSetPermission(Player player, String perm) {
	return false;
    }

    private HashMap<String, Boolean> getAll(Player player) {
	return null;
    }

    private HashMap<UUID, HashMap<String, PermissionInfo>> cahce = new HashMap<UUID, HashMap<String, PermissionInfo>>();

    public PermissionInfo getPermissionInfo(Player player, String perm, Long delay) {
	return getPermissionInfo(player, perm, false, delay);
    }

    public PermissionInfo getPermissionInfo(Player player, String perm) {
	return getPermissionInfo(player, perm, false, 1000L);
    }

    public PermissionInfo getPermissionInfo(Player player, String perm, boolean force) {
	return getPermissionInfo(player, perm, force, 1000L);
    }

    public PermissionInfo getPermissionInfo(Player player, String perm, boolean force, Long delay) {

	return null;
    }
}
