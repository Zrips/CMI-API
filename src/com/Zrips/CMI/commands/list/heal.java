package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class heal implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eHeal player", args = "[playerName/all] (healamount/healpercent) (-nofeed) (-ignoreffects) (-dontextinguish)", tab = { "playername%%all",
        "!-nofeed%%!-ignoreffects%%!-dontextinguish", "!-nofeed%%!-ignoreffects%%!-dontextinguish", "!-nofeed%%!-ignoreffects%%!-dontextinguish" }, regVar = { 0, 1, 2, 3, 4, 5, 6 }, consoleVar = { 1, 2, 3,
            4, 5, 6 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
