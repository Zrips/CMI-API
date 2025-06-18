package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class warp implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 115, info = "&eTeleports to warp location", args = "(warpName) (playerName) (-s) (-g:[groupName]) (-p:[pageNumber])", tab = { "warps",
        "playername" }, explanation = {}, regVar = { 0, 1, 2, 3, 4 }, consoleVar = { 1, 2, 3, 4 }, others = true, customAlias = { "warps" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
