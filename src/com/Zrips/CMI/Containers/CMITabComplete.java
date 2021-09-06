package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CMITabComplete {

    public HashMap<String, Object> tabs = new HashMap<String, Object>();

    public List<Object> getTabCompleteList(String[] args) {

	StringBuilder str = new StringBuilder();
	for (int z = 0; z < args.length - 1; z++) {
	    if (!str.toString().isEmpty())
		str.append(" ");
	    str.append(args[z]);
	}

	String comlpStr = getTabComplete(str.toString());

	List<Object> argsList = new ArrayList<Object>();

	return argsList;
    }

    private static boolean notRepeating(String word, String[] args) {

	for (String one : args) {
	    if (one.equalsIgnoreCase(word))
		return false;
	}
	return true;
    }

    public String getTabComplete(String tab) {
	

	Object res = getTab(tab.toLowerCase(), tabs);
	return res == null ? null : (String) res;
    }

    private Object getTab(String tab, HashMap<String, Object> map) {

	return "";
    }

    public void addTabComplete(String tab) {
	tab = tab.replace("%%", ",");
	addTab(tab, tabs);
    }

    private Object addTab(String tab, HashMap<String, Object> map) {
	
	return "";
    }
}
