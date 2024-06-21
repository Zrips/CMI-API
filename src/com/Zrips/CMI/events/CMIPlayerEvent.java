package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public class CMIPlayerEvent extends CMIEvent {

    private final Player player;

    public CMIPlayerEvent(Player player, boolean async) {
        super(async);
        this.player = player;
    }

    public CMIPlayerEvent(Player player) {
        this(player, false);
    }

    public Player getPlayer() {
        return this.player;
    }
}
