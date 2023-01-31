package com.Zrips.CMI.Modules.CmdCooldown;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.SpecializedCommands.SpecCMDCooldown;

public class CooldownManager {
    private HashMap<String, CMICmdCooldown> cooldowns = new HashMap<String, CMICmdCooldown>();

    CMI plugin;

    public CooldownManager(CMI plugin) {
        this.plugin = plugin;
    }

    public int getCooldownCount() {
        return cooldowns.size();
    }

    @Deprecated
    public void addCD(String cmd, Long seconds) {
        addCooldown(new CMICmdCooldown(cmd, seconds.intValue()));
    }

    public void addCooldown(String cmd, int seconds) {
        addCooldown(new CMICmdCooldown(cmd, seconds));
    }

    public void addCooldown(CMICmdCooldown cooldown) {
        cooldowns.put(cooldown.getCommand().toLowerCase(), cooldown);
    }

    private CMICmdCooldown getCooldown(String cmd) {
        return null;
    }

    private static Long getUsedTime(String cmd, CmdCooldown userCooldowns) {
        return getUsedTime(cmd, userCooldowns, false);
    }

    private static Long getUsedTime(String cmd, CmdCooldown userCooldowns, boolean exact) {

        return null;
    }

    private static String getCommandMatch(String cmd, CmdCooldown userCooldowns) {
        return getCommandMatch(cmd, userCooldowns, false);
    }

    private static String getCommandMatch(String cmd, CmdCooldown userCooldowns, boolean exact) {
        return null;
    }

    public boolean removeCooldown(CommandSender sender, String cmd) {

        return true;
    }

    public boolean isCmdInCooldown(CommandSender sender, String cmd) {

        return false;
    }

    public boolean canUseCmd(CommandSender sender, String cmd) {

        return true;
    }

    HashMap<UUID, CmdCooldown> playerCustomCooldowns = new HashMap<UUID, CmdCooldown>();

    CmdCooldown globalCooldowns = new CmdCooldown();

    public boolean canUseSpecCommandGlobal(CommandSender sender, SpecCMDCooldown cooldown, boolean inform) {

        return true;
    }

    public boolean canUseSpecCommand(Player player, SpecCMDCooldown cooldown, boolean inform) {

        return true;
    }

    public HashMap<String, CMICmdCooldown> getCooldowns() {
        return cooldowns;
    }

}
