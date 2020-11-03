package com.Zrips.CMI.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Containers.CMIUser;

public final class CMIUserBalanceChangeEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private CMIUser user;
    private CMIUser source;
    private double from;
    private double to;
    private String actionType;

    @Deprecated
    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to) {
	this(user, from, to, "Unknown");
    }

    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType, CMIUser source) {
	super(true);
	this.user = user;
	this.from = from;
	this.to = to;
	this.actionType = actionType;
	this.source = source;
    }

    @Deprecated
    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType) {
	this(user, from, to, actionType, null);
    }

    @Override
    @EventAnnotation(info = "Fired when players balance changes")
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

    public String getActionType() {
	return actionType;
    }

    public void setActionType(String actionType) {
	this.actionType = actionType;
    }

    /**
    * Only indicates player from or to who money got transfered if posible
    */
    public CMIUser getSource() {
	return source;
    }
}