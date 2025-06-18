package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class search implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eSearch from all players of specific items or stats", explanation = { "More information at https://www.zrips.net/cmi/extra/search/" }, regVar = { -100 }, consoleVar = {
        -100 }, alias = true, multiTab = { "cancel", "results", "survival,creative,adventure,spectator,fly,maxhp:21", "hand,stoneaxe oversize" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    enum actions {
        cancel, results, search;

        public static actions getByName(String name) {
            return null;
        }
    }
}
