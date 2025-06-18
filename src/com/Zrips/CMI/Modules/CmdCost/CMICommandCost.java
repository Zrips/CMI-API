package com.Zrips.CMI.Modules.CmdCost;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class CMICommandCost {
    private String command;
    private double cost;
    private boolean informOnCharge;
    private boolean requiresConfirmation;
    ConcurrentHashMap<UUID, String> confirmations;

    public CMICommandCost(String cmd, double cost) {
    }

    public String getCommand() {
        return null;
    }

    public void setCommand(String command) {
    }

    public double getCost() {
        return 0.0;
    }

    public String getSubCommand() {
        return null;
    }

    public void setCost(double cost) {
    }

    public boolean isInformOnCharge() {
        return false;
    }

    public void setInformOnCharge(boolean informOnCharge) {
    }

    public boolean isRequiresConfirmation() {
        return false;
    }

    public void setRequiresConfirmation(boolean requiresConfirmation) {
    }

    public void addConfirmation(UUID uuid, String cmd) {
    }

    public boolean isConfirmation(UUID uuid, String cmd) {
        return false;
    }

    public void removeConfirmation(UUID uuid) {
    }
}
