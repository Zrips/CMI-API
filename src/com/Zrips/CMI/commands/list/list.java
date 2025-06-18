package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class list implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eShows online player list", explanation = { "Perm: ", "cmi.command.list.admin", "cmi.command.list.staff", "cmi.command.list.hidden",
        "cmi.command.list.group.[number]" }, regVar = { 0 }, consoleVar = { 0 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private String nameFormating(Player player) {
        return null;
    }
}
