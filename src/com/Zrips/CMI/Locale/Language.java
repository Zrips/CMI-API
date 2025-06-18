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
    private CMI plugin;
    private HashMap<String, FileConfiguration> locales;
    static Pattern patern;

    public Language(CMI plugin) {
    }

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

    @Deprecated
    public String getMessage(String key, Object... variables) {
        return null;
    }

    public String getLMessage(String locale, String key, Object... variables) {
        return null;
    }

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
        return null;
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

    private static String outReplace(String msg, Object what, Object with) {
        return null;
    }

    private static String replace(String msg, Object what, Object with) {
        return null;
    }

    public String getDefaultMessage(String key) {
        return null;
    }

    @Deprecated
    public List<String> getMessageList(String key, Object... variables) {
        return null;
    }

    public List<String> getMessageLList(String locale, String key, Object... variables) {
        return null;
    }

    @Deprecated
    public boolean isList(String key) {
        return false;
    }

    public boolean isLList(String locale, String key) {
        return false;
    }

    @Deprecated
    public boolean containsKey(String key) {
        return false;
    }

    public boolean containsLKey(String locale, String key) {
        return false;
    }

    public boolean isString(String key) {
        return false;
    }

    @Deprecated
    public Set<String> getKeys(String path) {
        return null;
    }

    public Set<String> getLKeys(String locale, String path) {
        return null;
    }
}
