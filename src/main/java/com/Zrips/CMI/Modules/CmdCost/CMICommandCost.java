package com.Zrips.CMI.Modules.CmdCost;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.Zrips.CMI.CMI;

public class CMICommandCost {

    private String command = "";
    private double cost = 0D;
    private boolean informOnCharge = true;
    private boolean requiresConfirmation = true;

    ConcurrentHashMap<UUID, String> confirmations = new ConcurrentHashMap<UUID, String>();

    public CMICommandCost(String cmd, double cost) {
	this.command = cmd;
	this.cost = cost > 0D ? cost : 0D;
    }

    public String getCommand() {
	return command;
    }

    public void setCommand(String command) {
	this.command = command;
    }

    public double getCost() {
	return cost;
    }

    public String getSubCommand() {
	return command.startsWith(CMI.getInstance().getCommandManager().getLabel() + " ") ? command.substring(CMI.getInstance().getCommandManager().getLabel().length() + 1) : command;
    }

    public void setCost(double cost) {
	this.cost = cost;
    }

    public boolean isInformOnCharge() {
	return informOnCharge;
    }

    public void setInformOnCharge(boolean informOnCharge) {
	this.informOnCharge = informOnCharge;
    }

    public boolean isRequiresConfirmation() {
	return requiresConfirmation;
    }

    public void setRequiresConfirmation(boolean requiresConfirmation) {
	this.requiresConfirmation = requiresConfirmation;
    }

    public void addConfirmation(UUID uuid, String cmd) {
	confirmations.put(uuid, cmd);
    }

    public boolean isConfirmation(UUID uuid, String cmd) {
	String old = confirmations.get(uuid);
	if (old == null)
	    return false;
	return old.equals(cmd);
    }

    public void removeConfirmation(UUID uuid) {
	confirmations.remove(uuid);
    }
}
