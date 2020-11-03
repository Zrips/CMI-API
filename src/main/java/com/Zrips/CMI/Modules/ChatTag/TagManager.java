package com.Zrips.CMI.Modules.ChatTag;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;

public class TagManager {

    private CMI plugin;

    public TagManager(CMI plugin) {
	this.plugin = plugin;
    }

    private boolean ChatTagEnabled;
    private boolean HardCoreMode;
    private boolean OnlyWhenAfk;
    private String ChatTagColor;
    private boolean ChatTagRemoveEta;
    List<String> commands = new ArrayList<String>();

    public void load() {
    }

    public String tag(Player player, String msg, String format) {
	
	return null;
    }

    public String getChatTagColor() {
	return CMIChatColor.translate(ChatTagColor);
    }

    public boolean isChatTagRemoveEta() {
	return ChatTagRemoveEta;
    }

    public boolean isChatTagEnabled() {
	return ChatTagEnabled;
    }

    public boolean isHardCoreMode() {
	return HardCoreMode;
    }

    public void setHardCoreMode(boolean hardCoreMode) {
	HardCoreMode = hardCoreMode;
    }
}
