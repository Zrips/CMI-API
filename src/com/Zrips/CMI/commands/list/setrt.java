package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class setrt implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 40, info = "&eSet random teleport bounds", args = "(worldName) (center:[x]:[z]) (min:[range]) (max:[range]) (square/circle) (enabled/disabled)", tab = { "worlds", "center:%%",
        "min:%%", "max:%%", "square%%circle", "enabled%%disabled" }, explanation = {}, regVar = { 0, 1, 2, 3, 4, 5, 6 }, consoleVar = { 0, 1, 2, 3, 4, 5, 6 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
