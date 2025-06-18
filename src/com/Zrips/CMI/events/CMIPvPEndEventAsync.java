package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public class CMIPvPEndEventAsync extends CMIPlayerEvent {
    public CMIPvPEndEventAsync(Player player) {
        super(player, true);
    }
}
