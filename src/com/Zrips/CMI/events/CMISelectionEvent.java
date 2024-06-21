package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CuboidArea;

public final class CMISelectionEvent extends CMIPlayerEvent {

    private CuboidArea area;

    public CMISelectionEvent(Player player, CuboidArea area) {
        super(player);
        this.area = area;
    }

    public CuboidArea getArea() {
        return area;
    }

    public void setArea(CuboidArea area) {
        this.area = area;
    }

}
