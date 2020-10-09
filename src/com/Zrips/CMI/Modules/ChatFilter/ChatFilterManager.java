package com.Zrips.CMI.Modules.ChatFilter;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class ChatFilterManager {

    private CMI plugin;

    private HashMap<UUID, MessageLog> spamMessages = new HashMap<UUID, MessageLog>();
    private HashMap<UUID, MessageLog> spamCommands = new HashMap<UUID, MessageLog>();

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

    public void clearCache(UUID uuid) {
	spamMessages.remove(uuid);
	spamCommands.remove(uuid);
    }

    public ChatFilterManager(CMI plugin) {

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
	return 0;
    }

    public static int editDistance(String s1, String s2) {
	return 0;
    }

    private static ChatFilterBlockType getBlockType(String type) {
	return null;
    }

    public void load() {
    }

}
