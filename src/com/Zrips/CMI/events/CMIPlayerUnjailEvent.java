package com.Zrips.CMI.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;

public final class CMIPlayerUnjailEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private CMIUser user;

    private CMIJailCell cell;

    public CMIPlayerUnjailEvent(CMIUser user, CMIJailCell cell) {
	this.user = user;
	this.cell = cell;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when players gets unjailed")
    public final HandlerList getHandlers() {
	return handlers;
    }

    public CMIUser getUser() {
	return user;
    }

    public CMIJailCell getCell() {
	return cell;
    }

}
