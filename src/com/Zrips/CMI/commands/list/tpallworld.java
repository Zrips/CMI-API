package com.Zrips.CMI.commands.list;

import java.io.File;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.teleportAll;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class tpallworld implements Cmd {
    public teleportAll tpInfo;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 270, info = "&eTeleports ALL players from specific world", args = "[worldName] (worldName;x;y;z(;yaw;pitch)) (-a)", tab = { "worlds" }, regVar = { 1, 2, 3 }, explanation = {
        "-a variable will teleport everyone who are in no longer existing world to target location" }, consoleVar = { 2, 3 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static String getFromUser(File file) {
        return null;
    }
}
