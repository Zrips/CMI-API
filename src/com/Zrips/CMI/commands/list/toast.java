package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class toast implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eSends toast message to player", args = "[playerName/all] (-t:[advType]) (-icon:[material]) [message]", tab = { "playername", "-t:goal%%-t:challenge%%-t:task",
        "%%-icon:stone" }, regVar = { -100, -1 }, consoleVar = { -100, -1 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
