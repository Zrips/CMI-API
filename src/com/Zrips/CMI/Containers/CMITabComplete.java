package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CMITabComplete {

    public HashMap<String, Object> tabs = new HashMap<String, Object>();

    public static final String externalSeparator = ",";
    public static final String internalSeparator = "><";

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

    public String getTabComplete(String tab) {
        return "";
    }

    public void addTabComplete(String tab) {
        tab = tab.replace(internalSeparator, externalSeparator);
    }
}
