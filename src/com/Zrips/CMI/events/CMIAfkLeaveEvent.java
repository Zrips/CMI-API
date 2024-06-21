package com.Zrips.CMI.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public final class CMIAfkLeaveEvent extends CMIPlayerEvent {
    private List<String> leaveTrigerCommands = new ArrayList<String>();
    private long time;
    private String reason;

    public CMIAfkLeaveEvent(Player player) {
        super(player);
    }

    @Deprecated
    public CMIAfkLeaveEvent(Player player, List<String> leaveTrigerCommands) {
        super(player);
        this.leaveTrigerCommands = leaveTrigerCommands;
    }

    public CMIAfkLeaveEvent(Player player, List<String> leaveTrigerCommands, long time, String reason) {
        super(player);
        this.leaveTrigerCommands = leaveTrigerCommands;
        this.time = time;
        this.reason = reason;
    }

    public List<String> getLeaveTrigerCommands() {
        return leaveTrigerCommands;
    }

    public void setLeaveTrigerCommands(List<String> leaveTrigerCommands) {
        this.leaveTrigerCommands = leaveTrigerCommands;
    }

    public long getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }
}