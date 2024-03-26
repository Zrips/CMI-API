package com.Zrips.CMI.Modules.CmdWarmUp;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

public class WarmUpManager {
    public HashMap<String, CmdWarmUp> warmups = new HashMap<String, CmdWarmUp>();
    private HashMap<UUID, WarmUpInfo> counter = new HashMap<UUID, WarmUpInfo>();

    CMI plugin;

    public WarmUpManager(CMI plugin) {
        this.plugin = plugin;
    }

    public boolean isOnWarmUp(Player player) {
        return isOnWarmUp(player.getUniqueId());
    }

    public boolean isOnWarmUp(UUID uuid) {
        return counter.containsKey(uuid);
    }

    public void addWU(String cmd, CmdWarmUp warmup) {
        warmups.put(cmd.toLowerCase(), warmup);
    }

    private CmdWarmUp getTime(String cmd) {

        return null;
    }

    public boolean canMove(Player player) {
        return canMove(player.getUniqueId());
    }

    public boolean canMove(UUID uuid) {
        WarmUpInfo info = counter.get(uuid);
        if (info == null)
            return true;

        String cmd = info.getCmd();
        if (cmd != null) {
            cmd = cmd.toLowerCase();
            for (Entry<String, CmdWarmUp> one : warmups.entrySet()) {
                if (cmd.startsWith(one.getKey()))
                    return one.getValue().isMove();
            }
        }
        if (info.getLoc() != null)
            return info.isMove();
        return true;
    }

    public boolean canMoveByCmd(String cmd) {
        cmd = cmd.toLowerCase();
        for (Entry<String, CmdWarmUp> one : warmups.entrySet()) {
            if (cmd.startsWith(one.getKey()))
                return one.getValue().isMove();
        }
        return true;
    }

    @Deprecated
    public boolean startTeleportUsage(Player player, Location loc) {
        return startTeleportUsage(TpAction.tp, player, loc);
    }

    private final static String bossBarName = "CMICmdWarmupBar";

    public boolean startTeleportUsage(TpAction action, Player player, Location loc) {

        return true;
    }

    public boolean isWarmupCommand(CommandSender sender, String cmd) {

        return true;
    }

    public boolean startCmdUsage(CommandSender sender, String cmd) {

        return true;
    }

    private void performCmd(Player player, WarmUpInfo info) {

    }

    private void count(UUID uuid) {

    }

    public boolean cancel(UUID uuid) {
        return cancel(uuid, false);
    }

    public boolean cancel(UUID uuid, boolean soft) {

        return true;
    }

    boolean InformOnNoMove;
    boolean counterBarInfo;
    boolean showBossBarInfo = false;

    public void loadConfig() {

    }
}
