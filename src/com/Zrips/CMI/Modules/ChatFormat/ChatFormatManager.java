package com.Zrips.CMI.Modules.ChatFormat;

import java.util.HashMap;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Modules.Permissions.PermissionInfo;

public class ChatFormatManager {

    private CMI plugin;

    HashMap<Integer, String> groupFormats = new HashMap<Integer, String>();
    
    private Long chatMutedUntil = null;

    public ChatFormatManager(CMI plugin) {
	this.plugin = plugin;
    }

    private String ChatGeneralFormat = "";

    public void loadConfig(ConfigReader cfg) {

    }

    private String getChatGeneralFormat() {
	return ChatGeneralFormat;
    }

    public String getGroupFormat(Player player) {
	return null;
    }

    public Long getChatMutedUntil() {
	return chatMutedUntil;
    }

    public void setChatMutedUntil(Long chatMutedUntil) {
	this.chatMutedUntil = chatMutedUntil;
    }
}
