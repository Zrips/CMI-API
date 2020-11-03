package com.Zrips.CMI.Modules.Mirror;

import java.util.HashMap;

import org.bukkit.Location;

import com.Zrips.CMI.Modules.Mirror.MirrorManager.MirrorAction;

public class Mirrors {

    private HashMap<MirrorManager.MirrorAction, Boolean> map = new HashMap<MirrorManager.MirrorAction, Boolean>();
    private Location loc = null;
    private boolean paused = false;

    public Mirrors(Location loc) {
	this.loc = loc;
	reset();
    }

    public Mirrors() {
	reset();
    }

    public Mirrors reset() {
	return null;
    }

    public boolean is(MirrorManager.MirrorAction action) {
	return map.get(action);
    }

    public Mirrors set(MirrorManager.MirrorAction action, Boolean state) {
	map.put(action, state);
	return this;
    }

    public Location getCenter() {
	return loc;
    }

    public Mirrors setCenter(Location loc) {
	this.loc = loc.clone().add(0, -1, 0);
	return this;
    }

    public boolean isPaused() {
	return paused;
    }

    public Mirrors setPaused(boolean paused) {
	this.paused = paused;
	return this;
    }

    @Override
    public Mirrors clone() {
	return null;
    }
}
