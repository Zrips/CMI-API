package com.Zrips.CMI.Modules.Display;

import org.bukkit.entity.TextDisplay.TextAlignment;

public enum CMITextAlignment {
    LEFT, CENTER, RIGHT;

    private TextAlignment bukkitBoard = null;

    public TextAlignment getTextAlignment() {
        if (bukkitBoard != null)
            return bukkitBoard;
        return TextAlignment.valueOf(this.toString());
    }

    public static CMITextAlignment getByName(String name) {
        for (CMITextAlignment one : CMITextAlignment.values()) {
            if (one.toString().equalsIgnoreCase(name))
                return one;
        }
        return null;
    }
    
    public CMITextAlignment next() {
        switch (this) {
        case CENTER:
            return CMITextAlignment.RIGHT;
        case LEFT:
            return CMITextAlignment.CENTER;
        case RIGHT:
            return CMITextAlignment.LEFT;
        default:
            return CMITextAlignment.CENTER;       
        }
    }
}
