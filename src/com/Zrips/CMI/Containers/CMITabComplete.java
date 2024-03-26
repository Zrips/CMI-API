package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.List;

public class CMITabComplete {

    public HashMap<String, Object> tabs = new HashMap<String, Object>();

    public static final String externalSeparator = ",";
    public static final String internalSeparator = "><";

    public List<Object> getTabCompleteList(String[] args) {

        return null;
    }

    private static boolean notRepeating(String word, String[] args) {

        for (String one : args) {
            if (one.equalsIgnoreCase(word))
                return false;
        }
        return true;
    }

    public String getTabComplete(String tab) {

        return null;
    }

    private Object getTab(String tab, HashMap<String, Object> map) {

        return null;
    }

    public void addTabComplete(String tab) {
        tab = tab.replace(internalSeparator, externalSeparator);
        addTab(tab, tabs);
    }

    private Object addTab(String tab, HashMap<String, Object> map) {
      
        return null;
    }

    private static void generalAdd(String tab, HashMap<String, Object> map) {
    }
}
