package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class silentchest implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 10, info = "&eToggles silent chest", args = "", tab = {}, explanation = { "&ePlayers arround you wont see chest opening animation when you opening chest",
        "&eProtocollib required for this feature to work." }, regVar = { 0 }, consoleVar = { 666 }, modules = { "silentChest" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
