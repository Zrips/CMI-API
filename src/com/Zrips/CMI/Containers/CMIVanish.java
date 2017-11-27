package com.Zrips.CMI.Containers;

import java.util.HashMap;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.list.vanishedit.VanishAction;

public class CMIVanish {

    private CMIUser user;

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
    }

    public CMIUser getUser() {
	return user;
    }

    public void setUser(CMIUser user) {
	this.user = user;
    }

    public boolean is(VanishAction action) {
	return true;
    }

    public void set(VanishAction action, boolean state) {
    }

    public boolean isInitialized() {
	return true;
    }
}
