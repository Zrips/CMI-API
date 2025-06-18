package com.Zrips.CMI.commands.list;

import org.bukkit.block.BlockFace;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class se implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 65, info = "&eChanges sign text line.", args = "(SignLine) [Text]", tab = { "1%%2%%3%%4%%signLine", "signLine" }, explanation = { "Use \\n for additional line" }, regVar = {
        -100 }, consoleVar = { 666 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public BlockFace getClosestFace(float direction) {
        return null;
    }
}
