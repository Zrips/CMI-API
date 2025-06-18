package com.Zrips.CMI.commands.list;

import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Villager;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class merchant implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    public static List<Villager.Profession> getVillagerProfessions() {
        return null;
    }

    @Override
    @CAnnotation(info = "&eOpen merchant trade window", args = "[type] (playerName) (level)", tab = { "merchants", "playername", "1%%2%%3%%4%%5" }, regVar = { 1, 2, 3 }, consoleVar = { 1, 2,
        3 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
