package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class select implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eManage selection area", args = "(pos1/pos2/shift/expand/contract/clear) (amount)", multiTab = { "pos1,pos2,clear", "shift,expand,contract 1" }, explanation = {}, consoleVar = {
        666 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Actions {
        pos1, pos2, shift, expand, contract, clear, info;

        Actions() {
        }

        public static Actions getByName(String name) {
            return null;
        }
    }
}
