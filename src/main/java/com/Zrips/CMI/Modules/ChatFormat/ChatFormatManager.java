package com.Zrips.CMI.Modules.ChatFormat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;
import com.Zrips.CMI.Modules.RawMessages.RawMessage;

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
	staffChats.remove(uuid);
	for (Entry<String, CMIChatRoom> one : new HashMap<String, CMIChatRoom>(chatRooms).entrySet()) {
	    one.getValue().cleanOldUsers();
	    if (one.getValue().getUsers().isEmpty())
		chatRooms.remove(one.getKey());
	}
    }

    public ChatFormatManager(CMI plugin) {
	this.plugin = plugin;
    }

    private String ChatGeneralFormat = "";
    private String ChatMessageGeneralFormat = "";
    private int ChatGeneralRange = 0;
    private int ChatShoutRange = 0;
    private Integer ChatShoutCost = 0;
    public static int ChatRoomLife = 3600;
    public static String ChatRoomShout = "!";
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

    public void sendMessage(String sender, String Target, String message) {

    }

    public void sendMessage(CommandSender sender, Player Target, String message) {
	sendMessage(sender, sender != null ? sender.getName() : null, Target, Target != null ? Target.getName() : null, message);
    }

    public void sendMessage(CommandSender sender, String senderName, Player Target, String targetname, String message) {

    }

    public String updateUrl(String message) {
	return null;
    }

    public boolean containsUrl(String message) {
	return false;
    }

//    public RawMessage convertHoverOver(RawMessage rm, String message) {
//	return convertHoverOver(rm, message, null);
//    }

    public RawMessage convertHoverOver(RawMessage rm, String message, Player player) {

	return null;

    }

    public boolean isBungeeMessages() {
	return BungeeMessages;
    }

    public int getChatGeneralRange() {
	return ChatGeneralRange;
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
	return true;
    }

    public boolean createChatRoom(CMIUser user, String name, boolean priv) {
	return true;
    }

    @Deprecated
    public void leaveChatRoom(CMIUser user) {
	user.leaveChatRoom();
    }

    public String getChatMutedReason() {
	return chatMutedReason;
    }

    public void setChatMutedReason(String chatMutedReason) {
    }

}
