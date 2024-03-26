package com.Zrips.CMI.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public final class CMIAfkLeaveEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    private List<String> leaveTrigerCommands = new ArrayList<String>();
    private long time;
    private String reason;

    public CMIAfkLeaveEvent(Player player) {
        super(player);
    }

    @Deprecated
    public CMIAfkLeaveEvent(Player player, List<String> leaveTrigerCommands) {
        super(player);
        this.leaveTrigerCommands = leaveTrigerCommands;
    }

    public CMIAfkLeaveEvent(Player player, List<String> leaveTrigerCommands, long time, String reason) {
        super(player);
        this.leaveTrigerCommands = leaveTrigerCommands;
        this.time = time;
        this.reason = reason;
    }

    @Override
    @EventAnnotation(info = "Fired when players leaves afk mode")
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public List<String> getLeaveTrigerCommands() {
        return leaveTrigerCommands;
    }

    public void setLeaveTrigerCommands(List<String> leaveTrigerCommands) {
        this.leaveTrigerCommands = leaveTrigerCommands;
    }

    public long getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }
}