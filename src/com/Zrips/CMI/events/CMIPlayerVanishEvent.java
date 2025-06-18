package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public class CMIPlayerVanishEvent extends CMIPlayerCancellableEvent {
    public CMIPlayerVanishEvent(Player player) {
        super(player);
    }
}
