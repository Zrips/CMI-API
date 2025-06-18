package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class mobhead implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 250, info = "&eGet mob head", args = "[mobType] (entryNumber) (playerName) (-s)", tab = { "mobtype", "playername" }, explanation = {}, regVar = { 0, 1, 2, 3, 4,
        5 }, consoleVar = { 2, 3, 4 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void openGui(Player player, int page) {
    }
}
