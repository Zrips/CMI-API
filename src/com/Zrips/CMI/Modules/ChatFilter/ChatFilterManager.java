package com.Zrips.CMI.Modules.ChatFilter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIEventPriority;

import net.Zrips.CMILib.Chat.ChatFilterBlockType;

public class ChatFilterManager {
    private CMI plugin;
    private Pattern simpleReplacer;
    private LinkedHashMap<String, String> simpleReplacerMap;
    private Set<String> emojis;
    private HashMap<String, ChatFilterRule> rules;
    private ChatFilterRule whiteRules;
    private HashMap<UUID, MessageLog> spamMessages;
    private HashMap<UUID, MessageLog> spamCommands;
    private double similarityPercentage;
    private boolean preventDoublicates;
    private int douplicateInterval;
    private int douplicateChatMinAmount;
    private double similarityComamndPercentage;
    private boolean preventCommandDoublicates;
    private int douplicateCommandInterval;
    private int douplicateCommandMinAmount;
    private List<String> douplicateCommandWhiteList;
    private boolean capsFilter;
    private boolean lowerCase;
    private boolean cancelEvent;
    private int capsIgnoreUnder;
    private int capsPercentage;
    private List<String> capsCommands;
    private List<String> capsWhiteList;
    private CMIEventPriority capsCheckPriority;
    private CMIEventPriority filterCheckPriority;
    private CMIEventPriority simpleReplacerPriority;
    private CMIEventPriority commandSpamPriority;
    private CMIEventPriority chatSpamPriority;
    private CMIEventPriority signAdPriority;
    public final static String StringchatFilterFile = null;

    public void clearCache(UUID uuid) {
    }

    public ChatFilterManager(CMI plugin) {
    }

    public boolean checkCaps(Player player, String message) {
        return false;
    }

    public RuleResponse getCorrectMessage(Player player, String message) {
        return null;
    }

    @Nullable
    public String replaceEmoji(String message) {
        return null;
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
        return 0.0;
    }

    public static int editDistance(String s1, String s2) {
        return 0;
    }

    private static ChatFilterBlockType getBlockType(String type) {
        return null;
    }

    public void load() {
    }

    private static List<String> splitByUnicode(String input) {
        return null;
    }

    public void loadCommandFilters() {
    }

    public boolean isCancelCapEvent() {
        return false;
    }

    public boolean isCapToLowerCase() {
        return false;
    }

    public CMIEventPriority getCapsCheckPriority() {
        return null;
    }

    public CMIEventPriority getFilterCheckPriority() {
        return null;
    }

    public CMIEventPriority getSimpleReplacerPriority() {
        return null;
    }

    public CMIEventPriority getCommandSpamPriority() {
        return null;
    }

    public CMIEventPriority getChatSpamPriority() {
        return null;
    }

    public CMIEventPriority getSignAdvertisementPriority() {
        return null;
    }

    public HashMap<String, String> getEmojiReplacerMap() {
        return null;
    }

    public Set<String> getEmojis() {
        return null;
    }
}
