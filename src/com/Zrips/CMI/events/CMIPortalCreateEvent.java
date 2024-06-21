package com.Zrips.CMI.events;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.world.PortalCreateEvent.CreateReason;
import org.bukkit.util.Vector;

public final class CMIPortalCreateEvent extends CMIPlayerCancellableEvent {
    private int height;
    private int width;
    private World world;
    private Vector lowestPoint;
    private CreateReason reason;
    private CMIPortalType type;

    public enum CMIPortalType {
        Nether, End;
    }

    public CMIPortalCreateEvent(Player player, World world, CreateReason reason, int height, int width) {
        super(player);
        this.height = height;
        this.width = width;
        this.world = world;
        this.reason = reason;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public World getWorld() {
        return world;
    }

    public CreateReason getReason() {
        return reason;
    }

    public CMIPortalType getType() {
        return type;
    }

    public void setType(CMIPortalType type) {
        this.type = type;
    }

    public Vector getLowestPoint() {
        return lowestPoint;
    }

    public void setLowestPoint(Vector lowestPoint) {
        this.lowestPoint = lowestPoint;
    }
}