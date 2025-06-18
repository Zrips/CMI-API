package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class rankset implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 110, info = "&eSet a players rank", args = "(playerName) [rankName] (-cmd) (-cost)", tab = { "playername", "rankname", "-cmd%%", "-cost%%" }, explanation = {
        "-cmd will perform command defined for that rank rankup", "-cost will charge player with money, exp or items if defined for that rank rankup",
        "player will get rank even if he doesnt have enough money, exp or required items" }, regVar = { 1, 2, 3, 4 }, consoleVar = { 2, 3, 4 }, modules = "ranks", others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
