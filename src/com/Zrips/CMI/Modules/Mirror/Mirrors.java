package com.Zrips.CMI.Modules.Mirror;

import java.util.HashMap;

import org.bukkit.Location;

import com.Zrips.CMI.Modules.Mirror.MirrorManager.MirrorAction;

public class Mirrors {

    private HashMap<MirrorManager.MirrorAction, Boolean> map = new HashMap<MirrorManager.MirrorAction, Boolean>();
    private Location loc = null;
    private boolean paused = false;
    private long lastAction = 0L;

    public Mirrors(Location loc) {
	this.loc = loc;
	reset();
    }

    public Mirrors() {
	reset();
    }

    public Mirrors reset() {
	for (MirrorAction one : MirrorManager.MirrorAction.values()) {
	    map.put(one, false);
	}
	return this;
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
	Mirrors m = new Mirrors();
	m.map = map;
	m.loc = loc;
	m.paused = paused;
	return m;
    }

    public long getLastAction() {
	return lastAction;
    }

    public void setLastAction(long lastAction) {
	this.lastAction = lastAction;
    }
}
