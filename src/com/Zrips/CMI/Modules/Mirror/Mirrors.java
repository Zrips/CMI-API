package com.Zrips.CMI.Modules.Mirror;

import java.util.HashMap;

import org.bukkit.Location;

public class Mirrors {
    private HashMap<MirrorManager.MirrorAction, Boolean> map;
    private Location loc;
    private boolean paused;
    private long lastAction;

    public Mirrors(Location loc) {
    }

    public Mirrors() {
    }

    public Mirrors reset() {
        return null;
    }

    public boolean is(MirrorManager.MirrorAction action) {
        return false;
    }

    public Mirrors set(MirrorManager.MirrorAction action, Boolean state) {
        return null;
    }

    public Location getCenter() {
        return null;
    }

    public Mirrors setCenter(Location loc) {
        return null;
    }

    public boolean isPaused() {
        return false;
    }

    public Mirrors setPaused(boolean paused) {
        return null;
    }

    @Override
    public Mirrors clone() {
        return null;
    }

    public long getLastAction() {
        return 0;
    }

    public void setLastAction(long lastAction) {
    }
}
