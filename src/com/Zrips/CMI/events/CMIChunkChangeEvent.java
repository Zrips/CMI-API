package com.Zrips.CMI.events;

import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public final class CMIChunkChangeEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private Chunk oldChunk;
    private Chunk newChunk;
    private boolean cancelled;

    public CMIChunkChangeEvent(Player player, Chunk oldChunk, Chunk newChunk) {
        super(player);
        this.oldChunk = oldChunk;
        this.newChunk = newChunk;
    }

    public Chunk getOldChunk() {
        return this.oldChunk;
    }

    public Chunk getNewChunk() {
        return this.newChunk;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    @Override
    @EventAnnotation(info = "Fired when player changes chunk")
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}