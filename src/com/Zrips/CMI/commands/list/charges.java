package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class charges implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eShows left spawner charges", args = "[playerName] [add/set/take/clear/reset] (-f)", tab = { "playername", "add%%set%%take%%clear%%reset" }, regVar = { 0, 1, 2, 3,
        4 }, consoleVar = { 1, 2, 3, 4 }, alias = true, modules = { "spawnercharge" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        Set, Add, Clear, Take, Info, Reset;
    }
}
