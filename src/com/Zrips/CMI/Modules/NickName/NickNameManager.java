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
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Containers.CMIChatColor;

public class NickNameManager {

    private CMI plugin;

    private HashMap<String, UUID> NickMap = new HashMap<String, UUID>();
    private HashMap<String, UUID> NameMap = new HashMap<String, UUID>();

    public NickNameManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void removeNickName(String nick) {
	NickMap.remove(CMIChatColor.stripColor(nick).toLowerCase());
    }

    public void addNewNickName(String nick, UUID uuid) {
	NickMap.put(CMIChatColor.stripColor(nick).toLowerCase(), uuid);
    }

    public void addNewName(String nick, UUID uuid) {
	NameMap.put(nick.toLowerCase(), uuid);
    }

    public UUID whoUsesName(String nick) {
	return null;
    }

    public List<String> getNickNamesStartingWith(Player player, String nick) {
	return null;
    }

    private String NickNameFormat;
    private boolean DisplayNameChange;
    private String ValidNickNameRegex;
    private List<String> NickNameBlackList;
    private int NickNameLengthMax;
    private int NickNameLengthMin;
    private String NickNamePrefix;
    private Boolean PrefixWhenDifferent;
    private Boolean IncludeInTabComplete;
    private Boolean ColorsNickName;

    public void load() {

    }

    public String getNickNameFormat() {
	return NickNameFormat;
    }

    public List<String> getNickNameBlackList() {
	return NickNameBlackList;
    }

    public int getNickNameLengthMax() {
	return NickNameLengthMax;
    }

    public int getNickNameLengthMin() {
	return NickNameLengthMin;
    }

    public Boolean isColorsNickName() {
	return ColorsNickName;
    }

    public String getNickNamePrefix() {
	return NickNamePrefix;
    }

    public void setNickNamePrefix(String nickNamePrefix) {
	NickNamePrefix = nickNamePrefix;
    }

    public Boolean isPrefixWhenDifferent() {
	return PrefixWhenDifferent;
    }

    public void setPrefixWhenDifferent(Boolean prefixWhenDifferent) {
	PrefixWhenDifferent = prefixWhenDifferent;
    }

    public String getValidNickNameRegex() {
	return ValidNickNameRegex;
    }

    public boolean isDisplayNameChange() {
	return DisplayNameChange;
    }

    public boolean isIncludeNickNameInTabComplete() {
	return IncludeInTabComplete;
    }
}
