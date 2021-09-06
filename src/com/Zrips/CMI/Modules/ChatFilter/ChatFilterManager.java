package com.Zrips.CMI.Modules.ChatFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Chat.ChatFilterBlockType;

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

    private Boolean capsFilter;
    private int capsIgnoreUnder;
    private int capsPercentage;

    private List<String> capsCommands;

    private List<String> capsWhiteList;

    public final static String StringchatFilterFile = "chatfilter.yml";

    public void clearCache(UUID uuid) {
	spamMessages.remove(uuid);
	spamCommands.remove(uuid);
    }

    public ChatFilterManager(CMI plugin) {
	
    }

    public boolean checkCaps(Player player, String message) {

	return true;
    }

    public RuleResponce getCorrectMessage(Player player, String message) {
	return getCorrectMessage(player, message, false);
    }

    public RuleResponce getCorrectMessage(Player player, String message, boolean privateMessage) {
	
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
	    return 1.0;

    }

    public static int editDistance(String s1, String s2) {
	
	return 0;
    }

    private static ChatFilterBlockType getBlockType(String type) {
	return ChatFilterBlockType.None;
    }

    public void load() {

    }

    public void loadCommandFilters() {

    }
}
