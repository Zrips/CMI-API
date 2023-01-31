package com.Zrips.CMI.Modules.Ranks;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class AureliumManager {

    static boolean enabled = false;

    public static boolean setup() {
        if (!Bukkit.getServer().getPluginManager().isPluginEnabled("AureliumSkills"))
            return false;
        enabled = true;
        CMI.getInstance().consoleMessage("AureliumSkills found.");
        return true;
    }

    public static boolean isSkillCorrect(String name) {
        return false;
    }

    public static String getRealSkillName(CommandSender sender, String name) {
        return null;
    }

    public static int getSkillLevel(Player player, String skill) {
        return 0;
    }

}
