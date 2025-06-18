package com.Zrips.CMI.commands.list;

import java.util.HashMap;

import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.BlockStateType;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class blockinfo implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eCheck block information", regVar = { 0 }, consoleVar = { 666 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static HashMap<BlockStateType, String> getBlockStates(Block block) {
        return null;
    }
}
