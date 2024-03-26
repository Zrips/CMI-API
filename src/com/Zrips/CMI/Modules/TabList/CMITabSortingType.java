package com.Zrips.CMI.Modules.TabList;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.Locale.LC;

public enum CMITabSortingType {

    Group, CustomGroup, Name, NickName, Balance, World;

    public static CMITabSortingType getByName(String name) {
	for (CMITabSortingType one : CMITabSortingType.values()) {
	    if (one.toString().equalsIgnoreCase(name))
		return one;
	}
	return null;
    }

    public static String toStringList() {
	String n = "";
	for (CMITabSortingType one : CMITabSortingType.values()) {
	    if (!n.isEmpty())
		n += LC.info_ListSpliter.getLocale();
	    n += one.toString();
	}

	return n;
    }

}
