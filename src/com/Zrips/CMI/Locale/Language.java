package com.Zrips.CMI.Locale;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Locale.YmlMaker;

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
        try {
            Customlocale = new YmlMaker(plugin, "Translations" + File.separator + "Locale_" + plugin.getConfigManager().Lang + ".yml").getConfig();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private FileConfiguration getEN() {
        if (enlocale == null)
            try {
                enlocale = new YmlMaker(plugin, "Translations" + File.separator + "Locale_EN.yml").getConfig();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
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

        return msg;
    }

    public List<String> updateSnd(Snd snd, List<String> msg) {
        for (int i = 0, l = msg.size(); i < l; ++i) {
            msg.set(i, updateSnd(snd, msg.get(i)));
        }
        return msg;
    }

    public String updateSnd(Snd snd, String msg) {

        return msg;
    }

    @SuppressWarnings("deprecation")
    public String replacePlayer(String type, Player player, Player whoGets, String msg) {

        return msg;
    }

    public String replaceUser(String type, CMIUser user, String msg) {
        return replaceUser(type, user, null, msg);
    }

    public String replaceUser(String type, CMIUser user, Player whoGets, String msg) {

        return msg;
    }

    public String replacePlayer(String type, Location loc, String msg) {

        return msg;
    }

    public String replacePlayer(Location loc, String msg) {

        return msg;
    }

    private static String outReplace(String msg, Object what, Object with) {
        if (what == null)
            return msg;
        if (with == null)
            with = "";
        return msg.replace(String.valueOf(what), String.valueOf(with));
    }

    private static String replace(String msg, Object what, Object with) {
        if (what == null)
            return msg;
        if (with == null)
            with = "";
        return msg.replaceAll(String.valueOf("(?i)(\\[" + what + "\\])"), Matcher.quoteReplacement(String.valueOf(with)));
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
        String missing = "Missing locale for " + key + " ";

        List<String> ls = null;

        return ls;
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
        if (!plugin.getConfigManager().Lang.equalsIgnoreCase("EN") && Customlocale != null && Customlocale.isConfigurationSection(path)) {
            return Customlocale.getConfigurationSection(path).getKeys(false);
        }
        if (getEN() != null && getEN().isConfigurationSection(path)) {
            return getEN().getConfigurationSection(path).getKeys(false);
        }

        return new HashSet<String>();
    }
}
