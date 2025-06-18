package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class sound implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&ePlay sound at target location", args = "[sound] (-p:[pitch]) (-v:[volume]) (playerName/-all/-l:playerName) (world;x;y;z) (-r:[radius]) (-s)", multiTab = {
        "[sound] -p:,![currentLocation],[playername],-all,-r:,-l: -v:,![currentLocation],![playername],-all ![playername],![currentLocation],-all" }, explanation = {}, regVar = { 1, 2, 3, 4, 5, 6, 7, 8, 9,
            10 }, consoleVar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
