package com.Zrips.CMI.Containers;

public enum CMIInteractType {
    LeftClick, RightClick, LeftShiftClick, RightShiftClick;
    public static CMIInteractType getByName(String name) {
	if (name == null)
	    return null;
	if (!name.toLowerCase().endsWith("click"))
	    name += "click"; 
	for (CMIInteractType one : CMIInteractType.values()) {
	    if (one.toString().equalsIgnoreCase(name))
		return one;
	}
	return null;
    }
}
