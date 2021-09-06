package com.Zrips.CMI.Modules.TabList;

public enum CMITabSortingOrder {

    ASC, DESC;
    public static CMITabSortingOrder getByName(String name) {
	for (CMITabSortingOrder one : CMITabSortingOrder.values()) {
	    if (one.toString().equalsIgnoreCase(name))
		return one;
	}
	return null;
    }
}
