package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CMIPvEStartEventAsync extends CMIPlayerCancellableEvent {

    public CMIPvEStartEventAsync(final Player player) {
        super(player, true);
    }

}
