package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class saveditems implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 110, info = "&eSave or manage saved items", args = "[save/get/remove/list] (savedItemName) (-t:playerName) (-a:amount) (-c:category/all) (-s)", tab = {
        "save%%get%%remove%%list" }, explanation = {}, regVar = { 0, 1, 2, 3, 4, 5, 6 }, consoleVar = { 2, 3, 4, 5, 6 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void list(CMIUser user, String category, int page) {
    }

    private enum Action {
        save, get, remove, list, give;
    }
}
