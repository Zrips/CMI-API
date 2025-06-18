package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class itemframe implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 47, info = "&eManage item frames", args = "(invisible/fixed/invulnerable/all)", tab = { "invisible%%fixed%%invulnerable%%all" }, explanation = {}, regVar = { 0, 1,
        2 }, consoleVar = { 666 }, paccess = false, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        Invisible, Fixed, Invulnerable, All;

        public static Action getByName(String name) {
            return null;
        }
    }
}
