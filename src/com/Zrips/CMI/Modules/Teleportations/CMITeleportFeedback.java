package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Items.CMIMaterial;

public class CMITeleportFeedback {
    private boolean success;
    private Location location;
    private CMITeleportCondition condition;
    private double fallDistance;
    private CMIMaterial floor;

    public CMITeleportFeedback(Location location, boolean success) {
    }

    public boolean isSuccess() {
        return false;
    }

    public CMITeleportFeedback setSuccess(boolean success) {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public CMITeleportFeedback setLocation(Location location) {
        return null;
    }

    public void showFeedbackMessage(CommandSender sender, Player player) {
    }

    public CMITeleportCondition getCondition() {
        return null;
    }

    public boolean isGood() {
        return false;
    }

    public void setCondition(CMITeleportCondition condition) {
    }

    public double getFallDistance() {
        return 0.0;
    }

    public void setFallDistance(double fallDistance) {
    }

    public CMIMaterial getFloor() {
        return null;
    }

    public CMITeleportFeedback setFloor(CMIMaterial floor) {
        return null;
    }
}
