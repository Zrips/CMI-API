package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class setspawn implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 240, info = "&eSets spawn command teleport point", args = "(playerName) (true/false) (-g:[groupName]) (-rng:[range]) (-w:world,world_nether) (-loc:[world;x;y;z;yaw;pitch])", explanation = {
        "More info on command usage at https://www.zrips.net/cmi/commands/spawn/" }, regVar = { 0, 1, 2, 3, 4 }, consoleVar = { 1, 2, 3, 4 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
