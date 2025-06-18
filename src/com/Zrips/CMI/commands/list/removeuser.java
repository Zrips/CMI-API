package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class removeuser implements Cmd {
    private CMITask task;
    private Integer total;
    private Integer done;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 115, info = "&eRemoves user and its data", args = "[uuid/duplicates]", tab = { "duplicates" }, explanation = {}, regVar = { 666 }, consoleVar = { 1 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void tasker(CommandSender sender) {
    }

    private static boolean remove(CommandSender sender, CMIUser user, boolean inform) {
        return false;
    }
}
