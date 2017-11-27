package com.Zrips.CMI.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;
import com.Zrips.CMI.Modules.Placeholders.PlaceholderAPIHook.CMIPlaceHolders;

import me.clip.placeholderapi.PlaceholderAPI;

public class Placeholder {

    private CMI plugin;
    ChatFilterRule date = new ChatFilterRule();

    public Placeholder(CMI plugin) {
	this.plugin = plugin;
	date.setPattern(Arrays.asList("(%server_time_)(\\S+)(%)"));
    }

    public List<String> updatePlaceHolders(Player player, List<String> messages) {
	return null;
    }

    public String updatePlaceHolders(Player player, String message) {
	return null;
    }

    private static boolean contains(List<String> messages) {
	return false;
    }

    private String translateOwnPlaceHolder(Player player, String message) {

	return null;
    }

    public String getValue(Player player, CMIPlaceHolders placeHolder) {

	return null;
    }

    private String variable(Boolean state) {
	return null;
    }
}
