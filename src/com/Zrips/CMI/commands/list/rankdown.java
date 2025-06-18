package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class rankdown implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 110, info = "&eDecrease your rank", args = "(playerName) (rankName) (confirm) (-cmd) (-cost)", tab = { "rankname" }, explanation = {
        "-cmd will perform command defined for previous rank rankup", "-cost will charge player with money, exp or items if defined for previous rank rankup" }, regVar = { 0, 1, 2, 3, 4,
            5 }, consoleVar = { 2, 3, 4, 5 }, alias = true, modules = "ranks", others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
