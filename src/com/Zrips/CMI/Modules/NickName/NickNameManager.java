package com.Zrips.CMI.Modules.NickName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ConfigReader;

public class NickNameManager {

    private CMI plugin;

    private HashMap<String, UUID> NickMap = new HashMap<String, UUID>();
    private HashMap<String, UUID> NameMap = new HashMap<String, UUID>();

    public NickNameManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void removeNickName(String nick) {
	NickMap.remove(ChatColor.stripColor(nick).toLowerCase());
    }

    public void addNewNickName(String nick, UUID uuid) {
	NickMap.put(ChatColor.stripColor(nick).toLowerCase(), uuid);
    }

    public void addNewName(String nick, UUID uuid) {
	NameMap.put(nick.toLowerCase(), uuid);
    }

    public UUID whoUsesName(String nick) {
	UUID uuid = NickMap.get(nick.toLowerCase());
	if (uuid == null)
	    uuid = NameMap.get(nick.toLowerCase());
	return uuid;
    }

    public List<String> getNickNamesStartingWith(Player player, String nick) {
	return null;
    }

    private String NickNameFormat;
    private List<String> NickNameBlackList;
    private int NickNameLenght;
    private Boolean ColorsNickName;

    public void load() {
    }

    public String getNickNameFormat() {
	return NickNameFormat;
    }

    public List<String> getNickNameBlackList() {
	return NickNameBlackList;
    }

    public int getNickNameLenght() {
	return NickNameLenght;
    }

    public Boolean isColorsNickName() {
	return ColorsNickName;
    }
}
