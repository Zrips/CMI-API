package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class armorstand implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 47, info = "&eOpen armor stand editor", args = "(last/near)", tab = { "last%%near%%list" }, explanation = {}, regVar = { 0, 1, 2 }, consoleVar = {
        666 }, modules = "armorstand", paccess = false, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private Boolean processLast(Player player) {
        return null;
    }

    private Boolean processList(Player player, int page) {
        return null;
    }

    private Boolean processNear(String[] args, Player player) {
        return null;
    }
}
