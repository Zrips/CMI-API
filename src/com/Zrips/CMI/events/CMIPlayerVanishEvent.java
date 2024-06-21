package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public final class CMIPlayerVanishEvent extends CMIPlayerCancellableEvent {

    public CMIPlayerVanishEvent(final Player player) {
        super(player);
    }

}
