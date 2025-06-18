package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public class CMIPvEEndEventAsync extends CMIPlayerEvent {
    public CMIPvEEndEventAsync(Player player) {
        super(player, true);
    }
}
