package com.Zrips.CMI.Containers;

public enum CMIColorTypes {
    publicmessage(true), privatemessage(true), me(true), nickname(true), signs(false), books(true), itemname(true), itemlore(true);

    private boolean clean;

    CMIColorTypes(boolean clean) {
    }

    public boolean isClean() {
        return false;
    }

    public void setClean(boolean clean) {
    }
}
