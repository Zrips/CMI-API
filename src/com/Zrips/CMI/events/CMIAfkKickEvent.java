package com.Zrips.CMI.events;

import java.util.List;

import org.bukkit.entity.Player;

public class CMIAfkKickEvent extends CMIPlayerCancellableEvent {
    private List<String> kickTrigerCommands;

    public CMIAfkKickEvent(Player player, List<String> kickTrigerCommands) {
        super(player);
    }

    public List<String> getKickTrigerCommands() {
        return null;
    }

    public void setKickTrigerCommands(List<String> kickTrigerCommands) {
    }
}
