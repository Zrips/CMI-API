package com.Zrips.CMI.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public final class CMIAfkEnterEvent extends CMIPlayerCancellableEvent {
    private List<String> awayTrigerCommands = new ArrayList<String>();
    private AfkType type;

    public enum AfkType {
        auto, manual;
    }

    public CMIAfkEnterEvent(Player player, List<String> awayTrigerCommands, AfkType afkType) {
        super(player);
        this.awayTrigerCommands = awayTrigerCommands;
        this.type = afkType;
    }

    public List<String> getAwayTrigerCommands() {
        return awayTrigerCommands;
    }

    public void setAwayTrigerCommands(List<String> awayTrigerCommands) {
        this.awayTrigerCommands = awayTrigerCommands;
    }

    public AfkType getType() {
        return this.type;
    }
}