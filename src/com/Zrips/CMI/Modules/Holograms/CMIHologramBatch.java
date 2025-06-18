package com.Zrips.CMI.Modules.Holograms;

import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Display.CMIDisplay;

public class CMIHologramBatch {
    private ConcurrentHashMap<Integer, CMIDisplay> displays;
    private ConcurrentHashMap<Integer, CMIDisplay> icons;

    public ConcurrentHashMap<Integer, CMIDisplay> getDisplays() {
        return null;
    }

    public CMIDisplay getDisplay(int side) {
        return null;
    }

    public void addDisplay(int side, CMIDisplay display) {
    }

    public void clear() {
    }

    public ConcurrentHashMap<Integer, CMIDisplay> getIcons() {
        return null;
    }

    public CMIDisplay getIcon(int line) {
        return null;
    }

    public void addIcon(int line, CMIDisplay icon) {
    }

    public void destroy(Player player) {
    }
}
