package com.Zrips.CMI.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CMIEvent extends Event {
    private static final HandlerList handlers = null;

    public CMIEvent() {
    }

    public CMIEvent(boolean async) {
        super(async);
    }

    public static HandlerList getHandlerList() {
        return null;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }
}
