package com.Zrips.CMI.Modules.Mirror;

import java.util.HashMap;

import org.bukkit.Location;

import com.Zrips.CMI.Modules.Mirror.MirrorManager.Action;

public class Mirrors {

    private HashMap<MirrorManager.Action, Boolean> map = new HashMap<MirrorManager.Action, Boolean>();
    private Location loc = null;
    private boolean paused = false;

    public Mirrors(Location loc) {
	this.loc = loc;
	reset();
    }

    public Mirrors() {
	reset();
    }

    public void reset() {
	for (Action one : MirrorManager.Action.values()) {
	    map.put(one, false);
	}
    }

    public boolean is(MirrorManager.Action action) {
	return map.get(action);
    }

    public void set(MirrorManager.Action action, Boolean state) {
	map.put(action, state);
    }

    public Location getCenter() {
	return loc;
    }

    public void setCenter(Location loc) {
	this.loc = loc.clone().add(0, -1, 0);
    }

    public boolean isPaused() {
	return paused;
    }

    public void setPaused(boolean paused) {
	this.paused = paused;
    }

}
