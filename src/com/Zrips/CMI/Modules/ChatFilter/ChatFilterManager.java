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

    private boolean capsFilter = true;
    private int capsIgnoreUnder;
    private int capsPercentage;

    private List<String> capsCommands;

    private List<String> capsWhiteList;

    public final static String StringchatFilterFile = "ChatFilter.yml";

    public void clearCache(UUID uuid) {
        spamMessages.remove(uuid);
        spamCommands.remove(uuid);
    }

    public ChatFilterManager(CMI plugin) {

    }

    public boolean checkCaps(Player player, String message) {

        return true;
    }

    public RuleResponse getCorrectMessage(Player player, String message) {
        return getCorrectMessage(player, message, false);
    }

    public RuleResponse getCorrectMessage(Player player, String message, boolean privateMessage) {

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
        String longer = s1, shorter = s2;
        if (s1.length() < s2.length()) {
            longer = s2;
            shorter = s1;
        }
        int longerLength = longer.length();
        if (longerLength == 0) {
            return 1.0;
        }
        return (longerLength - editDistance(longer, shorter)) / (double) longerLength;
    }

    public static int editDistance(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] costs = new int[s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            int lastValue = i;
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0)
                    costs[j] = j;
                else {
                    if (j > 0) {
                        int newValue = costs[j - 1];
                        if (s1.charAt(i - 1) != s2.charAt(j - 1))
                            newValue = Math.min(Math.min(newValue, lastValue),
                                costs[j]) + 1;
                        costs[j - 1] = lastValue;
                        lastValue = newValue;
                    }
                }
            }
            if (i > 0)
                costs[s2.length()] = lastValue;
        }
        return costs[s2.length()];
    }

    private static ChatFilterBlockType getBlockType(String type) {
        for (ChatFilterBlockType one : ChatFilterBlockType.values()) {
            if (one.name().equalsIgnoreCase(type))
                return one;
        }
        return ChatFilterBlockType.None;
    }

    public void load() {

    }

    public void loadCommandFilters() {

    }
}
