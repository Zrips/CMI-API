package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class glow implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eSet players glow mode", args = "(playerName) [true/false/color/gui]", tab = { "colors%%playername", "colors%%true%%false%%gui" }, explanation = { "Example: /glow Zrips red",
        "Permissions: cmi.command.glow.color.[color] - allows to set particular glow color" }, regVar = { 0, 1, 2, 3, 4 }, consoleVar = { 1, 2, 3, 4 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void openGui(CommandSender sender, Player target) {
    }
}
