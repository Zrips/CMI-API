package com.Zrips.CMI.Modules.ChatFormat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;

import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.RawMessages.RawMessage;

public class ChatFormatManager {

    private CMI plugin;

    HashMap<Integer, String> groupFormats = new HashMap<Integer, String>();
    HashMap<Integer, String> groupMessageFormats = new HashMap<Integer, String>();

//    private HashMap<UUID, String> fixedChats = new HashMap<UUID, String>();
    private HashMap<String, CMIChatRoom> chatRooms = new HashMap<String, CMIChatRoom>();
    private Set<UUID> staffChats = new HashSet<UUID>();
//    public final static String colorReplacerPlaceholder = "\u0026";

    private Long chatMutedUntil = null;
    private String chatMutedReason = null;
    private boolean BungeeMessages = true;
    private boolean BungeePublicMessages = true;
    private boolean BungeeStaffMessages = true;

    public void clearCache(UUID uuid) {
    }

    public ChatFormatManager(CMI plugin) {
        this.plugin = plugin;
    }

    public enum chatReplySuggestion {
        pubmsg, privmsg, staffmsg, helpop, chatroom, discord;

        private String sug = "/msg [playerNickName] ";

        public String getSuggestion(CMIUser user) {
            if (user == null)
                return sug;
            return getSuggestion(user.getName(false), user.getDisplayName(false), user.getNickName());
        }

        public String getSuggestion(String playerName, String playerDisplayName, String playerNickName) {

            return "";
        }

        public void setSuggestion(String sug) {
            this.sug = sug;
        }
    }

    private String ChatGeneralFormat = "";
    private String ChatMessageGeneralFormat = "";
    private int ChatGeneralRange = 0;
    private int ChatShoutRange = 0;
    private Integer ChatShoutCost = 0;
    public static int ChatRoomLife = 3600;
    public static String ChatRoomShout = "!";

    public static TreeMap<Integer, Integer> chatDynamicRange = new TreeMap<Integer, Integer>();

    ChatFilterRule rule = new ChatFilterRule();
    ChatFilterRule itemRule = new ChatFilterRule();
    private boolean ChatTranslateLink = true;
    private boolean hoverItems = false;

    public void loadConfig(ConfigReader cfg) {

    }

    private String getChatGeneralFormat() {
        return ChatGeneralFormat;
    }

    public String getGroupFormat(Player player) {
        return "";
    }

    public String getGroupMessageFormat(Player player) {

        return "";
    }

    public Long getChatMutedUntil() {
        return chatMutedUntil;
    }

    public void setChatMutedUntil(Long chatMutedUntil) {
        this.chatMutedUntil = chatMutedUntil;
    }

    public void broadcastBungeeMessage(String sender, String message) {

    }

    public void sendMessage(String sender, String targetName, String message) {

    }

    public void sendMessage(CommandSender sender, Player Target, String message) {
        sendMessage(sender, sender != null ? sender.getName() : null, Target, Target != null ? Target.getName() : null, message, true);
    }

    public void sendMessage(CommandSender sender, Player Target, String message, boolean showToReceiver) {
        sendMessage(sender, sender != null ? sender.getName() : null, Target, Target != null ? Target.getName() : null, message, showToReceiver);
    }

    public void sendMessage(CommandSender sender, String senderName, Player Target, String targetname, String message) {
        sendMessage(sender, senderName, Target, targetname, message, true);
    }

    public void sendMessage(CommandSender sender, String senderName, Player Target, String targetname, String message, boolean showToReceiver) {

    }

    public String updateUrl(String message) {

        return "";
    }

    public boolean containsUrl(String message) {
        Matcher matcher = rule.getMatcher(message);
        boolean url = false;
        if (matcher != null)
            url = matcher.find();

        Matcher matcherI = itemRule.getMatcher(message);
        boolean item = false;
        if (matcherI != null)
            item = matcherI.find();

        return url || item;
    }

    public RawMessage convertHoverOver(RawMessage rm, String message, Player player) {
        return convertHoverOver(rm, message, player, false);
    }

    public RawMessage convertHoverOver(RawMessage rm, String message, Player player, boolean itemReplaced) {

        return null;
    }

    public StringBuilder convertHoverItem(StringBuilder str, String message, Player player, boolean itemReplaced) {

        return null;
    }

    public boolean isBungeeMessages() {
        return BungeeMessages;
    }

    public void setChatGeneralRange(int chatGeneralRange) {
        ChatGeneralRange = chatGeneralRange;
    }

    public int getChatShoutRange() {
        return ChatShoutRange;
    }

    public void setChatShoutRange(int chatShoutRange) {
        ChatShoutRange = chatShoutRange;
    }

    public Integer getChatShoutCost() {
        return ChatShoutCost;
    }

    public void setChatShoutCost(int chatShoutCost) {
        ChatShoutCost = chatShoutCost;
    }

    public Set<UUID> getStaffChats() {
        return staffChats;
    }

    public boolean isBungeePublicMessages() {
        return BungeePublicMessages;
    }

    public boolean isBungeeStaffMessages() {
        return BungeeStaffMessages;
    }

    public HashMap<String, CMIChatRoom> getChatRooms() {
        Iterator<Entry<String, CMIChatRoom>> iter = chatRooms.entrySet().iterator();
        while (iter.hasNext()) {
            Entry<String, CMIChatRoom> roome = iter.next();
            CMIChatRoom room = roome.getValue();
            if (room.isPersistent())
                continue;
            if (!room.getUsers().isEmpty())
                continue;
            if (room.getKeepAliveUntil() == 0L || room.getKeepAliveUntil() > System.currentTimeMillis())
                continue;
            iter.remove();
        }

        return chatRooms;
    }

    public CMIChatRoom getChatRoom(String name) {
        if (name == null)
            return null;
        return getChatRooms().get(name.toLowerCase());
    }

    public boolean joinChatRoom(CMIUser user, String name) {
        CMIChatRoom old = this.getChatRooms().get(name.toLowerCase());
        if (old == null) {
            return false;
        }
        old.addUser(user);
        old.removeWatcher(user);
        return true;
    }

    @Deprecated
    public boolean createChatRoom(CMIUser user, String name, boolean priv) {
        return createChatRoom(user, name, priv, false, false);
    }

    public boolean createChatRoom(CMIUser user, String name, boolean priv, boolean locked, boolean persistent) {

        return true;
    }

    public void load() {

    }

    public void save() {

    }

    @Deprecated
    public void leaveChatRoom(CMIUser user) {
        user.leaveChatRoom();
    }

    public String getChatMutedReason() {
        return chatMutedReason;
    }

    public void setChatMutedReason(String chatMutedReason) {
        if (chatMutedReason == null || chatMutedReason.isEmpty())
            chatMutedReason = null;
        else
            this.chatMutedReason = chatMutedReason;
    }

    public int getChatGeneralRange() {
        return getChatGeneralRange(null);
    }

    public int getChatGeneralRange(World world) {

        return 0;
    }

}
