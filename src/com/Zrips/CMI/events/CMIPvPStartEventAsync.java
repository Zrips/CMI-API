package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public class CMIPvPStartEventAsync extends CMIPlayerCancellableEvent {
    public CMIPvPStartEventAsync(Player player) {
        super(player, true);
    }
}
