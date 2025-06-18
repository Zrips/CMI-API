package com.Zrips.CMI.Modules.CmdCost;

import java.util.HashMap;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;

public class CMICommandCostManager {
    private HashMap<String, CMICommandCost> costs;
    CMI plugin;
    private String fileName;

    public CMICommandCostManager(CMI plugin) {
    }

    public int getCommandCostCount() {
        return 0;
    }

    public void addCost(String cmd, double cost) {
    }

    public CMICommandCost getCost(String cmd) {
        return null;
    }

    public CMICommandCostUsage canUseCmd(CommandSender sender, String cmd) {
        return null;
    }

    public boolean isContinueCommand(CommandSender sender, String cmd) {
        return false;
    }

    public boolean loadConfig(boolean isReload) {
        return false;
    }

    private static CMICommandCost get(String line) {
        return null;
    }
}
