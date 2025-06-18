package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class hologrampages implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eChange hologram page", args = "[holoName] (playerName) (next/prev/[pageNumber])", tab = { "holograms", "playername", "next%%prev%%" }, regVar = { 1, 2, 3 }, consoleVar = { 2,
        3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum pageAction {
        next, prev, exact;

        public static pageAction getByName(String name) {
            return null;
        }
    }
}
