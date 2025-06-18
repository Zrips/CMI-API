package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class dsign implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eManage dynamic signs", args = "(new)", tab = { "%%new" }, explanation = { "Look at sign and perform /cmi dsign new" }, regVar = { -66 }, consoleVar = {
        666 }, modules = "dynamicsigns", others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        edit, moveup, movedown, createnew, addline, info, deleteLine, gui;

        public static Action getByName(String name) {
            return null;
        }
    }
}
