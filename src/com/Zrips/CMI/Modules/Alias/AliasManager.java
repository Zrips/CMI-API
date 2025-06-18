package com.Zrips.CMI.Modules.Alias;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Containers.CommandAliasType;

public class AliasManager {
    private CMI plugin;
    public LinkedHashMap<String, CommandAlias> defaultAliases;
    public LinkedHashMap<String, CommandAlias> customAliases;
    public LinkedHashMap<String, CommandAlias> alternativeAliases;
    public HashMap<String, CommandAlias> fromAliases;
    public static String nonExactAliasSuffix;
    private static final int MAX_CACHE_SIZE = 0;
    private static Map<String, CommandAlias> cache;
    private static Map<String, List<CommandAlias>> cacheListed;
    public static Pattern patern;
    List<String> CommentList;
    List<String> temp;
    private String fileName;

    public AliasManager(CMI plugin) {
    }

    private static CommandAlias getFirst(String msg, CommandAlias compare, String key) {
        return null;
    }

    private static CommandAlias getSecond(String msg, CommandAlias secondAlias, CommandAlias firstAlias, CommandAlias compare, String key) {
        return null;
    }

    public void clearCache() {
    }

    public CommandAlias getAliasForCommand(String msg) {
        return null;
    }

    public List<CommandAlias> getAliasStartingWith(String msg) {
        return null;
    }

    public List<CommandAlias> getAliasStartingWith(String msg, CommandAliasType type) {
        return null;
    }

    private void register(CommandAlias ca) {
    }

    public void addDefault(CommandAlias ca) {
    }

    public void addCustom(CommandAlias ca) {
    }

    public void removeCustom(String command) {
    }

    public void removeCustom(CommandAlias ca) {
    }

    public LinkedHashMap<String, CommandAlias> getCustom() {
        return null;
    }

    public LinkedHashMap<String, CommandAlias> getDefaultAlias() {
        return null;
    }

    public HashMap<String, CommandAlias> getAll() {
        return null;
    }

    public HashMap<String, CommandAlias> getFrom() {
        return null;
    }

    private List<String> convertCustom() {
        return null;
    }

    public void save() {
    }

    public List<String> updateCommands(CommandAlias alias, List<String> args, List<String> commands) {
        return null;
    }

    public void fullLoad() {
    }

    public void load() {
    }

    public void loadRegularAlias() {
    }

    public void saveNew() {
    }

    public void saveNew(String fileName) {
    }
}
