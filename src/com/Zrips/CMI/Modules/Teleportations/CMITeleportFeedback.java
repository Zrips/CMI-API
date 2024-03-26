package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Items.CMIMaterial;

public class CMITeleportFeedback {
    private boolean success = true;
    private Location location;
    private CMITeleportCondition condition = CMITeleportCondition.Good;
    private int fallDistance = 0;
    private CMIMaterial floor = null;

    public CMITeleportFeedback(Location location, boolean success) {
        this.success = success;
        this.location = location;
    }

    public boolean isSuccess() {
        return success;
    }

    public CMITeleportFeedback setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public CMITeleportFeedback setLocation(Location location) {
        this.location = location;
        return this;
    }

    public void showFeedbackMessage(CommandSender sender, Player player) {

    }

    public CMITeleportCondition getCondition() {
        return condition;
    }

    public boolean isGood() {
        return getCondition().equals(CMITeleportCondition.Good);
    }

    public void setCondition(CMITeleportCondition condition) {
        this.condition = condition;
    }

    public int getFallDistance() {
        return fallDistance;
    }

    public void setFallDistance(int fallDistance) {
        this.fallDistance = fallDistance;
    }

    public CMIMaterial getFloor() {
        return floor;
    }

    public CMITeleportFeedback setFloor(CMIMaterial floor) {
        this.floor = floor;
        return this;
    }
}
