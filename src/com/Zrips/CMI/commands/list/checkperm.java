package com.Zrips.CMI.commands.list;

import java.util.HashMap;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.PInfo;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class checkperm implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 240, info = "&eCheck possible permission nodes", args = "(key word)", multiTab = { "[playerName]" }, regVar = { 0, 1, 2 }, consoleVar = { 0, 1, 2 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private Boolean show(CommandSender sender, int page, HashMap<String, PInfo> lss, String keyWord) {
        return null;
    }
}
