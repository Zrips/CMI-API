package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public final class CMIPlayerUnVanishEvent extends CMIPlayerCancellableEvent {

    public CMIPlayerUnVanishEvent(final Player player) {
        super(player);
    }
}
