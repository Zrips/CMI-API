package com.Zrips.CMI.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Containers.CMIUser;

public final class CMIPlayerNickNameChangeEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private String nickname;
    private CMIUser user;

    public CMIPlayerNickNameChangeEvent(final CMIUser user, String nickname) {
	this.user = user;
	this.nickname = nickname;
    }

    @Override
    @EventAnnotation(info = "Fired when player tries to change nickname")
    public final HandlerList getHandlers() {
	return handlers;
    }

    public static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    public final void setCancelled(final boolean cancel) {
	this.cancel = cancel;
    }

    @Override
    public final boolean isCancelled() {
	return cancel;
    }

    public String getNickName() {
	return nickname;
    }

    public void setNickName(String nickname) {
	this.nickname = nickname;
    }

    public CMIUser getUser() {
	return user;
    }
}
