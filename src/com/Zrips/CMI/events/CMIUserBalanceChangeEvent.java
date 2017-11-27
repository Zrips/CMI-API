package com.Zrips.CMI.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Containers.CMIUser;

public final class CMIUserBalanceChangeEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private CMIUser user;
    private double from;
    private double to;

    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to) {
	this.user = user;
	this.from = from;
	this.to = to;
    }

    @Override
    public HandlerList getHandlers() {
	return handlers;
    }

    public static HandlerList getHandlerList() {
	return handlers;
    }

    public CMIUser getUser() {
	return user;
    }

    public double getFrom() {
	return from;
    }

    public double getTo() {
	return to;
    }
}