package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Ranks.CMIRank;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class rankinfo implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 110, info = "&eYour rank information", args = "(playerName) (rankName)", tab = { "rankname%%playername" }, explanation = {}, regVar = { 0, 1, 2, 3 }, consoleVar = { 1, 2,
        3 }, modules = "ranks", others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void showRankInfo(CMI plugin, CMIRank rank, CommandSender sender, CMIUser user) {
    }
}
