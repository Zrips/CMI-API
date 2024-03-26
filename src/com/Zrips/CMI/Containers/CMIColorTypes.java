package com.Zrips.CMI.Containers;

public enum CMIColorTypes {
    publicmessage(true), privatemessage(true), me(true), nickname(true), signs(false), books(true), itemname(true), itemlore(true);

    private boolean clean;

    CMIColorTypes(boolean clean) {
        this.clean = clean;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
