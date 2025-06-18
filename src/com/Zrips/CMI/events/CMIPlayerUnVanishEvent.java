package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public class CMIPlayerUnVanishEvent extends CMIPlayerCancellableEvent {
    public CMIPlayerUnVanishEvent(Player player) {
        super(player);
    }
}
