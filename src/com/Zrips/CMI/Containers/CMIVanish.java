package com.Zrips.CMI.Containers;

import java.util.HashMap;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.list.vanishedit.VanishAction;

public class CMIVanish {

    private CMIUser user;

    private HashMap<VanishAction, Boolean> map = new HashMap<VanishAction, Boolean>();

    private Boolean wasCollidable = null;

    public void fromString(String line) {
    }

    @Override
    public String toString() {
	return null;
    }

    private static String to(boolean state) {
	return state ? "1" : "0";
    }

    private static boolean from(String state) {
	return state.equals("1") ? true : false;
    }

    public CMIVanish(CMIUser user) {
	this.user = user;
    }

    public CMIUser getUser() {
	return user;
    }

    public void setUser(CMIUser user) {
	this.user = user;
    }

    public boolean is(VanishAction action) {
	if (!map.containsKey(action) || map.get(action) == null) {
	    return action.isEnabled();
	}
	return map.get(action);
    }

    public void set(VanishAction action, boolean state) {
	map.put(action, state);
    }

    public Boolean getWasCollidable() {
	return wasCollidable == null ? true : wasCollidable;
    }

    public void setWasCollidable(Boolean wasCollidable) {
	this.wasCollidable = wasCollidable;
    }
}
