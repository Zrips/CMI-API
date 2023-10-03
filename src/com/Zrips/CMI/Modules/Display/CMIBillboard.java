package com.Zrips.CMI.Modules.Display;

import org.bukkit.entity.Display.Billboard;

public enum CMIBillboard {
    VERTICAL, CENTER, FIXED, HORIZONTAL;

    private Billboard bukkitBoard = null;

    public Billboard getBillboard() {
        if (bukkitBoard != null)
            return bukkitBoard;
        return Billboard.valueOf(this.toString());
    }

    public static CMIBillboard getByName(String name) {
        for (CMIBillboard one : CMIBillboard.values()) {
            if (one.toString().equalsIgnoreCase(name))
                return one;
        }
        return null;
    }
    
    public CMIBillboard next() {
        switch (this) {
        case CENTER:
            return CMIBillboard.VERTICAL;
        case FIXED:
            return CMIBillboard.CENTER;
        case HORIZONTAL:
            return CMIBillboard.FIXED;
        case VERTICAL:
            return CMIBillboard.HORIZONTAL;
        default:
            return CMIBillboard.CENTER;       
        }
    }
}
