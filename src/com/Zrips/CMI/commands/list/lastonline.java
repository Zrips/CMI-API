package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class lastonline implements Cmd {
    static SortedMap<Long, UUID> byTime;
    static HashMap<UUID, Long> byUUID;
    CMITask cleanTask;

    @Override
    public void getExtra(ConfigReader c) {
    }

    private static int getSizeByTime(int seconds) {
        return 0;
    }

    private static NavigableMap<Long, UUID> getEntries(int startPlace, int numberOfEntries) {
        return null;
    }

    public static void addLogOff(CMIUser user) {
    }

    @Override
    @CAnnotation(info = "&eShow played players from last x minutes", args = "(-p:[page])", regVar = { 0, 1 }, consoleVar = { 0, 1 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void triggerCleanerTask() {
    }

    private static CompletableFuture<Void> recalculate() {
        return null;
    }

    private void show(CommandSender sender, int page, int perPage) {
    }
}
