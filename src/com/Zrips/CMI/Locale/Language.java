package com.Zrips.CMI.Locale;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;

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

    public String getMessage(String key, Object... variables) {
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
    public String replacePlayer(String type, Player player, String msg) {

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

    private static String replace(String msg, Object what, Object with) {
	return null;
    }

    public String getDefaultMessage(String key) {
	return null;
    }

    public List<String> getMessageList(String key, Object... variables) {

	return null;
    }

    public boolean isList(String key) {
	return false;
    }

    public boolean containsKey(String key) {
	if (Customlocale.contains(key))
	    return true;
	return enlocale.contains(key);
    }

    public boolean isString(String key) {
	return enlocale.isString(key);
    }
}
