package com.Zrips.CMI.Modules.ViewRange;

import org.bukkit.Chunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Direction;
import com.Zrips.CMI.events.CMIChunkChangeEvent;

public class ChunkChange implements Listener {
    private CMI plugin;

    public ChunkChange(CMI plugin) {
	this.plugin = plugin;
    }

}
