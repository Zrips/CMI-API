package com.Zrips.CMI.Modules.TagName;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class TagNameManager {

    private CMI plugin;

    public TagNameManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {

    }

    public enum TeamAction {
        CREATE, UPDATE, DESTROY;
    }

    public static void changeNameTag(Player toSendTo, Player player, String name, String prefix, String suffix, TeamAction teamAction) {

    }

}
