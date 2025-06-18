package com.Zrips.CMI.commands.list;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class rt implements Cmd {
    private static ConcurrentHashMap<UUID, Map<String, Long>> map;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 40, info = "&eTeleports to random location", args = "(playerName) (worldName) (-s)", tab = { "playername", "worlds", "-s" }, explanation = {}, regVar = { 0, 1, 2, 3,
        4 }, consoleVar = { 1, 2, 3, 5 }, others = true, customAlias = { "rtp" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static Long getUsedAt(UUID uuid, String world) {
        return null;
    }

    public static void addUsedAt(UUID uuid, String world, long time) {
    }
}
