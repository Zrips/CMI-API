package com.Zrips.CMI.commands.list;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Jail.CMIJail;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class jailedit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eEdit jails", regVar = { 0, 1, 2, 3 }, consoleVar = { 666 }, modules = "jail", others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private Boolean redefineJail(CommandSender sender, CMIJail jail) {
        return null;
    }

    private Boolean removeJail(CommandSender sender, CMIJail jail) {
        return null;
    }

    private Boolean removeCell(CommandSender sender, CMIJail jail, Integer cellId) {
        return null;
    }

    private Boolean addCell(CommandSender sender, CMIJail jail, Location loc) {
        return null;
    }

    private Boolean cellList(CommandSender sender, CMIJail jail) {
        return null;
    }

    private Boolean jailList(CommandSender sender) {
        return null;
    }

    private Boolean addJail(CommandSender sender, String jailName) {
        return null;
    }

    private enum Action {
        addjail, delete, jaillist, celllist, addCell, removeCell, redefineJail, outsideLoc;

        public static Action getByName(String name) {
            return null;
        }
    }
}
