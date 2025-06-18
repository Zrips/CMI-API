package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class note implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 180, info = "&eManage players notes", args = "(playerName) [add/remove/clear/list] (id/note)", tab = { "playername", "add%%remove%%clear%%list" }, regVar = {
        -100 }, consoleVar = { -100 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        List, Add, Clear, Remove;
    }
}
