package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class enchant implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eEnchant items", args = "(playerName) [enchant] [level] (-o) (-onlyvalid) (-keeponlyvalid) (-inform) (-s) (-i:[itemName(:data)]) (clear)", tab = {
        "playername%%limitedEnchant%%clear", "limitedEnchant%%maxenchantlevel", "maxenchantlevel" }, explanation = { "-o will take item from offhand" }, regVar = { 0, 1, 2, 3, 4, 5, 6, 7 }, consoleVar = {
            2, 3, 4, 5, 6, 7 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
