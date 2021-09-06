package com.Zrips.CMI.Locale;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;

import net.Zrips.CMILib.Colors.CMIChatColor;

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
	return enlocale;
    }

    /**
     * Get the message with the correct key
     * @param key - the key of the message
     * @return the message
     */

    public String getMessage(String key, Object... variables) {
	return CMIChatColor.translate("");
    }

    public String filterNewLine(String msg) {

	return "";
    }

    public List<String> updateSnd(Snd snd, List<String> msg) {
	return null;
    }

    public String updateSnd(Snd snd, String msg) {

	return "";
    }

    @SuppressWarnings("deprecation")
    public String replacePlayer(String type, Player player, Player whoGets, String msg) {

	return "";
    }

    public String replaceUser(String type, CMIUser user, String msg) {

	return "";
    }

    public String replacePlayer(String type, Location loc, String msg) {
	return "";
    }

    public String replacePlayer(Location loc, String msg) {

	return "";
    }

    public String getDefaultMessage(String key) {

	return CMIChatColor.translate("");
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
	if (Customlocale != null && Customlocale.contains(key))
	    return Customlocale.isList(key);
	if (getEN().contains(key))
	    return getEN().isList(key);
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
