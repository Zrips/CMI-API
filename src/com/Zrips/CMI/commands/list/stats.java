package com.Zrips.CMI.commands.list;

import java.text.NumberFormat;
import java.util.HashMap;

import org.bukkit.Statistic;
import org.bukkit.Statistic.Type;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class stats implements Cmd {
    HashMap<String, Long> most;
    static NumberFormat formatter;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eCheck players stats", args = "(playerName)", tab = { "playername" }, regVar = { 0, 1 }, consoleVar = { 1 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static String convertDistance(long distance) {
        return null;
    }

    private String getList() {
        return null;
    }

    private String getList(int lines) {
        return null;
    }

    private int getTotal(Statistic st, Player player) {
        return 0;
    }

    private int getTotal(Statistic st, Player player, Type type) {
        return 0;
    }
}
