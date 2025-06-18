package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public class CMIPlayerEvent extends CMIEvent {
    private final Player player = null;

    public CMIPlayerEvent(Player player, boolean async) {
        super(async);
    }

    public CMIPlayerEvent(Player player) {
    }

    public Player getPlayer() {
        return null;
    }
}
