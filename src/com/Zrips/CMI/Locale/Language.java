package com.Zrips.CMI.Locale;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;

public class Language {
//    public FileConfiguration enlocale;
//    public FileConfiguration Customlocale;

    private CMI plugin;

    private HashMap<String, FileConfiguration> locales = new HashMap<String, FileConfiguration>();

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

    public FileConfiguration getCustom() {

        return null;
    }

    private FileConfiguration getLocale(String locale) {

        return null;
    }

    /**
     * Get the message with the correct key
     * @param key - the key of the message
     * @return the message
     */

    @Deprecated
    public String getMessage(String key, Object... variables) {
        return getLMessage(plugin.getConfigManager().Lang, key, variables);
    }

    public String getLMessage(String locale, String key, Object... variables) {

        return null;
    }

    static Pattern patern = Pattern.compile("(\\\\n)");

    public String filterNewLine(String msg) {
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
        return replaceUser(type, user, null, msg);
    }

    public String replaceUser(String type, CMIUser user, Player whoGets, String msg) {

        return null;
    }

    public String replacePlayer(String type, Location loc, String msg) {

        return null;
    }

    public String replacePlayer(Location loc, String msg) {

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
    @Deprecated
    public List<String> getMessageList(String key, Object... variables) {
        return getMessageLList(plugin.getConfigManager().Lang, key, variables);
    }

    public List<String> getMessageLList(String locale, String key, Object... variables) {

        return null;
    }

    @Deprecated
    public boolean isList(String key) {
        return isLList(plugin.getConfigManager().Lang, key);
    }

    public boolean isLList(String locale, String key) {
        locale = locale == null ? plugin.getConfigManager().Lang.toLowerCase() : locale.toLowerCase();

        FileConfiguration l = getLocale(locale);

        if (l != null && l.contains(key))
            return l.isList(key);
        if (getEN().contains(key))
            return getEN().isList(key);
        return false;
    }

    /**
     * Check if key exists
     * @param key - the key of the message
     * @return true/false
     */
    @Deprecated
    public boolean containsKey(String key) {
        return containsLKey(plugin.getConfigManager().Lang, key);
    }

    public boolean containsLKey(String locale, String key) {
        locale = locale == null ? plugin.getConfigManager().Lang.toLowerCase() : locale.toLowerCase();
        FileConfiguration l = getLocale(locale);
        if (l != null && l.contains(key))
            return true;
        return getEN().contains(key);
    }

    public boolean isString(String key) {
        return getEN().isString(key);
    }

    @Deprecated
    public Set<String> getKeys(String path) {
        return getLKeys(plugin.getConfigManager().Lang, path);
    }

    public Set<String> getLKeys(String locale, String path) {
        return null;
    }
}
