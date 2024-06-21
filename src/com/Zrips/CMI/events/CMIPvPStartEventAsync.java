package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public final class CMIPvPStartEventAsync extends CMIPlayerCancellableEvent {

    public CMIPvPStartEventAsync(final Player player) {
        super(player, true);
    }
}
