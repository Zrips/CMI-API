package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import com.Zrips.CMI.Modules.Portals.CuboidArea;

public final class CMISelectionEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    private CuboidArea area;

    public CMISelectionEvent(Player player, CuboidArea area) {
	super(player);
	this.area = area;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired on selection")
    public final HandlerList getHandlers() {
	return handlers;
    }

    public CuboidArea getArea() {
	return area;
    }

    public void setArea(CuboidArea area) {
	this.area = area;
    }

}
