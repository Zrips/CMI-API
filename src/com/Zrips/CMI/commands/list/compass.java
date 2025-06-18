package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class compass implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eSet players compass point to your location", args = "(targetName) (sourceName) (x) (z) (worldname) (reset) (-s)", tab = { "playername", "playername" }, explanation = {
        "Example: /cmi compass Zhax", "/cmi compass Zhax Zrips", "/cmi compass Zhax LT_Craft 0 0 -s", "/cmi compass reset Zhax" }, regVar = { 1, 2, 3, 4, 5, 6 }, consoleVar = { 2, 3, 4, 5,
            6 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
