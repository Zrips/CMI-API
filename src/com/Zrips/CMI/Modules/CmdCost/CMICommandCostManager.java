package com.Zrips.CMI.Modules.CmdCost;

import java.util.HashMap;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;

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

        return null;
    }

    public boolean isContinueCommand(CommandSender sender, String cmd) {

        return true;
    }

    private String fileName = "CommandCost.yml";

    public boolean loadConfig(boolean isReload) {

        return true;
    }

    private static CMICommandCost get(String line) {

        return null;
    }
}
