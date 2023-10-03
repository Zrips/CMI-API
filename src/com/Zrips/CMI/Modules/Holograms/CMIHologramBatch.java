package com.Zrips.CMI.Modules.Holograms;

import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Display.CMIDisplay;

import net.Zrips.CMILib.Logs.CMIDebug;

public class CMIHologramBatch {

    private ConcurrentHashMap<Integer, CMIDisplay> displays = new ConcurrentHashMap<Integer, CMIDisplay>();
    private ConcurrentHashMap<Integer, CMIDisplay> icons = new ConcurrentHashMap<Integer, CMIDisplay>();

    public ConcurrentHashMap<Integer, CMIDisplay> getDisplays() {
        return displays;
    }

    public CMIDisplay getDisplay(int side) {
        return displays.get(side);
    }

    public void addDisplay(int side, CMIDisplay display) {
        this.displays.put(side, display);
    }

//    public void addDisplay(Set<CMIDisplay> displays) {
//        this.displays.addAll(displays);
//    }

    public void clear() {
        this.displays.clear();
        this.icons.clear();
    }

    public ConcurrentHashMap<Integer, CMIDisplay> getIcons() {
        return icons;
    }

    public CMIDisplay getIcon(int line) {
        return icons.get(line);
    }

    public void addIcon(int line, CMIDisplay icon) {
        this.icons.put(line, icon);
    }

    public void destroy(Player player) {
        if (player == null || !player.isOnline())
            return;
        
        for (CMIDisplay one : displays.values()) {
            one.destroy(player);
        }

        for (CMIDisplay one : icons.values()) {
            one.destroy(player);
        }
        
        clear();
    }
}
