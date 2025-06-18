package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class importfrom implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eImport data from other plugins", args = "[essentials/hd] [home/warp/nick/logoutlocation/money/mail]", tab = { "essentials%%hd",
        "home%%warp%%nick%%logoutlocation%%money%%mail%%", "home%%", "warp%%", "nick%%", "logoutlocation%%", "money%%", "mail%%" }, explanation = {}, regVar = { 1, 2, 3, 4, 5, 6, 7 }, consoleVar = { 1, 2,
            3, 4, 5, 6, 7 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
