package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class donate implements Cmd {
    public static HashMap<UUID, Long> donateLock;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eDonate item you are holding", args = "[playerName] (amount)", tab = { "playername" }, regVar = { 0, 1, 2 }, consoleVar = { 666 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
