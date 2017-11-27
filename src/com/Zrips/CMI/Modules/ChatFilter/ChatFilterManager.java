package com.Zrips.CMI.Modules.ChatFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ConfigReader;

public class ChatFilterManager {

    private CMI plugin;

    private HashMap<String, ChatFilterRule> rules = new HashMap<String, ChatFilterRule>();
    private ChatFilterRule whiteRules = null;

    private HashMap<UUID, MessageLog> spamMessages = new HashMap<UUID, MessageLog>();
    private HashMap<UUID, MessageLog> spamCommands = new HashMap<UUID, MessageLog>();

    private double similarityPercentage = 0.8D;
    private boolean preventDoublicates = true;
    private int douplicateInterval = 5;
    private int douplicateChatMinAmount = 5;

    private double similarityComamndPercentage = 0.8D;
    private boolean preventCommandDoublicates = true;
    private int douplicateCommandInterval = 5;
    private int douplicateCommandMinAmount = 5;
    private List<String> douplicateCommandWhiteList = new ArrayList<String>();

    public enum ChatFilterBlockType {
	All(0), Others(1), None(2);

	private int id;

	ChatFilterBlockType(int id) {
	    this.id = id;
	}

	public int getId() {
	    return id;
	}
    }

    public ChatFilterManager(CMI plugin) {

    }

    public RuleResponce getCorrectMessage(Player player, String message) {

	return null;
    }

    public boolean isSpamedCommand(Player player, String message) {

	return false;
    }

    private boolean isWhiteListedCommand(String command) {

	return false;
    }

    public boolean isSpam(Player player, String message) {

	return false;
    }

    public static double similarity(String s1, String s2) {

	return 0D;
    }

    public static int editDistance(String s1, String s2) {

	return 0;
    }

    private static ChatFilterBlockType getBlockType(String type) {
	return ChatFilterBlockType.None;
    }

    public void load() {

    }

}
