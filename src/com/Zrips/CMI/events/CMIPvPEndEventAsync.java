package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public final class CMIPvPEndEventAsync extends CMIPlayerEvent {

    public CMIPvPEndEventAsync(final Player player) {
        super(player, true);
    }

}
