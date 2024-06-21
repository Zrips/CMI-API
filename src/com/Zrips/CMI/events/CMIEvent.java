package com.Zrips.CMI.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CMIEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    public CMIEvent() {
        super(false);
    }

    public CMIEvent(boolean async) {
        super(async);
    }

    public final static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
