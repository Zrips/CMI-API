package com.Zrips.CMI.commands.list;

import org.bukkit.block.BlockState;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class blockcycling implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eCycle block states", args = "", tab = { "(forward/backward)" }, regVar = { 0, 1 }, consoleVar = { 666 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    @Deprecated
    private void lowerToMinimal(BlockState s, short current) {
    }
}
