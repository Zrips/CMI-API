package com.Zrips.CMI;

import java.util.ArrayList;
import java.util.Collections;
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
	List<String> completionList = get(sender, command.getName(), label, args);
	Collections.sort(completionList);
	return completionList;
    }

    public enum TabAction {
	na,
	playername,
	mutedplayername,
	damageCause,
	bannedplayername,
	gamemode,
	worlds,
	itemname,
	EntityType,
	kit,
	kitnames,
	biome,
	treeType,
	maxplayers,
	potioneffect,
	effect,
	merchants,
	enchant,
	halfViewRange,
	doubleViewRange,
	ViewRange,
	maxenchantlevel,
	currentItemName,
	loreLine,
	currentItemLore,
	currentX,
	currentY,
	currentZ,
	currentWorld,
	currentPitch,
	currentYaw,
	itemFlag,
	nickName,
	nickNames,
	homes,
	warps,
	allwarps,
	rankname,
	statstype,
	statssubtype,
	motd,
	bungeeserver,
	scheduleName,
	ctext,
	jail,
	cellId,
	sound,
	dbusercollumsshort,
	placeholders,
	warncategory,
	projectiletype,
	holograms,
	mobtype,
	signLine;

	public static TabAction getAction(String name) {
	    return null;
	}
    }

    @SuppressWarnings("deprecation")
    public List<String> get(CommandSender sender, String command, String label, String[] args) {
	List<String> completionList = new ArrayList<>();
	return completionList;

    }

    private List<String> getColorNames() {
	return null;
    }
}
