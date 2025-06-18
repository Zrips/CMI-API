package com.Zrips.CMI.commands.list;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class scan implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 286, info = "&eScans for items in current world", args = "", multiTab = { "cancel", "results", "pause", "resume", "hand,stoneaxe oversize" }, explanation = {
        "More information at https://www.zrips.net/cmi/extra/scan/" }, regVar = { -66 }, consoleVar = { -66 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static Location lookAt(Player player, Location target) {
        return null;
    }

    enum actions {
        cancel, stop, results, search, pause, resume;

        public static actions getByName(String name) {
            return null;
        }
    }
}
