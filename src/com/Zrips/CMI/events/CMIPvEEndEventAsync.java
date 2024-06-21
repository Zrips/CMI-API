package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public final class CMIPvEEndEventAsync extends CMIPlayerEvent {

    public CMIPvEEndEventAsync(final Player player) {
        super(player, true);
    }
}
