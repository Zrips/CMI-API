package com.Zrips.CMI.Locale;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.YmlMaker;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Containers.CMIChatColor;

public class Language {
    public FileConfiguration enlocale;
    public FileConfiguration Customlocale;

    private CMI plugin;

    public Language(CMI plugin) {
	this.plugin = plugin;
    }

    /**
     * Reloads the config
     */
    public void reload() {
    }

    private FileConfiguration getEN() {
	return null;
    }

    /**
     * Get the message with the correct key
     * @param key - the key of the message
     * @return the message
     */

    public String getMessage(String key, Object... variables) {
	
	return null;
    }

    public String filterNewLine(String msg) {
	return null;
    }

    private String getM(LC lc) {
	return null;
    }

    public List<String> updateSnd(Snd snd, List<String> msg) {
	return null;
    }

    public String updateSnd(Snd snd, String msg) {
	
	return null;
    }

    @SuppressWarnings("deprecation")
    public String replacePlayer(String type, Player player, Player whoGets, String msg) {

	return null;
    }

    public String replaceUser(String type, CMIUser user, String msg) {
	
	return null;
    }

    public String replacePlayer(String type, Location loc, String msg) {

	return null;
    }

    public String replacePlayer(Location loc, String msg) {
	
	return null;
    }

    private static String outReplace(String msg, Object what, Object with) {
	return null;
    }

    private static String replace(String msg, Object what, Object with) {
	return null;
    }

    public String getDefaultMessage(String key) {
	return null;
    }

    /**
     * Get the message with the correct key
     * @param key - the key of the message
     * @return the message
     */
    public List<String> getMessageList(String key, Object... variables) {
	
	return null;
    }

    public boolean isList(String key) {
	return false;
    }

    /**
     * Check if key exists
     * @param key - the key of the message
     * @return true/false
     */
    public boolean containsKey(String key) {
	if (Customlocale != null && Customlocale.contains(key))
	    return true;
	return getEN().contains(key);
    }

    public boolean isString(String key) {
	return getEN().isString(key);
    }

    public Set<String> getKeys(String path) {
	return new HashSet<String>();
    }
}
