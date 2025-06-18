package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemFlag;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class hideflags implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 67, info = "&eHides item flags", args = "(playerName) [flagName/clear] (flagName)", tab = { "playerName%%itemFlag%%clear", "itemFlag%%clear" }, explanation = {}, regVar = { 1,
        2, 3 }, consoleVar = { 2, 3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static byte getBitModifier(ItemFlag hideFlag) {
        return 0;
    }

    private static ItemFlag getitemFlag(String name) {
        return null;
    }
}
