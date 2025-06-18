package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class weather implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 235, info = "&eControls server weather", args = "(sun/rain/storm) (lock/duration) (worldName/all)", tab = { "sun%%rain%%storm", "10m%%3600%%lock",
        "worlds%%all" }, explanation = { "Extra time formats can have: s/m/h/d/w/M/Y", "Example:", "/sun", "/rain", "/storm", "/sun lock", "/sun 120", "/sun Lt_Craft", "/sun 1h", "/sun 10m" }, regVar = {
            0, 1, 2, 3 }, consoleVar = { 1, 2, 3 }, alias = true, customAlias = { "!+sun:sun", "!+rain:rain", "!+storm:storm" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        SUN, RAIN, STORM, LOCK, INFO;
    }
}
