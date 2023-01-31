package com.Zrips.CMI.Modules.CmdCost;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.CMILC;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.commands.CommandsHandler;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Locale.LC;
import net.Zrips.CMILib.RawMessages.RawMessage;

public class CMICommandCostManager {
    private HashMap<String, CMICommandCost> costs = new HashMap<String, CMICommandCost>();

    CMI plugin;

    public CMICommandCostManager(CMI plugin) {
        this.plugin = plugin;
    }

    public int getCommandCostCount() {
        return costs.size();
    }

    public void addCost(String cmd, double cost) {
        costs.put(cmd.toLowerCase(), new CMICommandCost(cmd, cost));
    }

    public CMICommandCost getCost(String cmd) {
        return null;
    }

    public CMICommandCostUsage canUseCmd(CommandSender sender, String cmd) {

        return CMICommandCostUsage.Can;
    }

    public boolean isContinueCommand(CommandSender sender, String cmd) {

        return true;
    }

    public boolean loadConfig(boolean isReload) {

        return true;
    }

    private static CMICommandCost get(String line) {

        return null;
    }
}
