package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class sethome implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 115, info = "&eSets home location", args = "(homeName) (playerName) (-p) (-l:worldName;x;y;z) (block/Material) (slotNumber) (-overwrite)", tab = { "", "-p" }, explanation = {
        "cmi.command.sethome.unlimited", "-l will define custom location for new home location, this requires cmi.command.sethome.customloc permission node" }, regVar = { 0, 1, 2, 3, 4, 5,
            6 }, consoleVar = { 2, 3, 4, 5, 6 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
