package com.Zrips.CMI.Modules.CmdCooldown;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.SpecializedCommands.SpecCMDCooldown;

public class CooldownManager {
    private HashMap<String, CMICmdCooldown> cooldowns;
    CMI plugin;
    HashMap<UUID, CmdCooldown> playerCustomCooldowns;
    CmdCooldown globalCooldowns;

    public CooldownManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public int getCooldownCount() {
        return 0;
    }

    @Deprecated
    public void addCD(String cmd, Long seconds) {
    }

    public void addCooldown(String cmd, int seconds) {
    }

    public void addCooldown(CMICmdCooldown cooldown) {
    }

    private CMICmdCooldown getCooldown(String cmd) {
        return null;
    }

    private static Long getUsedTime(String cmd, CmdCooldown userCooldowns) {
        return null;
    }

    private static Long getUsedTime(String cmd, CmdCooldown userCooldowns, boolean exact) {
        return null;
    }

    private static String getCommandMatch(String cmd, CmdCooldown userCooldowns) {
        return null;
    }

    private static String getCommandMatch(String cmd, CmdCooldown userCooldowns, boolean exact) {
        return null;
    }

    public boolean removeCooldown(CommandSender sender, String cmd) {
        return false;
    }

    public boolean isCmdInCooldown(CommandSender sender, String cmd) {
        return false;
    }

    public boolean canUseCmd(CommandSender sender, String cmd) {
        return false;
    }

    public boolean canUseSpecCommandGlobal(CommandSender sender, SpecCMDCooldown cooldown, boolean inform) {
        return false;
    }

    public boolean canUseSpecCommand(Player player, SpecCMDCooldown cooldown, boolean inform) {
        return false;
    }

    public HashMap<String, CMICmdCooldown> getCooldowns() {
        return null;
    }
}
