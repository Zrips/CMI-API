package com.Zrips.CMI.commands.list;

import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class gamerule implements Cmd {
    final static int perPage = 0;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eManage gamerules", args = "(world) (gamerule) (value)", regVar = { 0, 1, 2, 3 }, consoleVar = { 3 }, others = false, multiTab = { "[worlds] [gamerule] [gamerulevalue]" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static int getPageCount() {
        return 0;
    }

    private static World getWorldFromPage(int page) {
        return null;
    }

    private static int getWorldNumber(World world) {
        return 0;
    }

    private static int getWorldPage(World world) {
        return 0;
    }

    private static String[] getGameRulesFromPage(int page) {
        return null;
    }

    private void openGui(Player player, int page) {
    }

    private enum type {
        b, i, s;
    }
}
