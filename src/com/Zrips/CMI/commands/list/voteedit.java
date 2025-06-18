package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class voteedit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 180, info = "&eManage players votes", args = "(playerName) [add/set/take/clear] [amount] (-s)", multiTab = { "[playername] set,add,clear,take,info,trigger 1",
        "set,add,clear,take,info,trigger [playername] 1" }, explanation = { "Example:", "/voteedit Zrips", "/voteedit add 10", "/voteedit take 10", "/voteedit Zrips clear",
            "/voteedit Zrips add 10" }, regVar = { 0, 1, 2, 3, 4 }, consoleVar = { 1, 2, 3, 4 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        Set, Add, Clear, Take, Info, Trigger;
    }
}
