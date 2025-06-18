package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class scale implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 60, info = "&eSet entities scale", args = "[set/add/take/clear] (playerName) [amount] (-s)", tab = { "set%%add%%take%%clear", "playername" }, explanation = {}, regVar = { 0, 1,
        2, 3, 4 }, consoleVar = { 2, 3, 4 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        Set, Add, Take, Clear, Info;
    }
}
