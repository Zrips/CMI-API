package com.Zrips.CMI.Modules.ChatTag;

import org.bukkit.ChatColor;
import org.bukkit.Sound;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ConfigReader;

public class TagManager {

    private CMI plugin;

    public TagManager(CMI plugin) {
	this.plugin = plugin;
    }

    private boolean ChatTagEnabled;
    private String ChatTagColor;
    private boolean ChatTagRemoveEta;
    private Sound sound;
    private float volume;
    private float pitch;

    public void load() {

    }

    public String getChatTagColor() {
	return ChatColor.translateAlternateColorCodes('&', ChatTagColor);
    }

    public boolean isChatTagRemoveEta() {
	return ChatTagRemoveEta;
    }

    public boolean isChatTagEnabled() {
	return ChatTagEnabled;
    }

    public Sound getSound() {
	return sound;
    }

    public float getVolume() {
	return volume;
    }

    public float getPitch() {
	return pitch;
    }
}
