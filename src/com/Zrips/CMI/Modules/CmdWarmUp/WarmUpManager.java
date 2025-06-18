package com.Zrips.CMI.Modules.CmdWarmUp;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

import net.Zrips.CMILib.BossBar.BossBarInfo;

public class WarmUpManager {
    public HashMap<String, CmdWarmUp> warmups;
    private HashMap<UUID, WarmUpInfo> counter;
    CMI plugin;
    private final static String bossBarName = null;
    boolean InformOnNoMove;
    boolean counterBarInfo;
    boolean showBossBarInfo;
    BossBarInfo bossBarInfo;

    public WarmUpManager(CMI plugin) {
    }

    public boolean isOnWarmUp(Player player) {
        return false;
    }

    public boolean isOnWarmUp(UUID uuid) {
        return false;
    }

    public void addWU(String cmd, CmdWarmUp warmup) {
    }

    private CmdWarmUp getTime(String cmd) {
        return null;
    }

    public boolean canMove(Player player) {
        return false;
    }

    public boolean canMove(UUID uuid) {
        return false;
    }

    public boolean canMoveByCmd(String cmd) {
        return false;
    }

    @Deprecated
    public boolean startTeleportUsage(Player player, Location loc) {
        return false;
    }

    public boolean startTeleportUsage(TpAction action, Player player, Location loc) {
        return false;
    }

    public boolean isWarmupCommand(CommandSender sender, String cmd) {
        return false;
    }

    public boolean startCmdUsage(CommandSender sender, String cmd) {
        return false;
    }

    private void performCmd(Player player, WarmUpInfo info) {
    }

    private void count(UUID uuid) {
    }

    public boolean cancel(UUID uuid) {
        return false;
    }

    public boolean cancel(UUID uuid, boolean soft) {
        return false;
    }

    public void loadConfig() {
    }
}
