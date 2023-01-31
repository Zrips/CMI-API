package com.Zrips.CMI.Modules.ChatTag;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Colors.CMIChatColor;

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

    @Deprecated
    public String tag(Player player, String msg, String format) {
        return tag(player, msg, format, true);
    }

    public String tag(Player player, String msg, String format, boolean performCmds) {
        return "";
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
