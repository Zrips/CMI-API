package com.Zrips.CMI.events;

import org.bukkit.Chunk;
import org.bukkit.entity.Player;

public final class CMIChunkChangeEvent extends CMIPlayerCancellableEvent {
    private Chunk oldChunk;
    private Chunk newChunk;

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
}