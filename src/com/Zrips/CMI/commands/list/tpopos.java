package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class tpopos implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 45, info = "&eTeleports to location by force", args = "(-p:playerName) [x] [y] [z] (world) (pitch) (yaw) (-rng:[range])", tab = { "currentX", "currentY", "currentZ", "worlds",
        "currentPitch", "currentYaw", "%%-rng:" }, explanation = {}, regVar = { -100 }, consoleVar = { -1, -100 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
