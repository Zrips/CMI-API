package com.Zrips.CMI.events;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.world.PortalCreateEvent.CreateReason;
import org.bukkit.util.Vector;

public class CMIPortalCreateEvent extends CMIPlayerCancellableEvent {
    private int height;
    private int width;
    private World world;
    private Vector lowestPoint;
    private CreateReason reason;
    private CMIPortalType type;

    public CMIPortalCreateEvent(Player player, World world, CreateReason reason, int height, int width) {
        super(player);
    }

    public int getHeight() {
        return 0;
    }

    public int getWidth() {
        return 0;
    }

    public World getWorld() {
        return null;
    }

    public CreateReason getReason() {
        return null;
    }

    public CMIPortalType getType() {
        return null;
    }

    public void setType(CMIPortalType type) {
    }

    public Vector getLowestPoint() {
        return null;
    }

    public void setLowestPoint(Vector lowestPoint) {
    }

    public enum CMIPortalType {
        Nether, End;
    }
}
