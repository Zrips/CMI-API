package com.Zrips.CMI.Modules.ChatFormat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;

import net.Zrips.CMILib.Container.CMIPlayer;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.RawMessages.RawMessage;

public class ChatFormatManager {

    private CMI plugin;

    HashMap<Integer, String> groupFormats = new HashMap<Integer, String>();
    HashMap<Integer, String> groupMessageFormats = new HashMap<Integer, String>();

//    private HashMap<UUID, String> fixedChats = new HashMap<UUID, String>();
    private HashMap<String, CMIChatRoom> chatRooms = new HashMap<String, CMIChatRoom>();
    private HashMap<UUID, CMIChatRoom> userChatRoom = new HashMap<UUID, CMIChatRoom>();

    private Set<UUID> staffChats = new HashSet<UUID>();
//    public final static String colorReplacerPlaceholder = "\u0026";

    private Long chatMutedUntil = null;
    private String chatMutedReason = null;
    private boolean BungeeMessages = true;
    private boolean BungeePublicMessages = true;
    private boolean BungeeStaffMessages = true;

    public void clearCache(UUID uuid) {
        staffChats.remove(uuid);
        for (Entry<String, CMIChatRoom> one : new HashMap<String, CMIChatRoom>(chatRooms).entrySet()) {
            one.getValue().cleanOldUsers();
            if (one.getValue().getUsers().isEmpty() && !one.getValue().isPersistent())
                chatRooms.remove(one.getKey());
        }
        userChatRoom.remove(uuid);
    }

    public ChatFormatManager(CMI plugin) {
        this.plugin = plugin;
    }

    public enum chatClickAction {
        pubmsg, privmsg, staffmsg, helpop, chatroom, discord;

        private String sug = "/msg [playerNickName] ";
        private String cmd = "";

        private boolean specialized = false;

        public void updateClickAction(RawMessage rm, CMIUser user) {

        }

        public void updateClickAction(RawMessage rm, String playerName, String playerDisplayName, String playerNickName) {

        }

        public String getSuggestion(CMIUser user) {
            if (user == null)
                return sug;
            return getSuggestion(user.getName(false), user.getDisplayName(false), user.getNickName());
        }

        public String getSuggestion(String playerName, String playerDisplayName, String playerNickName) {
            return process(playerName, playerDisplayName, playerNickName, sug);
        }

        public void setSuggestion(String sug) {
            this.sug = sug;
        }

        public String getCommand() {
            return cmd;
        }

        public void setCommand(String cmd) {
            this.cmd = cmd;
            specialized = CMI.getInstance().getSpecializedCommandManager().isSpecializedCommand(cmd);
        }

        public String getCommand(CMIUser user) {
            if (user == null)
                return sug;
            return getCommand(user.getName(false), user.getDisplayName(false), user.getNickName());
        }

        private static String process(String playerName, String playerDisplayName, String playerNickName, String value) {

            return null;
        }

        public String getCommand(String playerName, String playerDisplayName, String playerNickName) {
            if (cmd.isEmpty())
                return cmd;
            return process(playerName, playerDisplayName, playerNickName, cmd);
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

    public String getNickNamePrefix(CMIUser user) {
        return null;
    }

    public String getGroupFormat(Player player) {
        return null;
    }

    public String getGroupMessageFormat(Player player) {
        return null;
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
        CommandSender s = null;
        if (sender.equalsIgnoreCase("console"))
            s = Bukkit.getConsoleSender();
        else {
            CMIUser send = plugin.getPlayerManager().getUser(sender);
            if (send != null)
                s = send.getPlayer(false);
        }
        if (s == null)
            s = CMIPlayer.getByName(sender);

        CMIUser user = plugin.getPlayerManager().getUser(targetName);
        Player target = null;
        if (user != null)
            target = user.getPlayer(false);
        else
            target = CMIUser.getOnlinePlayer(targetName);

        sendMessage(s, sender, target, targetName, message, true);
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
        return null;
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

//    public RawMessage convertHoverOver(RawMessage rm, String message) {
//	return convertHoverOver(rm, message, null);
//    }

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

        return null;
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
        this.setChatRoom(user, old);
        return true;
    }

    @Deprecated
    public boolean createChatRoom(CMIUser user, String name, boolean priv) {
        return createChatRoom(user, name, priv, false, false);
    }

    public boolean createChatRoom(CMIUser user, String name, boolean priv, boolean locked, boolean persistent) {

        return true;
    }

    private String fileName = "ChatRooms.yml";

    public void load() {

    }

    public void save() {

    }

    public CMIChatRoom getChatRoom(UUID uuid) {
        return userChatRoom.get(uuid);
    }

    public boolean leaveChatRoom(UUID uuid) {
        if (getChatRoom(uuid) == null)
            return false;
        return getChatRoom(uuid).removeUser(CMIUser.getUser(uuid));
    }

    public void setChatRoom(CMIUser user, CMIChatRoom cmiChatRoom) {
        if (cmiChatRoom != null && !cmiChatRoom.getUsers().contains(user)) {
            cmiChatRoom.getUsers().add(user);
        }
        userChatRoom.put(user.getUniqueId(), cmiChatRoom);
    }

    public void leaveChatRoom(CMIUser user) {
        leaveChatRoom(user.getUniqueId());
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
