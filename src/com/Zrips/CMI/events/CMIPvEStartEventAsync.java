package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public class CMIPvEStartEventAsync extends CMIPlayerCancellableEvent {
    public CMIPvEStartEventAsync(Player player) {
        super(player, true);
    }
}
