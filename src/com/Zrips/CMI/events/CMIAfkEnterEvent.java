package com.Zrips.CMI.events;

import java.util.List;

import org.bukkit.entity.Player;

public class CMIAfkEnterEvent extends CMIPlayerCancellableEvent {
    private List<String> awayTrigerCommands;
    private AfkType type;

    public CMIAfkEnterEvent(Player player, List<String> awayTrigerCommands, AfkType afkType) {
        super(player);
    }

    public List<String> getAwayTrigerCommands() {
        return null;
    }

    public void setAwayTrigerCommands(List<String> awayTrigerCommands) {
    }

    public AfkType getType() {
        return null;
    }

    public enum AfkType {
        auto, manual;
    }
}
