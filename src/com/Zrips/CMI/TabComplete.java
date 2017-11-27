package com.Zrips.CMI;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class TabComplete implements TabCompleter {

    private CMI plugin;

    public TabComplete(CMI plugin) {
	this.plugin = plugin;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
	return null;
    }

    public enum TabAction {
	na, playername, gamemode, worlds, itemname, EntityType, kit, biome, treeType, maxplayers, potioneffect,
	merchants, enchant, halfViewRange, doubleViewRange, ViewRange, maxenchantlevel, currentItemName, loreLine, currentItemLore, currentX, currentY, currentZ,
	currentWorld, currentPitch, currentYaw, itemFlag, nickName, homes, warps, rankname, statstype, statssubtype, motd;
	public static TabAction getAction(String name) {
	    for (TabAction one : TabAction.values()) {
		if (one.name().equalsIgnoreCase(name))
		    return one;
	    }
	    return TabAction.na;
	}
    }

    @SuppressWarnings("deprecation")
    public List<String> get(CommandSender sender, String command, String label, String[] args) {
	return null;
    }
}
