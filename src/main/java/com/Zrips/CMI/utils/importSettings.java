package com.Zrips.CMI.utils;

import java.util.HashMap;

import com.Zrips.CMI.utils.EssentialsConverter.importType;

public class importSettings {
    private HashMap<importType, Boolean> map = new HashMap<importType, Boolean>();

    public importSettings set(importType type, boolean state) {
	map.put(type, state);
	return this;
    }

    public boolean is(importType type) {
	if (!map.containsKey(type))
	    return false;
	return map.get(type);
    }

    public HashMap<importType, Boolean> getMap() {
	return map;
    }

    public void setMap(HashMap<importType, Boolean> map) {
	this.map = map;
    }
}
