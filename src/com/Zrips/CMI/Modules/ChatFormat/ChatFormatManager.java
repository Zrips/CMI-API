package com.Zrips.CMI.Modules.ChatFormat;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

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
    HashMap<Integer, String> groupFormats;
    HashMap<Integer, String> groupMessageFormats;
    private HashMap<String, CMIChatRoom> chatRooms;
    private HashMap<UUID, CMIChatRoom> userChatRoom;
    private Set<UUID> staffChats;
    private Long chatMutedUntil;
    private String chatMutedReason;
    private boolean BungeeMessages;
    private boolean BungeePublicMessages;
    private boolean BungeePublicMessagesSingleIgnore;
    private boolean BungeeStaffMessages;
    private String ChatGeneralFormat;
    private String ChatMessageGeneralFormat;
    private int ChatGeneralRange;
    private int ChatShoutRange;
    private String ChatShoutColor;
    private Integer ChatShoutCost;
    public static int ChatRoomLife;
    public static String ChatRoomShout;
    public static TreeMap<Integer, Integer> chatDynamicRange;
    ChatFilterRule rule;
    ChatFilterRule itemRule;
    private boolean ChatTranslateLink;
    private boolean hoverItems;
    private String fileName;

    public void clearCache(UUID uuid) {
    }

    public ChatFormatManager(CMI plugin) {
    }

    public void loadConfig(ConfigReader cfg) {
    }

    private String getChatGeneralFormat() {
        return null;
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
        return null;
    }

    public void setChatMutedUntil(Long chatMutedUntil) {
    }

    public void broadcastBungeeMessage(String sender, String message) {
    }

    public void sendMessage(String sender, String targetName, String message) {
    }

    public void sendMessage(CommandSender sender, Player Target, String message) {
    }

    public void sendMessage(CommandSender sender, Player Target, String message, boolean showToReceiver) {
    }

    public void sendMessage(CommandSender sender, String senderName, Player Target, String targetname, String message) {
    }

    public void sendMessage(CommandSender sender, String senderName, Player target, String targetname, String message, boolean showToReceiver) {
    }

    public String updateUrl(String message) {
        return null;
    }

    public boolean containsUrl(String message) {
        return false;
    }

    public RawMessage convertHoverOver(RawMessage rm, String message, Player player) {
        return null;
    }

    public RawMessage convertHoverOver(RawMessage rm, String message, Player player, boolean itemReplaced) {
        return null;
    }

    public StringBuilder convertHoverItem(StringBuilder str, String message, Player player, boolean itemReplaced) {
        return null;
    }

    public boolean isBungeeMessages() {
        return false;
    }

    public void setChatGeneralRange(int chatGeneralRange) {
    }

    public int getChatShoutRange() {
        return 0;
    }

    public void setChatShoutRange(int chatShoutRange) {
    }

    public Integer getChatShoutCost() {
        return null;
    }

    public void setChatShoutCost(int chatShoutCost) {
    }

    public Set<UUID> getStaffChats() {
        return null;
    }

    public boolean isBungeePublicMessages() {
        return false;
    }

    public boolean isBungeePublicMessagesSingleIgnore() {
        return false;
    }

    public boolean isBungeeStaffMessages() {
        return false;
    }

    public HashMap<String, CMIChatRoom> getChatRooms() {
        return null;
    }

    public CMIChatRoom getChatRoom(String name) {
        return null;
    }

    public boolean joinChatRoom(CMIUser user, String name) {
        return false;
    }

    @Deprecated
    public boolean createChatRoom(CMIUser user, String name, boolean priv) {
        return false;
    }

    public boolean createChatRoom(CMIUser user, String name, boolean priv, boolean locked, boolean persistent) {
        return false;
    }

    public void load() {
    }

    public void save() {
    }

    public CMIChatRoom getChatRoom(UUID uuid) {
        return null;
    }

    public boolean leaveChatRoom(UUID uuid) {
        return false;
    }

    public void setChatRoom(CMIUser user, CMIChatRoom cmiChatRoom) {
    }

    public void leaveChatRoom(CMIUser user) {
    }

    public String getChatMutedReason() {
        return null;
    }

    public void setChatMutedReason(String chatMutedReason) {
    }

    public int getChatGeneralRange() {
        return 0;
    }

    public int getChatGeneralRange(World world) {
        return 0;
    }

    public String getChatShoutColor() {
        return null;
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
            return null;
        }

        public String getSuggestion(String playerName, String playerDisplayName, String playerNickName) {
            return null;
        }

        public void setSuggestion(String sug) {
        }

        public String getCommand() {
            return null;
        }

        public void setCommand(String cmd) {
        }

        public String getCommand(CMIUser user) {
            return null;
        }

        private static String process(String playerName, String playerDisplayName, String playerNickName, String value) {
            return null;
        }

        public String getCommand(String playerName, String playerDisplayName, String playerNickName) {
            return null;
        }
    }
}
