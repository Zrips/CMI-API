package com.Zrips.CMI.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public final class CMIAfkKickEvent extends CMIPlayerCancellableEvent {

    private List<String> kickTrigerCommands = new ArrayList<String>();

    public CMIAfkKickEvent(Player player, List<String> kickTrigerCommands) {
        super(player);
        this.kickTrigerCommands = kickTrigerCommands;
    }

    public List<String> getKickTrigerCommands() {
        return kickTrigerCommands;
    }

    public void setKickTrigerCommands(List<String> kickTrigerCommands) {
        this.kickTrigerCommands = kickTrigerCommands;
    }
}