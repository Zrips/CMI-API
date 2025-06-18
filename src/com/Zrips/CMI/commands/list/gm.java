package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class gm implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eSet players game mode", args = "(playerName) [gamemode]", tab = { "playername%%gamemode", "gamemode%%playername" }, regVar = { 1, 2, 3 }, consoleVar = { 2, 3 }, customAlias = {
        "gamemode", "+creative:gmc", "+survival:gms", "+spectator:gmsp", "+adventure:gma" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
